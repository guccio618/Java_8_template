/**************************************************************
 * 
 * Use Class Builder to build a object of a specific class
 * 
 **************************************************************/

public class Student_With_Builder {
	
	public static void main(String[] args) {
		String firstName = "Jackie";
		String lastName = "Chan";
		int age = 27;
		
		Student_With_Builder student = Student_With_Builder.builder()
				.withFirstName(firstName)
				.withLastName(lastName)
				.withAge(age)
				.build();
		
		System.out.println(student);
	}
	
	
	/************************** functions ****************************/
	
	private String firstName;
	private String lastName;
	private Integer age;
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder {
		private String firstName;
	
		public Builder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		private String lastName;
		
		public Builder withLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		private Integer age;
		
		public Builder withAge(Integer age) {
			this.age = age;
			return this;
		}
		
		protected void populate(Student_With_Builder student) {
			student.setFirstName(this.firstName);
			student.setLastName(this.lastName);
			student.setAge(this.age);
		}
		
		public Student_With_Builder build() {
			Student_With_Builder student = new Student_With_Builder();
			populate(student);
			return student;
		}
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Student_With_Builder [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getAge()=" + getAge()
				+ "]";
	}
}
