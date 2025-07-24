// ResidentPortal Class
public class ResidentPortal {

    private PaymentSystem paymentSystem;
    public ResidentPortal(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    // Method to manage home devices
    public void manageDevices() {
        System.out.println("Managing home devices via Resident Portal...");

        System.out.println("Turning ON the thermostat...");
        System.out.println("Turning OFF the lights...");
    }

    public void viewUtilityData() {
        System.out.println("Viewing utility data via Resident Portal...");

        System.out.println("Electricity Usage: 350 kWh");
        System.out.println("Water Usage: 1200 liters");
    }

            // method to makıng a payment
    public void makePayment(double amount, boolean useCrypto) {
        System.out.println("Making a payment via Resident Portal...");
        if (useCrypto) {
            System.out.println("Processing cryptocurrency payment...");
        } else {
            System.out.println("Processing fiat payment...");
        }
        paymentSystem.processPayment(amount);
    }
}
