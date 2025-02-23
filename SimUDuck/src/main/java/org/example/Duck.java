package org.example;

// Interfaces
interface Flyable {
    void fly();
}

interface Quackable {
    void quack();
}

// Clase Abstracta padre
abstract class Duck {

    public Duck(){

    }
    // Método abstracto
    abstract void display();

    public void swim(){
        System.out.print("estoy nadando");
    }

}


// Subclases
class MallardDuck extends Duck implements Flyable, Quackable {
    public void fly() {
        System.out.println("MallardDuck esta volando");
    }

    public void quack() {
        System.out.println("MallardDuck esta haciendo quak");
    }

    @Override
    void display() {
        System.out.println("hola, soy un pato silvestre");
    }
}

class ReadheadDuck extends Duck implements Flyable,Quackable{
    public void fly(){
        System.out.println("ReadDuck esta volando");

    }
    public void quack(){
        System.out.print("ReadDuck esta haciendo quack");

    }
    @Override
    public void display(){
        System.out.print(" hola, soy un pato cabeza roja ");
    }
}


class RubberDuck extends Duck implements Quackable {
    public void quack() {
        System.out.println("RuberDuck esta haciendo quack");
    }

    @Override
    void display() {
        System.out.println("hola, soy un pato de hule/goma");
    }
}


class DecoyDuck  extends Duck{
    public void display(){

    }
}


