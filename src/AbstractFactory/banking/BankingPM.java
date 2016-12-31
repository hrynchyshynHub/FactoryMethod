package AbstractFactory.banking;

import AbstractFactory.ProjectManager;

/**
 * Created by ваня on 31.12.2016.
 */
public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("manager managin gproject");
    }
}
