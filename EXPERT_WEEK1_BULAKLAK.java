package expert_week1_bulaklak;

public class EXPERT_WEEK1_BULAKLAK {
    public static void main(String[] args) {
        
        byte number = 127;
        number++;

        System.out.println("Overflow result: " + number);
        
        String flowerString1 = new String("Flower");
        String flowerString2 = new String("Flower");
        String flowerString3 = "Flower";

        // == checks if they are the same object
        System.out.println("String 1 == String 2: " + (flowerString1 == flowerString2));
        // False because they are two different objects

        System.out.println("String 1 == String 3: " + (flowerString1 == flowerString3));
        // False because String 1 is a new object

        System.out.println("String 2 == String 3: " + (flowerString2 == flowerString3));
        // False because String 2 is a new object

        // .equals() checks if the text is the same
        System.out.println("String 1.equals(String 2): " + flowerString1.equals(flowerString2));
        System.out.println("String 1.equals(String 3): " + flowerString1.equals(flowerString3));
        System.out.println("String 2.equals(String 3): " + flowerString2.equals(flowerString3));
 
        // Sharing the same array
        int[] flowers = {10, 20, 30};
        int[] otherFlowers = flowers;

        otherFlowers[0] = 100;

        System.out.println("flowers[0]: " + flowers[0]);
        System.out.println("otherFlowers[0]: " + otherFlowers[0]);
    }
    
}
