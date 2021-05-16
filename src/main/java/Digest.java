import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

//fixme: The Digest class is abstract, it could not be used and initialized unless other child classes extend that
public abstract class Digest {

    //fixme: For thread safety it might be better use of ConcurrentHashMap or HashTable
    private Map<byte[], byte[]> cache = new HashMap<byte[], byte[]>();

    //fixme: it seems the name of the method should be changed to a meaning full name for example a verb different from the class name
    public byte[] digest(byte[] input) {
        byte[] result = cache.get(input);
        if (result == null) {
            //fixme: Instead of synchronized block it might be better use of ConcurrentHashMap or HashTable
            synchronized (cache) {
                //fixme: duplicate code should be eliminated
                result = cache.get(input);
                //fixme: duplicate if statement should be eliminated
                if (result == null) {
                    try {
                        //fixme: the doDigest method does not have implementation
                        result = doDigest(input);
                        cache.put(input, result);
                    } catch (RuntimeException ex) {
                        //fixme: Line 30: This is just a common log error, for understanding the cause it should be like below :
                        // LoggerFactory.getLogger(Digest.class).error(ex.getMessage() , ExceptionUtils.getStackTrace(ex));
                        LoggerFactory.getLogger("Digest").error("Unable to make digest");

                        //fixme: Line 34: For raising the exception it is better translate the RuntimeException to a meaningful
                        // or defining a specific Checked Exception like below
                        // throw new ServiceException(ex) or throw new DigestException(ex);
                        throw ex;
                    }
                }
            }
        }
        return result;
    }

    //fixme: Every child class that extends the Digest class should implement the doDigest method
    protected abstract byte[] doDigest(byte[] input);
}