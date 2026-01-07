class Animal {
    void sound1() {
        System.out.println("Animal! ");
    }
}

class Dog extends Animal {
    void sound2() {
        System.out.println("Dog!");
    }
}

class Cat extends Animal {
    void sound3() {
        System.out.println("Cat!");
    }
}

class Puppy extends Dog {
    void sound4() {
        System.out.println("Puppies!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal ani = new Animal();
        Dog dog = new Dog();
        Puppy pu  = new Puppy();
        ani.sound1();
        dog.sound1();
        dog.sound2();
        pu.sound1();
        pu.sound2();
        pu.sound4();
    }
}
