package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetFrequency() {
        radio.setCurrentFrequency(6);
        int expected = 6;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetFrequencyIf0() {
        radio.setCurrentFrequency(0);
        int expected = 0;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetFrequencyIfMoreMax() {
        radio.setCurrentFrequency(10);
        int expected = 0;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetFrequencyIfMax() {
        radio.setCurrentFrequency(9);
        int expected = 9;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetFrequencyIf1() {
        radio.setCurrentFrequency(1);
        int expected = 1;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetFrequencyIf8() {
        radio.setCurrentFrequency(8);
        int expected = 8;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetFrequencyIfLessMin() {
        radio.setCurrentFrequency(-1);
        int expected = 0;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseFrequencyOnOnebyMax() {
        radio.setCurrentFrequency(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseFrequencyOnOnebyMin() {
        radio.setCurrentFrequency(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseFrequencyOnOnebyMiddle() {
        radio.setCurrentFrequency(6);
        radio.next();
        int expected = 7;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldIncreaseFrequencyOnOnebyPenultimate() {
        radio.setCurrentFrequency(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReduceFrequencyOnOnebyMiddle() {
        radio.setCurrentFrequency(8);
        radio.prev();
        int expected = 7;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReduceFrequencyOnOnebyMin() {
        radio.setCurrentFrequency(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReduceFrequencyOnOnebyMax() {
        radio.setCurrentFrequency(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolume() {
        radio.setCurrentVolume(6);
        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMoreMax() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeLessMin() {
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeOnOnebyMiddle() {
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int expected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeOnOnebyMax() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeOnOnebyPreMax() {
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeOnOnebyPreMin() {
        radio.setCurrentVolume(1);
        radio.increaseVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeOnOnebyMin() {
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldReduceVolumeOnOnebyMiddle() {
        radio.setCurrentVolume(50);
        radio.reduceVolume();
        int expected = 49;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeOnOnebyMin() {
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeOnOnebyMax() {
        radio.setCurrentVolume(100);
        radio.reduceVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeOnOnebyLessMax() {
        radio.setCurrentVolume(100);
        radio.reduceVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}
