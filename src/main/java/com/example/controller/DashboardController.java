package com.example.controller;
import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController public class DashboardController {
 @GetMapping("/api/expenses") public Map<String,Object> data(){return Map.of("monthlyBudget",50000,"spent",32750,"remaining",17250,"transactions",38,"items",List.of(
 Map.of("description","Office Supplies","category","Office","amount",4250,"date","2026-09-02"),
 Map.of("description","AWS Infrastructure","category","Cloud","amount",12500,"date","2026-09-04"),
 Map.of("description","Team Lunch","category","Food","amount",3500,"date","2026-09-06"),
 Map.of("description","Software License","category","Software","amount",12500,"date","2026-09-07")));}}
