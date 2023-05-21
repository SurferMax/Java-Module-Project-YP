public class Main {
    public static void main(String[] args) {
        CountingPeople count = new CountingPeople();
        int result = count.calculate();
        newGoodGenerator generator = new newGoodGenerator();
        do{
            generator.generateNewGood();
        } while (generator.askingMoreGoods());
        System.out.println("Добавили все товары, какие мы хотели");
        System.out.println(generator.showTotalPrice());
        generator.bill(result);
    }
}



