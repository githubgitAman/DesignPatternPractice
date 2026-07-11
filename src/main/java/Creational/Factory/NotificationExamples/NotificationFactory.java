package Creational.Factory.NotificationExamples;

public class NotificationFactory {
    public static Notification createNotification(NOTIFICATIONTYPE type){
        if(type.equals(NOTIFICATIONTYPE.EMAIL)){
            return new EmailNotification();
        }
        else if(type.equals(NOTIFICATIONTYPE.MESSAGE)){
            return new MessageNotification();
        }
        else{
            return new PhoneNotification();
        }
    }
}
