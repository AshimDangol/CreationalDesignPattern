package singleton;

// Singleton: ensures only one instance exists throughout the application
public class CollegeConfig {

    // Eagerly created single instance (thread-safe by default)
    private static CollegeConfig instance = new CollegeConfig();

    private String collegeName;
    private String systemVersion;

    // Private constructor prevents external instantiation
    private CollegeConfig() {
        this.collegeName = "ABC College";
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
