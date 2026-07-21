package singleton;

// Demo showing the problem: two separate objects are created
public class SingletonBadDemo {

    public static void main(String[] args) {
        CollegeConfigBad config1 = new CollegeConfigBad();
        CollegeConfigBad config2 = new CollegeConfigBad();

        System.out.println(config1.getCollegeName());
        System.out.println(config2.getCollegeName());

        // Prints false — config1 and config2 are different objects in memory
        System.out.println(config1 == config2);
    }
}
