package com.boot;

import static org.junit.Assert.*;

import com.boot.controller.HomeController;
import org.junit.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        HomeController hc = new HomeController();
        String result = hc.home();
        assertEquals("Das Boot, reporting for duty!", result);
    }
}
