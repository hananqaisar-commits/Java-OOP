class Media implements Payable, Comparable<Media> {
    private String title;
    public double durationSeconds;
    private int releaseYear;
    public Artist artist;

    public Media(String title, int durationSeconds, int releaseYear) {
        if (title == null || title.trim().isEmpty()) {
            System.out.println("Invalid");
        } else {
            this.title = title;
        }
        if (durationSeconds < 0) {
            System.out.println("Invalid");
        } else {
            this.durationSeconds = durationSeconds;
        }
        if (releaseYear >= 1877 && releaseYear <= 2100) {

            this.releaseYear = releaseYear;
        } else {
            System.out.println("Invalid");
        }
    }

    public Artist getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public double getDurationSeconds() {
        double min = this.durationSeconds / 60;
        return min;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public int compareTo(Media other) {
        int result = this.getTitle().compareToIgnoreCase(other.getTitle());
        if (result == 0) {
            if (this.getReleaseYear() < other.getReleaseYear()) {
                return -1;
            } else if (this.getReleaseYear() > other.getReleaseYear()) {
                return 1;
            } else if (this.getReleaseYear() == other.getReleaseYear()) {
                return 0;
            }
        } else if (result != 0) {
            return result;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Media))
            return false;

        Media other = (Media) obj;

        if (this.artist == null || other.artist == null) {
            return this.artist == other.artist;
        }

        return this.artist.getName().equalsIgnoreCase(other.artist.getName());
    }

}