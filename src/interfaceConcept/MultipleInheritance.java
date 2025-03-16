package interfaceConcept;

public class MultipleInheritance implements Sample,Demo
{
	@Override
	public void squre() {
		System.out.println("From Squre method........");
		
	}

	@Override
	public void demo1() {
		System.out.println("From demo1() method......");
		
	}
	
	public static void main(String[] args)
	{
//		MultipleInheritance mi=new MultipleInheritance();
//		mi.squre();
//		mi.demo2();
//		Demo.demo3();
//		
//		//MultipleInheritance mi2=new Sample();
//		
//		
//		Sample mi1=new MultipleInheritance();
//		mi1.area();
		
		MultipleInheritance m2=new MultipleInheritance();
		Sample s=(Sample) m2;//Rule 1-- yes, Rule 2-- yes, Rule 3--yes
		s.area();
		s.squre();
		Demo d=(Demo) m2;
		d.demo1();
		d.demo2();
		
		
		
			
			
	}
}
