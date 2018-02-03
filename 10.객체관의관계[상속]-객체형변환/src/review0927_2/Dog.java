package review0927_2;

public class Dog extends Animal{
	private String name = "멍멍이";
	private String color = "black";
	private int age = 5;
	private int size = 25;
	
	public Dog(String name, String color, int age, int size) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
		this.size = size;
	}

	public Dog() {
	}
	
	@Override
	public void sound(){
		super.sound();
		System.out.println("멍멍!");
	}
	
	

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getAge() {
		return age;
	}

	public int getSize() {
		return size;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
