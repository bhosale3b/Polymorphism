package overloading;

public class A {
	public void addition() {
		System.out.println("default parameter addition");
	}
    public void addition(int a,int b) {
    	System.out.println("addition is :"+(a+b));
    }
    public static void main(String[] args) {
		A a=new A();
		a.addition();
		a.addition(1,6);
	}

}
