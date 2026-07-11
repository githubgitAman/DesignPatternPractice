package Creational.Factory.NotificationExamples;

public class MessageNotification implements Notification {
    @Override
    public String notificationMessage() {
        return "This is a notification message";
    }
}
