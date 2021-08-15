package stackAndQueue;

public class AnimalShelter<T>{
    private Queue<T> newCat;
    private Queue<T> newDog;

    public AnimalShelter() {
        newCat = new Queue<>();
        newDog = new Queue<>();
    }

    public void enqueue(T animal) throws Exception{
        if(animal instanceof Cat){
            newCat.enqueue(animal);
        }if(animal instanceof Dog){
            newDog.enqueue(animal);
        } if(!(animal instanceof Cat || animal instanceof Dog)){
            throw new Exception("The instance should be either dog or cat");
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
