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
        Path fileName = Path.of("test-file.md");
        String fileContent = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(fileContent);
        assertEquals("The link should be https://something.com","https://something.com",links.get(0));
        assertEquals("The links should be some-thing.html","some-thing.html",links.get(1));
    }

    @Test
    public void getImageLinkTest() throws IOException
    {
        Path fileName = Path.of("imageLink.md");
        String fileContent = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(fileContent);
        assertEquals("There should be nothing in the arrayList of links",0,links.size());
    }

    @Test
    public void testfile2() throws IOException
    {
        Path fileName = Path.of("test-file2.md");
        String fileContent = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(fileContent);
        assertEquals("The link should be https://something.com","https://something.com",links.get(0));
        assertEquals("The links should be some-page.html","some-page.html",links.get(1));
    }

    @Test 
    public void testfile3() throws IOException
    {
        Path fileName = Path.of("test-file3.md");
        String fileContent = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(fileContent);
        assertEquals("There should be nothing in the arrayList of links",0,links.size());
    }

    @Test
    public void testfile4() throws IOException
    {
        Path fileName = Path.of("test-file4.md");
        String fileContent = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(fileContent);
        assertEquals("There should be nothing in the arrayList of links",0,links.size());
    }

    @Test
    public void testfile5() throws IOException
    {
        Path fileName = Path.of("test-file5.md");
        String fileContent = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(fileContent);
        assertEquals("There should be nothing in the arrayList of links",0,links.size());
    }

    @Test
    public void testfile6() throws IOException
    {
        Path fileName = Path.of("test-file6.md");
        String fileContent = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(fileContent);
        assertEquals("There should be nothing in the arrayList of links",0,links.size());
    }
    
    @Test
    public void testfile7() throws IOException
    {
        Path fileName = Path.of("test-file7.md");
        String fileContent = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(fileContent);
        assertEquals("There should be nothing in the arrayList of links",0,links.size());
    }

    @Test
    public void testfile8() throws IOException
    {
        Path fileName = Path.of("test-file8.md");
        String fileContent = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(fileContent);
        assertEquals("There should be nothing in the arrayList",1,links.size());
    }

    @Test
    public void snippet1Test() throws IOException
    {
        Path fileName = Path.of("snippet1lab4.md");
        String fileContent = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(fileContent);
        String[] exp = {"`google.com","google.com","ucsd.edu"};
        for(int i = 0; i< 3; i++)
        {
            assertEquals(exp[i], links.get(i));
        }
    }

    @Test
    public void snippet2Test() throws IOException
    {
        Path fileName = Path.of("snippet2lab4.md");
        String fileContent = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(fileContent);
        String[] exp = {"a.com","a.com(())","example.com"};
        assertEquals(exp[2], links.get(2));
        for(int i = 0; i< 3; i++)
        {
            assertEquals(exp[i], links.get(i));
        }
    }

    @Test
    public void snippet3Test() throws IOException
    {
        Path fileName = Path.of("snippet3lab4.md");
        String fileContent = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(fileContent);
        String[] exp = {"https://www.twitter.com",
            "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule","https://cse.ucsd.edu/"};
            String s1 = exp[1];
            String s2 = links.get(1);
        assertEquals(s1,s2);
        for(int i = 0; i< 3; i++)
        {
            assertEquals(exp[i], links.get(i));
        }
    }
}