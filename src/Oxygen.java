/**
 * @author Jisoo Kang
 * Student Number: 991636291
 * Campus: Trafalgar
 * Assignment_2
 */


public class Oxygen extends mHealth{
    public  double partPressOx;
    public  double oxygenSat;

    //Constant
    final double OXYGEN_CONST1 = 23400.00;
    final double OXYGEN_CONST2 = 150.00;

    //Accessor

    public double getOxygenSat() {
        return oxygenSat;
    }

    public double getPartPressOx(){
        return partPressOx;
    }

    //Mutator
    public void setOxygenSat(double oxygenSat) {
        this.oxygenSat = oxygenSat;
    }

    public void setPartPressOx(double partPressOx) {
        this.partPressOx = partPressOx;
    }

    public double computeOutput() {
        oxygenSat = 1.0 / (OXYGEN_CONST1 * (1.0/((Math.pow(partPressOx, 3)) + OXYGEN_CONST2 * partPressOx)) + 1.0);
        oxygenSat = oxygenSat * 100;
        return oxygenSat;
    }
}
