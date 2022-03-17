package exercise.overall.score;

public class ScoreTest {
	private static Subject[] subjects = new Subject[] { new Subject("C"), new Subject("Linux"), new Subject("Java") };
	private static Student[] students = new Student[] { 
			new Student("����", new int[] { 80, 90, 100 }),
			new Student("����", new int[] { 70, 80, 90 }), 
			new Student("����", new int[] { 75, 88, 95 }),
			new Student("����", new int[] { 80, 70, 85 }) };

	public static void main(String[] args) {
		printLine();
		printTitle() ;
		printLine();
		printScores() ;
		printLine();
	}

	private static void printTitle() {		 
		System.out.print ("���� ");
		for (Subject s :  subjects) 
			System.out.print (s.getsubjectName() +" ");
		System.out.println ("���� ���");
	}

	private static void printScores() {		 
		for (Student s :  students) {
			System.out.print (s.getName() +" ");
			for (int i=0;i<s.getScores().length ; i++) {
				System.out.print (s.getScores()[i] +" ");
			}
			System.out.print (s.getTotal() +" ");
			System.out.printf ("%.2f \n", s.getAverage() );
		}
	}

	private static void printLine() {
		System.out.println("===========================");
	}

}