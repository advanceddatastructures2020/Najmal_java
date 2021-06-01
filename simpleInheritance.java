class A
{
int i,j;
void showij()
{
System.out.println("i = "+i+" \n j = "+j);
}
}
class B extends A 
{
int k;
void showk()
{
System.out.println("k = "+k+"\n");
}
void sum()
{
System.out.println("i + j + k = "+(i+j+k));
}
}

class simpleInheritance
{
public static void main(String args[])
{
A superob = new A();
B subob = new B();

superob.i=10;
superob.j=20;

System.out.println("contents of suoerob \n ");
superob.showij();
subob.i=2;
subob.j=3;
subob.k=4;

System.out.println("contents of subob \n");
subob.showij();
subob.showk();

System.out.println("i + j + k in subob : ");
subob.sum();
}
}


