//This is the implementation of the Singleton Pattern as suggested in Homework1.
//The purpose of the CityController class is to centralize the management of city infrastructure,
//specifically controlling streetlights, while ensuring there is only one instance of this controller.
//Singleton Pattern ensures that all parts of the application use the same instance of CityController.

public class CityController {

    // Static variable to hold the single instance of CityController
    private static CityController instance;

    // Field to hold the current AnalyticsStrategy
    private AnalyticsStrategy strategy;

    // Private constructor to restrict instantiation of the class from outside
    // This enforces the Singleton Pattern by preventing multiple instances from being created.
    // Which is the most important thing in this method as you mentioned in slides which you provided in class.
    private CityController() {
    }

    // Method to retrieve the single instance of CityController
    public static CityController getInstance() {
        if (instance == null) { // as I said before I leave it simple .
            instance = new CityController();
        }
        return instance; // Returning the single instance
    }

    // Method to control streetlights
    // This demonstrates the centralization of streetlight management in a single controller
    public void controlStreetLights(String action) {
        // Display the actions
        System.out.println("Street Lights are now " + action);
    }

        // method to set the current AnalyticsStrategy

    public void setAnalyticsStrategy(AnalyticsStrategy strategy) {
        this.strategy = strategy;
    }

    // Method to execute the current AnalyticsStrategy

    public void performAnalytics() {
        if (strategy != null) {
            System.out.println("Performing analytics...");
            strategy.analyze();
        } else {
            System.out.println("No analytics strategy is set.");
        }
    }

    // Method to access cloud services using the Proxy Pattern

    public void accessHybridCloud(CloudService service) {
        service.performOperation("Store traffic data");
    }
}
