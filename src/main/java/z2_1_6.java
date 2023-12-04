public class z2_1_6 {
    public static class Cat {
        public static void sayHello() {
            System.out.println("Мяу!");
        }
    }

    public static class Dog {
        public static void catchCat(Cat aCat) {
            System.out.println("Кошка поймана");
            Cat.sayHello();
        }

        public static void bark() {
            System.out.println("Гав!");
        }
    }
}

