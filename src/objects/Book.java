package objects;

import java.io.Serializable;

public class Book implements Serializable{
	
	private static final long serialVersionUID = 8584765010549352205L;
	String Title;
	String Author;
	int pages;
	
	Book(String name, String auth, int pagecount) {
		Title = name;
		Author = auth;
		pages = pagecount;
	}
}
