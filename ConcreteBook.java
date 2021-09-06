public class ConcreteBook implements Book {
    /**
     * This class contains the methods that all the subclasses will be referencing
     */
    private final Title title;
    private final Author author;
    private final String bookType;
    private final double duration;
    private final float price;

    public ConcreteBook(final Title title, final Author author, final double duration, final String bookType) {
        this.title = title;
        this.author = author;
        this.duration = duration;
        this.bookType = bookType;
        this.author.addPublished(this);
        if (bookType == "AudioBook") {
            this.price = 15;
        }
        else if (bookType == "HardBack") {
            this.price = 12;
        }
        else {
            this.price = 10;
        };
    };

    public double duration() {
        return this.duration;
    }

    @Override
    public Title title() {
        // Returns the title of the book
        return this.title;
    }

    @Override
    public Author author() {
        // Returns the author of the book
        return this.author;
    }

    @Override
    public float price() {
        // Returns the price of the book
        return this.price;
    }  

    @Override
    public String bookType() {
        // Returns the type of the book
        return this.bookType;
    }  
}
