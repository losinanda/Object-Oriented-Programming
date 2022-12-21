package id.ac.undiksha.siak.entities;

public class Staff extends Person {
	private String nip;
	private String unit;

	public Staff() {
		super();
		this.nip = "<invalid nip>";
		this.unit = "<invalid unit>";
	}

	public void printAllInfo() {
		System.out.println("NIP: " + this.getNip());
		System.out.println("Name: " + this.getName());
		System.out.println("Address:" + this.getAddress());
		System.out.println("Gender: " + (getGender() ? "Male" : "Female"));
		System.out.println("Unit: " + this.getUnit());
	}

	public Staff(String nip, String unit) {
		super();
		this.nip = nip;
		this.unit = unit;
	}

	public Staff(String name, String address, boolean gender, String nip, String unit) {
		super(name, address, gender);
		// TODO Auto-generated constructor stub
		this.nip = nip;
		this.unit = unit;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}
