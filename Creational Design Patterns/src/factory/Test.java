package factory;

public class Test {
public static void main(String[] args) {
	NotificationFactory factory=new NotificationFactory();
	Notification notification = factory.crateNewNotification("Email");
	notification.notifyUser();
}
}
