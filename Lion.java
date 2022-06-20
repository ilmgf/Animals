package animals;

public class Lion extends Feline implements Animal {
 
	private String animalName;
	
	public Lion() {
		super();
	}

	@Override
	public String makeNoise() {
		return "ROAR";
		// TODO Auto-generated method stub
		
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
		return "Lion";
	}

}
