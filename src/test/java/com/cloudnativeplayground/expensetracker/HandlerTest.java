package com.cloudnativeplayground.expensetracker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HandlerTest {
    @Test
    void testHandleRequest() {
        Handler handler = new Handler();
        String response = handler.handleRequest("World");
        assertEquals("Hello, World from Expense Tracker!", response);
    }
}
