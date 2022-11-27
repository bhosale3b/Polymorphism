package overriding;


public class Child extends Parent {
		@Override
		public void addition() { 
			// same name same para // here we can't change return type and modifier
		
			System.out.println("child method");
		}
		public void sub() {
			System.out.println("child sub method");
		}
		public static void main(String[] args) {
			Child c=new Child();
			c.addition();
			//child method called bec modifier 1st compiler read parents code then move to the child but here same method so it's take child method
		}

}
