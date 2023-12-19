package basic;

public class InheritanceQuestion 
{
	  public static void main(String[] args) {
	        A obj = new B();
	        obj.method1();
	    }
}
class A {
    void method1() {
        System.out.println("A - method1");
        
       method2();
    }
 
    void method2() {
        System.out.println("A - method2");
    }
 
}
 
class B extends A {
    void method1() {
        System.out.println("B - method1");
        super.method1();
    }
 
    void method2() {
        System.out.println("B - method2");
    }
}