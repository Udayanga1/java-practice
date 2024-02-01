public class Demo
{
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Udayanga");

		System.out.println(sb.capacity()); //print 24, 16 + 8 (8 characters for Udayanga)

		System.out.println(sb.length()); //print 8

		sb.append(" Wijesiri");

		System.out.println(sb);	//print Udayanga Wijesiri

		System.out.println(sb.capacity()); //still print 24

		System.out.println(sb.length()); //print 17 (8 + 9 for " Wijesiri")

		// String Bilder has the same methods

		// String objects are immutable and StringBuffer objects are mutable
	}
}