import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by L.z Double E on 4/3/2017.
 */
public class ProxyFileTest {

    IFile file;

    @Before
    public void setUp() throws Exception {
        file = ProxyFile.getProxyFile("Book.pdf");
    }

    @Test
    public void fileNameTest() throws Exception {

        Assert.assertSame(file.getFile(),"Book.pdf");
    }
}
