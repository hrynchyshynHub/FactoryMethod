package AbstractFactory;

/**
 * Created by ваня on 31.12.2016.
 */
public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();

}
