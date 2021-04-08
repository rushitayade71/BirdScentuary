package birdsScentuary;

public class ToyDuck extends Bird implements Flyable, Swimmable  {
static int count;

	@Override
	void incrementCount() {
		count++;
	}

	@Override
	int getCount() {
		return count;
	}

	@Override
	public void swim() {
		System.out.println("ToyDuck is swimming");
		
	}

	@Override
	public void fly() {
		System.out.println("ToyDuck can Fly");
	}

	@Override
	void decrementCount() {
		count--;
	}

}
