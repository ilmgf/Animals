package animals;

public class AnimalManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TIGER
		Tiger t = new Tiger();
		System.out.println("This animal is a " + t.getAnimalName());
		System.out.println("What sound does this animal make? " + t.makeNoise());
		System.out.println("This animal is a " + t.eat());
		System.out.println("This animal is said to sleep around " + t.sleep() + " hours a day.");
		System.out.println("Does this animal roam? " + t.roam());
		System.out.println("-------------------------------------------------------");
		
		Cat c = new Cat();
		System.out.println("This animal is a " + c.getAnimalName());
		System.out.println("What sound does this animal make? " + c.makeNoise());
		System.out.println("This animal is a " + c.eat());
		System.out.println("This animal is said to sleep around " + c.sleep() + " hours a day.");
		System.out.println("Does this animal roam? " + c.roam());
		System.out.println("-------------------------------------------------------");
		
		Lion l = new Lion();
		System.out.println("This animal is a " + l.getAnimalName());
		System.out.println("What sound does this animal make? " + l.makeNoise());
		System.out.println("This animal is a " + l.eat());
		System.out.println("This animal is said to sleep around " + l.sleep() + " hours a day.");
		System.out.println("Does this animal roam? " + l.roam());
		System.out.println("-------------------------------------------------------");
		
		Dog d = new Dog();
		System.out.println("This animal is a " + d.getAnimalName());
		System.out.println("What sound does this animal make? " + d.makeNoise());
		System.out.println("This animal is a " + d.eat());
		System.out.println("This animal is said to sleep around " + d.sleep() + " hours a day.");
		System.out.println("Does this animal roam? " + d.roam());
		System.out.println("-------------------------------------------------------");
		
		Wolf w = new Wolf();
		System.out.println("This animal is a " + w.getAnimalName());
		System.out.println("What sound does this animal make? " + w.makeNoise());
		System.out.println("This animal is a " + w.eat());
		System.out.println("This animal is said to sleep around " + w.sleep() + " hours a day.");
		System.out.println("Does this animal roam? " + w.roam());
		System.out.println("-------------------------------------------------------");
		
		Hippo h = new Hippo();
		System.out.println("This animal is a " + h.getAnimalName());
		System.out.println("What sound does this animal make? " + h.makeNoise());
		System.out.println("This animal is a " + h.eat());
		System.out.println("This animal is said to sleep around " + h.sleep() + " hours a day.");
		System.out.println("Does this animal roam? " + h.roam());


	}

}
