import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSort {

	public static void main(String[] args) {
		
		List<Student> arrList = new ArrayList<>();
		arrList.add(new Student(45, "Suraj"));
		arrList.add(new Student(12, "Rachna"));
		arrList.add(new Student(23, "Anurag"));
		arrList.add(new Student(90, "Pooja"));
		System.out.println("Array before Sort :");
		for (Student a : arrList) {

			System.out.println(a);

		}

		//Collections.sort(arrList);
		Collections.sort(arrList,new IdComparator());
		System.out.println("Array After Sort :");
		for (Student a : arrList) {

			System.out.println(a);

		}

	}

}
