package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetFrequency() {
        Radio frequency = new Radio();
        frequency.setCurrentFrequency(6);
        int expected = 6;
        int actual = frequency.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetFrequencyIf0() {
        Radio frequency = new Radio();
        frequency.setCurrentFrequency(0);
        int expected = 0;
        int actual = frequency.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetFrequencyIfMoreMax() {
        Radio frequency = new Radio();
        frequency.setCurrentFrequency(10);
        int expected = 0;
        int actual = frequency.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetFrequencyIfMax() {
        Radio frequency = new Radio();
        frequency.setCurrentFrequency(9);
        int expected = 9;
        int actual = frequency.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetFrequencyIf1() {
        Radio frequency = new Radio();
        frequency.setCurrentFrequency(1);
        int expected = 1;
        int actual = frequency.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetFrequencyIf8() {
        Radio frequency = new Radio();
        frequency.setCurrentFrequency(8);
        int expected = 8;
        int actual = frequency.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetFrequencyIfLessMin() {
        Radio frequency = new Radio();
        frequency.setCurrentFrequency(-1);
        int expected = 0;
        int actual = frequency.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseFrequencyOnOnebyMax() {
        Radio frequency = new Radio();
        frequency.setCurrentFrequency(9);
        frequency.next();
        int expected = 0;
        int actual = frequency.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseFrequencyOnOnebyMin() {
        Radio frequency = new Radio();
        frequency.setCurrentFrequency(0);
        frequency.next();
        int expected = 1;
        int actual = frequency.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseFrequencyOnOnebyMiddle() {
        Radio frequency = new Radio();
        frequency.setCurrentFrequency(6);
        frequency.next();
        int expected = 7;
        int actual = frequency.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReduceFrequencyOnOnebyMiddle() {
        Radio frequency = new Radio();
        frequency.setCurrentFrequency(8);
        frequency.prev();
        int expected = 7;
        int actual = frequency.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReduceFrequencyOnOnebyMin() {
        Radio frequency = new Radio();
        frequency.setCurrentFrequency(0);
        frequency.prev();
        int expected = 9;
        int actual = frequency.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldReduceFrequencyOnOnebyMax() {
        Radio frequency = new Radio();
        frequency.setCurrentFrequency(9);
        frequency.prev();
        int expected = 8;
        int actual = frequency.getCurrentFrequency();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(6);
        int expected = 6;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMoreMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeLessMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void shouldIncreaseVolumeOnOnebyMiddle() {
        Radio volume = new Radio();
        volume.setCurrentVolume(50);
        volume.increaseVolume();
        int expected = 51;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeOnOnebyMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeOnOnebyPreMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);
        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeOnOnebyPreMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);
        volume.increaseVolume();
        int expected = 2;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeOnOnebyMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.increaseVolume();
        int expected = 1;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldReduceVolumeOnOnebyMiddle() {
        Radio volume = new Radio();
        volume.setCurrentVolume(50);
        volume.reduceVolume();
        int expected = 49;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeOnOnebyMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.reduceVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeOnOnebyMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.reduceVolume();
        int expected = 99;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeOnOnebyMoreMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.reduceVolume();
        int expected = 99;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}
