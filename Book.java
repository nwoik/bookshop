public interface Book {
    /**
     * Book interface containing all the abstract methods that all the Book classes will use
     */
    public Title title();
    public Author author();
    public float price();
    public String bookType();
    public double duration();
};
