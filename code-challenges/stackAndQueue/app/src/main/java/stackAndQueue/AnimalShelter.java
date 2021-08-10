package stackAndQueue;

public class AnimalShelter{
    private Cat newCat;
    private Dog newDog;

    public AnimalShelter(Cat newCat, Dog newDog) {
        this.newCat = newCat;
        this.newDog = newDog;
    }

    public Cat getNewCat() {
        return newCat;
    }

    public void setNewCat(Cat newCat) {
        this.newCat = newCat;
    }

    public Dog getNewDog() {
        return newDog;
    }

    public void setNewDog(Dog newDog) {
        this.newDog = newDog;
    }
}
