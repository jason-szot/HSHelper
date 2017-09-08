package objects;

// object representing reading assignment or activity
public class Reading {
	String name;
	String author;
	int minutes;
	String date;
	String method;
	int pages;
	Boolean finished;
	
	Reading(Book book, int time, String d, String reader, int pagecount, Boolean end) {
		name = book.Title;
		author = book.Author;
		minutes = time;
		date = d;
		method = reader;
		pages = pagecount;
		finished = end;
	}
}
