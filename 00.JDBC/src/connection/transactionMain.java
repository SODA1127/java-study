package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itwill.dao.common.ConnectionFactory;

public class transactionMain {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String updateSQLA = "update accounta set acc_balance = acc_balance - ? where acc_no = ?";
		String updateSQLB = "update accountb set acc_balance = acc_balance + ? where acc_no = ?";
		String selectSQLBalanceA = "select acc_balance from accounta where acc_no = ?";
		String selectSQLBalanceB = "select acc_balance from accountb where acc_no = ?";
		
		
		try {
			con = ConnectionFactory.getConection();
			/*
			 * DML문 전송시에 자동으로 COMMIT
			 * con.setAutoCommit(true);
			 */
			int acc_no = 10000; // 계좌번호
			int money = 100000; // 이체할 금액
			
			con.setAutoCommit(false);
			pstmt = con.prepareStatement(updateSQLA);
			pstmt.setInt(1, money);
			pstmt.setInt(2, acc_no);
			/************** transacton start ***************/
			int updateRowCount = pstmt.executeUpdate();
			System.out.println("1. account A계좌 " + acc_no + "번에서 " + money + "만큼 감소");
			pstmt.clearParameters();
			pstmt.close();
			
			pstmt = con.prepareStatement(updateSQLB);
			pstmt.setInt(1, money);
			pstmt.setInt(2, acc_no);
			updateRowCount = pstmt.executeUpdate();
			System.out.println("2. account B계좌 " + acc_no + "번에서 " + money + "만큼 증가");
			pstmt.close();
			/************** A계좌 잔고 검사 --> 음수면 롤백 **************/
			pstmt = con.prepareStatement(selectSQLBalanceA);
			pstmt.setInt(1, acc_no);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				int acc_balance = rs.getInt("acc_balance");
				System.out.println("3. account A계좌 잔고 : " + acc_balance);
				if(acc_balance < 0) {
					/************** transacton end(rollback) ***************/
					con.rollback();
					System.err.println("4-1. 잔고가 음수로 이체 트랜잭션 실패 rollback() : " + acc_balance);
				}else {
					/************** transacton end(commit) ***************/
					System.out.println("4-2. 잔고가 양수 또는 0원으로 이체 트랜잭션 성공 commit() : " + acc_balance);
					con.commit();
				}
			}
		} catch (Exception e) {
			try {
				/************** transacton end ***************/
				con.rollback();
				System.out.println("99. 이체 트랜잭션시 에러 발생하여 rollback()");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		
	}
}
