package com.misacfd.videoconverter;

import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.VideoAttributes;

import java.io.File;

public class MovToMp4Converter implements VideoConverter{

    public void movToMp4(String inputFile, String outputFile) {
        convertMovToMp4(inputFile, outputFile, 64000, 44100, 1280000, 29);
    }

    private void convertMovToMp4(String inputFile, String outputFile, int audioBitRate, int audioSamplingRate, int videoBitRate, int videoFrameRate) {
        File source = new File(inputFile);
        File target = new File(outputFile);
        try {

            AudioAttributes audio = new AudioAttributes();
            audio.setCodec("libmp3lame");
            audio.setBitRate(new Integer(audioBitRate));
            audio.setChannels(new Integer(1));
            audio.setSamplingRate(new Integer(audioSamplingRate));
            VideoAttributes video = new VideoAttributes();
            video.setCodec("mpeg4");
            video.setBitRate(new Integer(videoBitRate));
            video.setFrameRate(new Integer(videoFrameRate));
            EncodingAttributes attrs = new EncodingAttributes();
            attrs.setFormat("mp4");
            attrs.setAudioAttributes(audio);
            attrs.setVideoAttributes(video);
            Encoder encoder = new Encoder();
            encoder.encode(source, target, attrs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
