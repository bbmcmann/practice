public class Fjord{

    public static void main(String[] args) {
    
        Car takk = new Car("Takk", "Sedan", 50, 8.0);
        Car beklager = new Car("Beklager", "Sedan", 40, 7.5);
        Car vakker = new Car("Vakker", "SUV", 60, 5.0);
        Car stygg = new Car("Stygg", "SUV", 55, 6.0);
        Car vanskellig = new Car("Vanskelling", "Truck", 65, 4.75);
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