package com.tecnologiaefinancas.desafiostech.en.advanced.stream.employee;

import java.util.*;
import java.util.stream.Collectors;

public class _15AdvancedStreamQuestions {

    /*
    Challenge: 15 advanced questions of stream() covering `reduce`, `joining`, `partitioningBy`, and other key topics.

            🔥 15 Advanced Java Stream Questions
            Reduce (Aggregation)
            1️. Find the total salary of all employees using `reduce()`.
            2️. Get the highest salary using `reduce()` instead of `max()`.
            3️. Find the average salary of all employees using only `reduce()`.

            Joining (String Manipulation)
            4️. Create a comma-separated string of all employee names using `joining()`.
            5️. Format the employee list as: `"Alice (Engineering), Bob (HR), ..."`.
            6️. Generate a single string listing all salaries, separated by `" | "`.

            PartitioningBy (Grouping)
            7. Partition employees into high earners (salary ≥ 80,000) and low earners.
            8️. Split employees into Engineering vs. Non-Engineering departments.
            9️⃣ Divide employees into **those earning more or less than the median salary**.

            Other Advanced Stream Challenges
            10. Find the **highest-paid employee in each department** using `groupingBy()`.
            1️⃣1️⃣ Sort employees **by salary descending** using Streams.
            1️⃣2️⃣ Count **how many employees** work in each department using Streams.
            1️⃣3️⃣ Create a `Map<String, List<String>>`, grouping **departments** with their employee names.
            1️⃣4️⃣ Retrieve the **top 3 highest salaries** from the list using Streams.
            1️⃣5️⃣ Find the **lowest salary in Finance department** using Streams.

            Hint to a new challenge: explore more about Collectors in stream: groupingBy, joining, summarizingInt, summarizingDouble, partitioningBy



     */


    public static void main (String[] args) {

        List<Employee> employees;
        employees = List.of(
                new Employee("Alice", "Engineering", 75000),
                new Employee("Bob", "HR", 55000),
                new Employee("Charlie", "Engineering", 98000),
                new Employee("David", "Finance", 67000),
                new Employee("Eve", "Engineering", 84000),
                new Employee("Frank", "HR", 59000),
                new Employee("Grace", "Finance", 72000),
                new Employee("Hank", "Engineering", 88000),
                new Employee("Ivy", "Finance", 69000),
                new Employee("Jack", "HR", 53000)
        );

        // 1️. Find the total salary of all employees using `reduce()`.
        int totalSalary = employees.stream().map(Employee::getSalary)
                .reduce(0, Integer::sum);

        // 2️. Get the highest salary using `reduce()` instead of `max()`.
        int highestSalary = employees.stream().map(Employee::getSalary).reduce(Integer.MIN_VALUE, Integer::max);

        // 3️. Find the average salary of all employees using only `reduce()`.
        double averageSalary = employees.stream().map(Employee::getSalary).reduce(0, Integer::sum)/(double)employees.size();

        // 4️. Create a comma-separated string of all employee names using `joining()`.
        String employeeNames = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", "));

        //5️. Format the employee list as: `"Alice (Engineering), Bob (HR), ..."`.
        String formattedEmployees = employees.stream()
                .map(e-> e.getName() + " (" + e.getDepartment() + ")")
                .collect(Collectors.joining(", "));

        // 6️. Generate a single string listing all salaries, separated by `" | "`.
        String allSalaries = employees.stream()
                .map(e -> e.getSalary() + " |")
                .collect(Collectors.joining(" "));

        //or
        String allSalaries02 = employees.stream()
                .map(e -> String.valueOf(e.getSalary()))
                .collect(Collectors.joining(" | "));

        //PartitioningBy (Grouping)
        //7. Partition employees into high earners (salary ≥ 80,000) and low earners.

        Map<Boolean, List<Employee>> partitionedEmployeesBySalary = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() >= 80000));

        // Formatting output before printing
        String highEarners = partitionedEmployeesBySalary.get(true).stream()
                        .map(e-> e.getName() + " (" + e.getDepartment() +") - $ " + e.getSalary())
                                .collect(Collectors.joining(" | "));
        String lowEarners = partitionedEmployeesBySalary.get(false).stream()
                        .map(e -> e.getName() + " (" + e.getDepartment() +") - $ " + e.getSalary())
                                .collect(Collectors.joining(" | "));

        //8️. Split employees into Engineering vs. Non-Engineering departments.
        Map<Boolean, List<Employee>> partitionedEmployeesByEngineeringOrNo = employees.stream()
                .collect(Collectors.partitioningBy(e -> Objects.equals(e.getDepartment(), "Engineering")));

        String engineeringEmployees = partitionedEmployeesByEngineeringOrNo.get(true).stream()
                .map(e-> e.getName() + " | - $ " + e.getSalary())
                .collect(Collectors.joining(" | "));
        String nonEngineeringEmployees = partitionedEmployeesByEngineeringOrNo.get(false).stream()
                .map(e -> e.getName() + " (" + e.getDepartment() +") - $ " + e.getSalary())
                .collect(Collectors.joining(" | "));


    }
}
