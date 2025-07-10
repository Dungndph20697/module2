package lesson5;

public class Book {
    private String title;
    private String author;
    private String isbn;
    //true là chưa mượn, false là đã mượn
    private boolean borrowed;
    private static int totalBook = 0;

    public Book(String title, String author, String isbn, boolean borrowed) {
        totalBook++;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.borrowed = borrowed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public static int getTotalBook() {
        return totalBook;
    }

    public static void setTotalBook(int totalBook) {
        Book.totalBook = totalBook;
    }

    public void borrowBook() {
        if (borrowed == false) {
            System.out.println("sach da dươc muon");
        } else {
            borrowed = true;
        }
    }

    public void returnBook() {
        if (borrowed){
            System.out.println("Sach chưa duoc muon");
        }else {
        borrowed = false;
        }
    }

//    public static void displayTotalBook() {
//        System.out.println("Tong so sach la: " + totalBook);
//    }

}
