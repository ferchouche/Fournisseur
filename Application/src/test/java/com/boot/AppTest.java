package com.boot;


import com.boot.controller.HomeController;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest

{
    @Test
    public void testApp() {
        HomeController hc = new HomeController();
        String result = hc.home();
        assertEquals(result, "Das Boot, reporting for duty!");
    }
}
