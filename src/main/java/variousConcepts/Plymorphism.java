package variousConcepts;

public class Plymorphism {

}

class Animal {
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Pig extends Animal {
		public Pig() {
			
		}
		
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	  public void pigSleep() {
		  System.out.println("Pig sleeps");
	  }
	}

	class Dog extends Animal {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	}

	class Main {
	  public static void main(String[] args) {
	    Animal myAnimal = new Animal();  // Create a Animal object
	    
	    Pig pig = new Pig();
	    pig.pigSleep();
	    pig.animalSound();
	    
	    Animal pig1 = new Pig();
	    pig1.animalSound();
	    
	    
	   /* Animal myPig = new Pig();  // Create a Pig object
	    Animal myDog = new Dog();  // Create a Dog object
	    myAnimal.animalSound();
	    myPig.animalSound();
	    myDog.animalSound();*/
	  }
	}
