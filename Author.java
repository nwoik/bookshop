public enum Author implements person {
    /**
     * Every instance of Author is created through person
     * All the methods are called from person
     */
    JJR_Tolkien("JJR", "Tolkien"), JD_Sallinger("JD", "Sallinger");
    private final person Author;

    private Author(String fname, String lname) {
        this.Author = new ConcretePerson(fname, lname, true);
    }

    @Override
    public float receive(float money) {
        // Adds money (float) to earnings
        return this.Author.receive(money);
    }

    @Override
    public float charge(float cost) {
        // Takes money (float) away from earnings
        return this.Author.charge(cost);
    }

    @Override
    public Object buy(Book book) {
        /* 
        Adds the book object to the books owned array
        Takes away the price from the earnings
        Gives 10% to author of that book
        */
        return this.Author.buy(book);
    }

    @Override
    public String getName() {
        // Returns the name
        return this.Author.getName();
    }

    @Override
    public float getEarnings() {
        // Returns the earnings
        return this.Author.getEarnings();
    }

    @Override
    public void addPublished(Book book) {
        // Adds a book object to the BooksPublished list
        this.Author.addPublished(book);
    }

    @Override
    public void printBooksOwned() {
        // Prints the list of books owned
        this.Author.printBooksOwned();
    }

    @Override
    public void printBooksPublished() {
        // Prints the list of books published
        this.Author.printBooksPublished();
    }
    
}
