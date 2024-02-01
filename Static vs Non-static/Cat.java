public class Cat 
{
	private static int catCount = 0; //static

	public String name; //non-static
	int age; //non-static
	int livesRemaining; //non-static

	public void meow() 
	{
		System.out.println("Meow");
	}

	public Cat()
	{
		catCount++;
	}

	public static int getCatCount()
	{
		// System.out.println(name); // cannot use name field since it is non-static
		return catCount; // catCount is static, so ok
	}
}