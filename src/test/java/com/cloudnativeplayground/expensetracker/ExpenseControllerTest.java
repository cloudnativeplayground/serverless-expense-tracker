package com.cloudnativeplayground.expensetracker;

import com.cloudnativeplayground.expensetracker.controller.ExpenseController;
import com.cloudnativeplayground.expensetracker.model.Expense;
import com.cloudnativeplayground.expensetracker.service.ExpenseService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

class ExpenseControllerTest {

    @InjectMocks
    private ExpenseController expenseController;

    @Mock
    private ExpenseService expenseService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllExpenses() {
        // Arrange
        Expense expense1 = new Expense(1L, "Groceries", new BigDecimal("100.0"), LocalDate.now(), "Food");
        Expense expense2 = new Expense(2L, "Utilities", new BigDecimal("50.0"), LocalDate.now(), "Bills");
        List<Expense> mockExpenses = Arrays.asList(expense1, expense2);
        when(expenseService.getAllExpenses()).thenReturn(mockExpenses);

        // Act
        List<Expense> response = expenseController.getAllExpenses();

        // Assert
        assertEquals(2, response.size());
        assertEquals("Groceries", response.get(0).getDescription());
    }

    @Test
    void testAddExpense() {
        // Arrange
        Expense newExpense1 = new Expense(null, "Rent", new BigDecimal("500.0"), LocalDate.now(), "Housing");
        Expense savedExpense1 = new Expense(3L, "Rent", new BigDecimal("500.0"), LocalDate.now(), "Housing");
        Expense newExpense2 = new Expense(null, "Internet", new BigDecimal("60.0"), LocalDate.now(), "Utilities");
        Expense savedExpense2 = new Expense(4L, "Internet", new BigDecimal("60.0"), LocalDate.now(), "Utilities");
        when(expenseService.saveExpense(newExpense1)).thenReturn(savedExpense1);
        when(expenseService.saveExpense(newExpense2)).thenReturn(savedExpense2);

        // Act
        Expense response = expenseController.createExpense(newExpense1);

        // Assert
        assertNotNull(response);
        assertEquals("Rent", response.getDescription());
    }
}
