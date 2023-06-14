package Assignment8Prob3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Marketing> marketingList = new ArrayList<>();

        
        marketingList.add(new Marketing("John", "Product A", 1200.50));
        marketingList.add(new Marketing("Mary", "Product B", 950.75));
        marketingList.add(new Marketing("David", "Product C", 1500.25));

        
        System.out.println("Size of the list: " + marketingList.size());

        
        System.out.println("Marketing List:");
        for (Marketing marketing : marketingList) {
            System.out.println(marketing.toString());
        }

        
        Marketing marketingToFind = new Marketing("Mary", "Product B", 950.75);
        boolean found = marketingList.contains(marketingToFind);
        System.out.println("Is Mary's Marketing object found? " + found);

        
        Collections.sort(marketingList, Comparator.comparingDouble(Marketing::getSalesAmount));
        System.out.println("\n Sorted Marketing List (by sales amount):");
        for (Marketing marketing : marketingList) {
            System.out.println(marketing.toString());
        }

        
        List<Marketing> resultList = listMoreThan1000(marketingList);
        Collections.sort(resultList, Comparator.comparing(Marketing::getEmployeeName));
        System.out.println("\n Sorted Marketing List (by employee name) with sales amount > $1000:");
        for (Marketing marketing : resultList) {
            System.out.println(marketing.toString());
        }
    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> result = new ArrayList<>();
        for (Marketing marketing : list) {
            if (marketing.getSalesAmount() > 1000) {
                result.add(marketing);
            }
        }
        return result;
    }
}
