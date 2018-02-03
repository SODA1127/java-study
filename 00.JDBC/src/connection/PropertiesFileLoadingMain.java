package connection;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileLoadingMain {

	public static void main(String[] args) throws Exception {
		/*
		 * eclipse project root file path
		 */
		// FileInputStream fileInputStream=new
		// FileInputStream("setting_eclise_root.properties");

		/*
		 * class root path
		 */
		/*
		 * InputStream fileInputStream = PropertiesFileLoadingMain.class
		 * .getClassLoader() .getResourceAsStream("setting_classpath_root.properties");
		 */
		/*
		 * class root -->package
		 */
		InputStream fileInputStream = PropertiesFileLoadingMain.class.getClassLoader()
				.getResourceAsStream("connectionpool/setting_classpath_package.properties");

		Properties properties = new Properties();
		properties.load(fileInputStream);
		System.out.println(properties);
		System.out.println("url : " + properties.get("url"));
		System.out.println("driver : " + properties.get("driver"));
		System.out.println("user : " + properties.get("user"));
		System.out.println("pass : " + properties.get("pass"));

	}

}
