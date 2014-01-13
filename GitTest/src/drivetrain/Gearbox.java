package drivetrain;

import edu.wpi.first.wpilibj.Jaguar;

public class Gearbox {
    
    private Jaguar j1, j2;
    
    public Gearbox(Jaguar j1, Jaguar j2) {
        this.j1 = j1;
        this.j2 = j2;
    }
}
