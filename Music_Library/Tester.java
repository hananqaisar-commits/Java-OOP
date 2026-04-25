import java.util.*;

public class Tester {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create Media objects
        Media m1 = new Song("Dill lagi", 134, 2019, "Sad");
        Media m2 = new Song("Dil Lagi", 345, 2020, "Romantic");
        Media m3 = new PodcastEp("Podcast no.1", 3235, 2026, "Podcast", 3);
        Media m4 = new Song("End of beginning", 230, 2018, "Emotional");

        // artists
        m1.artist = new Artist("Atif Aslam", "Pakistan", 2300425);
        m2.artist = new Artist("Arigit Singh", "India", 73004325);
        m3.artist = new Artist("Atif aslam", "Pakistan", 13423);

        // Playlist
        Playlist likedSongs = new Playlist("Liked songs");
        likedSongs.addItems(m2);
        likedSongs.addItems(m1);
        likedSongs.addItems(m3);
        likedSongs.addItems(m4);

        System.out.println(m1.artist.equals(m3.artist)); // true
        System.out.println(m1.artist.equals(m2.artist)); // false

        List<Media> list = new ArrayList<>();
        list.add(m4);
        list.add(m1);
        list.add(m2);

        // here i am sortting my list by overridding compareTo
        Collections.sort(list);

        // Print sorted list through Collections
        System.out.println("Sorted list:");
        for (Media media : list) {
            System.out.printf("%-30s - %-4d\n",
                    media.getTitle(),
                    media.getReleaseYear());
        }

        // Play all playlist
        likedSongs.playAll(likedSongs);

        input.close();
    }
}