package id.ac.undiksha.siak.organization;

import id.ac.undiksha.siak.entities.Lecturer;

public class StudyProgram implements Department, Faculty {
	private String studyProgramCode;
	private String studyProgramName;

	public Lecturer coordinator = new Lecturer();

	public Lecturer getCoordinator() {
		return coordinator;
	}

	public void setCoordinator(Lecturer coordinator) {
		this.coordinator = coordinator;
	}

	public StudyProgram() {

	}

	public String getStudyProgramCode() {
		return studyProgramCode;
	}

	public void setStudyProgramCode(String studyProgramCode) {
		this.studyProgramCode = studyProgramCode;
	}

	public String getStudyProgramName() {
		return studyProgramName;
	}

	public void setStudyProgramName(String studyProgramName) {
		this.studyProgramName = studyProgramName;
	}

	public StudyProgram(String studyProgramCode, String studyProgramName) {
		super();
		this.studyProgramCode = studyProgramCode;
		this.studyProgramName = studyProgramName;
	}

	private String departmentName;
	private String departmentCode;
	// private String facultyName;

	@Override
	public void setDeptName(String deptName) {
		this.departmentName = deptName;
	}

	@Override
	public String getDeptName() {
		return this.departmentName;
	}

	@Override
	public void setDeptCode(String deptCode) {
		this.departmentCode = deptCode;
	}

	@Override
	public String getDeptCode() {
		return this.departmentCode;
	}

	@Override
	public String getFacultyName() {
		// TODO Auto-generated method stub
		// return this.facultyName;
		return null;
	}

	@Override
	public void setFacultyName(String facultyName) {
		// TODO Auto-generated method stub
		// this.facultyName = facultyName;
	}

}
