package workshop2.entity;

public class MovieTest {
	public static void main(String[] args) {
			Movie[] movies = new Movie[] {
					new Movie("반지의 제왕 - 반지 원정대", "피터 잭슨", "판타지, 모험", "일라이저 우드", 2001, 178, "12세 관람가"),
					new Movie("트랜스포머:패자의 역습", "마이클 베이", "SF, 액션", "샤이아 라보프", 2009, 149),
					new Movie("러브 액츄얼리", "리처드 커티스", "멜로, 드라마", "앨런 릭맨등", 2003, 134, "15세 관람가"),
					new Movie("쿵푸 팬더", "마크 오스본", "애니메이션", "잭 블랙", "전체 관람가")
					};
			System.out.println("<<전체 영화 정보 조회>>");
			printHead();
			for (Movie m : movies) {
				System.out.printf("%-18s", m.getTitle() );
				System.out.printf("%-10s", m.getDirector() );
				
				System.out.printf("%-10s", m.getGenre());
				System.out.printf("%-10s", m.getActor());
				System.out.printf("%-4s년  ",m.getReleaseYear());
				System.out.printf("%-3s분  " ,m.getRunTime());
				System.out.println(m.getRating() );
			}
			
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println();
			System.out.println("<<2005년 이전 개봉작 조회>>");
			printHead();
			for (Movie m : movies) {
				if(m.getReleaseYear()<2005 && m.getReleaseYear()>0 ) {
				System.out.printf("%-18s", m.getTitle() );
				System.out.printf("%-10s", m.getDirector() );
				
				System.out.printf("%-10s", m.getGenre());
				System.out.printf("%-10s", m.getActor());
				System.out.printf("%-4s년  ",m.getReleaseYear());
				System.out.printf("%-3s분  " ,m.getRunTime());
				System.out.println(m.getRating() );
				}
			}
			
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println();
			System.out.println("<<애니메이션 조회>>");
			printHead();
			for (Movie m : movies) {
				if(m.getGenre().equals("애니메이션")) {
				System.out.printf("%-18s", m.getTitle() );
				System.out.printf("%-10s", m.getDirector() );
				
				System.out.printf("%-10s", m.getGenre());
				System.out.printf("%-10s", m.getActor());
				System.out.printf("%-4s년  ",m.getReleaseYear());
				System.out.printf("%-3s분  " ,m.getRunTime());
				System.out.println(m.getRating() );
				}
			}
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println();
			System.out.println("<<런타임 140분 이상 영화 조회>>");
			printHead();
			for (Movie m : movies) {
				if(m.getRunTime()>=140 && m.getRunTime()>0) {
				System.out.printf("%-18s", m.getTitle() );
				System.out.printf("%-10s", m.getDirector() );
				
				System.out.printf("%-10s", m.getGenre());
				System.out.printf("%-10s", m.getActor());
				System.out.printf("%-4s년  ",m.getReleaseYear());
				System.out.printf("%-3s분  " ,m.getRunTime());
				System.out.println(m.getRating() );
				}
			}
		}
		public static void printHead() {
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println("\t제목\t\t감독\t장르\t주연\t개봉년도 런타임\t등급");
			System.out.println("--------------------------------------------------------------------------------------");
		}

	}