public class Reader implements person {
    /**
     * Every instance of Reader is created through person
     * All the methods are called from person
     */
    private final String fname;   
    private final String lname;
    private final person Reader;

    Reader(final String fname, final String lname) {
        this.fname = fname;
        this.lname = lname;
        this.Reader = new ConcretePerson(fname, lname, false);
    }

    @Override
    public float receive(float money) {
        // Adds money (float) to earnings
        return this.Reader.receive(money);
    }

    @Override
    public float charge(float cost) {
        // Takes money (float) away from earnings
        return this.Reader.charge(cost);
    }

    @Override
    public Object buy(Book book) {
        /* 
        Adds the book object to the books owned array
        Takes away the price from the earnings
        Gives 10% to author of that book
        */
        return this.Reader.buy(book);
    }

    @Override
    public String getName() {
        // Returns the name
        return this.Reader.getName();
    }

    @Override
    public float getEarnings() {
        // Returns the earnings
        return this.Reader.getEarnings();
    }

    @Override
    public void addPublished(Book book) {
        // Adds a book object to the BooksPublished list
        this.Reader.addPublished(book);
    }

    @Override
    public void printBooksOwned() {
        // Prints the list of books owned
        this.Reader.printBooksOwned();
    }

    @Override
    public void printBooksPublished() {
        // Prints the list of books published
        this.Reader.printBooksPublished();
    }

}
