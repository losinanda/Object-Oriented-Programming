package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student();
		std1.setName("Nanda");
		std1.setNim("2115101046");
		std1.setAddress("Singaraja");
		std1.setGender(true);
		std1.setStudyProgram("ILKOM");
		std1.setDepartment("TI");
		std1.setFaculty("FTK");

		Student std2 = new Student("2115101046", "Adi", "Singaraja", true, "CS", "Informatics", "Vocational and Engineering ");

		std1.printAllInfo();
		std2.printAllInfo();
	}

}
