
//This is the implementation of the Adapter Pattern as suggested in Homework1.

// PaymentSystem interface
interface PaymentSystem {
    void processPayment(double amount);
}

// Adapter for Cryptocurrency Payment
class CryptoPaymentAdapter implements PaymentSystem {
    private CryptoPayment cryptoPayment;

    public CryptoPaymentAdapter(CryptoPayment cryptoPayment) {
        this.cryptoPayment = cryptoPayment;
    }

    @Override
    public void processPayment(double amount) {
        this.cryptoPayment.makeCryptoPayment(amount);
    }
}

//  Cryptocurrency Payment Class
class CryptoPayment {
    public CryptoPayment() {
    }

    public void makeCryptoPayment(double amount) {
        System.out.println("Processing cryptocurrency payment of " + amount + " units.");
    }
}

// Fiat Payment Class
class FiatPayment implements PaymentSystem {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing fiat payment of $" + amount);
    }
}