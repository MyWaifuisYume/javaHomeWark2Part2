public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int deposit = 2500;
        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int currentBalance = balance + deposit + bonus;
        System.out.println("Баланс :" + currentBalance);
    }
}