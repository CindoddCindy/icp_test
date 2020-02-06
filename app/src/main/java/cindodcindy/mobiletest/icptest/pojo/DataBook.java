
package cindodcindy.mobiletest.icptest.pojo;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataBook {

    @SerializedName("books")
    @Expose
    private List<Book> books = new ArrayList<Book>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DataBook() {
    }

    /**
     * 
     * @param books
     */
    public DataBook(List<Book> books) {
        super();
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public DataBook withBooks(List<Book> books) {
        this.books = books;
        return this;
    }

}
