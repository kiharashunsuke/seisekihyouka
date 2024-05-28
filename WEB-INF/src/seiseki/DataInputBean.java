package seiseki;

public class DataInputBean {
	private int japanese;
	private int math;
	private int social;
	private int science;
	private int english;
	private int goukei;
	private String name;
	private int search_name_flg;
	private int stu_no;

	public DataInputBean() {
	}
	public DataInputBean(int stu_no, int japanese, int math, int social, int science, int english, int goukei) {
		//this.name = name;
		this.stu_no = stu_no;
		this.japanese = japanese;
		this.math = math;
		this.social = social;
		this.science = science;
		this.english  = english;
		this.goukei = goukei;
	}
	public int getJapanese() {
		return japanese;
	}
	public void setJapanese(int japanese) {
		this.japanese = japanese;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSocial() {
		return social;
	}
	public void setSocial(int social) {
		this.social = social;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSearch_name_flg() {
		return search_name_flg;
		}
	public void setSearch_name_flg(int nameflg) {
		this.search_name_flg = nameflg;
		}
	public int getStu_no() {
		return stu_no;
	}
	public void setStu_no(int stu_no) {
		this.stu_no = stu_no;
	}
}
