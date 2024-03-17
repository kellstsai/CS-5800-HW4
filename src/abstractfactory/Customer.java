package abstractfactory;

public class Customer {
    private String name;
    private DietPlan dietPlan;

    public Customer(String name, DietPlan dietPlan){
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public void mealPlan(){
        DietPlanFactory factory = DietPlanFactorySingleton.getInstance();

        Carbs carbs = factory.createCarbs();
        Protein protein = factory.createProtein();
        Fats fats = factory.createFats();

        System.out.println("Customer: " + name);
        System.out.println("Diet Plan: " + dietPlan);
        System.out.println("Carbs: " + carbs.getFood());
        System.out.println("Protein: " + protein.getFood());
        System.out.println("Fats: " + fats.getFood());
        System.out.println("************");
    }
}
