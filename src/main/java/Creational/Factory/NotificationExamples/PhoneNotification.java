package Creational.Factory.NotificationExamples;

public class PhoneNotification implements Notification {
    @Override
    public String notificationMessage() {
        return "This is a phone notification";
    }
}
