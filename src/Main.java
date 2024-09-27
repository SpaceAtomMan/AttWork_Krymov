import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        System.out.print("Загружаю...5");

        for (int i = 4; i >= 1; i--) {

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("..." + i);
        }
        System.out.print("... Поехали!");}
}

/*
HTTPS или SSH https://github.com/SpaceAtomMan/AttWork_Krymov.git

echo "# AttWork_Krymov" >> README.md
git init
git add README.md
git commit -m "первая фиксация"
git branch -M main
git remote add origin https://github.com/SpaceAtomMan/AttWork_Krymov.git
git push -u origin main

... или запустите существующий репозиторий из командной строки
git remote добавляет origin https://github.com/SpaceAtomMan/AttWork_Krymov.git
ветка git -M main
git push -u origin main
 */

