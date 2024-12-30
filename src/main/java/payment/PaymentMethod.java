package payment;

public class PaymentMethod {
        private String methodName;
        private double balance;

        public PaymentMethod(String methodName, double balance) {
            this.methodName = methodName;
            this.balance = balance;
        }

        public boolean processPayment(double amount) {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
                System.out.println("Paid " + amount + " using " + methodName);
                return true;
            }
            System.out.println("Payment failed. Insufficient balance or invalid amount.");
            return false;
        }

        public void addFunds(double amount) {
            if (amount > 0) balance += amount;
            System.out.println("Added " + amount + " to " + methodName + ". Balance: " + balance);
        }

        public static void main(String[] args) {
            PaymentMethod card = new PaymentMethod("Credit Card", 500.00);
            card.processPayment(150.00);
            card.addFunds(200.00);
        }


}
