import java.util.Scanner;

public class newGoodGenerator { // Добавить с большой буквы;
    String nameToSet = "Nameless Good";
    double priceToSet = 00.00;
    double totalPrice = 00.00;
    public String allGoods = "Список всех товаров: " + "\n";
    public String generateNewGood() { // Тут добавить проверку на дробные числа и на наличие строки в названии.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите название товара, чтобы добавить его");
    // String descriptionArrived = scanner.next(); Была ошибка, что считывал только до пробела и выкидывал ошибку.
    this.nameToSet = scanner.nextLine();
    // System.out.println(this.nameToSet);
    System.out.println("Введите цену товара, чтобы добавить ее (рубли.копейки)");
    this.priceToSet = scanner.nextDouble();
    // System.out.println(this.priceToSet);
    Good goodToSend = new Good();
    String goodAdded = goodToSend.goodCreated(this.nameToSet, this.priceToSet);
    this.addingNewGood(this.nameToSet, this.priceToSet);
    return goodAdded;
    // nameToSet.goodCreated(nameToSet, priceToSet);
    // nameToSet.goodCreated(nameToSet, priceToSet);
    }
    public boolean askingMoreGoods() { //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нужны еще товары, нажмите 'Enter'. Чтобы завершить программу введите 'Завершить'");
        String userReply = scanner.nextLine();
        if (userReply.equalsIgnoreCase("Завершить"))
        {
            // System.out.println("Завершаем");
            return false;
        } else {System.out.println("Добавляем еще один товар");
            return true;}

    }
    public void addingNewGood(String name, double price) {
        String formattedDouble = String.format("%.2f", price);
        System.out.println("Товар был добавлен в корзину: " + formattedDouble + " " + name);
        String goodDescription = formattedDouble + " - " + name +"; ";
        // String operator = scanner.next();
        totalPrice += price;
        System.out.println("Цена всего заказа: " + formattedDouble);
        allGoods = allGoods.concat(goodDescription + "\n");
        System.out.println(allGoods);
    }
    public String showTotalPrice() {
        String formattedDouble = String.format("%.2f", totalPrice);
        System.out.println("Цена всего заказа: " + totalPrice);
        return formattedDouble;
    }

    public void bill(int peopleCount) {
        String rubleText;
        double result = totalPrice / peopleCount;
        int preResult = (int) Math.floor(totalPrice / peopleCount);
        switch (preResult % 10) {
            case 1:
                rubleText = "рубль";
                break;
            case 2:
            case 3:
            case 4:
                rubleText = "рубля";
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
            default:
                rubleText = "рублей";
                break;
        }
        System.out.println(allGoods);
        System.out.printf("Каждый человек заплатит %.2f %s", result, rubleText);
    }
}
