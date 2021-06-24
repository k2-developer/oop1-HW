package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    public Radio radio = new Radio();


    @Test
    void getNumberChannelMax() {
        assertEquals(10, radio.getNumberChannelMax());
    }

    @Test
    void getVolumeLevelMax() {
        assertEquals(100, radio.getVolumeLevelMax());
    }

    @Test
    void switchChannelUp() {
        radio.setCurrentChannel(5);
        radio.switchChannelUp();
        assertEquals(6, radio.getCurrentChannel());
    }

    @Test
    void switchChannelDown() {
        radio.setCurrentChannel(5);
        radio.switchChannelDown();
        assertEquals(4, radio.getCurrentChannel());

    }

    @Test
    void switchVolumeUp() {
        radio.setCurrentVolume(5);
        radio.switchVolumeUp();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void switchVolumeDown() {
        radio.setCurrentVolume(5);
        radio.switchVolumeDown();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void switchChannelFromMaxToMin() {
        radio.setCurrentChannel(10);
        radio.switchChannelUp();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    void switchChannelFromMinToMax() {
        radio.setCurrentChannel(0);
        radio.switchChannelDown();
        assertEquals(10, radio.getCurrentChannel());
    }

    @Test
    void switchVolumeFromMinToMax() {
        radio.setCurrentVolume(0);
        radio.switchVolumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void switchVolumeFromMaxToMin() {
        radio.setCurrentVolume(100);
        radio.switchVolumeUp();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void setChannelOverMax(){
        radio.setCurrentChannel(15);
        assertEquals(10,radio.getCurrentChannel());
    }

    @Test
    void setVolumeOverMax(){
        radio.setCurrentVolume(105);
        assertEquals(100,radio.getCurrentVolume());
    }
    @Test
    void setChannelLowerMin(){
        radio.setCurrentChannel(-1);
        assertEquals(0,radio.getCurrentChannel());
    }

    @Test
    void setVolumeOverMin(){
        radio.setCurrentVolume(-1);
        assertEquals(0,radio.getCurrentVolume());
    }

}