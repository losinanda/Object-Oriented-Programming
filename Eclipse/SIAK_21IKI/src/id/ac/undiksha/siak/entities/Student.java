package id.ac.undiksha.siak.entities;

import id.ac.undiksha.siak.organization.StudyProgram;

public class Student extends Person {
	private String nim;
	private StudyProgram studyProgram;

	public Student() {
		super();
		this.nim = "<invalid nim>";
		studyProgram = new StudyProgram();
	}

	public void printAllInfo() {
		System.out.println("Student Identity");
		System.out.println("NIM: " + this.getNim());
		System.out.println("Name: " + this.getName());
		System.out.println("Address: " + this.getAddress());
		System.out.println("Gender: " + (getGender() ? "Male" : "Female"));
		System.out.println("Study Program Code: " + this.getStudyProgram().getStudyProgramCode());
		System.out.println("Study Program: " + this.getStudyProgram().getStudyProgramName());
		System.out.println("\nCoordinator Identity");
		System.out.println("Coordinator Name:  " + this.getStudyProgram().getCoordinator().getName());
		System.out.println("Coordinator Address: " + this.getStudyProgram().getCoordinator().getAddress());
		System.out.println("Coordinator NIP: " + this.getStudyProgram().getCoordinator().getNip());
		System.out.println("Gender: " + (this.getStudyProgram().getCoordinator().getGender() ? "Male" : "Female"));

	}

//	public Student(String nim, String studyProgram, String department, String faculty) {
//		super();
//		this.nim = nim;
//		this.studyProgram = studyProgram;
//	}

	public Student(String name, String address, boolean gender, String nim, String studyProgramCode,
			String studyProgramName) {
		// TODO Auto-generated constructor stub
		super(name, address, gender);
		this.nim = nim;
		studyProgram = new StudyProgram(studyProgramCode, studyProgramName);
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public StudyProgram getStudyProgram() {
		return studyProgram;
	}

	public void setStudyProgram(StudyProgram studyProgram) {
		this.studyProgram = studyProgram;
	}
}
