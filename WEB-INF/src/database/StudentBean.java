package database;

public class StudentBean {

/*
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
	*/
	private String name;
	private int student_no;
	private int gakuryokutest_1_japanese;
	private int gakuryokutest_math;
	private int gakuryokutest_science;
	private int gakuryokutest_social;
	private int gakuryokutest_english;
	private int gakuryokutest_goukei;
	private int gakuryokutest_2_japanese;
	private int gakuryokutest_2_math;
	private int gakuryokutest_2_science;
	private int gakuryokutest_2_social;
	private int gakuryokutest_2_english;
	private int gakuryokutest_2_goukei;

	public StudentBean() {
	}
	public StudentBean(String name, int student_no, int gakuryokutest_1_japanese, int gakuryokutest_math,
			int gakuryokutest_science, int gakuryokutest_social, int gakuryokutest_english,
			int gakuryokutest_goukei, int gakuryokutest_2_japanese, int gakuryokutest_2_math,
			int gakuryokutest_2_english, int gakuryokutest_2_science, int gakuryokutest_2_social,
			int gakuryokutest_2_goukei) {
		this.name = name;
		this.student_no = student_no;
		this.gakuryokutest_1_japanese = gakuryokutest_1_japanese;
		this.gakuryokutest_math = gakuryokutest_math;
		this.gakuryokutest_science = gakuryokutest_science;
		this.gakuryokutest_social = gakuryokutest_social;
		this.gakuryokutest_english = gakuryokutest_english;
		this.gakuryokutest_goukei = gakuryokutest_goukei;
		this.gakuryokutest_2_japanese = gakuryokutest_2_japanese;
		this.gakuryokutest_2_math = gakuryokutest_2_math;
		this.gakuryokutest_2_science = gakuryokutest_2_science;
		this.gakuryokutest_2_social = gakuryokutest_2_social;
		this.gakuryokutest_2_english = gakuryokutest_2_english;
		this.gakuryokutest_2_goukei = gakuryokutest_2_goukei;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudent_no() {
		return student_no;
	}
	public void setStudent_no(int student_no) {
		this.student_no = student_no;
	}
	public int getGakuryokutest_math() {
		return gakuryokutest_math;
	}
	public void setGakuryokutest_math(int gakuryokutest_math) {
		this.gakuryokutest_math = gakuryokutest_math;
	}
	public int getGakuryokutest_science() {
		return gakuryokutest_science;
	}
	public void setGakuryokutest_science(int gakuryokutest_science) {
		this.gakuryokutest_science = gakuryokutest_science;
	}
	public int getGakuryokutest_social() {
		return gakuryokutest_social;
	}
	public void setGakuryokutest_social(int gakuryokutest_social) {
		this.gakuryokutest_social = gakuryokutest_social;
	}
	public int getGakuryokutest_1_japanese() {
		return gakuryokutest_1_japanese;
	}
	public void setGakuryokutest_1_japanese(int gakuryokutest_1_japanese) {
		this.gakuryokutest_1_japanese = gakuryokutest_1_japanese;
	}
	public int getGakuryokutest_english() {
		return gakuryokutest_english;
	}
	public void setGakuryokutest_english(int gakuryokutest_english) {
		this.gakuryokutest_english = gakuryokutest_english;
	}
	public int getGakuryokutest_goukei() {
		return gakuryokutest_goukei;
	}
	public void setGakuryokutest_goukei(int gakuryokutest_goukei) {
		this.gakuryokutest_goukei = gakuryokutest_goukei;
	}

	public int getGakuryokutest_2_math() {
		return gakuryokutest_2_math;
	}
	public void setGakuryokutest_2_math(int gakuryokutest_2_math) {
		this.gakuryokutest_2_math = gakuryokutest_2_math;
	}
	public int getGakuryokutest_2_science() {
		return gakuryokutest_2_science;
	}
	public void setGakuryokutest_2_science(int gakuryokutest_2_science) {
		this.gakuryokutest_2_science = gakuryokutest_2_science;
	}
	public int getGakuryokutest_2_social() {
		return gakuryokutest_2_social;
	}
	public void setGakuryokutest_2_social(int gakuryokutest_2_social) {
		this.gakuryokutest_2_social = gakuryokutest_2_social;
	}
	public int getGakuryokutest_2_japanese() {
		return gakuryokutest_2_japanese;
	}
	public void setGakuryokutest_2_japanese(int gakuryokutest_2_japanese) {
		this.gakuryokutest_2_japanese = gakuryokutest_2_japanese;
	}
	public int getGakuryokutest_2_english() {
		return gakuryokutest_2_english;
	}
	public void setGakuryokutest_2_english(int gakuryokutest_2_english) {
		this.gakuryokutest_2_english = gakuryokutest_2_english;
	}
	public int getGakuryokutest_2_goukei() {
		return gakuryokutest_2_goukei;
	}
	public void setGakuryokutest_2_goukei(int gakuryokutest_2_goukei) {
		this.gakuryokutest_2_goukei = gakuryokutest_2_goukei;
	}
}