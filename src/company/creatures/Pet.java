package company.creatures;

class Pet extends Animal implements Feedable {
    public Pet(String species) {
        super(species);
    }

    @Override
    public void feed() {

    }

    @Override
    public void feed(double foodWeight) {
    }

}