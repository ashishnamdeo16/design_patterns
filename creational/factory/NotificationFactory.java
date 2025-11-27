package creational.factory;


public class NotificationFactory {

    public static Notification sendNotification(String typeOfNotification){

        switch(typeOfNotification.toLowerCase()){
            case "email":
                return new EmailNotification();
            case "sms":
                return new SmsNotification();
            case "push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown notification type: " + typeOfNotification);
        }
    };

}
