class Song extends Media {
    private String genre;

    public Song(String title, int durationSeconds, int releaseYear, String genre) {
        super(title, durationSeconds, releaseYear);
        this.genre = genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void play() {

        super.play();
        System.out.printf("Playing Song:%s by %s duration:%f [%s]\n", getTitle(), getArtist(), getDurationSeconds(),
                getGenre());
    }
}