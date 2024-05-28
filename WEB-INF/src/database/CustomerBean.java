package database;

public class CustomerBean {

	private String name;
	private int student_no;
	private int kesseki_1;
	private int kesseki_2;
	private int tyukan_1_1_japanese;
	private int tyukan_1_1_math;
	private int tyukan_1_1_english;
	private int tyukan_1_1_science;
	private int tyukan_1_1_social;
	private int tyukan_1_1_goukei;
	private int kimatu_1_1japanese;
	private int kimatu_1_1_math;
	private int kimatu_1_1_english;
	private int kimatu_1_1_science;
	private int kimatu_1_1_social;
	private int kimatu_1_1_goukei;
	private int tyukan_1_2_japanese;
	private int tyukan_1_2_math;
	private int tyukan_1_2_english;
	private int tyukan_1_2_science;
	private int tyukan_1_2_social;
	private int tyukan_1_2_goukei;
	private int kimatu_1_2_japanese;
	private int kimatu_1_2_math;
	private int kimatu_1_2_english;
	private int kimatu_1_2_scoience; //scoience
	private int kimatu_1_2_social;
	private int kimatu_1_2_goukei;
	private int gakuryokutest_1_japanese;
	private int gakuryokutest_math;
	private int gakuryokutest_english;
	private int gakuryokutest_science;
	private int gakuryokutest_social;
	private int gakuryokutest_goukei;
	private int tyukan_2_1_japanese;
	private int tyukan_2_1_math;
	private int tyukan_2_1_english;
	private int tyukan_2_1_science;
	private int tyukan_2_1_social;
	private int tyukan_2_1_goukei;
	private int kimatu_2_1_japanese;
	private int kimatu_2_1_math;
	private int kimatu_2_1_english;
	private int kimatu_2_1_science;
	private int kimatu_2_1_social;
	private int kimatu_2_1_goukei;
	private int tyukan_2_2_japanese;
	private int tyukan_2_2_math;
	private int tyukan_2_2_english;
	private int tyukan_2_2_science;
	private int tyukan_2_2_social;
	private int tyukan_2_2_goukei;
	private int kimatu_2_2_japanese;
	private int kimatu_2_2_math;
	private int kimatu_2_2_english;
	private int kimatu_2_2_science;
	private int kimatu_2_2_social;
	private int kimatu_2_2_goukei;
	private int gakuryokutest_2_japanese;
	private int gakuryokutest_2_math;
	private int gakuryokutest_2_english;
	private int gakuryokutest_2_science;
	private int gakuryokutest_2_social;
	private int gakuryokutest_2_goukei;
	private int tairyokutest_1;
	private int tairyokutest_2;
	private int tyukan_3_1_japanese;
	private int tyukan_3_1_math;
	private int tyukan_3_1_english;
	private int tyukan_3_1_science;
	private int tyukan_3_1_social;
	private int tyukan_3_1_goukei;
	private int kimatu_3_1_japanese;
	private int kimatu_3_1_math;
	private int kimatu_3_1_english;
	private int kimatu_3_1_science;
	private int kimatu_3_1_social;
	private int kimatu_3_1_goukei;
	private int tyukan_3_2_japanese;
	private int tyukan_3_2_math;
	private int tyukan_3_2_english;
	private int tyukan_3_2_science;
	private int tyukan_3_2_social;
	private int tyukan_3_2_goukei;
	private int kimatu_3_2_japanese;
	private int kimatu_3_2_math;
	private int kimatu_3_2_english;
	private int kimatu_3_2_science;
	private int kimatu_3_2_social;
	private int kimatu_3_2_goukei;
	private int gakuryokutest_3_japanese;
	private int gakuryokutest_3_math;
	private int gakuryokutest_3_english;
	private int gakuryokutest_3_science;
	private int gakuryokutest_3_social;
	private int gakuryokutest_3_goukei;



	public CustomerBean() {
	}

