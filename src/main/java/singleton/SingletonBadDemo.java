package singleton;

// Demo showing the problem: calling 'new' twice creates two separate objects
public class SingletonBadDemo {

    public static void main(String[] args) {
        // Each call to 'new' creates a distinct object
        CollegeConfigBad config1 = new CollegeConfigBad();
        CollegeConfigBad config2 = new CollegeConfigBad();

        System.out.println(config1.getCollegeName());
        System.out.println(config2.getCollegeName());

        // Prints false — config1 and config2 are different objects in memory
        System.out.println(config1 == config2);
    }
}
