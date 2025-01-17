package DataTypesExercises;

import org.testng.annotations.Test;

public class ReplaceDoublePrice {

    public String originalOffer = "12.99 euros";
    public String oldPrice = "12.99";
    public String newPrice = "7.99";

    public String updatedOffer = originalOffer.replace(oldPrice, newPrice);

    @Test
    public void replaceDoublePrice() {
        System.out.println("It was: " + originalOffer);
        System.out.println("Discounted offer is: " + updatedOffer);
        System.out.println(originalOffer.replace(oldPrice, newPrice));
    }

}
