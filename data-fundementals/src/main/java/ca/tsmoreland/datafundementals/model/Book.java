package ca.tsmoreland.datafundementals.model;

public class Book {

    private long id;
    private String title;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "id: %d, title: %s".formatted(id, title);
    }
}
