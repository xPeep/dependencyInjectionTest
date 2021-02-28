package cz.upce.inpia.dit;

public class UserService {
    private EmailService emailService;

    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void createAccount() {
        // create account
        emailService.sendEmail("bohm.josef@upce.cz", "Hello dude");
    }

}
