package L10.abstraction.polymorphism.Task03EasyInstanceofBranching;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Email sent");
    }
}
