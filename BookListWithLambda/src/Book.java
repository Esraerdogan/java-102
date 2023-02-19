import java.util.ArrayList;

public class Book {
    private String name;
    private int pageNumber;
    private String authorName;
   private int publishingDate;

    public Book(String name, int pageNumber, String authorName, int publishingDate) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.publishingDate = publishingDate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(int publishingDate) {
        this.publishingDate = publishingDate;
    }
}
