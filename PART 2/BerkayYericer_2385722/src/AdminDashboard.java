// AdminDashboard Class
public class AdminDashboard {

    private CityController cityController;
    public AdminDashboard(CityController cityController) {
        this.cityController = cityController;
    }

    public void viewAnalytics() {
        System.out.println("Displaying analytics on Admin Dashboard...");

        cityController.setAnalyticsStrategy(new TrafficAnalytics());
        cityController.performAnalytics();
        cityController.setAnalyticsStrategy(new EnergyAnalytics());
        cityController.performAnalytics();
    }
    public void manageCityInfrastructure() {
        System.out.println("Managing city infrastructure via Admin Dashboard...");

        cityController.controlStreetLights("ON");
        cityController.controlStreetLights("OFF");
    }
    public void monitorCloudServices(CloudService cloudService) {
        System.out.println("Monitoring cloud services via Admin Dashboard...");
        cloudService.performOperation("Check system status");
    }
}
