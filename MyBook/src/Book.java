import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
    ArrayList<Observer> obs = new ArrayList<Observer>();
    private List<Author> authors = new ArrayList<>();
    public Book(String title) {
        super(title);
    }

    public void addContent(Element content){
        add(content);
    }

    public void addAuthor(Author author){
        this.authors.add(author);
    }

    public void setObs(Observer o){
        obs.add(o);
    }

    public void print() {
        System.out.println("Authors:");
        for(Author author : authors){
            author.print();
        }
        super.print();
    }
}