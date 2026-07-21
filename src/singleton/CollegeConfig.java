package singleton;

// Singleton pattern: ensures only one instance exists throughout the application
// Eager initialization guarantees thread safety without synchronized blocks
public class CollegeConfig {

    // Eagerly created single instance (JVM guarantees single initialization)
    private static final CollegeConfig instance = new CollegeConfig();

    private String collegeName;
    private String systemVersion;

    // Private constructor prevents external instantiation via 'new'
    private CollegeConfig() {
        this.collegeName = "pcps college";
        this.systemVersion = "1.0";
    }

    // Global access point — always returns the same instance
    public static CollegeConfig getInstance() {
        return instance;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getSystemVersion() {
        return systemVersion;
    }
}
