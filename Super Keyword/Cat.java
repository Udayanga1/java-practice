public class Cat extends Animal
{
	public String catFoodPreference;

	public Cat(int age, String name, String catFoodPreference)
	{
		// this.age = age; //this is valid but dupication
		// this.name = name; //this is valid but dupication

		super(age, name); //same functionality as above two combined.

		this.catFoodPreference = catFoodPreference;
	}

	@Override //works without this but it's a good practice to include this
	public void makeNoise() 
	{
		super.makeNoise(); // calls the parent method
		System.out.println("Meow"); //calls the child method
	}

	//super can be used in other non-static methods as well
	public void jump() 
	{
		super.makeNoise();
		
		// the below is not valid since somethingPrivate() is a private method of Animal class
		// super.somethingPrivate();
	}

}