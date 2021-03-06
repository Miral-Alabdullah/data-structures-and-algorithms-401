package stackAndQueue;

public class Animal {
    private String name;
    private String breed;
    private double age;

    public Animal(){

    }

    public Animal(String name, String breed, double age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        String s = "Name: " + getName() +
                ", Breed: " + getBreed() +
                ", Age: " + getAge();
        System.out.println(s);
        return s;
    }
}
