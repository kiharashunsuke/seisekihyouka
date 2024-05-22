package database;

public class StudentBean {

//DBのカラム名を統一し、テーブルを分けることでメソッドを共有
	private String name;
	private int student_no;
	private int japanese;
	private int math;
	private int science;
	private int social;
	private int english;
	private int goukei;

	public StudentBean() {

}
	public StudentBean(String name, int student_no, int japanese, int math, int science,
					int social, int english, int goukei) {
		this.name = name;
		this.japanese = japanese;
		this.math = math;
		this.science = science;
		this.social = social;
		this.english = english;
		this.goukei = goukei;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMath() {
		return math;
	}
	public int getStudent_no() {
		return student_no;
	}
	public void setStudent_no(int student_no) {
		this.student_no = student_no;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getSocial() {
		return social;
	}
	public void setSocial(int social) {
		this.social = social;
	}
	public int getJapanese() {
		return japanese;
	}
	public void setJapanese(int japanese) {
		this.japanese = japanese;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getGoukei() {
		return goukei;
	}
	public void setGoukei(int goukei) {
		this.goukei = goukei;
	}

}