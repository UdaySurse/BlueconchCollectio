import java.time.LocalDate;

public class Movie implements Comparable<Movie>{

	private Integer movieId;
	private String MovieName;
	private String genre;
	private LocalDate releaseDate;
	public Movie(Integer movieId, String movieName, String genre, LocalDate releaseDate) {
		
		this.movieId = movieId;
		MovieName = movieName;
		this.genre = genre;
		this.releaseDate = releaseDate;
	}
	public Integer getMovieId() {
		return movieId;
	}
	public String getMovieName() {
		return MovieName;
	}
	public String getGenre() {
		return genre;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
	@Override
	public String toString() {
		
		return "--"+movieId+
				"--"+MovieName+
				"--"+genre+
				"--"+releaseDate;
	}
	@Override
	public int compareTo(Movie o) {
		
		int i = releaseDate.compareTo(o.releaseDate);
		if(i == 0) {
			
			return 0;
		}
		else if(i > 0) {
			
			return 1;
		}
		return -1;
	}
}
