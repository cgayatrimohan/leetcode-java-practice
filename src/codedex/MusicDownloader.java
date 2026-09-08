package codedex;

@SuppressWarnings("unused")
public class MusicDownloader {
	private String songName;
	private String artistName;
	private String album;
	private String fileLink;
	private int releaseYear;

	public	MusicDownloader(String songName, String artistName, String album, String fileLink, int releaseYear) {
		this.songName = songName;
		this.artistName = artistName;
		this.album = album;
		this.fileLink = fileLink;
		this.releaseYear = releaseYear;
	}

	public String showFileLink(String songName) {
		if(this.songName.equalsIgnoreCase(songName)) {
			System.out.println("Link for " + songName + " is: " + this.fileLink);
		}
		
		return this.fileLink;
	}
}
