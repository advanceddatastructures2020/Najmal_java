class Dog
{
	String name;
	int age;
	
	public Dog(String name,int age)
	{
	  this.name=name;
 	  this.age=age;
	}

  public void getName()
  {
    System.out.println(name);
  }
   public void getAge()
  {
    System.out.println(age);
  }

 public static void main(String a[])
 {
  Dog tuffy= new Dog("tuffy",5);
  Dog tuffy1= new Dog("tuffy1",4);
  Dog tuffy2= new Dog("tuffy2",6);
  tuffy.getName();
  tuffy.getAge();
  tuffy1.getName();
  tuffy1.getAge();
  tuffy2.getName();
  tuffy2.getAge();
 }

}