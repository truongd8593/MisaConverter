package com.misacfd.documentconverter;

import org.ghost4j.converter.ConverterException;
import org.ghost4j.document.DocumentException;

public interface DocumentConverter {
    void psToPdf(String inputFile, String outputFile) throws ConverterException, DocumentException;
}
