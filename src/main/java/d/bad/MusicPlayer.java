package d.bad;

public class MusicPlayer {
    private SpotifyService spotifyService;

    public MusicPlayer() {
        spotifyService = new SpotifyService();
    }

    public void playFromSpotify(String song) {
        spotifyService.playSong(song);
    }
}
