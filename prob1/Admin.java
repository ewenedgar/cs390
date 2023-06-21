package prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key, Student>  hm= new HashMap<>();
		for(Student st : students) {
			Key k = new Key(st.getFirstName(),st.getLastName());
			hm.put(k, st);
		}
		return hm;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
               //implements
		int count = 0;
		double sum = 0;
		
		for(Map.Entry<Key, Student> st: maps.entrySet()) {
			Key k = st.getKey();
			Student stu = st.getValue();
			sum += stu.getGpa();
			count++;
		}
		return (sum / count);	 		  
}
}
