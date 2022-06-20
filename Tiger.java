package animals;

public class Tiger extends Feline {
	private String animalName;

	public Tiger() {
		super();
	}

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "ROAR";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Carnivore";
	}

	@Override
	public int sleep() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public boolean roam() {
		// TODO Auto-generated method stub
		return true;
	}

	public String getAnimalName() {
		return "Tiger";
	}


}
