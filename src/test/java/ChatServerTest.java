import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.testng.AssertJUnit.assertEquals;

class ChatServerTest {

    @Test
    void checkDbList() {
        File file = new File("/Users/decagon/Desktop/db.csv");
        var usernames = DbUtils.readCSVUsingBufferedReader(file);
        for (String[] strings : usernames) {
            var string = strings[0];
            System.out.println(string);
        }
        assertEquals(2, usernames.size());
    }
}