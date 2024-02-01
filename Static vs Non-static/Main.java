public class Main 
{
	public static void main(String[] args) 
	{
		System.out.println(Cat.getCatCount()); // this works since getCatCount() is static | print 0

		Cat myCat = new Cat();
		myCat.name = "Eveready";

		myCat.meow(); // print meow

		Cat bigCat = new Cat();

		// Cat.meow(); // cannot call this method since this method is not static. So the object owns meow() but not the class.


		System.out.println(Cat.getCatCount()); // print 2

		// However static methods and fields are accessible to objects as well (below).
		System.out.println(myCat.getCatCount()); // still print 2 (But not usually use since misleading)

	}
}