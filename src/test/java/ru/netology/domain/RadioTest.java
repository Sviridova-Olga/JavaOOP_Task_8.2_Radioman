package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    private void initFields() {
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
    }

    @Test
    void shouldNextStationNumber() {
        initFields();
        radio.setCurrentStation(8);
        radio.nextStationNumber();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldPrevStationNumber() {
        initFields();
        radio.setCurrentStation(1);
        radio.prevStationNumber();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldIncreaseVolume() {
        initFields();
        radio.setCurrentVolume(9);
        radio.increaseVolume();

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        initFields();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldCurrentStationOverMax() {
        initFields();
        radio.setCurrentStation(10);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldCurrentStationLessThenMin() {
        initFields();
        radio.setCurrentStation(-1);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldCurrentVolumeOverMax() {
        initFields();
        radio.setCurrentVolume(11);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldCurrentVolumeLessThenMin() {
        initFields();
        radio.setCurrentVolume(-1);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseMaxVolume() {
        initFields();
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseMinVolume() {
        initFields();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldNextMaxStation() {
        initFields();
        radio.setCurrentStation(9);
        radio.nextStationNumber();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldPrevMinStation() {
        initFields();
        radio.setCurrentStation(0);
        radio.prevStationNumber();

        assertEquals(9, radio.getCurrentStation());
    }
}