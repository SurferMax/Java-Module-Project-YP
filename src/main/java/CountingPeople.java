import java.util.Scanner;

class CountingPeople {
    int result = 0;
    public int calculate() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("На сколько человек считать счет?");
            result = scanner.nextInt();
            if (result == 1) {
                System.out.println("А что тут считать, 1 и есть 1");
            } else if (result > 1) {
                System.out.println("Понял, счет делим на " + result);
                return result;
            } else {
                System.out.println("Это некорректное значение для подсчёта, введи снова");
            }
        }
        while (result <= 1);
        return result;
    }
}

