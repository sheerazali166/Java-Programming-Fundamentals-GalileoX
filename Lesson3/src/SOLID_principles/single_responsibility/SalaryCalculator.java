package SOLID_principles.single_responsibility;

import java.util.HashMap;
import java.util.Map;

// This class is just responsible of calculate the salaries
public class SalaryCalculator {

    private static HashMap<String, Integer> hashMapExtraHours = new HashMap<String, Integer>();

    public static void initOverTimeOurPayment() {

        hashMapExtraHours.put("Project Developer", 25);
        hashMapExtraHours.put("Project Manager", 40);

    }

    public static HashMap<Integer, Integer> calculateCompanyWorkersSalaries(HashMap<Integer, Worker> hashMapCompanyWorkers) {

        HashMap<Integer, Integer> hashMapCompanyWorkersSalaries = new HashMap<Integer, Integer>();

        for (Map.Entry<Integer, Worker> companyWorkers: hashMapCompanyWorkers.entrySet()) {
            Integer id = companyWorkers.getKey();
            Worker worker = companyWorkers.getValue();
            int salary = worker.getWorkersBaseSalary() + worker.getWorkersExtraHours();

            hashMapCompanyWorkersSalaries.put(id, salary);
        }
        return hashMapCompanyWorkersSalaries;
    }
}
