package assignment8Prob2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static <T extends EmployeeData> List<T> combine(List<Staff> staffList, List<Teacher> teacherList) {
        List<T> combinedList = new ArrayList<>();
        combinedList.addAll((Collection<? extends T>) teacherList);
        combinedList.addAll((Collection<? extends T>) staffList);
        return combinedList;
    }

    public static void main(String[] args) {
    	List<Staff> staff = new ArrayList<>();
		staff.add(new Staff("John", 110000, 2));
		staff.add(new Staff("Tom", 110000, 4));
		staff.add(new Staff("Edward", 120000, 1));
		staff.add(new Staff("Rich",90000, 3));
		staff.add(new Staff("Kevin", 100000,1));

		List<Teacher> teachers = new ArrayList<>();
		teachers.add(new Teacher("Andrew", 110000, 10000));
		teachers.add(new Teacher("Rabelais", 130000, 5500));
		teachers.add(new Teacher("Phil", 135000, 12000));
		teachers.add(new Teacher("Tony",95000, 8000));


        List<EmployeeData> combinedList = combine(staff, teachers);

        double sumOfSalaries = Statistics.computeSumOfSalaries(combinedList);
        System.out.println("Sum of all salaries: " + sumOfSalaries);
    }
}
