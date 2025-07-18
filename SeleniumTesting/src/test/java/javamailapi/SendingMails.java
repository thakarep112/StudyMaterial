package javamailapi;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class SendingMails {

	public static void main(String[] args) throws AddressException, MessagingException {
		
		// Creating object of MonitoringMail class where entire logic is written to send out emails.
		
		MonitoringMail mail = new MonitoringMail();
		
		// Calling sendMail method and passing all the required parameters.
		// All the parameters(In a static way) are defined under TestConfig class.
		
		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody);

	}

}
