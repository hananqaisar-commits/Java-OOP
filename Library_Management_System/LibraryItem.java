package Library_Management_System;

class LibraryItem {

    protected String title;
    protected String author;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + " Author: " + getAuthor() + "\n";
    }
}