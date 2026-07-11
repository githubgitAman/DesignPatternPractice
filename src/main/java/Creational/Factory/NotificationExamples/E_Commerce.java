package Creational.Factory.NotificationExamples;

public class E_Commerce {
    public void refresh(){
        System.out.println("Refreshing page");
    }
    //Factory method
    public Notification createNotification(NOTIFICATIONTYPE type){
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
