package AbstractFactory.website;

import AbstractFactory.Developer;

/**
 * Created by ваня on 31.12.2016.
 */
public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("php developer write code...");
    }
}
