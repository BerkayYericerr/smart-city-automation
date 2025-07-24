//Berkay Yericer 2385722
//This is what I realized while studying this assignment. I realized that this assignment was given not to improve our coding skills,
//But to understand how Design patterns are used and how they are applied to codes.
//and in order for me to do this homework, I researched design patterns both from slides and from the Internet and studied their sample use.
//That's why I wrote simple codes, but I came up with an assignment where the design patterns are clearly defined.

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        // Singleton Pattern Ensures only one instance of CityController is created as you mentioned in PDF like (Suggested Key Patterns)
        CityController cityController = CityController.getInstance();

        // Command Pattern - Using RemoteControl to control streetlights (Suggested Key Patterns)
        RemoteControl remoteControl = new RemoteControl();
        // Turn ON the streetlights
        remoteControl.setCommand(new TurnOnStreetLightsCommand(cityController));
        remoteControl.pressButton();
        // Turn OFF the streetlights
        remoteControl.setCommand(new TurnOffStreetLightsCommand(cityController));
        remoteControl.pressButton();

        // Observer Pattern - Notify Residents and Authorities of security events (Suggested Key Patterns)
        CityMonitor monitor = new CityMonitor();
        // Add observers (lıke Residents and Authorities)
        Resident resident1 = new Resident("Berkay Yericer");
        Authority authority1 = new Authority("Fire Department");
        monitor.addObserver(resident1);
        monitor.addObserver(authority1);
        // Notify all observers about a security breach
        monitor.notifyObservers("Security breach detected!");

        // Adapter Pattern - Process cryptocurrency payments using CryptoPaymentAdapter (Suggested Key Patterns)
        CryptoPayment cryptoPayment = new CryptoPayment();
        PaymentSystem cryptoAdapter = new CryptoPaymentAdapter(cryptoPayment);
        // Process a cryptocurrency payment of 100.0 units
        cryptoAdapter.processPayment(100.0);

        PaymentSystem fiatPayment = new FiatPayment();
        fiatPayment.processPayment(50.0);


        DailyRoutine cityRoutine = new CityRoutine();
        cityRoutine.executeRoutine();


        SecurityManager securityManager = new SecurityManager();
        securityManager.authenticate("Admin", "Multi-Factor Authentication");
        System.out.println(securityManager.encrypt("Sensitive Data"));

        // Hybrid-Cloud Integration
        CloudService hybridCloud = new HybridCloudProxy();
        cityController.accessHybridCloud(hybridCloud);

        // strategy Pattern
        cityController.setAnalyticsStrategy(new TrafficAnalytics());
        cityController.performAnalytics();
        cityController.setAnalyticsStrategy(new EnergyAnalytics());
        cityController.performAnalytics();


        // AdminDashboard
        AdminDashboard adminDashboard = new AdminDashboard(cityController);
        adminDashboard.viewAnalytics();
        adminDashboard.manageCityInfrastructure();

            // ResidentPortal
        ResidentPortal residentPortal = new ResidentPortal(fiatPayment);
        residentPortal.manageDevices();
        residentPortal.viewUtilityData();
        residentPortal.makePayment(50.0, false);


        System.out.println("Switching ResidentPortal to CryptoPayment...");
        ResidentPortal cryptoResidentPortal = new ResidentPortal(cryptoAdapter);
        cryptoResidentPortal.makePayment(100.0, true);
    }
}

//Suggested Key Patterns in Homework1
// Singleton Pattern for the CityController to centralize management.
// Command Pattern for commands such as turning on/off street lights or processing payments.
// Observer Pattern to send notifications for security events or city-wide updates.
// Adapter Pattern to integrate multiple cryptocurrencies into the digital banking system.
// Template Method Pattern for automating daily routines in city services, like lighting schedules or security checks.
