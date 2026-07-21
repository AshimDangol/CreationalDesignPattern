package singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// JUnit 5 tests to verify Singleton behavior
class CollegeConfigTest {

    @Test
    // Verify that two calls to getInstance() return the exact same object (reference equality)
    void testSingleInstance() {
        CollegeConfig instance1 = CollegeConfig.getInstance();
        CollegeConfig instance2 = CollegeConfig.getInstance();
        assertSame(instance1, instance2, "Both references should point to the same instance");
    }

    @Test
    // Verify the default college name is set correctly
    void testCollegeName() {
        CollegeConfig instance = CollegeConfig.getInstance();
        assertEquals("pcps college", instance.getCollegeName(), "College name should be pcps college");
    }

    @Test
    // Verify the default system version is set correctly
    void testSystemVersion() {
        CollegeConfig instance = CollegeConfig.getInstance();
        assertEquals("1.0", instance.getSystemVersion(), "System version should be 1.0");
    }

    @Test
    // Verify that getInstance() never returns null
    void testInstanceNotNull() {
        CollegeConfig instance = CollegeConfig.getInstance();
        assertNotNull(instance, "Singleton instance should not be null");
    }
}
