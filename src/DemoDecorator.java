public class DemoDecorator {
    public static void main(String[] args) {
// Make "Sabina's hits" playlist and add 1 Vinyl song and another normal song to it
        PlayList sabinaPlaylist = new PlayList("Sabina's hits");
        sabinaPlaylist.add(new Vinilo(new Song("Princesa", "Joaquín Sabina")));
        sabinaPlaylist.add(new Song("Calle melancolía", "Joaquín Sabina"));
// Make "Manolo García's hits" playlist and add 1 MP4 song to it
        PlayList garciaPlaylist = new PlayList("Manolo Garcia's hits");
        garciaPlaylist.add(new MP4(new Song("Pájaros de barro", "Manolo García")));
// Make "my songs" playlist; add the two playlists
        PlayList mySongs = new PlayList("My Songs");
        mySongs.add(sabinaPlaylist);
        mySongs.add(garciaPlaylist);
// Play all songs of each playlist
        mySongs.play();
    }
}
