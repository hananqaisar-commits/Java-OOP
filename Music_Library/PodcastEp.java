class PodcastEp extends Media {
    private String showName;
    private int epNo;

    public PodcastEp(String title, int durationSeconds, int releaseYear, String showName, int epNo) {
        super(title, durationSeconds, releaseYear);
        if (epNo >= 1) {
            this.epNo = epNo;
        } else {
            System.out.println("Invalid");
        }

        this.showName = showName;
    }

    public void setEpNo(int epNo) {
        this.epNo = epNo;
    }

    public int getEpNo() {
        return epNo;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getShowName() {
        return showName;
    }

    @Override
    public void play() {
        super.play();
        System.out.printf("Playing podcast:%s %s Ep: %-3d (Duration: %f)\n", getTitle(), getShowName(), getEpNo(),
                getDurationSeconds());
    }
}