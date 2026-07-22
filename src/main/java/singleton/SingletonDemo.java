package singleton;

// Demo showing the Singleton fix: both references point to the same object
public class SingletonDemo {

    public static void main(String[] args) {
        // Retrieve the single instance twice
        CollegeConfig config1 = CollegeConfig.getInstance();
        CollegeConfig config2 = CollegeConfig.getInstance();

        System.out.println(config1.getCollegeName());
        System.out.println(config2.getCollegeName());

        // Prints true — config1 and config2 are the exact same instance in memory
        System.out.println(config1 == config2);
    }
}
