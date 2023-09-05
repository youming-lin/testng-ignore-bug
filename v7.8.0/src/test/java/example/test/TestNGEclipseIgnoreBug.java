package example.test;

import static org.testng.Assert.fail;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGEclipseIgnoreBug {
    @Test(enabled = false)
    public void testEnabledFalse() {
        fail("Test is not enabled");
    }

    @Test
    @Ignore
    public void testIgnored() {
        fail("Test is ignored");
    }
}
