public class Test {
    public static void main(String[] args) {
        Date d1 = new Date(22,2,2023);
        Date d2 = new Date(23,2,2023);
        Date d3 = new Date(24,2,2023);

        Author au1 = new Author("vanthi",d1);
        Author au2 = new Author("minhhoa",d2);
        Author au3 = new Author("vanvuong",d3);

        Book b1 = new Book("mathematic1",2000,1999,au1);
        Book b2 = new Book("mathematic2",3000,2000,au2);
        Book b3 = new Book("mathematic3",4000,2001,au3);


        System.out.println("The name of b1 is: " + b1.getBookName());
        System.out.println("Published year is same to? " + b1.checkTheSameYear(b2));
        System.out.println("The price of b3 after 20% sale is: " + b3.getPriceAfterSale(20));


    }
}
