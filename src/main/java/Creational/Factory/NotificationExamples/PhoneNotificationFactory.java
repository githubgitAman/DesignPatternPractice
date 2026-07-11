package Creational.Factory.NotificationExamples;

public class PhoneNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new PhoneNotification();
    }
}
