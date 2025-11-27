package creational.factory;

public class TestExample {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.sendNotification("push");
        notification.notifyUser();
    }
}
