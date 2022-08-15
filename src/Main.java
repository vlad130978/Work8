import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Task 1
        printLeapG(2022);


        //Task 2
        int clientOS = 1;
        int dev = 2022;

        printSupForInstall (clientOS, dev);

        //Task 3
        int delDist = 95;
        int delDay = calcDelDay(delDist);
        System.out.println("потребуется дней: " + delDay);


    }

    private static void printLeapG(int g) {
        if (isLeapG(g)) {
            System.out.println("високосный");
        } else {
            System.out.println("не високосный");}
    }

    private static boolean isLeapG(int g) {
        return g % 4 == 0 && g % 100 != 0 || g % 400 == 0;
    }


    private static void printSupForInstall (int clientsOS, int dev) {
        int curY = LocalDate.now().getYear();
        if (dev < curY){
            System.out.println("установите облегчённую версию приложения для *");
        }else {
            System.out.println("установите врсию для *");
        }
        if (clientsOS == 1) {
            System.out.println("Android по ссылке!");
        }else {
            System.out.println("ios по ссылке");
        }
    }

    private static int calcDelDay(int delDist) {
        int delDay = 1;
        int interval = 48;
        int startInterval = 24;
        if (delDist > startInterval) {
            delDay = delDay + (int) Math.ceil((delDist - startInterval) / (double) interval);
        }
        return delDay;
    }

}