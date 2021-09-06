public class Title {
    private final String title;
    private final String subtitle;

    public Title(final String title) {
        this.title = title;
        this.subtitle = "";
    };

    public Title(final String title, final String subtitle) {
        this.title = title;
        this.subtitle = subtitle;
    };

    public String getTitle() {
        if (this.subtitle != "") {
            return this.title +" / "+ this.subtitle;
        }
        return this.title;
    }

};
