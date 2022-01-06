import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MovieService {
	
	
	public static void main(String[] args) {
		
		System.out.println("Adding movies to the given ds");
		
		Map<Movie,Integer> map = addKeyValuePairsToMap();
		
		System.out.println("List of movie on the basis of rating");
		
		
		
		List<Map.Entry<Movie,Integer>> lmovie = getHigherRatedMovieNames(map);
		
		System.out.println("Specific genre movie");
		String gener ="";
		getMovieNamesOfSpecificGenre(lmovie,gener);
		
		System.out.println("Sorted by rating lowest rate");
		
		getSortedMovieListByRating(map);
		
		System.out.println("Sorted by release date");
		getSortedMovieListByReleaseDate(map);
	}
	
	
	
	public static Map<Movie,Integer> addKeyValuePairsToMap(){
		
		//Integer movieId, String movieName, String genre, LocalDate releaseDate
		Map<Movie,Integer> movieMap= new HashMap<Movie,Integer>();
		
		movieMap.put(new Movie(1,"Tadap","Drama", LocalDate.of(2016, 02, 10)),1);
		movieMap.put(new Movie(2,"Sambhaji","Hostoric", LocalDate.of(2017, 03, 11)),3);
		movieMap.put(new Movie(3,"Kick","Comedy", LocalDate.of(2018, 03, 11)),4);
		movieMap.put(new Movie(4,"Spiderman","Action", LocalDate.of(2019, 05, 12)),7);
		movieMap.put(new Movie(5,"Harry Potter","Children", LocalDate.of(2015, 02, 10)),8);
		
		return movieMap;
		
	}
	
	public static List<Map.Entry<Movie,Integer>> getHigherRatedMovieNames(Map<Movie, Integer> map) {
		
		Set<Map.Entry<Movie,Integer>> s = map.entrySet();
		List<Map.Entry<Movie,Integer>> lmovie = new ArrayList<>();
		lmovie.addAll(s);
		
		
		
		Collections.sort(lmovie, new Comparator<Map.Entry<Movie, Integer> >() {
            public int compare(Map.Entry<Movie, Integer> o1,
                               Map.Entry<Movie, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
		
		
		System.out.println(lmovie);
		
		return lmovie;
		
	}

	public static List<String> getMovieNamesOfSpecificGenre(List<Entry<Movie, Integer>> lmovie,String genre){
		
		
		List<Movie> generMovieList = new ArrayList<Movie>();
		
		List<String> genMovieList = new ArrayList<String>();
		for(Map.Entry<Movie, Integer> movie : lmovie) {
			
			generMovieList.add(movie.getKey());
		}
		
		for(Movie s :generMovieList) {
			if(s.getGenre().equals(genre)) {
			System.out.println(s.getMovieName());
			genMovieList.add(s.getMovieName());
			}
		}
		
		System.out.println(genMovieList);
		return genMovieList;
	}
	
	 public List<String> getMovieNamesReleasedAfterSpecificDateAndRatingLesserThanThree(){
		 
		 return null;
	 }
	
	 public static List<Movie> getSortedMovieListByReleaseDate(Map<Movie, Integer> map){
		 List<Movie> lmovie = new ArrayList<>();
		 for(Map.Entry<Movie, Integer> m : map.entrySet()) {
			 
			 lmovie.add(m.getKey());
			 
		 }
		 
		 Collections.sort(lmovie);
		 
		 System.out.println(lmovie);
		 
		 return lmovie;
	 }
	 
	 public static String getSortedMovieListByRating(Map<Movie, Integer> map){
		 
			Set<Map.Entry<Movie,Integer>> s = map.entrySet();
			List<Map.Entry<Movie,Integer>> lmovie = new ArrayList<>();
			lmovie.addAll(s);
			
			
			
			Collections.sort(lmovie, new Comparator<Map.Entry<Movie, Integer> >() {
	            public int compare(Map.Entry<Movie, Integer> o1,
	                               Map.Entry<Movie, Integer> o2)
	            {
	                return (o1.getValue()).compareTo(o2.getValue());
	            }
	        });
			
			
			System.out.println(lmovie.get(0).getKey().getMovieName());
			
			return lmovie.get(0).getKey().getMovieName();
	 }
	 
	 
	
}
