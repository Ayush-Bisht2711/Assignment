package nestedclasses;

//nested classes 
//1) inner class | non static class
  // inner class methods can access all properties of outer class
//2) static class
public class Person {

	String name;
	int id;
   void display()
   {
	  System.out.println("display method");
   }
	//private class AccountMgr
     class AccountMgr
	 {
		int a;
		static int b;
		final int y=11;
		AccountMgr(){}
		void show()
		{
			name="test";
			id=22;
			a=22;
			b=33;
			System.out.println(name+"  "+ id+"   "+ a+"  "+ b);
			display();
		}
		static void print()
		{   
			System.out.println("testing static method in inner class");
		}
	}
	public static void main(String[] args) {
		Person p= new Person();
		p.display();   
		Person.AccountMgr m= p.new AccountMgr();
		m.show();
		m.print();
		
		
	}

}

