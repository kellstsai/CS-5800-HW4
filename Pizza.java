package builderpattern;
import java.util.*;

public class Pizza {
    private String chain;
    private String size;

    private boolean pepperoni;
    private boolean peppers;
    private boolean ham;
    private boolean sausage;
    private boolean chicken;
    private boolean pesto;
    private boolean mushrooms;
    private boolean olives;
    private boolean spicyPork;
    private boolean bacon;
    private boolean spinach;
    private boolean hamPineapple;
    private boolean onions;
    private boolean tomatoAndBasil;
    private boolean extraCheese;
    private boolean beef;

    public void eat(){
        System.out.println("The pizza chain is " + chain + ". The size of the pizza is " + size);
        List<String> toppingsList = getToppingsList();
        System.out.println("Toppings: " + String.join(", ", toppingsList));
    }

    public Pizza(String chain, String size, boolean pepperoni, boolean sausage, boolean mushrooms, boolean bacon, boolean onions, boolean extraCheese, boolean peppers, boolean chicken, boolean olives, boolean spinach,
        boolean tomatoAndBasil, boolean beef, boolean ham, boolean pesto, boolean spicyPork, boolean hamPineapple){
        this.chain = chain;
        this.size = size;
        this.pepperoni = pepperoni;
        this.peppers = peppers;
        this.ham = ham;
        this.sausage = sausage;
        this.chicken =chicken;
        this.pesto = pesto;
        this.mushrooms = mushrooms;
        this.olives = olives;
        this.spicyPork = spicyPork;
        this.bacon = bacon;
        this.spinach = spinach;
        this.hamPineapple = hamPineapple;
        this.onions = onions;
        this.tomatoAndBasil = tomatoAndBasil;
        this.extraCheese = extraCheese;
        this.beef = beef;
    }


    private List<String> getToppingsList() {
        List<String> toppings = new ArrayList<>();
        if (pepperoni) toppings.add("Pepperoni");
        if (peppers) toppings.add("Peppers");
        if (ham) toppings.add("Ham");
        if (sausage) toppings.add("Sausage");
        if (chicken) toppings.add("Chicken");
        if (pesto) toppings.add("Pesto");
        if (mushrooms) toppings.add("Mushrooms");
        if (olives) toppings.add("Olives");
        if (spicyPork) toppings.add("Spicy Pork");
        if (bacon) toppings.add("Bacon");
        if (spinach) toppings.add("Spinach");
        if (hamPineapple) toppings.add("Ham and Pineapple");
        if (onions) toppings.add("Onions");
        if (tomatoAndBasil) toppings.add("Tomato and Basil");
        if (extraCheese) toppings.add("Extra Cheese");
        if (beef) toppings.add("Beef");
        return toppings;
    }
}
