package singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// JUnit 5 tests to verify Singleton behavior
class CollegeConfigTest {

    @Test
    void testSingleInstance() {
        CollegeConfig instance1 = CollegeConfig.getInstance();
        CollegeConfig instance2 = CollegeConfig.getInstance();
        assertSame(instance1, instance2, "Both references should point to the same instance");
    }

    @Test
    void testCollegeName() {
        CollegeConfig instance = CollegeConfig.getInstance();
        assertEquals("ABC College", instance.getCollegeName(), "College name should be ABC College");
    }

    @Test
    void testSystemVersion() {
        CollegeConfig instance = CollegeConfig.getInstance();
        assertEquals("1.0", instance.getSystemVersion(), "System version should be 1.0");
    }

    @Test
    void testInstanceNotNull() {
        CollegeConfig instance = CollegeConfig.getInstance();
        assertNotNull(instance, "Singleton instance should not be null");
    }
}
