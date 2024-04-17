
public class Cat extends Animal{
	private String color;

	public Cat () {
		super();
		this.color = "cat";
	}
	public Cat(String color) {
		super();
		this.color = color;
	}
	
	public Cat(String name, double height, double weight, String color) {
		super(name, height, weight);
		
		this.color = color;
	}
	public String makeSound () {
		return "meow meow";
	}
	@Override
	public String toString() {
		String str = super.toString() +  " \nCat's color = " + color ;
		return str;
	}
	
}
