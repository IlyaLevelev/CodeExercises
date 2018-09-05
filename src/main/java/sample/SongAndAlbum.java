package sample;

import java.util.*;

public class SongAndAlbum {

	public static void main(String[] args) {

		Album thisIsAllYours = new Album();
		Album prenderElAlma = new Album();
		Song nara = new Song();
		Song leftHandFree = new Song();
		Song hungerOfThePine = new Song();
		Song cumbiaDelOlvido = new Song();
		Song laCosecha = new Song();
		Song colibria = new Song();

		thisIsAllYours.author = "altJ";
		thisIsAllYours.title = "This is all Yours";
		thisIsAllYours.year = 2014;

		prenderElAlma.author = "Nicola Cruz";
		prenderElAlma.title = "Prender el Alma";
		prenderElAlma.year = 2015;

		nara.title = "Nara";
		nara.length = 296;
		leftHandFree.title = "Left Hand Free";
		leftHandFree.length = 174;
		hungerOfThePine.title = "Hunger of the Pine";
		hungerOfThePine.length = 305;
		cumbiaDelOlvido.title = "Cumbia del Olvido";
		cumbiaDelOlvido.length = 216;
		laCosecha.title = "La Cosecha";
		laCosecha.length = 315;
		colibria.title = "Colibria";
		colibria.length = 480;

		thisIsAllYours.songs = Arrays.asList(nara, leftHandFree, hungerOfThePine);
		prenderElAlma.songs = Arrays.asList(cumbiaDelOlvido, laCosecha, colibria);

		displayAlbumInfo (thisIsAllYours);
		displayAlbumInfo (prenderElAlma);

	}

	static void displayAlbumInfo (Album album) {
		
		
		int i = 1;
		System.out.println(album.author + " - " + album.title + " (" + album.year + ")");
		for (Song song : album.songs) {
			int minutes = (song.length/60);
			int seconds = song.length - (minutes * 60);
			String secondsString = "" + seconds;
			if (seconds < 10) {
				secondsString = "0" + seconds; 
			}
			System.out.println(i + " - " + song.title + " - " + minutes +  ":" + secondsString);
			
			i = i +1;
		}
	}

}

class Song{
	String title;
	int length;
	boolean explicit;
}

class Album{
	String author;
	String title;
	int year;

	List<Song> songs;
}