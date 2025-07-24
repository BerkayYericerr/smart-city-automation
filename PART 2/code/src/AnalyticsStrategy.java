// AnalyticsStrategy Interface
public interface AnalyticsStrategy {
    void analyze();
}

// TrafficAnalytics Class
class TrafficAnalytics implements AnalyticsStrategy {
    @Override
    public void analyze() {
        double congestionLevel = Math.random() * 100;
        if (congestionLevel < 30) {
            System.out.println("Traffic is smooth with low congestion: " + congestionLevel + "%");
        } else if (congestionLevel < 70) {
            System.out.println("Traffic is moderate with medium congestion: " + congestionLevel + "%");
        } else {
            System.out.println("Traffic is heavy with high congestion: " + congestionLevel + "%");
        }
    }
}

// EnergyAnalytics Class
class EnergyAnalytics implements AnalyticsStrategy {
    @Override
    public void analyze() {
        double energyDemand = Math.random() * 1000;
        if (energyDemand < 300) {
            System.out.println("Energy demand is low: " + energyDemand + " kWh");
        } else if (energyDemand < 700) {
            System.out.println("Energy demand is moderate: " + energyDemand + " kWh");
        } else {
            System.out.println("Energy demand is high: " + energyDemand + " kWh");
        }
    }
}