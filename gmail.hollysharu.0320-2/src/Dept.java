
public class Dept {
	//변수명은 컬럼이름을 그대로 씀 
	private int deptno;
	private String dname;
	private String loc;

	// 접근자메소드 생성
	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Dept 테이블 [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
}
