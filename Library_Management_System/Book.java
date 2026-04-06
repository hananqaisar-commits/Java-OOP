package Library_Management_System;

class Book extends LibraryItem {

    private int page;

    public Book(String title, String author, int page) {
        super(title, author);
        this.page = page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public String toString() {
        return "Book name: " + getTitle() + " Author: " + getAuthor() + " | Pages: " + getPage() + "\n";
    }
}