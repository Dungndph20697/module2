package lesson5;

public class Library {

    public void addBook(){
        Book b1 = new Book("Kinh doanh", "Dung", "b001",false);
        Book b2 = new Book("Kinh doanh", "Tan", "b002",false);
        Book b3 = new Book("Kinh doanh", "Dung", "b003",false);
        Book b4 = new Book("Kinh doanh", "Tan", "b004",false);
    }
    public static void displayTotalBook(){
        System.out.println("Tong so sach la: " + Book.getTotalBook());
    }

}
