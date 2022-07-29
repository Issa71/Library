package library;

public class Newspaper extends Items implements Media {

		private int yearOfRelease;

		public Newspaper(String name, int yearOfRelease) {
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

