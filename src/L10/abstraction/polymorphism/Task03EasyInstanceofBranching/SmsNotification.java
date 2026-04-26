package L10.abstraction.polymorphism.Task03EasyInstanceofBranching;

public class SmsNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("SMS sent");
    }
}
