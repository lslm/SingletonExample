package models;

public class WelcomeWindow {
    private String title;
    private static WelcomeWindow instance;

    private WelcomeWindow() {}

    public static WelcomeWindow getInstance() {
        if (instance == null) {
            instance = new WelcomeWindow();
        }

        return instance;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
