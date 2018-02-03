
public class OverLoadingMain {
	public static void main(String[] args) {
		OverLoading  ol = new OverLoading();
		ol.method();
		ol.method(1321);
		ol.method(12, 34);
		ol.method(322, "String");
		ol.method("String1", "String2");
		
	}
}
