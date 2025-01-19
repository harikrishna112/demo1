package com.fme.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.fme.model.Expense;

public interface ExpenseService {
    List<Expense> findAll();
    Optional<Expense> findById(Long id);
    Expense save(Expense expense);
    void deleteById(Long id);
    List<Expense> findByPersonId(Long personId);
    List<Expense> findByDateBetween(LocalDate startDate, LocalDate endDate);
    Map<String, Object> generateMonthlyReport(int year, int month);
    Map<String, Double> getExpensesSummaryByCategory(LocalDate startDate, LocalDate endDate);
}