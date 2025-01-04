package com.cloudnativeplayground.expensetracker.repository;

import com.cloudnativeplayground.expensetracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}