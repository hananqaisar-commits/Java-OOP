package Library_Management_System;

class Magazine extends LibraryItem {

    private int issueno;

    public Magazine(String title, String author, int issueno) {
        super(title, author);
        this.issueno = issueno;
    }

    public void setIssueno(int issueno) {
        this.issueno = issueno;
    }

    public int getIssueno() {
        return issueno;
    }
}