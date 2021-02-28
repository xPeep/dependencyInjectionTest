package cz.upce.inpia.dit;

public class EmailService {
    public EmailService() {
        System.out.println("new Instance service");
    }

    public void sendEmail(String to, String body) {
        System.out.println("Sending e-mail to" + to + ", with body " + body);
    }
}
