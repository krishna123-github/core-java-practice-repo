/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design_Patterns;

/**
 *
 * @author krishna
 */
public class FactoryDesignPatern {

    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("Email");
        notification.sendNotification();
    }
}

class NotificationFactory {

    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty()) {
            return null;
        }

        switch (channel) {
            case "SMS":
                return new SMSNotify();
            case "Email":
                return new EmailNotify();
            case "Fcm":
                return new FcmNotify();
            default:
                throw new AssertionError();
        }
    }
}

interface Notification {

    public void sendNotification();
}

class SMSNotify implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("SMS");
    }

}

class EmailNotify implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("Email");
    }

}

class FcmNotify implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("Fcm");
    }
}

/**
 * It is a creational design pattern that talks about the creation of an object.
 * The factory design pattern says that define an interface ( A java interface
 * or an abstract class) for creating object and let the subclasses decide which
 * class to instantiate. If we notice the name Factory method, that means there
 * is a method which is a factory, and in general, factories are involved with
 * creational stuff and here with this, an object is being created. It is one of
 * the best ways to create an object where object creation logic is hidden from
 * the client.
 */
