import java.util.Comparator;

public class IdComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.rollNo>s2.rollNo)
		return 1;
		if(s1.rollNo<s2.rollNo)
		return -1;
		return 0;
	}

}
