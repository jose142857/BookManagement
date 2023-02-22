public class Book {
    private String bookName;
    private double price;
    private int publishYear;
    private Author bookAuthor;

//setter & getter
    public Book(String bookName, double price, int publishYear, Author bookAuthor) {
        this.bookName = bookName;
        this.price = price;
        if(publishYear>=0){
            this.publishYear = publishYear;
        }else {
            this.publishYear = 0;
        }
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public Author getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(Author bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

//    create methods
    public String printNameOfBook(){
        return this.bookName;
    }

    public boolean checkTheSameYear(Book otherBook){
      return this.publishYear == otherBook.publishYear;

    }

    public double getPriceAfterSale(int x){
//        this.price = this.price *(1-x/100);
//        return this.price;
        return this.price - this.price*x/100;
    }



}
