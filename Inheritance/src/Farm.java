
public class Farm {

	public static void main(String[] args) {
		Animal animal1 = new Animal ("Doggy", 2.0, 30.0);
		
		System.out.println(animal1);
		System.out.println(animal1.makeSound());
		
		Cat cat1 = new Cat ("Bart", 1.5, 12.0, "Gray");
		System.out.println(cat1.toString());
		System.out.println(cat1.makeSound());
		
		Dog dog1 = new Dog ("Henry", 3.0, 13.7, "German Shepard");
		System.out.println(dog1.toString());

	}

}
