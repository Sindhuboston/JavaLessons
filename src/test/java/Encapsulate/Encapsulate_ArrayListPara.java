package Encapsulate;

import java.util.ArrayList;

public class Encapsulate_ArrayListPara {
	private ArrayList<String> genres;
	private String movie;
	private String director;
	private String rating;
					//---------------------- Setters ------------------------------------------
						public void setGenres(ArrayList<String> genres) {
								this.genres = genres;}
						public void setMovie(String movie) {
								this.movie = movie;}
						public void setDirector(String director) {
								this.director = director;}
						public void setRating(String rating) {
							if (rating.equalsIgnoreCase("p")||rating.equalsIgnoreCase("pg")||rating.equalsIgnoreCase("nr")||rating.equalsIgnoreCase("pg-16")) {
								this.rating = rating;
							}else
								this.rating = "NR";}	
						//---------------------- Getters ------------------------------------------
						public ArrayList<String> getGenres() {
								return genres;}
						public String getMovie() {
								return movie;}
						public String getDirector() {
								return director;}
						public String getRating() {
								return rating;}

	public static void main(String[] args) {
		Encapsulate_ArrayListPara en= new Encapsulate_ArrayListPara();
							
							ArrayList <String> ar = new ArrayList<String>();
							ar.add("Drama");
							ar.add("thriller");
							ar.add("comedy");
							ar.add("action");
		en.setGenres(ar);
		en.setDirector("Steven Spielberg");
		en.setMovie("JurrasicPark");
		en.setRating("pg");
		
		System.out.println(en.getGenres());  /* <<<<---- ArrayList passed as an argument */
		System.out.println(en.getMovie());
		System.out.println(en.getDirector());
		System.out.println(en.getRating());
	}
}
