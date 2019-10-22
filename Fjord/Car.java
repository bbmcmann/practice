public class Car{

    private String make;
    private String type;
    private int tankSize;
    private double time;

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
        double driveDistance = 60 * this.time;
        return driveDistance/(tankSize * 0.264172);
    }

}