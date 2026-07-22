package singleton;

// Bad design: public constructor allows unrestricted instantiation — multiple objects can be created
// Violates the Singleton principle; every caller gets a distinct instance
public class CollegeConfigBad {

    private String collegeName;
    private String systemVersion;

    // Public constructor — can be called any number of times
    public CollegeConfigBad() {
        this.collegeName = "pcps college";
        this.systemVersion = "1.0";
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getSystemVersion() {
        return systemVersion;
    }
}
