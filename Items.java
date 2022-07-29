package library;

public abstract class Items {

	private boolean available = true;

	private String name;
	
	public String getName() {
		return name;}
		
		public void setName(String name) {
			this.name = name;
	
	}
		public boolean isAvailable() {
			return available;
		}	
			public void setAvailable(boolean available) {
				this.available = available;
	}
		}



