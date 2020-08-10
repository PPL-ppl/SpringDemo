package org.example;

import static org.junit.Assert.assertTrue;

import org.example.Test.AService;
import org.example.Test.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Config.class})
@ActiveProfiles("pro")
public class AppTest {
    @Autowired
    AService aService;

    @Test
    public void testApp() {
        String expect = "pro";
        String actual = aService.getName();
        Assert.assertEquals(expect, actual);
    }
}
