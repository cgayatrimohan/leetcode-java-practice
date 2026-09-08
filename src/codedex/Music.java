package codedex;

public class Music {
	public static void main(String[] args) {
		// Add your code here! 💖
		MusicDownloader music = new MusicDownloader("Pink Pony Club", "Chappell Roan", "Midwest Princes",
				"https://www.spotify.com/pink-pony-club.mp3", 2023);

		music.showFileLink("Pink Pony Club");
	}
}
