package animals;

public class Dog extends Canine {

	private String animalName;
	
	
	public Dog() {
		super();
	}

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "Woof!";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Omnivore";
	}

	@Override
	public int sleep() {
		// TODO Auto-generated method stub
		return 14;
	}

	@Override
	public boolean roam() {
		// TODO Auto-generated method stub
		return true;
	}

	public String getAnimalName() {
		return "Dog";
	}
	
	

}
