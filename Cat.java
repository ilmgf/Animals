package animals;

public class Cat extends Feline {
	private String animalName;
	
	

	public Cat() {
		super();
	}

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "Meow.";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Omnivore";
	}

	@Override
	public int sleep() {
		// TODO Auto-generated method stub
		return 15;
	}

	@Override
	public boolean roam() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getAnimalName() {
		return "Cat";
	}

}
