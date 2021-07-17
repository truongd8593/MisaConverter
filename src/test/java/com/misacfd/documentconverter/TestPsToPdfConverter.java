package com.misacfd.documentconverter;

import org.ghost4j.converter.ConverterException;
import org.ghost4j.document.DocumentException;
import org.junit.Test;

public class TestPsToPdfConverter {
    private final String inputFile = "user_manual.ps";

    @Test
    public void testPsToPdfConverter() throws ConverterException, DocumentException {
        DocumentConverter psToPdfConverter = new PsToPdfConverter();
        psToPdfConverter.psToPdf(inputFile, inputFile.replace(".ps", ""));
    }
}
