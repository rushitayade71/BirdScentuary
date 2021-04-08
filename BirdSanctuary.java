package birdsScentuary;

	import java.util.ArrayList;
	import  java.util.List;

	public class BirdSanctuary {

	    List<Bird> birdList = new ArrayList<>();
	    private  static BirdSanctuary instance = null;
	    private BirdSanctuary() {}

	    public synchronized static BirdSanctuary getInstance() {
	        if(instance==null)
	            instance = new BirdSanctuary();
	        return instance;
	    }
	    public void addBird(Bird bird) {
	        birdList.add(bird);
	        bird.incrementCount();
	    }
	    
	    public void removeBird(Bird bird) {
	    	birdList.remove(bird);
	    	bird.decrementCount();
	    }

	    public void print() {
	    	   for (Bird bird : birdList) {
	               System.out.println(bird.getCount());
	               if(bird instanceof Flyable)
	                   ((Flyable)bird).fly();
	               if(bird instanceof Swimmable)
	                   ( (Swimmable) bird).swim();
	               if(bird instanceof Eatable)
	            	   ((Eatable) bird).eat();

	           }
	       }
	}

