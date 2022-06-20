package animals;

public class Wolf extends Canine {
	private String animalName;

	public Wolf() {
		super();
	}

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "Howl";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Carnivore";
	}

	@Override
	public int sleep() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public boolean roam() {
		// TODO Auto-generated method stub
		return true;
	}

	public String getAnimalName() {
		return "Wolf";
	}

}
