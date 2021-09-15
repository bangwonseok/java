package chapter9_1;

public class Ex1 {

	public static void main(String[] args) {
		AnimalMove(new Human());
		AnimalMove(new Tiger());
		AnimalMove(new Eagle());
	}
	
	public static void AnimalMove(Animal animal) {
		animal.move();
		if(animal instanceof Human) {
			Human human = (Human)animal; //  <- �� ��ȯ
			human.breads();
		} else if (animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal; // < - �� ��ȯ
			tiger.breads();
		} else if (animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;
			eagle.hatch();
		}
	}
}
