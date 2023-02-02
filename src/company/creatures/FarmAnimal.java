package company.creatures;

class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        System.out.println(getName() + " zjadł");
    }

    @Override
    public void feed() {

    }

    @Override
    public void feed(double foodWeight) {

    }
}