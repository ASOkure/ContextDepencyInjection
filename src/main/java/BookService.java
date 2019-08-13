
@Loggable
public class BookService {


    @Inject @ThirteenDigits
    private  NumberGenerator numberGenerator;

    public Book createBook( String title, Float price,  String description ){

        Book book = new Book(title, price, description);
        book.setNumber(numberGenerator());
        return  book;

    }

}
