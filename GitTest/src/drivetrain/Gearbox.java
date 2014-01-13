package drivetrain;

import edu.wpi.first.wpilibj.Jaguar;

public class Gearbox {
    
    private Jaguar j1, j2;
    
    public Gearbox(int channel1, int channel2) {
        j1 = new Jaguar(channel1);
        j2 = new Jaguar(channel2);
    }
}
