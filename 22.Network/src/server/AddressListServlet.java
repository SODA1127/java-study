package server;

import java.io.OutputStream;
import java.util.ArrayList;

import com.itwill.dao.address3.Address;
import com.itwill.dao.address3.AddressDao;

public class AddressListServlet {	
	public void service(OutputStream out) throws Exception{
		AddressDao addressDao = new AddressDao();
		ArrayList<Address> addressList = addressDao.selectAll();
		
		for (int i = 0; i < addressList.size(); i++) {
			Address address = addressList.get(i);
			String addressStr = address.toString();
			out.write(addressStr.getBytes(), 0, addressStr.getBytes().length);
			out.write("<br>".getBytes(), 0, "".getBytes().length);
		}
	}
}
