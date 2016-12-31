package AbstractFactory.website;

import AbstractFactory.ProjectManager;

/**
 * Created by ваня on 31.12.2016.
 */
public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("web site pm project site");
    }
}
