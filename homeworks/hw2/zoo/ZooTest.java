package de.telran.geork.homeworks.hw2.zoo;

import javax.lang.model.element.AnnotationMirror;

public class ZooTest {
    public static void main(String[] args) {
        Animal cow = new Cow();
        cow.voice();
        cow.eat("Meat");
        Animal lamb = new Lamb();
        lamb.voice();
        lamb.eat("meat");
        Animal cat = new Cat();
        cat.voice();
        cat.eat("meat");
        Animal dog = new Dog();
        dog.voice();
        dog.eat("meat");

    }

}
