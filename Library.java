package library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Items> items = new ArrayList<>();
	
	public boolean addItem(Items item) {
		return this.items.add(item);
	}
	
		public boolean removeItem(String name) {
			return this.items.remove(this.getItemByname(name));}
			
			public Items getItemByname(String name) {
				for (Items i : this.items) {
					if (i.getName() == name) {
						return i;
					}
					
}
				return null;
				
}
}