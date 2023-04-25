import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int threadCount = 9;
        double[] stop_duration = {4.0, 8.0, 1.0, 9.0, 7.0, 5.0, 3.0, 2.0, 6.0};
        //double[] stop_duration = {4.0, 1.0, 6.0, 5.0, 3.0, 2.0};

       /* Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість потків: ");
        int numStops = scanner.nextInt();

        double[] stop_duration = new double[numStops];

        for (int i = 0; i < numStops; i++) {
           System.out.print("Тривалість зупинки " + (i+1) + " : ");
           stop_duration[i] = scanner.nextDouble();
        }

         System.out.println("Введені значення: ");
         for (int i = 0; i < numStops; i++) {
            System.out.println("Зупинка " + (i+1) + " : " + stop_duration[i]);
        }

        scanner.close();*/


        Breaker breaker = new Breaker(stop_duration);
        new ThreadController(threadCount, breaker);
        new Thread(breaker).start();
    }
}

