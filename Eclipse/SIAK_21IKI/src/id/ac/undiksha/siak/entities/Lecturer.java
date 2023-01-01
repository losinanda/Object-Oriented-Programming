package id.ac.undiksha.siak.entities;

public class Lecturer extends Person {
	private String nip;
	private String studyProgram;
	private String department;
	private String faculty;

	public Lecturer() {
		super();
		this.nip = "<invalid nip>";
		this.studyProgram = "<invalid nim>";
		this.department = "<invalid department>";
		this.faculty = "<invalid faculty>";
	}

	public void printAllInfo() {
		System.out.println("Lecturer Identity");
		System.out.println("NIP: " + this.getNip());
		System.out.println("Name: " + this.getName());
		System.out.println("Address: " + this.getAddress());
		System.out.println("Gender: " + (getGender() ? "Male" : "Female"));
		System.out.println("Study Program: " + this.studyProgram);
		System.out.println("Department: " + this.department);
		System.out.println("Faculty: " + this.faculty);
	}

//	public Lecturer(String nip, String studyProgram, String department, String faculty) {
//		super();
//		this.nip = nip;
//		this.studyProgram = studyProgram;
//		this.department = department;
//		this.faculty = faculty;
//	}

	public Lecturer(String name, String address, boolean gender, String nip, String studyProgram, String department,
			String faculty) {
		super(name, address, gender);
		// TODO Auto-generated constructor stub
		this.nip = nip;
		this.studyProgram = studyProgram;
		this.department = department;
		this.faculty = faculty;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getStudyProgram() {
		return studyProgram;
	}

	public void setStudyProgram(String studyProgram) {
		this.studyProgram = studyProgram;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

}
