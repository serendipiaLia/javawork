package polymorphism.animals;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	} 
	
	/* public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	} */
}
class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	/*public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	} */
}
class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
	/* public void move() {
		System.out.println("호랑이가 사냥을 합니다.");
	} */
}
public class AnimalTest {
	//moveAnimal()정의 - 매개변수의 다형성
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	public static void main(String[] args) {
		//AnimalTest 객체 생성
		AnimalTest aTest = new AnimalTest();
		
		//Animal 타입으로 객체 생성 (다형성)
		Animal human = new Human();
		Animal eagle = new Eagle();
		Animal Tiger = new Tiger();
		
		//moveAnimal() 호출
		aTest.moveAnimal(human);	//Animal animal = new Human
		aTest.moveAnimal(eagle);
		aTest.moveAnimal(Tiger);
		// moveAnimal(human); //static을 붙힌 후 호출
	}
}
