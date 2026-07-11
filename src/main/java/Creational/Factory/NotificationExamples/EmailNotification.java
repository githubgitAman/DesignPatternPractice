package Creational.Factory.NotificationExamples;

public class EmailNotification implements Notification {
    @Override
    public String notificationMessage() {
        return "This is an email notification";
    }
}
