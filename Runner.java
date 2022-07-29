package library;

public class Runner {

	public static void main(String[] args) {
		Library library = new Library();

		library.addItem(new Book("The Great Gatsby", 1952));
		library.addItem(new Book("Animal Farm", 1983));
		library.addItem(new Book("Pride and Prejudice", 1985));
		library.addItem(new Newspaper("The Guardian", 2002 ));
		library.addItem(new Newspaper("The Daily Mail", 1985));
		library.addItem(new Newspaper(" The Sun", 1920));

		System.out.println(library.getItemByname("Animal Farm"));
}

}
