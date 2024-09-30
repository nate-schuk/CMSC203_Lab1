/*
 * Class: CMSC203  
 * Instructor: Khandan Monshi
 * Description: Movie driver task 1 creates a movie instance and asks the client to 
 * give information for a movie. Then all the information is printed out with the toString method.
 * Due: 10/2/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: Nathaniel Schuknecht
*/

import java.util.*;

public class MovieDriver_Task1 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Movie movie = new Movie();
		
		System.out.println("Enter the name of a movie");
		String movieName = keyboard.nextLine();
		movie.setTitle(movieName);
		
		System.out.println("Enter the rating of the movie");
		String movieRating = keyboard.nextLine();
		movie.setRating(movieRating);
		
		System.out.println("Enter the number of tickets sold for this movie");
		int ticketsSold = keyboard.nextInt();
		movie.setSoldTickets(ticketsSold);
		
		System.out.println(movie.toString());
		
	}
}
