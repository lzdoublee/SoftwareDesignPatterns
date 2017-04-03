/**
 * Created by L.z Double E on 4/3/2017.
 */
public class AbstractFactory {
    public ModuleFactory  getSubjectYear(String year){
        if("second".equalsIgnoreCase(year))
            return new SecondYearModulesFactory();
        else
            return new ThirdYearModuleFactory();
    }
}

