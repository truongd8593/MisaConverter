package com.misacfd.documentconverter;

import org.ghost4j.converter.ConverterException;
import org.ghost4j.converter.PDFConverter;
import org.ghost4j.document.DocumentException;
import org.ghost4j.document.PSDocument;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PsToPdfConverter implements DocumentConverter{
    public PsToPdfConverter() {

    }

    public void psToPdf(String inputFile, String outputFile) throws ConverterException, DocumentException {
        convertPsToPdf(inputFile, outputFile);
    }

    private void convertPsToPdf(String inputFile, String outputFile) throws ConverterException, DocumentException {
        FileOutputStream fos = null;
        PSDocument document = new PSDocument();
        File archivePDFTemp = null;

        try {

            archivePDFTemp = new File (outputFile + ".pdf");
            document.load (new File (inputFile));

            // Create OutputStream
            fos = new FileOutputStream (archivePDFTemp);

            // Create converter
            PDFConverter converter = new PDFConverter();

            // Set options
            converter.setPDFSettings (PDFConverter.OPTION_PDFSETTINGS_PREPRESS);

            // Convert
            converter.convert (document, fos);
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
