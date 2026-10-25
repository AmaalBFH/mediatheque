// Etape 1 -- Exceptions
public class CatalogueCorrompuException extends MediathequeException {
    public CatalogueCorrompuException(String message, Throwable cause) {
        super(message, cause);
    }
}