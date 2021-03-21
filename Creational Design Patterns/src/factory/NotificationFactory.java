package factory;

public class NotificationFactory {

	public Notification crateNewNotification(String notificationType){
		
		if(notificationType==null || notificationType.isEmpty()) {
			return null;
		}
		if("SMS".equals(notificationType)) {
			return new SMSNotification();
		}
		if("Email".equals(notificationType)) {
			return new EmailNotification();
		}
		return null;
		
	}
}
