package com.misacfd.videoconverter;

import org.junit.Test;

public class TestMovToMp4Converter {
    private final String inputFile = "610.MOV";

    @Test
    public void testMovToMp4Converter() {
        VideoConverter movToMp4Converter = new MovToMp4Converter();
        movToMp4Converter.movToMp4(inputFile, inputFile.replace(".MOV", ".mp4"));
    }
}
