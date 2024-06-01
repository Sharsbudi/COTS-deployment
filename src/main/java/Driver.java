import src.main.java.Counter;

public class Driver {

    public static void main(String[] args) {
        
        Counter counter = new Counter();
        
        System.out.println("Current count: " + counter.getCount());
        
        counter.increment();
        System.out.println("Current count: " + counter.getCount());
        
        counter.decrement();
        System.out.println("Current count: " + counter.getCount());
        
        counter.increaseBy(5);
        System.out.println("Current count after increaseBy 5: " + counter.getCount());
        
        counter.decreaseBy(3);
        System.out.println("Current count after decreaseBy 3: " + counter.getCount());
        
        counter.multiplyBy(2);
        System.out.println("Current count after multiplyBy 2: " + counter.getCount());
        
        counter.triple();
        System.out.println("Current count after triple: " + counter.getCount());
        
        counter.powerBy(2);
        System.out.println("Current count after powerBy 2: " + counter.getCount());
        
        System.out.println("Is count even? " + counter.isCountEven());
    }

}
