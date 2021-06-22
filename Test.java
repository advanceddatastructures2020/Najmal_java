class Rectangle
{
private int length,breadth;
public Rectangle(int l, int b)
{
length=l;
breadth=b;
}
public int getArea()
{
return length*breadth;
}
}
class Test
{
public static void main(String args[])
{
 Rectangle[] rect= new Rectangle[2];
 rect[0]=new Rectangle(2,4);
 rect[1]=new Rectangle(4,5);
 for(int i=0;i<2;i++)
{
System.out.println(rect[i].getArea());
}
}
}

