public class Fjord{

    public static void main(String[] args) {
    
        Car takk = new Car("Takk", "Sedan", 40, 9.5);
        Car beklager = new Car("Beklager", "Sedan", 45, 7.5);
        Car vakker = new Car("Vakker", "SUV", 60, 7.5);
        Car stygg = new Car("Stygg", "SUV", 50, 9.0);
        Car vanskellig = new Car("Vanskelling", "Truck", 60, 8.75);
        Car lastebil = new Car("Lastebil", "Truck", 70, 5.5);

        Car[] cars = {takk, beklager, vakker, stygg, vanskellig, lastebil};

        for(int i = 6; i > 0; i--){
            if(cars[i-1].getType().equals("SUV") && cars[i-1].findMPG() > 40){
                System.out.println(cars[i-1]);
                System.out.println("The " + cars[i-1].getType() + " meets government regulations.");
            }
            else if(cars[i-1].getType().equals("Sedan") && cars[i-1].findMPG() > 50){
                System.out.println(cars[i-1]);
                System.out.println("The " + cars[i-1].getType() + " meets government regulations.");
            }
            else if(cars[i-1].getType().equals("Truck") && cars[i-1].findMPG() > 30){
                System.out.println(cars[i-1]);
                System.out.println("The " + cars[i-1].getType() + " meets government regulations.");
            }
            else{
                System.out.println(cars[i-1]);
                System.out.println("***Car does not meet regulations***");
            }
        
        }

    }

}