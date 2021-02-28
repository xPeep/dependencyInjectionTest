package cz.upce.inpia.dit;

public class DependencyInjector {
    private static UserService userService;
    private static EmailService emailService;
    private static ArticleService articleService;

    public static ArticleApp getArticleApp() {
        return new Application(getUserService(), getArticleService());
    }

    private static ArticleService getArticleService() {
        if (articleService == null) {
            articleService = new ArticleService(getEmailService());
        }
        return articleService;
    }

    private static UserService getUserService() {
        if (userService == null) userService = new UserService(
                getEmailService()
        );
        return userService;
    }

    private static EmailService getEmailService() {
        if (emailService == null) {
            emailService = new EmailService();
        }
        return emailService;
    }
}
