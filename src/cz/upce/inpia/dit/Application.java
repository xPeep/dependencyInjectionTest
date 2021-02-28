package cz.upce.inpia.dit;

public class Application implements ArticleApp {
    UserService userService;
    ArticleService articleService;

    public Application(UserService userService, ArticleService articleService) {
        this.userService = userService;
        this.articleService = articleService;
    }

    public static void main(String[] args) {
        ArticleApp application = DependencyInjector.getArticleApp();
        application.process();
    }

    @Override
    public void process() {
        userService.createAccount();
        articleService.publishArticle();
    }
}
