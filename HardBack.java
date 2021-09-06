/**
  * Lab2
  * @author Name (Student No: 119380051)
*/

public class HardBack implements Book{
    /**
     * Every instance of Hardback is created through ConcreteBook
     * All the methods are called from ConcreteBook
     */
    private final Author author;
    private final Title title;
    private final double duration;
    private final Book HardBack;

    public HardBack(final Author author, final Title title, final double duration) {
        this.author = author;
        this.title = title;
        this.duration = duration;
        this.HardBack = new ConcreteBook(title, author, duration, "HardBack");
    };

    @Override
    public double duration() {
        return this.HardBack.duration();
    }

    @Override
    public Title title() {
        // returns the title of the book
        return this.HardBack.title();
    };

    @Override
    public Author author() {
        // returns the author object
        return this.HardBack.author();
    };

    @Override
    public float price() {
        // returns the price of the book
        return this.HardBack.price();
    };

    @Override
    public String bookType() {
        // Returns the type of the book
        return this.HardBack.bookType();
    }  
};
