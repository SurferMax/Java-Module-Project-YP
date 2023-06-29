public class Main {
    public static void main(String[] args) {
        Pair pair = new Pair();
        Sayable <Pair> tester = new Tester();
        tester.theSameAs(pair);
    }
}
        class Pair {
            public String StringSay;
            public void saySomething() {
                System.out.println("Метод saySomething сработал без generics");
            }
        }

        class Tester implements Sayable<Pair> {
                public void theSameAs(Pair object) {
                System.out.println("В классе Тестер я говорю theSameAs сработал с generics: " + object);
            }
        }

        interface Sayable<T> {
            public void theSameAs(T object);
        }





//








