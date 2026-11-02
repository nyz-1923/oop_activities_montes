
/*
 * Name: Renyza Kaye Montes
 * Section: [Your Section]
 * Date: November 3, 2026
 */

public class Main {

    public static void main(String[] args) {

        
        Book book1 = new Book(
                "Noli Me Tangere",
                "Jose Rizal",
                "ISBN-001",
                350.00
        );

        Book book2 = new Book(
                "El Filibusterismo",
                "Jose Rizal",
                "ISBN-002",
                320.00
        );

       
        EBook book3 = new EBook(
                "Florante at Laura",
                "Francisco Balagtas",
                "ISBN-003",
                150.00,
                "PDF"
        );

     
        Book[] books = {book1, book2, book3};


        System.out.println("===== BOOK INFORMATION =====");

        for (Book book : books) {

            if (book instanceof EBook) {
                System.out.println("\n===== E-BOOK =====");
            }

            book.displayInfo();
            System.out.println();
        }

   
        System.out.println("===== UPDATED INFORMATION =====");

        book2.setPrice(299.50);

        System.out.println("Title: " + book2.getTitle());
        System.out.printf("Price: PHP %.2f%n", book2.getPrice());


        System.out.println("\n===== DISCOUNT INFORMATION =====");

        book1.applyDiscount(10);

        System.out.println("Title: " + book1.getTitle());
        System.out.printf("Price after 10%% discount: PHP %.2f%n",
                book1.getPrice());

      
        System.out.println("\n===== VALIDATION TEST =====");

        book2.setPrice(-100);

        System.out.printf("Current Price: PHP %.2f%n",
                book2.getPrice());
    }
}

/*
 * REFLECTION QUESTIONS
 *
 * 1. Why is it better to change the price through setPrice()
 * instead of making price public?
 *
 * Answer: better sya because setPrice() validates the value
 * and prevents the book price from becoming negative.
 *
 * 2. Which members does EBook inherit from Book, and which
 * does it add on its own?
 *
 * Answer: Ma inherit sa EBook ang title, author, ISBN, price,
 * getters, setters, and displayInfo() method gikan sa Book.
 * E add niya iyang sariling fileFormat attribute ug ang iyang getter and setter.
 *
 * 3. If the library later adds an AudioBook class, how would
 * inheritance make that easier?
 *
 * Answer: Ang AudioBook class can also extend Book and reuse
 * its existing attributes and methods. Need ra niya na ma add 
 * iyang own attributes and methods para sa audio information.
 */
