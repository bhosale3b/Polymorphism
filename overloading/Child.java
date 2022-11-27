package overloading;


public class Child extends Parent {
		public void addition(int a){
			System.out.println("child addition method");// same name but different parameters
		}

		public static void main(String[] args) {
			Child c=new Child();
			c.addition();
			c.addition(7);
			
		

		}

	}


