package birdsScentuary;

public class Parrot extends Bird implements Flyable, Eatable{

    static  int count;

     public void fly(){
        System.out.println("parrot fly");
    }

    @Override
	public void eat() {
        System.out.println("Parrot is eating");
    }

    @Override
    void incrementCount() {
        count++;
    }

    @Override
    int  getCount() {
        return count;
    }

	@Override
	void decrementCount() {
	count--;
	}


}
