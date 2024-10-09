import java.util.concurrent.TimeUnit;

public class ScreenSaver {
    // private int times;

    public static void Saver1(int times1) {
        System.out.print("Загружаю");
        for (int i = times1; i >= 0; i--) {

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i==0)
                System.out.print("... Поехали!");
            else
                System.out.printf("..." + i);
        }

    }
}
