package AbstractFactory.banking;

import AbstractFactory.Developer;
import AbstractFactory.ProjectManager;
import AbstractFactory.ProjectTeamFactory;
import AbstractFactory.Tester;

/**
 * Created by ваня on 31.12.2016.
 */
public class BankinfTeanFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATeste();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
