public class Book implements Comparable<Book>{

    private String name;
    private int pageNum;
    private String authorName;
    private  int publishDate;

    public Book(String name, int pageNum, String authorName, int publishDate) {
        this.name = name;
        this.pageNum = pageNum;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }


    public int getPageNum() {
        return pageNum;
    }


    public String getAuthorName() {
        return authorName;
    }

    public int getPublishDate() {
        return publishDate;
    }

    @Override
    public int compareTo(Book b){
        return getName().compareTo(b.getName());
    }
}
