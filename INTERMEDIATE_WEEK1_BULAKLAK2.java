package intermediate_week1_bulaklak;

public class INTERMEDIATE_WEEK1_BULAKLAK {
    public static void main(String[] args) {
        int flowerQuantity = 5;
        double flowerUnitPrice = 99.0;
        String flowerStoreName = "JM'S FLOWERSHOP";
        
        System.out.println("   RECEIPT   ");
        System.out.println("Quantity: " + flowerQuantity);  
        System.out.println("Unit Price: " + flowerUnitPrice);
        
        // Total cost should not be int because the unit price is a double
        System.out.println("Total Cost: " + flowerUnitPrice * flowerQuantity );
        System.out.println("Store Name: " + flowerStoreName);
    }   
}
