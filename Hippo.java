package animals;

public class Hippo implements Animal {

	String animalName;
	 public String getAnimalName() {
		return "hippo";
	}
	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "Growl";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "Omnivore";
	}

	@Override
	public int sleep() {
		// TODO Auto-generated method stub
		return 16;
	}

	@Override
	public boolean roam() {
		// TODO Auto-generated method stub
		return true;
	}

}
