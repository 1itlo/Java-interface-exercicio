
class Fish extends Animal {
    public Fish() {
        super(0); 
    }

    @Override
    void eat() {
        System.out.println("Peixes comem crustáceos.");
    }

    @Override
    public void walk() {
        System.out.println("Peixes não podem andar.");
    }
}


