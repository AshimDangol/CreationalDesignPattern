package facade;

// Subsystem component — generates sequential roll numbers starting from 1001
public class RollNumberAssigner {
    private static int counter = 1000;

    public int assignRollNumber() {
        return ++counter;
    }
}
