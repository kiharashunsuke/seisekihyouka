package database;

public class StudentBean {


	private String name;
	private int japanese;
	private int math;
	private int science;
	private int social;
	private int english;
	private int goukei;

	public StudentBean() {

}
	public StudentBean(String name, int japanese, int math, int science,
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