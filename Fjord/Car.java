public class Car{

    private String make;
    private String type;
    private int tankSize;
    private double time;

    public static final double LITER_CONVERSION = 0.264172;
    public static final double DRIVE_SPEED = 60.0;

    public Car(String make, String type, int tankSize, double time){
        this.make = make;
        this.type = type;
        this.tankSize = tankSize;
        this.time = time;
    }

    public String getMake(){
        return this.make;
    }

    public String getType(){
        return this.type;
    }

    public int getTankSize(){
        return this.tankSize;
    }

    public double getTime(){
        return this.time;
    }

    public double findMPG(){
        double driveDistance = DRIVE_SPEED * this.time;
        return driveDistance/(tankSize * LITER_CONVERSION);
    }

    public String toString(){
        return make + " with type " + type + " gets " + findMPG() + " MPG.";
    }

    

}