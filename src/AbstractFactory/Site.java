package AbstractFactory;

import AbstractFactory.banking.BankinfTeanFactory;
import AbstractFactory.website.WebSiteProjectTeamFactory;

/**
 * Created by ваня on 31.12.2016.
 */
public class Site {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteProjectTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager  projectManager = projectTeamFactory.getProjectManager();

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

    }

}