	public CustomerBean(String name, int student_no, int kesseki_1, int kesseki_2, int tyukan_1_1_japanese, int tyukan_1_1_math,
		int tyukan_1_1_english, int tyukan_1_1_science, int tyukan_1_1_social, int tyukan_1_1_goukei, int kimatu_1_1japanese, int kimatu_1_1_math,
		int kimatu_1_1_english, int kimatu_1_1_science, int kimatu_1_1_social, int kimatu_1_1_goukei, int tyukan_1_2_japanese,
		int tyukan_1_2_math, int tyukan_1_2_english, int tyukan_1_2_science, int tyukan_1_2_social, int tyukan_1_2_goukei,
		int kimatu_1_2_japanese, int kimatu_1_2_math, int kimatu_1_2_english, int kimatu_1_2_scoience, int kimatu_1_2_social,
		int kimatu_1_2_goukei, int gakuryokutest_1_japanese, int gakuryokutest_math, int gakuryokutest_english,int gakuryokutest_science, int gakuryokutest_social,
		int gakuryokutest_goukei, int tyukan_2_1_japanese, int tyukan_2_1_math, int tyukan_2_1_english,
		int tyukan_2_1_science, int tyukan_2_1_social, int tyukan_2_1_goukei, int kimatu_2_1_japanese, int kimatu_2_1_math,
		int kimatu_2_1_english, int kimatu_2_1_science, int kimatu_2_1_social, int kimatu_2_1_goukei, int tyukan_2_2_japanese,
		int tyukan_2_2_math, int tyukan_2_2_english, int tyukan_2_2_science, int tyukan_2_2_social, int tyukan_2_2_goukei,
		int kimatu_2_2_japanese, int kimatu_2_2_math, int kimatu_2_2_english, int kimatu_2_2_science, int kimatu_2_2_social,
		int kimatu_2_2_goukei, int gakuryokutest_2_japanese, int gakuryokutest_2_math, int gakuryokutest_2_english, int gakuryokutest_2_science,
		int gakuryokutest_2_social, int gakuryokutest_2_goukei, int tairyokutest_1, int tairyokutest_2, int tyukan_3_1_japanese, int tyukan_3_1_math,
		int tyukan_3_1_english, int tyukan_3_1_science, int tyukan_3_1_social, int tyukan_3_1_goukei, int kimatu_3_1_japanese,
		int kimatu_3_1_math, int kimatu_3_1_english, int kimatu_3_1_science, int kimatu_3_1_social, int kimatu_3_1_goukei,
		int tyukan_3_2_japanese, int tyukan_3_2_math, int tyukan_3_2_english, int tyukan_3_2_science, int tyukan_3_2_social,
		int tyukan_3_2_goukei, int kimatu_3_2_japanese, int kimatu_3_2_math, int kimatu_3_2_english, int kimatu_3_2_science,
		int kimatu_3_2_social, int kimatu_3_2_goukei, int gakuryokutest_3_japanese, int gakuryokutest_3_math,
		int gakuryokutest_3_english, int gakuryokutest_3_science, int gakuryokutest_3_social, int gakuryokutest_3_goukei ) {

		this.name = name;
		this.student_no = student_no;
		this.kesseki_1 = kesseki_1;
		this.kesseki_2 = kesseki_2;
		this.tyukan_1_1_japanese = tyukan_1_1_japanese;
		this.tyukan_1_1_math = tyukan_1_1_math;
		this.tyukan_1_1_english = tyukan_1_1_english;
		this.tyukan_1_1_science = tyukan_1_1_science;
		this.tyukan_1_1_social = tyukan_1_1_social;
		this.tyukan_1_1_goukei = tyukan_1_1_goukei;
		this.kimatu_1_1japanese = kimatu_1_1japanese;
		this.kimatu_1_1_math = kimatu_1_1_math;
		this.kimatu_1_1_english = kimatu_1_1_english;
		this.kimatu_1_1_science = kimatu_1_1_science;
		this.kimatu_1_1_social = kimatu_1_1_social;
		this.kimatu_1_1_goukei = kimatu_1_1_goukei;
		this.tyukan_1_2_japanese = tyukan_1_2_japanese;
		this.tyukan_1_2_math = tyukan_1_2_math;
		this.tyukan_1_2_english = tyukan_1_2_english;
		this.tyukan_1_2_science = tyukan_1_2_science;
		this.tyukan_1_2_social = tyukan_1_2_social;
		this.tyukan_1_2_goukei = tyukan_1_2_goukei;
		this.kimatu_1_2_japanese = kimatu_1_2_japanese;
		this.kimatu_1_2_math = kimatu_1_2_math;
		this.kimatu_1_2_english = kimatu_1_2_english;
		this.kimatu_1_2_scoience = kimatu_1_2_scoience;
		this.kimatu_1_2_social = kimatu_1_2_social;
		this.kimatu_1_2_goukei = kimatu_1_2_goukei;
		this.gakuryokutest_1_japanese = gakuryokutest_1_japanese;
		this.gakuryokutest_math = gakuryokutest_math;
		this.gakuryokutest_english = gakuryokutest_english;
		this.gakuryokutest_science = gakuryokutest_science;
		this.gakuryokutest_social = gakuryokutest_social;
		this.gakuryokutest_goukei = gakuryokutest_goukei;
		this.tyukan_2_1_japanese = tyukan_2_1_japanese;
		this.tyukan_2_1_math = tyukan_2_1_math;
		this.tyukan_2_1_english = tyukan_2_1_english;
		this.tyukan_2_1_science = tyukan_2_1_science;
		this.tyukan_2_1_social = tyukan_2_1_social;
		this.tyukan_2_1_goukei = tyukan_2_1_goukei;
		this.kimatu_2_1_japanese = kimatu_2_1_japanese;
		this.kimatu_2_1_math = kimatu_2_1_math;
		this.kimatu_2_1_english = kimatu_2_1_english;
		this.kimatu_2_1_science = kimatu_2_1_science;
		this.kimatu_2_1_social = kimatu_2_1_social;
		this.kimatu_2_1_goukei = kimatu_2_1_goukei;
		this.tyukan_2_2_japanese = tyukan_2_2_japanese;
		this.tyukan_2_2_math = tyukan_2_2_math;
		this.tyukan_2_2_english = tyukan_2_2_english;
		this.tyukan_2_2_science = tyukan_2_2_science;
		this.tyukan_2_2_social = tyukan_2_2_social;
		this.tyukan_2_2_goukei = tyukan_2_2_goukei;
		this.kimatu_2_2_japanese = kimatu_2_2_japanese;
		this.kimatu_2_2_math = kimatu_2_2_math;
		this.kimatu_2_2_english = kimatu_2_2_english;
		this.kimatu_2_2_science = kimatu_2_2_science;
		this.kimatu_2_2_social = kimatu_2_2_social;
		this.kimatu_2_2_goukei = kimatu_2_2_goukei;
		this.gakuryokutest_2_japanese = gakuryokutest_2_japanese;
		this.gakuryokutest_2_math = gakuryokutest_2_math;
		this.gakuryokutest_2_english = gakuryokutest_2_english;
		this.gakuryokutest_2_science = gakuryokutest_2_science;
		this.gakuryokutest_2_social = gakuryokutest_2_social;
		this.gakuryokutest_2_goukei = gakuryokutest_2_goukei;
		this.tairyokutest_1 = tairyokutest_1;
		this.tairyokutest_2 = tairyokutest_2;
		this.tyukan_3_1_japanese = tyukan_3_1_japanese;
		this.tyukan_3_1_math = tyukan_3_1_math;
		this.tyukan_3_1_english = tyukan_3_1_english;
		this.tyukan_3_1_science = tyukan_3_1_science;
		this.tyukan_3_1_social = tyukan_3_1_social;
		this.tyukan_3_1_goukei = tyukan_3_1_goukei;
		this.kimatu_3_1_japanese = kimatu_3_1_japanese;
		this.kimatu_3_1_math = kimatu_3_1_math;
		this.kimatu_3_1_english = kimatu_3_1_english;
		this.kimatu_3_1_science = kimatu_3_1_science;
		this.kimatu_3_1_social = kimatu_3_1_social;
		this.kimatu_3_1_goukei = kimatu_3_1_goukei;
		this.tyukan_3_2_japanese = tyukan_3_2_japanese;
		this.tyukan_3_2_math = tyukan_3_2_math;
		this.tyukan_3_2_english = tyukan_3_2_english;
		this.tyukan_3_2_science = tyukan_3_2_science;
		this.tyukan_3_2_social = tyukan_3_2_social;
		this.tyukan_3_2_goukei = tyukan_3_2_goukei;
		this.kimatu_3_2_japanese = kimatu_3_2_japanese;
		this.kimatu_3_2_math = kimatu_3_2_math;
		this.kimatu_3_2_english = kimatu_3_2_english;
		this.kimatu_3_2_science = kimatu_3_2_science;
		this.kimatu_3_2_social = kimatu_3_2_social;
		this.kimatu_3_2_goukei = kimatu_3_2_goukei;
		this.gakuryokutest_3_japanese = gakuryokutest_3_japanese;
		this.gakuryokutest_3_math = gakuryokutest_3_math;
		this.gakuryokutest_3_english = gakuryokutest_3_english;
		this.gakuryokutest_3_science = gakuryokutest_3_science;
		this.gakuryokutest_3_social = gakuryokutest_3_social;
		this.gakuryokutest_3_goukei = gakuryokutest_3_goukei;
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

	public int getKesseki_1() {
		return kesseki_1;
	}

	public void setKesseki_1(int kesseki_1) {
		this.kesseki_1 = kesseki_1;
	}

	public int getKesseki_2() {
		return kesseki_2;
	}

	public void setKesseki_2(int kesseki_2) {
		this.kesseki_2 = kesseki_2;
	}

	public int getTyukan_1_1_japanese() {
		return tyukan_1_1_japanese;
	}

	public void setTyukan_1_1_japanese(int tyukan_1_1_japanese) {
		this.tyukan_1_1_japanese = tyukan_1_1_japanese;
	}

	public int getTyukan_1_1_math() {
		return tyukan_1_1_math;
	}

	public void setTyukan_1_1_math(int tyukan_1_1_math) {
		this.tyukan_1_1_math = tyukan_1_1_math;
	}

	public int getTyukan_1_1_english() {
		return tyukan_1_1_english;
	}

	public void setTyukan_1_1_english(int tyukan_1_1_english) {
		this.tyukan_1_1_english = tyukan_1_1_english;
	}

	public int getTyukan_1_1_science() {
		return tyukan_1_1_science;
	}

	public void setTyukan_1_1_science(int tyukan_1_1_science) {
		this.tyukan_1_1_science = tyukan_1_1_science;
	}

	public int getTyukan_1_1_social() {
		return tyukan_1_1_social;
	}

	public void setTyukan_1_1_social(int tyukan_1_1_social) {
		this.tyukan_1_1_social = tyukan_1_1_social;
	}

	public int getTyukan_1_1_goukei() {
		return tyukan_1_1_goukei;
	}

	public void setTyukan_1_1_goukei(int tyukan_1_1_goukei) {
		this.tyukan_1_1_goukei = tyukan_1_1_goukei;
	}

	public int getKimatu_1_1_japanese() {
		return kimatu_1_1japanese;
	}

	public void setKimatu_1_1_japanese(int kimatu_1_1_japanese) {
		this.kimatu_1_1japanese = kimatu_1_1_japanese;
	}

	public int getKimatu_1_1_math() {
		return kimatu_1_1_math;
	}

	public void setKimatu_1_1_math(int kimatu_1_1_math) {
		this.kimatu_1_1_math = kimatu_1_1_math;
	}

	public int getKimatu_1_1_english() {
		return kimatu_1_1_english;
	}

	public void setKimatu_1_1_english(int kimatu_1_1_english) {
		this.kimatu_1_1_english = kimatu_1_1_english;
	}

	public int getKimatu_1_1_science() {
		return kimatu_1_1_science;
	}

	public void setKimatu_1_1_science(int kimatu_1_1_science) {
		this.kimatu_1_1_science = kimatu_1_1_science;
	}

	public int getKimatu_1_1_social() {
		return kimatu_1_1_social;
	}

	public void setKimatu_1_1_social(int kimatu_1_1_social) {
		this.kimatu_1_1_social = kimatu_1_1_social;
	}

	public int getKimatu_1_1_goukei() {
		return kimatu_1_1_goukei;
	}

	public void setKimatu_1_1_goukei(int kimatu_1_1_goukei) {
		this.kimatu_1_1_goukei = kimatu_1_1_goukei;
	}

	public int getTyukan_1_2_japanese() {
		return tyukan_1_2_japanese;
	}

	public void setTyukan_1_2_japanese(int tyukan_1_2_japanese) {
		this.tyukan_1_2_japanese = tyukan_1_2_japanese;
	}

	public int getTyukan_1_2_math() {
		return tyukan_1_2_math;
	}

	public void setTyukan_1_2_math(int tyukan_1_2_math) {
		this.tyukan_1_2_math = tyukan_1_2_math;
	}

	public int getTyukan_1_2_english() {
		return tyukan_1_2_english;
	}

	public void setTyukan_1_2_english(int tyukan_1_2_english) {
		this.tyukan_1_2_english = tyukan_1_2_english;
	}

	public int getTyukan_1_2_science() {
		return tyukan_1_2_science;
	}

	public void setTyukan_1_2_science(int tyukan_1_2_science) {
		this.tyukan_1_2_science = tyukan_1_2_science;
	}

	public int getTyukan_1_2_social() {
		return tyukan_1_2_social;
	}

	public void setTyukan_1_2_social(int tyukan_1_2_social) {
		this.tyukan_1_2_social = tyukan_1_2_social;
	}

	public int getTyukan_1_2_goukei() {
		return tyukan_1_2_goukei;
	}

	public void setTyukan_1_2_goukei(int tyukan_1_2_goukei) {
		this.tyukan_1_2_goukei = tyukan_1_2_goukei;
	}

	public int getKimatu_1_2_japanese() {
		return kimatu_1_2_japanese;
	}

	public void setKimatu_1_2_japanese(int kimatu_1_2_japanese) {
		this.kimatu_1_2_japanese = kimatu_1_2_japanese;
	}

	public int getKimatu_1_2_math() {
		return kimatu_1_2_math;
	}

	public void setKimatu_1_2_math(int kimatu_1_2_math) {
		this.kimatu_1_2_math = kimatu_1_2_math;
	}

	public int getKimatu_1_2_english() {
		return kimatu_1_2_english;
	}

	public void setKimatu_1_2_english(int kimatu_1_2_english) {
		this.kimatu_1_2_english = kimatu_1_2_english;
	}

	public int getKimatu_1_2_scoience() {
		return kimatu_1_2_scoience;
	}

	public void setKimatu_1_2_scoience(int kimatu_1_2_scoience) {
		this.kimatu_1_2_scoience = kimatu_1_2_scoience;
	}

	public int getKimatu_1_2_social() {
		return kimatu_1_2_social;
	}

	public void setKimatu_1_2_social(int kimatu_1_2_social) {
		this.kimatu_1_2_social = kimatu_1_2_social;
	}

	public int getKimatu_1_2_goukei() {
		return kimatu_1_2_goukei;
	}

	public void setKimatu_1_2_goukei(int kimatu_1_2_goukei) {
		this.kimatu_1_2_goukei = kimatu_1_2_goukei;
	}
	public int getGakuryokutest_1_japanese() {
		return gakuryokutest_1_japanese;
	}

	public void setGakuryokutest_1_japanese(int gakuryokutest_1_japanese) {
		this.gakuryokutest_1_japanese = gakuryokutest_1_japanese;
	}
	public int getGakuryokutest_math() {
		return gakuryokutest_math;
	}
	public void setGakuryokutest_math(int gakuryokutest_math) {
		this.gakuryokutest_math = gakuryokutest_math;
	}

	public int getGakuryokutest_english() {
		return gakuryokutest_english;
	}

	public void setGakuryokutest_english(int gakuryokutest_english) {
		this.gakuryokutest_english = gakuryokutest_english;
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
	public int getGakuryokutest_goukei() {
		return gakuryokutest_goukei;
	}

	public void setGakuryokutest_goukei(int gakuryokutest_goukei) {
		this.gakuryokutest_goukei = gakuryokutest_goukei;
	}

	public int getTyukan_2_1_japanese() {
		return tyukan_2_1_japanese;
	}

	public void setTyukan_2_1_japanese(int tyukan_2_1_japanese) {
		this.tyukan_2_1_japanese = tyukan_2_1_japanese;
	}

	public int getTyukan_2_1_math() {
		return tyukan_2_1_math;
	}

	public void setTyukan_2_1_math(int tyukan_2_1_math) {
		this.tyukan_2_1_math = tyukan_2_1_math;
	}

	public int getTyukan_2_1_english() {
		return tyukan_2_1_english;
	}

	public void setTyukan_2_1_english(int tyukan_2_1_english) {
		this.tyukan_2_1_english = tyukan_2_1_english;
	}

	public int getTyukan_2_1_science() {
		return tyukan_2_1_science;
	}

	public void setTyukan_2_1_science(int tyukan_2_1_science) {
		this.tyukan_2_1_science = tyukan_2_1_science;
	}

	public int getTyukan_2_1_social() {
		return tyukan_2_1_social;
	}

	public void setTyukan_2_1_social(int tyukan_2_1_social) {
		this.tyukan_2_1_social = tyukan_2_1_social;
	}

	public int getTyukan_2_1_goukei() {
		return tyukan_2_1_goukei;
	}

	public void setTyukan_2_1_goukei(int tyukan_2_1_goukei) {
		this.tyukan_2_1_goukei = tyukan_2_1_goukei;
	}

	public int getKimatu_2_1_japanese() {
		return kimatu_2_1_japanese;
	}

	public void setKimatu_2_1_japanese(int kimatu_2_1_japanese) {
		this.kimatu_2_1_japanese = kimatu_2_1_japanese;
	}

	public int getKimatu_2_1_math() {
		return kimatu_2_1_math;
	}

	public void setKimatu_2_1_math(int kimatu_2_1_math) {
		this.kimatu_2_1_math = kimatu_2_1_math;
	}

	public int getKimatu_2_1_english() {
		return kimatu_2_1_english;
	}

	public void setKimatu_2_1_english(int kimatu_2_1_english) {
		this.kimatu_2_1_english = kimatu_2_1_english;
	}

	public int getKimatu_2_1_science() {
		return kimatu_2_1_science;
	}

	public void setKimatu_2_1_science(int kimatu_2_1_science) {
		this.kimatu_2_1_science = kimatu_2_1_science;
	}

	public int getKimatu_2_1_social() {
		return kimatu_2_1_social;
	}

	public void setKimatu_2_1_social(int kimatu_2_1_social) {
		this.kimatu_2_1_social = kimatu_2_1_social;
	}

	public int getKimatu_2_1_goukei() {
		return kimatu_2_1_goukei;
	}

	public void setKimatu_2_1_goukei(int kimatu_2_1_goukei) {
		this.kimatu_2_1_goukei = kimatu_2_1_goukei;
	}

	public int getTyukan_2_2_japanese() {
		return tyukan_2_2_japanese;
	}

	public void setTyukan_2_2_japanese(int tyukan_2_2_japanese) {
		this.tyukan_2_2_japanese = tyukan_2_2_japanese;
	}

	public int getTyukan_2_2_math() {
		return tyukan_2_2_math;
	}

	public void setTyukan_2_2_math(int tyukan_2_2_math) {
		this.tyukan_2_2_math = tyukan_2_2_math;
	}

	public int getTyukan_2_2_english() {
		return tyukan_2_2_english;
	}

	public void setTyukan_2_2_english(int tyukan_2_2_english) {
		this.tyukan_2_2_english = tyukan_2_2_english;
	}

	public int getTyukan_2_2_science() {
		return tyukan_2_2_science;
	}

	public void setTyukan_2_2_science(int tyukan_2_2_science) {
		this.tyukan_2_2_science = tyukan_2_2_science;
	}

	public int getTyukan_2_2_social() {
		return tyukan_2_2_social;
	}

	public void setTyukan_2_2_social(int tyukan_2_2_social) {
		this.tyukan_2_2_social = tyukan_2_2_social;
	}

	public int getTyukan_2_2_goukei() {
		return tyukan_2_2_goukei;
	}

	public void setTyukan_2_2_goukei(int tyukan_2_2_goukei) {
		this.tyukan_2_2_goukei = tyukan_2_2_goukei;
	}

	public int getKimatu_2_2_japanese() {
		return kimatu_2_2_japanese;
	}

	public void setKimatu_2_2_japanese(int kimatu_2_2_japanese) {
		this.kimatu_2_2_japanese = kimatu_2_2_japanese;
	}

	public int getKimatu_2_2_math() {
		return kimatu_2_2_math;
	}

	public void setKimatu_2_2_math(int kimatu_2_2_math) {
		this.kimatu_2_2_math = kimatu_2_2_math;
	}

	public int getKimatu_2_2_english() {
		return kimatu_2_2_english;
	}

	public void setKimatu_2_2_english(int kimatu_2_2_english) {
		this.kimatu_2_2_english = kimatu_2_2_english;
	}

	public int getKimatu_2_2_science() {
		return kimatu_2_2_science;
	}

	public void setKimatu_2_2_science(int kimatu_2_2_science) {
		this.kimatu_2_2_science = kimatu_2_2_science;
	}

	public int getKimatu_2_2_social() {
		return kimatu_2_2_social;
	}

	public void setKimatu_2_2_social(int kimatu_2_2_social) {
		this.kimatu_2_2_social = kimatu_2_2_social;
	}

	public int getKimatu_2_2_goukei() {
		return kimatu_2_2_goukei;
	}

	public void setKimatu_2_2_goukei(int kimatu_2_2_goukei) {
		this.kimatu_2_2_goukei = kimatu_2_2_goukei;
	}
	public int getGakuryokutest_2_japanese() {
		return gakuryokutest_2_japanese;
	}

	public void setGakuryokutest_2_japanese(int gakuryokutest_2_japanese) {
		this.gakuryokutest_2_japanese = gakuryokutest_2_japanese;
	}
	public int getGakuryokutest_2_math() {
		return gakuryokutest_2_math;
	}

	public void setGakuryokutest_2_math(int gakuryokutest_2_math) {
		this.gakuryokutest_2_math = gakuryokutest_2_math;
	}
	public int getGakuryokutest_2_english() {
		return gakuryokutest_2_english;
	}

	public void setGakuryokutest_2_english(int gakuryokutest_2_english) {
		this.gakuryokutest_2_english = gakuryokutest_2_english;
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

	public int getGakuryokutest_2_goukei() {
		return gakuryokutest_2_goukei;
	}

	public void setGakuryokutest_2_goukei(int gakuryokutest_2_goukei) {
		this.gakuryokutest_2_goukei = gakuryokutest_2_goukei;
	}

	public int getTairyokutest_1() {
		return tairyokutest_1;
	}

	public void setTairyokutest_1(int tairyokutest_1) {
		this.tairyokutest_1 = tairyokutest_1;
	}
	public int getTairyokutest_2() {
		return tairyokutest_2;
	}

	public void setTairyokutest_2(int tairyokutest_2) {
		this.tairyokutest_2 = tairyokutest_2;
	}


	public int getTyukan_3_1_japanese() {
		return tyukan_3_1_japanese;
	}

	public void setTyukan_3_1_japanese(int tyukan_3_1_japanese) {
		this.tyukan_3_1_japanese = tyukan_3_1_japanese;
	}

	public int getTyukan_3_1_math() {
		return tyukan_3_1_math;
	}

	public void setTyukan_3_1_math(int tyukan_3_1_math) {
		this.tyukan_3_1_math = tyukan_3_1_math;
	}

	public int getTyukan_3_1_english() {
		return tyukan_3_1_english;
	}

	public void setTyukan_3_1_english(int tyukan_3_1_english) {
		this.tyukan_3_1_english = tyukan_3_1_english;
	}

	public int getTyukan_3_1_science() {
		return tyukan_3_1_science;
	}

	public void setTyukan_3_1_science(int tyukan_3_1_science) {
		this.tyukan_3_1_science = tyukan_3_1_science;
	}

	public int getTyukan_3_1_social() {
		return tyukan_3_1_social;
	}

	public void setTyukan_3_1_social(int tyukan_3_1_social) {
		this.tyukan_3_1_social = tyukan_3_1_social;
	}

	public int getTyukan_3_1_goukei() {
		return tyukan_3_1_goukei;
	}

	public void setTyukan_3_1_goukei(int tyukan_3_1_goukei) {
		this.tyukan_3_1_goukei = tyukan_3_1_goukei;
	}

	public int getKimatu_3_1_japanese() {
		return kimatu_3_1_japanese;
	}

	public void setKimatu_3_1_japanese(int kimatu_3_1_japanese) {
		this.kimatu_3_1_japanese = kimatu_3_1_japanese;
	}

	public int getKimatu_3_1_math() {
		return kimatu_3_1_math;
	}

	public void setKimatu_3_1_math(int kimatu_3_1_math) {
		this.kimatu_3_1_math = kimatu_3_1_math;
	}

	public int getKimatu_3_1_english() {
		return kimatu_3_1_english;
	}

	public void setKimatu_3_1_english(int kimatu_3_1_english) {
		this.kimatu_3_1_english = kimatu_3_1_english;
	}

	public int getKimatu_3_1_science() {
		return kimatu_3_1_science;
	}

	public void setKimatu_3_1_science(int kimatu_3_1_science) {
		this.kimatu_3_1_science = kimatu_3_1_science;
	}

	public int getKimatu_3_1_social() {
		return kimatu_3_1_social;
	}

	public void setKimatu_3_1_social(int kimatu_3_1_social) {
		this.kimatu_3_1_social = kimatu_3_1_social;
	}

	public int getKimatu_3_1_goukei() {
		return kimatu_3_1_goukei;
	}

	public void setKimatu_3_1_goukei(int kimatu_3_1_goukei) {
		this.kimatu_3_1_goukei = kimatu_3_1_goukei;
	}

	public int getTyukan_3_2_japanese() {
		return tyukan_3_2_japanese;
	}

	public void setTyukan_3_2_japanese(int tyukan_3_2_japanese) {
		this.tyukan_3_2_japanese = tyukan_3_2_japanese;
	}

	public int getTyukan_3_2_math() {
		return tyukan_3_2_math;
	}

	public void setTyukan_3_2_math(int tyukan_3_2_math) {
		this.tyukan_3_2_math = tyukan_3_2_math;
	}

	public int getTyukan_3_2_english() {
		return tyukan_3_2_english;
	}

	public void setTyukan_3_2_english(int tyukan_3_2_english) {
		this.tyukan_3_2_english = tyukan_3_2_english;
	}

	public int getTyukan_3_2_science() {
		return tyukan_3_2_science;
	}

	public void setTyukan_3_2_science(int tyukan_3_2_science) {
		this.tyukan_3_2_science = tyukan_3_2_science;
	}

	public int getTyukan_3_2_social() {
		return tyukan_3_2_social;
	}

	public void setTyukan_3_2_social(int tyukan_3_2_social) {
		this.tyukan_3_2_social = tyukan_3_2_social;
	}

	public int getTyukan_3_2_goukei() {
		return tyukan_3_2_goukei;
	}

	public void setTyukan_3_2_goukei(int tyukan_3_2_goukei) {
		this.tyukan_3_2_goukei = tyukan_3_2_goukei;
	}

	public int getKimatu_3_2_japanese() {
		return kimatu_3_2_japanese;
	}

	public void setKimatu_3_2_japanese(int kimatu_3_2_japanese) {
		this.kimatu_3_2_japanese = kimatu_3_2_japanese;
	}

	public int getKimatu_3_2_math() {
		return kimatu_3_2_math;
	}

	public void setKimatu_3_2_math(int kimatu_3_2_math) {
		this.kimatu_3_2_math = kimatu_3_2_math;
	}

	public int getKimatu_3_2_english() {
		return kimatu_3_2_english;
	}

	public void setKimatu_3_2_english(int kimatu_3_2_english) {
		this.kimatu_3_2_english = kimatu_3_2_english;
	}

	public int getKimatu_3_2_science() {
		return kimatu_3_2_science;
	}

	public void setKimatu_3_2_science(int kimatu_3_2_science) {
		this.kimatu_3_2_science = kimatu_3_2_science;
	}

	public int getKimatu_3_2_social() {
		return kimatu_3_2_social;
	}

	public void setKimatu_3_2_social(int kimatu_3_2_social) {
		this.kimatu_3_2_social = kimatu_3_2_social;
	}

	public int getKimatu_3_2_goukei() {
		return kimatu_3_2_goukei;
	}

	public void setKimatu_3_2_goukei(int kimatu_3_2_goukei) {
		this.kimatu_3_2_goukei = kimatu_3_2_goukei;
	}

	public int getGakuryokutest_3_japanese() {
		return gakuryokutest_3_japanese;
	}

	public void setGakuryokutest_3_japanese(int gakuryokutest_3_japanese) {
		this.gakuryokutest_3_japanese = gakuryokutest_3_japanese;
	}

	public int getGakuryokutest_3_math() {
		return gakuryokutest_3_math;
	}

	public void setGakuryokutest_3_math(int gakuryokutest_3_math) {
		this.gakuryokutest_3_math = gakuryokutest_3_math;
	}
	public int getGakuryokutest_3_english() {
		return gakuryokutest_3_english;
	}

	public void setGakuryokutest_3_english(int gakuryokutest_3_english) {
		this.gakuryokutest_3_english = gakuryokutest_3_english;
	}
	public int getGakuryokutest_3_science() {
		return gakuryokutest_3_science;
	}

	public void setGakuryokutest_3_science(int gakuryokutest_3_science) {
		this.gakuryokutest_3_science = gakuryokutest_3_science;
	}

	public int getGakuryokutest_3_social() {
		return gakuryokutest_3_social;
	}

	public void setGakuryokutest_3_social(int gakuryokutest_3_social) {
		this.gakuryokutest_3_social = gakuryokutest_3_social;
	}
	public int getGakuryokutest_3_goukei() {
		return gakuryokutest_3_goukei;
	}

	public void setGakuryokutest_3_goukei(int gakuryokutest_3_goukei) {
		this.gakuryokutest_3_goukei = gakuryokutest_3_goukei;
	}
}
