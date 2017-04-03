/**
 * Created by L.z Double E on 4/3/2017.
 */
public class ThirdYearModuleFactory implements ModuleFactory{
    @Override
    public Module getSubjectName(String subjectCode) {
        if(subjectCode.equalsIgnoreCase("IRP300S"))
            return new ThirdYearIP();
        else
            return new ThirdYearTP();
    }
}