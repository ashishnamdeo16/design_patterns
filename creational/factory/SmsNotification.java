package creational.factory;

public class SmsNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending Sms Notification to the User..");
    }
}
