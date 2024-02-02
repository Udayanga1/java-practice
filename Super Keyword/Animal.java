public class Animal 
{
	public int age;
	public String name;

	// implement no args constructor
	public Animal()
	{

	}

	public Animal(int age, String name)
	{
		this.age = age;
		this.name = name;
	}

	public void makeNoise()
	{
		System.out.println("Hello, I am an animal");

	}

	public void eat()
	{
		System.out.println("Munch munch");
	}

	private void somethingPrivate()
	{
		System.out.println("This is a private method");
	}
}