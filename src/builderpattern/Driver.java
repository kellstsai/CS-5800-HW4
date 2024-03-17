package builderpattern;
public class Driver{
    public static void main(String[] args) {
        Pizza pizza1 = new PizzaBuilder()
        .setChain("Pizza Hut")
        .setSize("Small")
        .setBeef(true)
        .setOlives(true)
        .setOnions(true)
        .create();

        Pizza pizza2 = new PizzaBuilder()
        .setChain("Papa John's")
        .setSize("Medium")
        .setBeef(true)
        .setOlives(true)
        .setOnions(true)
        .setPesto(true)
        .setHam(true)
        .setChicken(true)
        .create();

        Pizza pizza3 = new PizzaBuilder()
        .setChain("Domino's")
        .setSize("Large")
        .setBeef(true)
        .setOlives(true)
        .setOnions(true)
        .setPesto(true)
        .setChicken(true)
        .setPepperoni(true)
        .setHamPineapple(true)
        .setBacon(true)
        .setPeppers(true)
        .create();

        pizza1.eat();
        pizza2.eat();
        pizza3.eat();

        Pizza pizzaHut1 = new PizzaBuilder()
        .setChain("Pizza Hut")
        .setSize("Large")
        .setExtraCheese(true)
        .setMushrooms(true)
        .setBacon(true)
        .create();

        Pizza pizzaHut2 = new PizzaBuilder()
        .setChain("Pizza Hut")
        .setSize("Small")
        .setExtraCheese(true)
        .setMushrooms(true)
        .create();

        Pizza littleCaesars1 = new PizzaBuilder()
        .setChain("Little Caesars")
        .setSize("Medium")
        .setExtraCheese(true)
        .setMushrooms(true)
        .setBacon(true)
        .setPepperoni(true)
        .setBeef(true)
        .setHam(true)
        .setPesto(true)
        .setOnions(true)
        .create();

        Pizza littleCaesars2 = new PizzaBuilder()
        .setChain("Little Caesars")
        .setSize("Medium")
        .setExtraCheese(true)
        .setMushrooms(true)
        .setBacon(true)
        .setHam(true)
        .setPesto(true)
        .setOnions(true)
        .create();

        Pizza Dominos1 = new PizzaBuilder()
        .setChain("Dominos")
        .setSize("Small")
        .setBacon(true)
        .create();

        Pizza Dominos2 = new PizzaBuilder()
        .setChain("Dominos")
        .setSize("Small")
        .setBacon(true)
        .setPesto(true)
        .setMushrooms(true)
        .create();


        pizzaHut1.eat();
        pizzaHut2.eat();;
        littleCaesars1.eat();
        littleCaesars2.eat();
        Dominos1.eat();
        Dominos2.eat();
    }
}
