// CloudService Interface
public interface CloudService {
    void performOperation(String operation);
}

// RealCloudService Class
class RealCloudService implements CloudService {
    @Override
    public void performOperation(String operation) {
        System.out.println("Performing cloud operation: " + operation);
    }
}

// HybridCloudProxy Class
class HybridCloudProxy implements CloudService {
    private RealCloudService realCloudService;

    public HybridCloudProxy() {
        this.realCloudService = new RealCloudService();
    }

    @Override
    public void performOperation(String operation) {
        System.out.println("Authenticating cloud request...");
        realCloudService.performOperation(operation);
    }
}
