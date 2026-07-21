package singleton;

// Bad design: allows unrestricted instantiation — multiple objects can be created
public class CollegeConfigBad {

    private String collegeName;
    private String systemVersion;

    public CollegeConfigBad() {
        this.collegeName = "ABC College";
        this.systemVersion = "1.0";
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getSystemVersion() {
        return systemVersion;
    }
}
