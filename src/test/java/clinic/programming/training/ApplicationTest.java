package clinic.programming.training;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by FrankZ on 10.06.2017.
 */
public class ApplicationTest {

    private Application application;

    @Before
    public void setup() {
        application = new Application();
    }

    @Test
    public void testWordCountString() {
        int count = application.countWords("this is a test");
        assertTrue(count == 4);
    }

    @Test
    public void testWordCountEmpty() {
        int count = application.countWords("");
        assertTrue(count == 0);
    }

    @Test
    public void testWordCountNull() {
        int count = application.countWords(null);
        assertTrue(count == 0);
    }

    @Test
    @Ignore
    public void testWordCountMore() {
        int count = application.countWords("this will be skipped");
        assertTrue(count == 3);
    }

    @Test
    public void testWordCountSingle() {
        int count = application.countWords("single");
        assertTrue(count == 1);
    }
}
