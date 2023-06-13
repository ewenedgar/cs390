package assignment8Prob2;

import java.util.*;
public class Statistics {
	
	public static double computeSumOfSalaries(List<? extends EmployeeData> employees) {
        double sum = 0;
        for (EmployeeData employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
}

