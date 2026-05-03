import java.util.ArrayList;

class LibraryUtils {

    public static double totalDuration(ArrayList<Media> list) {
        double sec = 0.00;
        for (Media media : list) {
            sec = sec + media.getDurationSeconds();
        }
        return sec;
    }

    public static void playAll(Playlist otherobj) {
        for (Media n : otherobj.items) {
            if (n instanceof Song) {
                System.out.print("  - Song: ");
                n.play();
            } else if (n instanceof PodcastEp) {
                System.out.print("  - Podcast: ");
                n.play();
            }
        }

    }

    public static ArrayList<Song> songsInGenre(ArrayList<Media> list, String genre) {

        ArrayList<Song> returned = new ArrayList<>();

        // 1st Logic that i used in this:
        for (Media media : list) {
            if (media instanceof Song) {
                Song corrected = (Song) media;
                String s_lowercase1 = corrected.getGenre().toLowerCase();
                String s_lowercase2 = genre.toLowerCase();

                if (s_lowercase1.equals(s_lowercase2)) {
                    returned.add(corrected);
                }

                // 2nd Logic that i used:
                // for (Media media : list) {
                // if (media instanceof Song) {
                // Song corrected= (Song) media;
                // if (corrected.getGenre().equalsIgnoreCase(genre)) {
                // returned.add(corrected);
                // }
                // }
                // }
            }
        }

        return returned;
    }
}