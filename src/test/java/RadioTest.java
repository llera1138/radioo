package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldPickNumber() {
        radio.setCurrentRadioStation(3);
        int ecpected = 3;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(ecpected, actual);
    }

    @Test
    public void shouldNextNumber() {
        radio.setCurrentRadioStation(3);
        radio.next();
        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumber() {
        radio.setCurrentRadioStation(2);
        radio.prev();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberAfterMax() {
        radio.setCurrentRadioStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrewNumberBeforeMin() {
        radio.setCurrentRadioStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberAboveMax() {
        radio.setCurrentRadioStation(11);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberBelowMin() {
        radio.setCurrentRadioStation(-3);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentSoundVolume(45);
        radio.volumeUp();
        int expected = 46;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReductionVolume() {
        radio.setCurrentSoundVolume(78);
        radio.volumeDown();
        int expected = 77;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVol() {
        radio.setCurrentSoundVolume(100);
        radio.volumeUp();
        int expected = 100;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVol() {
        radio.setCurrentSoundVolume(0);
        radio.volumeDown();
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        radio.setCurrentSoundVolume(101);
        radio.volumeUp();
        int expected = 100;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReductionVolumeBelowMin() {
        radio.setCurrentSoundVolume(-1);
        radio.volumeDown();
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}