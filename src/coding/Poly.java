package coding;
  
 class Animal{
	 public void animalSound() {
		 System.out.println("The animal makes a sound");
	 }
 }
 class cow extends Animal{
	
	 public void animalSound() {
		 System.out.println("The cow makes a sound");
	 }
 }
 class Dog extends Animal{
	 
	 public void animalSound() {
		 System.out.println("The Dow makes a sound");
	 }
 }
 public class Poly {
  public static void main(String[] args) {
	  Animal myAnimal =new Animal();
	  Animal  mycow =new  cow();
	  Animal myDog =new Dog();
	  myAnimal.animalSound();
	  mycow.animalSound();
	  myDog.animalSound();
  }
}