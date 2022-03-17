package workshop2.entity;

public class MovieTest {
	public static void main(String[] args) {
			Movie[] movies = new Movie[] {
					new Movie("������ ���� - ���� ������", "���� �轼", "��Ÿ��, ����", "�϶����� ���", 2001, 178, "12�� ������"),
					new Movie("Ʈ��������:������ ����", "����Ŭ ����", "SF, �׼�", "���̾� ����", 2009, 149),
					new Movie("���� �����", "��ó�� ĿƼ��", "���, ���", "�ٷ� ���ǵ�", 2003, 134, "15�� ������"),
					new Movie("��Ǫ �Ҵ�", "��ũ ������", "�ִϸ��̼�", "�� ��", "��ü ������")
					};
			System.out.println("<<��ü ��ȭ ���� ��ȸ>>");
			printHead();
			for (Movie m : movies) {
				System.out.printf("%-18s", m.getTitle() );
				System.out.printf("%-10s", m.getDirector() );
				
				System.out.printf("%-10s", m.getGenre());
				System.out.printf("%-10s", m.getActor());
				System.out.printf("%-4s��  ",m.getReleaseYear());
				System.out.printf("%-3s��  " ,m.getRunTime());
				System.out.println(m.getRating() );
			}
			
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println();
			System.out.println("<<2005�� ���� ������ ��ȸ>>");
			printHead();
			for (Movie m : movies) {
				if(m.getReleaseYear()<2005 && m.getReleaseYear()>0 ) {
				System.out.printf("%-18s", m.getTitle() );
				System.out.printf("%-10s", m.getDirector() );
				
				System.out.printf("%-10s", m.getGenre());
				System.out.printf("%-10s", m.getActor());
				System.out.printf("%-4s��  ",m.getReleaseYear());
				System.out.printf("%-3s��  " ,m.getRunTime());
				System.out.println(m.getRating() );
				}
			}
			
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println();
			System.out.println("<<�ִϸ��̼� ��ȸ>>");
			printHead();
			for (Movie m : movies) {
				if(m.getGenre().equals("�ִϸ��̼�")) {
				System.out.printf("%-18s", m.getTitle() );
				System.out.printf("%-10s", m.getDirector() );
				
				System.out.printf("%-10s", m.getGenre());
				System.out.printf("%-10s", m.getActor());
				System.out.printf("%-4s��  ",m.getReleaseYear());
				System.out.printf("%-3s��  " ,m.getRunTime());
				System.out.println(m.getRating() );
				}
			}
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println();
			System.out.println("<<��Ÿ�� 140�� �̻� ��ȭ ��ȸ>>");
			printHead();
			for (Movie m : movies) {
				if(m.getRunTime()>=140 && m.getRunTime()>0) {
				System.out.printf("%-18s", m.getTitle() );
				System.out.printf("%-10s", m.getDirector() );
				
				System.out.printf("%-10s", m.getGenre());
				System.out.printf("%-10s", m.getActor());
				System.out.printf("%-4s��  ",m.getReleaseYear());
				System.out.printf("%-3s��  " ,m.getRunTime());
				System.out.println(m.getRating() );
				}
			}
		}
		public static void printHead() {
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println("\t����\t\t����\t�帣\t�ֿ�\t�����⵵ ��Ÿ��\t���");
			System.out.println("--------------------------------------------------------------------------------------");
		}

	}