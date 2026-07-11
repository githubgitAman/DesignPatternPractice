package Creational.Factory.NotificationExamples;

public class E_Commerce {
    public void refresh(){
        System.out.println("Refreshing page");
    }
//    //Method to get Factory object type
//    public NotificationFactory getNotificationFactory(NOTIFICATIONTYPE notificationType){
//        if(notificationType == NOTIFICATIONTYPE.EMAIL){
//            return new EmailNotificationFactory();
//        }
//        else if(notificationType == NOTIFICATIONTYPE.PHONE){
//            return new PhoneNotificationFactory();
//        }
//        else{
//            return new MessageNotificationFactory();
//        }
//    }
}
