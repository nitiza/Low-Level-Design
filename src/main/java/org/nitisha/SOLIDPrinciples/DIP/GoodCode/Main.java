package org.nitisha.SOLIDPrinciples.DIP.GoodCode;

public class Main {

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService((new EmailService()));

        notificationService.notify("Your order has been shipped");

        NotificationService smsNotification = new NotificationService(new SMSService());
        smsNotification.notify("OTP 1234");
    }
}
