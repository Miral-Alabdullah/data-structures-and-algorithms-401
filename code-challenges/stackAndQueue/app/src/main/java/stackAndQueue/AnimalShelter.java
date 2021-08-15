package stackAndQueue;

public class AnimalShelter<T>{
    private Queue<T> newCat;
    private Queue<T> newDog;

    public AnimalShelter() {
        newCat = new Queue<>();
        newDog = new Queue<>();
    }

    public void enqueue(T animal) {
        if(animal instanceof Cat){
            newCat.enqueue(animal);
        }if(animal instanceof Dog){
            newDog.enqueue(animal);
        }
    }

    public T dequeue(T pref){
        if(pref instanceof Cat){
            return pref;
        }if(pref instanceof Dog){
            return pref;
        }
        else
            return null;
    }

    public Queue<T> getNewCat() {
        return newCat;
    }

    public void setNewCat(Queue<T> newCat) {
        this.newCat = newCat;
    }

    public Queue<T> getNewDog() {
        return newDog;
    }

    public void setNewDog(Queue<T> newDog) {
        this.newDog = newDog;
    }
}
