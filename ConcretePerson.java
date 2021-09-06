import java.util.List;
import java.util.ArrayList;

public class ConcretePerson implements person {
    private final String fname;   
    private final String lname;
    private float earnings;
    private List<Book> booksOwned;
    private final Boolean isPublishable;
    private List<Book> booksPublished;

    public ConcretePerson(final String fname, final String lname, final Boolean isPublishable) {
        this.fname = fname;
        this.lname = lname;
        this.earnings = 0;
        this.booksOwned = new ArrayList<>();
        this.isPublishable = isPublishable;
        if (isPublishable == true) {
            this.booksPublished = new ArrayList<>();
        };
    }

    @Override
    public float receive(float money) {
        // Adds money (float) to earnings
        this.earnings += money;
        return earnings;
    }

    @Override
    public float charge(float cost) {
        // Takes money (float) away from earnings
        this.earnings -= cost;
        return earnings;
    }

    @Override
    public Object buy(final Book book) {
        /* 
        Adds the book object to the books owned array
        Takes away the price from the earnings
        Gives 10% to author of that book
        */
        if (this.earnings >= book.price()) {
            this.booksOwned.add(book);
            this.earnings -= book.price();
            float pay = (float)(book.price()*0.1);
            book.author().receive(pay);
        }
        else {
            System.out.println("You don’t have enough money to buy");
            System.out.println();
        }
        return null;
    }

    @Override
    public String getName() {
        // Returns the name
        return this.fname +" "+ this.lname;
    }

    @Override
    public float getEarnings() {
        // Returns the earnings
        return this.earnings;
    }

    @Override
    public void addPublished(final Book book) {
        // Adds a book object to the BooksPublished list
        this.booksPublished.add(book);
        return;
    }

    @Override
    public void printBooksOwned() {
        // Prints the list of books owned
        System.out.println(this.fname+" "+this.lname+" owns:");
        for (int i = 0; i < this.booksOwned.size(); i++) {     
            System.out.println(this.booksOwned.get(i).bookType() +"["+ "author = " + this.booksOwned.get(i).author().getName() + ", " + "title = " + this.booksOwned.get(i).title().getTitle() + ", "+ "price = " + this.booksOwned.get(i).price() + ", " + "duration = " + this.booksOwned.get(i).duration() +"]"); 
            
            // AudioBook[ author = JJR Tolkien, title = The Hobbit / An Unexpected Journey, price = 15.0, duration = 1800.5 ]
        }
        System.out.println();
    }

    @Override
    public void printBooksPublished() {
        // Prints the list of books published
        System.out.println(this.fname+" "+this.lname+" published:");
        for (int i = 0; i < this.booksOwned.size(); i++) {   
            System.out.println(this.booksOwned.get(i).bookType() +"["+ "author = " + this.booksOwned.get(i).author().getName() + ", " + "title = " + this.booksOwned.get(i).title().getTitle() + ", "+ "price = " + this.booksOwned.get(i).price() + ", " + "duration = " + this.booksOwned.get(i).duration() +"]"); 
        };
        System.out.println();
    };
};


