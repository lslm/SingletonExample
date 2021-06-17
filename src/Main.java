import models.WelcomeWindow;

public class Main {
    public static void main(String[] args) {
        WelcomeWindow window1= WelcomeWindow.getInstance();
        window1.setTitle("Janela 1");

        System.out.println(window1.getTitle());

        WelcomeWindow window2 = WelcomeWindow.getInstance();
        window2.setTitle("Janela 2");

        System.out.println(window1.getTitle());
        System.out.println(window2.getTitle());
    }
}
