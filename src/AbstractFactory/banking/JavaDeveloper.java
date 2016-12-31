package AbstractFactory.banking;

import AbstractFactory.Developer;

/**
 * Created by ваня on 31.12.2016.
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("java developer write code");
    }
}
