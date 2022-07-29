package library;

public class Book extends Items implements Media {

	private int yearOfRelease;

	public Book(String name, int yearOfRelease) {
		super.getName();
		this.yearOfRelease = yearOfRelease;
	}

	public int getyearOfRelease() {
		return yearOfRelease;
	}

	public void setyearOfRelease(int noOfPages) {
		this.yearOfRelease = yearOfRelease;
	}
	

	@Override
	public void written() {
		System.out.println("Check year Of Release");
		
	}
	
	}


