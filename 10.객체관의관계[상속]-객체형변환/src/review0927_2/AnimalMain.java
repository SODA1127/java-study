package review0927_2;

public class AnimalMain {
	public static void main(String[] args) {
		Animal sd = new Animal();
		Dog Dsd = new Dog();
		Cat Csd = new Cat();
		sd = Dsd;
		sd.sound();
		Csd.sound();
		
		
	}
}
