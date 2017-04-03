/**
 * Created by L.z Double E on 4/3/2017.
 */
public class ProxyFile implements IFile{


    private OriginalFile oFile;
    private String fileName;
    private static ProxyFile fileP=null;

    private ProxyFile(String fileName){

        this.fileName = fileName;
        oFile = OriginalFile.getOgFileInst(fileName);
    }
    public static ProxyFile getProxyFile(String fileName){
        if(fileP==null)
            return new ProxyFile(fileName);
        else
            return fileP;
    }

    @Override
    public String getFile() {
        return oFile.getFile();
    }
}
