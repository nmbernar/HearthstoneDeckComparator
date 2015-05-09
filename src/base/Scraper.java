package base;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Scraper {

	public static void main(String[] args){
		try {
			Document doc = Jsoup.connect("http://www.hearthhead.com/decks?filter=na=mech+mage").get();
			String cssPath = "a.c8";
			Elements e = doc.select("div > a.c8"); //null for some reason
			System.out.println(e.size());
		} catch(IOException e){
			e.printStackTrace();
		} finally {
			//System.out.println("Complete!");
		}
	}
}
