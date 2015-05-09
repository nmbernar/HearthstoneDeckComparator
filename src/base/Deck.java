package base;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	private String name;
	private List<String> contents;
	
	public Deck(){
		contents = new ArrayList<String>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getContents() {
		return contents;
	}

	public void setContents(List<String> contents) {
		this.contents = contents;
	}
	
	
	
}
