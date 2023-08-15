class Cat extends Animal implements Pet {
    private String name;


    public Cat(String name) {
        super(4); 
        this.name = name;
    }

    public Cat() {
        this(""); 
    }

    @Override
    public void eat() {
        System.out.println("O gato chamado " + name + " come peixe.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("O gato " + name + " brinca com um ratinho de brinquedo.");
    }
}
