package Creational.Factory.NotificationExamples;

public class Client {
    public static void main(String[] args) {
        NotificationFactory notificationFactoryObject = new MessageNotificationFactory();
        Notification notificationMessage = notificationFactoryObject.createNotification();
        System.out.println(notificationMessage);
    }
}
