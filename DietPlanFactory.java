package abstractfactory;

public interface DietPlanFactory {
    Carbs createCarbs();

    Protein createProtein();

    Fats createFats();
}
