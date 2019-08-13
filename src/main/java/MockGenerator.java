import java.util.Random;

public class MockGenerator  implements NumberGenerator {



    @Inject
    private  Logger logger;

    @Loggable

    public  String  generateNumber (){

        String mock = "MOCK-" + Math.abs(new Random().nextInt());
        logger.info( "Generate Mock : " + mock);
        return mock;

    }
}
