package com.revature;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class HackerRankDriver {

	static int minimumMoves(int[] a, int[] m) {
		int moves = 0;
		for (int i = 0; i < a.length; i++) {
			int andreaNum = a[i];
			int mariaNum = m[i];
			while (andreaNum != 0) {
				int andreaDigit = andreaNum % 10;
				int mariaDigit = mariaNum % 10;
				moves += Math.abs(andreaDigit - mariaDigit);
				andreaNum /= 10;
				mariaNum /= 10;
			}
		}
		return moves;

	}

	static int getNumberOfMovies(String substr) {
		/*
		 * Endpoint: "https://jsonmock.hackerrank.com/api/movies/search/?Title=substr"
		 */

		try {
			URL url = new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title=" + substr);
			InputStream is = url.openStream();
			InputStreamReader isr = new InputStreamReader(is);
			JsonParser jp = new JsonParser();
			JsonObject je = jp.parse(isr).getAsJsonObject();
			return je.get("total").getAsInt();

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;

	}
	
    static String[] getMovieTitles(String substr) {

    	try {
			URL url = new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title=" + substr);
			InputStream is = url.openStream();
			InputStreamReader isr = new InputStreamReader(is);
			JsonParser jp = new JsonParser();
			int numPages = jp.parse(isr).getAsJsonObject().get("total_pages").getAsInt();
			
			is = url.openStream();
			isr = new InputStreamReader(is);
			
			Set<JsonObject> movies = new HashSet<JsonObject>();
			
			JsonArray ja;
			int i = 0;
			do {
				url = new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title=" + substr + "&page=" + i);
				is = url.openStream();
				isr = new InputStreamReader(is);
				ja = jp.parse(isr).getAsJsonObject().get("data").getAsJsonArray();
				for (JsonElement element : ja) {
					movies.add(element.getAsJsonObject());
				}
				i++;
			} while(ja.size() != 0);
			
			String [] titleArray = new String[movies.size()];
			
			List<String> titles = new ArrayList<String>();
			
			for (JsonObject jo : movies) {
				titles.add(jo.get("Title").getAsString());
			}
			
			Arrays.sort(titles.toArray(titleArray));
			return titleArray;

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		return null;
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(String title: getMovieTitles("maze")) {
			System.out.println(title);
		}
	}

}
