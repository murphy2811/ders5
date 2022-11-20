package kalıtım;

public class Student extends ComunityMember {
	protected String studentId;
     public void giris() {
		
		System.out.println(" Kapisindan giris yapti...");
	}
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public Student(String Adi, String Soyadi, String tel, String studentId) {
		super(Adi, Soyadi, tel);
		this.studentId = studentId;
	}

}
