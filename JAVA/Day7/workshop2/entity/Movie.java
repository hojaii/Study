package workshop2.entity;

	public class Movie {
		private String title;
		private String director;
		private String genre;
		private String actor;
		private int releaseYear;
		private int runTime;
		private String rating;
	public Movie(String title, String director, String genre, String actor, String rating) {
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.actor = actor;
		this.rating = rating;
	}	
	public Movie(String title, String director, String genre, String actor, int releaseYear, int runTime) {
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.actor = actor;
		this.releaseYear = releaseYear;
		this.runTime = runTime;
		
	}
	public Movie(String title, String director, String genre, String actor, int releaseYear,
			int runTime, String rating) {
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.actor = actor;
		this.releaseYear = releaseYear;
		this.runTime = runTime;
		this.rating = rating;
		
	}
	public String getTitle() {
		return title;
	}
	public String getDirector() {
		return director;
	}
	public String getGenre() {
		return genre;
	}
	public String getActor() {
		return actor;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public int getRunTime() {
		return runTime;
	}
	public String getRating() {
		return rating;
	}
}
