package Creational.Factory.NotificationExamples;

public class MessageNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new MessageNotification();
    }
}
