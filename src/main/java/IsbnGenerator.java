
@ThirteenDigits
public class IsbnGenerator implements  NumberGenerator {

    @Inject
    private  Logger logger;


    @Loggable
    public String generateNumber() {
        String isbn = "13-84356-" + Math.abs(new Random().nextInt());
        logger.info("Generated ISBN : " + isbn);
        return isbn;
    }
}

