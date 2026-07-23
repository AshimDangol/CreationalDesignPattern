package state.bad;

public class ApplicationManagerBad {
    private int state; // 0=Submitted, 1=Verified, 2=Approved, 3=Enrolled

    public ApplicationManagerBad() {
        this.state = 0;
    }

    public void next() {
        if (state == 0) {
            System.out.println("Application submitted — moving to Verified");
            state = 1;
        } else if (state == 1) {
            System.out.println("Application verified — moving to Approved");
            state = 2;
        } else if (state == 2) {
            System.out.println("Application approved — moving to Enrolled");
            state = 3;
        } else if (state == 3) {
            System.out.println("Already enrolled");
        }
    }

    public String getCurrentState() {
        switch (state) {
            case 0: return "Submitted";
            case 1: return "Verified";
            case 2: return "Approved";
            case 3: return "Enrolled";
            default: return "Unknown";
        }
    }
}
