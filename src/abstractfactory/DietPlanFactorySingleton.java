package abstractfactory;

public class DietPlanFactorySingleton {
    private static DietPlanFactory instance;

    private DietPlanFactorySingleton() {}

    public static synchronized DietPlanFactory getInstance() {
        if (instance == null) {
            instance = new NoRestrictionFactory();
        }
        return instance;
    }

    public static synchronized void setInstance(DietPlanFactory factory) {
        instance = factory;
    }
}