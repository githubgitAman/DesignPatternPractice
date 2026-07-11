package Creational.Factory.NotificationExamples;

public class Client {
    public static void main(String[] args) {
        E_Commerce commerce = new E_Commerce();
        Notification notificationObject = commerce.getNotificationFactory(NOTIFICATIONTYPE.PHONE);
        System.out.println(notificationObject.notificationMessage());
    }
}
