package singleton;

import java.util.Scanner;

public class CollegeConfigTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CollegeConfig Test ===");
        testSingleInstance();
        testInstanceNotNull();

        System.out.print("Enter expected college name: ");
        String expectedName = scanner.nextLine();
        testCollegeName(expectedName);

        System.out.print("Enter expected system version: ");
        String expectedVersion = scanner.nextLine();
        testSystemVersion(expectedVersion);

        scanner.close();
    }

    static void testSingleInstance() {
        CollegeConfig instance1 = CollegeConfig.getInstance();
        CollegeConfig instance2 = CollegeConfig.getInstance();
        if (instance1 == instance2) {
            System.out.println("PASS: Both references point to the same instance");
        } else {
            System.out.println("FAIL: References point to different instances");
        }
    }

    static void testCollegeName(String expected) {
        CollegeConfig instance = CollegeConfig.getInstance();
        if (expected.equals(instance.getCollegeName())) {
            System.out.println("PASS: College name is " + expected);
        } else {
            System.out.println("FAIL: Expected " + expected + " but got " + instance.getCollegeName());
        }
    }

    static void testSystemVersion(String expected) {
        CollegeConfig instance = CollegeConfig.getInstance();
        if (expected.equals(instance.getSystemVersion())) {
            System.out.println("PASS: System version is " + expected);
        } else {
            System.out.println("FAIL: Expected " + expected + " but got " + instance.getSystemVersion());
        }
    }

    static void testInstanceNotNull() {
        CollegeConfig instance = CollegeConfig.getInstance();
        if (instance != null) {
            System.out.println("PASS: Instance is not null");
        } else {
            System.out.println("FAIL: Instance is null");
        }
    }
}
