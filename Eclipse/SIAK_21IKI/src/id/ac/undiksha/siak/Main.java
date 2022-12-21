package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Student std1 = new Student(); std1.setName("Nanda");
		 * std1.setNim("2115101046"); std1.setAddress("Singaraja");
		 * std1.setGender(true); std1.setStudyProgram("ILKOM");
		 * std1.setDepartment("TI"); std1.setFaculty("FTK");
		 * 
		 * Student student2 = new Student("2115101046", "Adi", "Singaraja", true, "CS",
		 * "Informatics", "Vocational and Engineering "); Lecturer lecturer2 = new
		 * Lecturer("2115101046", "Kadek", "Singaraja", true, "CS", "Informatics",
		 * "Vocational and Engineering "); Staff staff2 = new Staff("2115101046", "Adi",
		 * "Singaraja", true, "UPT TIK");
		 * 
		 * std1.printAllInfo(); student2.printAllInfo(); System.out.println("");
		 * lecturer2.printAllInfo(); System.out.println(""); staff2.printAllInfo();
		 */

//		Person prs1 = new Person ();
//		prs1.setName("Adi");
//		System.out.println(prs1.getName());

//		Student std1 = new Student ();
//		std1.setNim("12345");
//		std1.printAllInfo();
//		System.out.println(std1.getName());

//		Person siX = new Student();
//		siX.get
//		Person SiY = new Person("Caca", "Denpasar", false);
//		Student siY = new Person();
//		siY.get

		Student x1 = new Student("12345", "Ilkom", "TI", "FTK");
		Student x2 = new Student("Caca", "Denpasar", false, "12345", "Ilkom", "TI", "FTK");
//		x2.printAllInfo();
		Lecturer y1 = new Lecturer("0000", "Ilkom", "TI", "FTK");
		Lecturer y2 = new Lecturer("Ari", "Denpasar", false, "00000", "Ilkom", "TI", "FTK");
//		y2.printAllInfo();
		Staff z1 = new Staff("99999", "FTK");
		Staff z2 = new Staff("Budi", "Denpasar", true, "99999", "FTK");
		z2.printAllInfo();

	}

}
