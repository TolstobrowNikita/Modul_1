public class test {
    public static void main(String[] args) {
        Dog d = new Dog(new Cat()); // создаём собаку с кошкой
        d.catchCat(); // ловим кошку
    }
}

class Dog {
    Cat c; // кошка

    Dog(Cat c) { // конструктор с передачей кошки
        this.c = c;
    }

    void catchCat() { // метод ловли кошки
        System.out.print("Catching... ");
        c.meow(); // мяуканье кошки
    }
}

class Cat { // кошка
    void meow() { // мяуканье
        System.out.println(" Meow! ");
    }
}