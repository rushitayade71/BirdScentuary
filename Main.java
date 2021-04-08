package birdsScentuary;

public class Main {
	public static void main(String[] args) {
		BirdSanctuary sanctuary = BirdSanctuary.getInstance();

        Bird duck = new Duck();
        Bird duck1 = new Duck();
        Bird parrot = new Parrot();
        Bird penguin = new Penguin();
        Bird toyduck = new ToyDuck();
        		
        sanctuary.addBird(duck);
        sanctuary.addBird(duck1);
        sanctuary.addBird(parrot);
        sanctuary.addBird(penguin);
        sanctuary.addBird(penguin);
        sanctuary.addBird(toyduck);
        
        sanctuary.print();
        
        sanctuary.removeBird(duck1); 
        
        sanctuary.print();
        
       // System.out.println(duck1.getCount());
       // System.out.println(duck.getCount());
       // System.out.println(parrot.getCount());
//        System.out.println(penguin.getCount());
//        System.out.println(toyduck.getCount());
        
	}
}
