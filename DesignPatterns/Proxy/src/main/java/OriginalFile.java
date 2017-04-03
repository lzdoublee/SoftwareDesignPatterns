/**
 * Created by L.z Double E on 4/3/2017.
 */
public class OriginalFile implements IFile {
    private String fileName;
    private static OriginalFile oFile =null;

    private OriginalFile(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    public static OriginalFile getOgFileInst(String fileName ) {
        if (oFile == null)
            return oFile = new OriginalFile(fileName);
        else
            return oFile;
    }

    @Override
    public String getFile() {
        return fileName;
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
