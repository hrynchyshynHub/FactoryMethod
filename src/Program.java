/**
 * Created by ваня on 31.12.2016.
 */
public class Program {
    public static void main(String[] args) {
        DeveloperFactory factory = createDeveloperFactoryBySpeciality("php");
        factory.createDeveloper().writeCode();
    }
    static DeveloperFactory createDeveloperFactoryBySpeciality(String speciality){
        if(speciality.equals("java")){
            return new JavaDeveloperFactory();
        }else if(speciality.equals("c++")){
            return new CppDeveloperFactory();

        }
        else if(speciality.equals("php")){
            return new PhpDeveloperFactory();
        }
        else throw new RuntimeException(speciality + "is unknown");
    }
}
