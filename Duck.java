package birdsScentuary;

public class Duck extends Bird implements Swimmable,Flyable,Eatable{
    static int count;
    public void fly(){
        System.out.println("Duck can fly");
   }

   @Override
   public void eat() {
       System.out.println("Duck is eating fish");
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
   public  void swim() {
       System.out.println("Duck is swimming");
   }

@Override
void decrementCount() {
	count--;
}


}
