package L10.abstraction.polymorphism.Task03EasyInstanceofBranching;

public class Main {

    public static void main(String[] args) {

        Notification[] not = {
                new EmailNotification(),
                new SmsNotification()
        };

        for (Notification n : not) {

            n.notifyUser();

            if (n instanceof EmailNotification) {
                System.out.println("Email is active");
                System.out.println();
            }

            if (n instanceof SmsNotification) {
                System.out.println("SMS is active");
                System.out.println();
            }
        }
    }
}
