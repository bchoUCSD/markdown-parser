import static org.junit.Assert.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinksTest() throws IOException
    {
        Path fileName = Path.of("/Users/bryan/Documents/GitHub/markdown-parser/test-file.md");
        String fileContent = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(fileContent);
        assertEquals("The link should be https://something.com","https://something.com",links.get(0));
        assertEquals("The links should be some-thing.html","some-thing.html",links.get(1));
    }
}