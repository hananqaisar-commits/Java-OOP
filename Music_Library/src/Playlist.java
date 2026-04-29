import java.util.ArrayList;

class Playlist {
    private String playlistName;
    ArrayList<Media> items;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.items = new ArrayList<>();

    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void addItems(Media other) {
        if (other instanceof Song) {
            Media s = (Song) other;
            items.add(s);
        } else if (other instanceof PodcastEp) {
            Media p = (PodcastEp) other;
            items.add(p);
        }
    }

    public void removeItems(Media other) {
        items.remove(other);
    }

    public int getSize(Playlist other) {
        return other.items.size();
    }

    public Media getIndex(int index) {
        return items.get(index);
    }

    public void playAll(Playlist otherobj) {
        for (Media n : otherobj.items) {
            if (n instanceof Song) {
                System.out.println("Song: ");
                n.play();
            }
            if (n instanceof PodcastEp) {
                System.out.println("Podcast: ");
                n.play();
            }
        }

    }

    @Override
    public String toString() {
        return String.format("Playlist: %s | Size: %d", getPlaylistName(), getSize(this));
    }
}