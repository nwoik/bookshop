import javax.naming.event.ObjectChangeListener;

interface person {
    /**
     * Person interface containing all the abstract methods that all the person classes will use
     */
    public float receive(final float money);
    public float charge(final float cost);
    public Object buy(final Book book);
    public String getName();
    public float getEarnings();
    public void addPublished(final Book book);
    public void printBooksOwned();
    public void printBooksPublished();
};
