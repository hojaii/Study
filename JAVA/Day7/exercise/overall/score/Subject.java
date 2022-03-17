package exercise.overall.score;

public class Subject {
	private String subjectName;
	
	public Subject(String subjectName) {
		//super(); 생략해도 되는 코드
		this.subjectName = subjectName;
	}
	public String getsubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
}
