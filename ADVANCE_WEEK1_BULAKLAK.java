package advance_week1_bulaklak;

public class ADVANCE_WEEK1_BULAKLAK {
    public static void main(String[] args) {
        
        // I used casting here to get the whole number of meters
        double flowerCM = 275.5;
        int flowerWM = (int) (flowerCM / 100);
        
        double flowerRemainingC = flowerCM - (flowerWM * 100);
        // No cast is needed because int can automatically become double
        double flowerM = flowerWM;
        
        // The decimal part will be lost when double is converted to int
        int flowerWN = (int) flowerCM;
        
        System.out.println("Centimeters: " + flowerCM);
        System.out.println("Whole Meters: " + flowerWM);
        System.out.println("Remaining Centimeters: " + flowerRemainingC);
        System.out.println("Meters as Double: " + flowerM);
        System.out.println("Double to Int: " + flowerWN);
    }
}
