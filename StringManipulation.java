public class StringManipulation
{
	public static void main(String args[])
	{
	String greeting="Hello";
	System.out.println(greeting);
	String txt2="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	System.out.println("the length of the text string is: "+txt2.length());
	String txt="Hello World";
	System.out.println(txt.toUpperCase());
	System.out.println(txt.toLowerCase());
	String txt1="please locate where 'locate' occurs!";
	System.out.println(txt1.indexOf("locate"));
	String firstName="John";
	String lastName="Doe";
	System.out.println(firstName.concat(lastName));


	String x="10";
    String y="20";
    String z= x+y;
    System.out.println(z);

    String a="Rockstar";
    System.out.println(a.charAt(3));
    System.out.println(a.compareTo("Rockstar"));
    System.out.println(a.compareTo("ROCKSTAR"));
    System.out.println(a.replace("Rock","New"));
 	}
}