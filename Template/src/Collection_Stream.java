import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collection_Stream {
	
	public static void main(String[] args) {
		Student_With_Builder student1 = Student_With_Builder.builder()
				.withFirstName("Kobe")
				.withLastName("Bryant")
				.withAge(27)
				.build();
		
		Student_With_Builder student2 = Student_With_Builder.builder()
				.withFirstName("Kevin")
				.withLastName("Garnnet")
				.withAge(25)
				.build();
		
		Student_With_Builder student3 = Student_With_Builder.builder()
				.withFirstName("Tim")
				.withLastName("Duncan")
				.withAge(23)
				.build();
			
		List<Student_With_Builder> students = new ArrayList();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		List<Student_With_Builder> youngStudents = students.stream()
				.filter(student -> student.getAge() <= 25)
				.collect(Collectors.toList());
		
		List<String> youngStudentNames = students.stream()
				.filter(student -> student.getAge() <= 25)
				.map(student -> student.getFirstName())
				.collect(Collectors.toList());
		
		System.out.println("All Students: ");
		students.stream().forEach(student -> System.out.println("[" + student.getFirstName() + " " + student.getLastName() + "]"));
		System.out.println();
		
		System.out.println("Young Students: ");
		youngStudents.stream().forEach(student -> System.out.println("[" + student.getFirstName() + " " + student.getLastName() + "]"));
		System.out.println();
		
		System.out.println("Young Student Names: ");
		youngStudentNames.stream().forEach(name -> System.out.println("[" + name + "]"));
	}
}
