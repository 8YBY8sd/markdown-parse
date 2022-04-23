import static org.junit.Assert.*;  //using jar file
import org.junit.*; //using jar file
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest { //create a class

    @Test //build test 
    public void addition() { //addition method
        assertEquals(2, 1 + 1); //check the output
    }
    
    @Test
    public void getLinks() throws IOException {
        List<String> list = List.of("https://something.com", "some-thing.html");
        Path fileName = Path.of("C:\\Users\\yubin\\OneDrive - UC San Diego\\UCSD\\UCSD study\\CSE 15L\\lab\\lab3\\markdown-parser\\test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(links, list);
    }

    @Test
    public void getLinksTwo() throws IOException {
        List<String> list = List.of("https://im.qq.com/", "qq.html");
        Path fileName = Path.of("C:\\Users\\yubin\\OneDrive - UC San Diego\\UCSD\\UCSD study\\CSE 15L\\lab\\lab3\\markdown-parser\\part3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(links, list);
    }

    
}