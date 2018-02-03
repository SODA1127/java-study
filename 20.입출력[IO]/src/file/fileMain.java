package file;

import java.io.File;
import java.io.IOException;
import java.net.URL;


public class fileMain {
	public static void main(String[] args) {
		File file1 = new File("sample", "00.VariableDeclare.txt");
		File file2 = new File("sample" + File.separator + "11.OOP.txt");
		System.out.println(file2.getAbsolutePath());
		File file3 = new File("/Users/leekijung/Documents/workspace/20.입출력[IO]/sample/11.OOP.txt");
		System.out.println("1. 파일 구분자 : " + File.separator);
		System.out.println("2. file path : " + file1.getPath());
		System.out.println("3. file absolute path : " + file1.getAbsolutePath());
		System.out.println("4. file name : " + file1.getName());
		System.out.println("5. file parent : " + file1.getParent());
		
		File dir1 = new File("sample");
		System.out.println("6. directory 여부 : " + dir1.isDirectory());
		System.out.println("7. file 여부 : " + dir1.isFile());
		System.out.println("7. file 여부 : " + file1.isFile());
		
		System.out.println("8. directory 안에 파일목록 : ");
		if(dir1.isDirectory()){
			String[] fileList = dir1.list();
			for (int i = 0; i < fileList.length; i++) {
				System.out.println("\t" + fileList[i]);
			}
		}
		
		System.out.println("9. directory 안에 파일(디렉토리)목록 (File) : ");
		File[] fileList= dir1.listFiles();
		for (int i = 0; i < fileList.length; i++) {
			if(fileList[i].isFile()){
				String fileName = fileList[i].getName();
				System.out.println("\tFile : " + fileName);
			}else{
				String fileName = fileList[i].getName();
				System.out.println("\tdirectory : " + fileName);
			}
			
		}
		
		System.out.println("10. root directory 안의 파일(디렉토리) 경로");
		File[] rootDir = File.listRoots();
		for (int i = 0; i < rootDir.length; i++) {
			System.out.println("Root : " + rootDir[i].getPath());
		}
		
		System.out.println("11. root directory 안의 파일(디렉토리) 목록(File)");
		File rootDDir = new File("/");
		File[] rootDFiles = rootDDir.listFiles();
		for (int i = 0; i < rootDFiles.length; i++) {
			if(rootDFiles[i].isDirectory()){
				System.out.println("D : " + rootDFiles[i].getName());
			}else if(rootDFiles[i].isFile()){
				System.out.println("F : " + rootDFiles[i].getName());
			}
		}
		
		System.out.println("11. directory 생성");
		File newDir1 = new File("newDir1");
		File newDir2 = new File("newDir2");
		File newDir3 = new File("sample", "newDir3");
		
		boolean isSuccess = newDir1.mkdir();
		System.out.println(">> make directory : " + isSuccess);
		System.out.println(">> directory 존재여부 : " + newDir1.exists());
		newDir2.mkdir();
		newDir3.mkdir();
		System.out.println("12. directory 이름변경");
		newDir2.renameTo(new File("reanmeDir2"));
		System.out.println("13. directory 삭제");
		newDir3.deleteOnExit();
		System.out.println("14. File 생성");
		File newFile = new File("newDir1", "newFile.txt");
		try {
			boolean createSuccess = newFile.createNewFile();
			System.out.println("파일의 생성여부 : " + createSuccess);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * Class Path root
		 */
		URL url = fileMain.class.getClassLoader().getResource("");
		System.out.println(url.getPath());
	}
}
