package SOLID_principles.single_responsibility;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, Worker> hashMapCompanyWorkers = new HashMap<Integer, Worker>();

        // Adding two workers
        hashMapCompanyWorkers.put(170015, new Worker(170015, 5100,24, "Rubi Ramos", "Project Developer"));
        hashMapCompanyWorkers.put(170016, new Worker(170016, 5000,20,
                "John Johnz Iliigal Puppy", "Project Manager With Wife Qualities"));

        // Initialize vertical overtime hour payment for the two types of job title
        SalaryCalculator.initOverTimeOurPayment();

        // Calculate salary without extra hours
        HashMap<Integer, Integer> hashMapCompanyWorkersSalaries = SalaryCalculator.calculateCompanyWorkersSalaries(hashMapCompanyWorkers);

        // Print to console
        System.out.println("Salaries without extra hours:");
        System.out.println(hashMapCompanyWorkers.get(170015) + "\n\tSalary: " + hashMapCompanyWorkersSalaries.get(170015) + " money unit");
        System.out.println(hashMapCompanyWorkers.get(170016) + "\n\tSalary: " + hashMapCompanyWorkersSalaries.get(170016) + " money unit");

        // Adding extra hours
        hashMapCompanyWorkers.replace(170015, hashMapCompanyWorkers.get(170015).addWorkersExtraHour(10));
        hashMapCompanyWorkers.replace(170016, hashMapCompanyWorkers.get(170016).addWorkersExtraHour(5));

        // Calculate salary without extra hours
        hashMapCompanyWorkersSalaries = SalaryCalculator.calculateCompanyWorkersSalaries(hashMapCompanyWorkers);

        // Print to console statement two
        System.out.println("Salaries with extra hours:");
        System.out.println(hashMapCompanyWorkers.get(170015) + "\n\tSalary: " + hashMapCompanyWorkersSalaries.get(170015) + " money unit");
        System.out.println(hashMapCompanyWorkers.get(170016) + "\n\tSalary: " + hashMapCompanyWorkersSalaries.get(170016) + " money unit");

    }
}
