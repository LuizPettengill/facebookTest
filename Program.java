package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		Comment c3 = new Comment("Take a lot of pictures!");
		
		Post p1 = new Post(
				sdf.parse("14/12/1994 12:35:41"),
				"Traveling to New Zealand!",
				"I'm going to visit this wonderful country!",
				12);

		p1.addComment(c1);
		p1.addComment(c2);
		p1.addComment(c3);
		
		System.out.println(p1);
	}

}
