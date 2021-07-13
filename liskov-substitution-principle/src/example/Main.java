package example;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("André");

        System.out.println(user.getName());

        // changing to child class
        PremiumUser premiumUser = new PremiumUser();
        premiumUser.setName("André");

        System.out.println(premiumUser.getName());
    }
}
