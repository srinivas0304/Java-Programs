package exceptions;

 class Animal {
	public void makeSound()
	{
		System.out.println("Animal Makes Sound.....");
	}

}

class Dog extends Animal
{
	public void makeSound() {
		System.out.println("Dog barks.....");
	}
}

class Cat extends Animal
{
	public void makeSound()
	{
		System.out.println("Cat meows.....");
	}
}

public class Main
{
	public static void main(String[] args) 
	{
		//Animal animal=new Dog();
		//animal.makeSound();
		
//		Animal animal=new Animal();
//		Cat cat=(Cat) animal;
//		cat.makeSound();
		
		//To avoid this, use the instanceof operator to check the object's type before casting
		Animal animal=new Dog();
		if(animal instanceof Cat)
		{
			Cat cat=(Cat) animal;
			cat.makeSound();
		}
		else
		{
			System.out.println("Animal is not a cat.....");
		}	
		
	}
}
