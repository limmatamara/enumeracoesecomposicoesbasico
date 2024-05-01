package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Coment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Coment coment1 = new Coment("Have a nice trip!");
		Coment coment2 = new Coment("Wow, thats awesome!");
		Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country",12);
		post1.addComent(coment1);
		post1.addComent(coment2);
		
		Coment coment3 = new Coment("Good night");
		Coment coment4 = new Coment("May the force be with you");
		Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);
		post2.addComent(coment3);
		post2.addComent(coment4);
		
		System.out.println(post1);
		System.out.println();
		System.out.println(post2);
		
		
		
	}

}
