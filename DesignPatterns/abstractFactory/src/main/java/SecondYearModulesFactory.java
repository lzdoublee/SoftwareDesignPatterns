/**
 * Created by L.z Double E on 4/3/2017.
 */
public class SecondYearModulesFactory implements ModuleFactory{
    @Override
     public Module getSubjectName(String subjectCode)
    {
        if(subjectCode.equalsIgnoreCase("IRP200S"))
            return new SecondYearIP();
        else
            return new SecondYearTP();
    }
}
