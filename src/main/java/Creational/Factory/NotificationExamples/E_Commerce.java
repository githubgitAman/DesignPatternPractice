package Creational.Factory.NotificationExamples;

public class E_Commerce {
    public void refresh(){
        System.out.println("Refreshing page");
    }
    //Method to get factory method
    public Notification getNotificationFactory(NOTIFICATIONTYPE notificationType){
        return NotificationFactory.createNotification(notificationType);
    }
}
