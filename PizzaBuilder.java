package builderpattern;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PizzaBuilder{
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

    public PizzaBuilder setChain(String chain){this.chain = chain;return this;}

    public PizzaBuilder setSize(String size){
        if(!isValidSize(size)){throw new IllegalArgumentException("Invalid Pizza size.");}
        this.size = size;
        return this; 
    }

    public PizzaBuilder setPepperoni (boolean pepperoni) {
        this.pepperoni = pepperoni; 
        return this; 
    }

    public PizzaBuilder setPeppers (boolean peppers) {
        this.peppers = peppers;
        return this; 
    }

    public PizzaBuilder setHam (boolean ham) {
        this.ham = ham; 
        return this; 
    }

    public PizzaBuilder setSausage (boolean sausage) {
        this.sausage = sausage;
        return this; 
    }

    public PizzaBuilder setChicken (boolean chicken) {
        this.chicken = chicken;
        return this; 
    }

    public PizzaBuilder setPesto (boolean pesto) {
        this.pesto = pesto;
        return this; 
    }

    public PizzaBuilder setMushrooms (boolean mushrooms) {
        this.mushrooms = mushrooms;
        return this; 
    }

    public PizzaBuilder setOlives (boolean olives) {
        this.olives = olives;
        return this;
    }

    public PizzaBuilder setSpicyPork (boolean spicyPork) {
        this.spicyPork = spicyPork;
        return this; 
    }

    public PizzaBuilder setBacon (boolean bacon) {
        this.bacon = bacon;
        return this; 
    }
    
    public PizzaBuilder setSpinach (boolean spinach) {
        this.spinach = spinach;
        return this; 
    }

    public PizzaBuilder setHamPineapple (boolean hamPineapple) {
        this.hamPineapple = hamPineapple; 
        return this; 
    }

    public PizzaBuilder setOnions (boolean onions) {
        this.onions = onions; 
        return this; 
    }
    
    public PizzaBuilder setTomatoBasil (boolean tomatoAndBasil) {
        this.tomatoAndBasil = tomatoAndBasil;
        return this; 
    }

    public PizzaBuilder setExtraCheese (boolean extraCheese) {
        this.extraCheese = extraCheese;
        return this; 
    }

    public PizzaBuilder setBeef (boolean beef) {
        this.beef = beef;
        return this; 
    }



    public Pizza create() {
        if (size == null) {
            throw new IllegalStateException("A valid pizza size must be used."); 
        }
        return new Pizza(chain, size, pepperoni, peppers, ham, sausage, chicken, pesto, mushrooms, olives, spicyPork, bacon, spinach, hamPineapple, onions, tomatoAndBasil, extraCheese, beef); 
    }

    
    private boolean isValidSize(String size){
        String[] validSizes = {"Small", "Medium", "Large"};
        for (int i = 0; i < validSizes.length; i++) {
            if (validSizes[i].equalsIgnoreCase(size)) {
                return true; 
            }
        }
        return false;
    }


    /*
    private boolean isValidSize(String size) {
        List<String> validSizes = Arrays.asList("Small", "Medium", "Large"); 
        return validSizes.contains(size.trim().toLowerCase()); 
    }
    */
    
}
