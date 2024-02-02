public class Main 
{
	public static void main(String[] args) 
	{
		Cat brownie = new Cat(2, "Brownie", "Purina One");
		System.out.println(brownie.name + " is " + brownie.age + " years old and likes " + brownie.catFoodPreference);

		// System.out.println(brownie.name);


		brownie.makeNoise();

		// super cannot be used in the object. hence, the below is not valid
		// brownie.super.makeNoise();


	}
}