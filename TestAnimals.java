public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Yuumi");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.walk();
        d.eat();

        c.walk();
        c.eat();
        c.play();

        a.walk();
        a.eat();

        e.walk();
        e.eat();

        p.play();
    }
}