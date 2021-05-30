import org.ghost4j.converter.ConverterException;
import org.ghost4j.document.DocumentException;
import org.junit.Assert;
import org.junit.Test;

public class TestPsToPdfConverter {
    private final String inputFile = "user_manual.ps";

    @Test
    public void testPsToPdfConverter() throws ConverterException, DocumentException {
        PsToPdfConverter psToPdfConverter = new PsToPdfConverter();
        psToPdfConverter.convertPsToPdf(inputFile, inputFile.replace(".ps", ""));
    }
}
