package abstractfactory;

public class Driver {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Ashley", DietPlan.PALEO);
        Customer customer2 = new Customer("Alex", DietPlan.NUT_ALLERGY);
        Customer customer3 = new Customer("Janet", DietPlan.NO_RESTRICTION);
        Customer customer4 = new Customer("Derek", DietPlan.NO_RESTRICTION);
        Customer customer5 = new Customer("Emily", DietPlan.NO_RESTRICTION);
        Customer customer6 = new Customer("Henry", DietPlan.VEGAN);

        customer1.mealPlan();
        customer2.mealPlan();
        customer3.mealPlan();
        customer4.mealPlan();
        customer5.mealPlan();
        customer6.mealPlan();
    }
}
