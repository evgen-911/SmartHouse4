package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test

    public void shouldStationDown() {
        Radio station = new Radio();
        station.setCurrentStation(6);
        station.previousStation();
        assertEquals(5, station.getCurrentStation());
    }

    @Test

    public void shouldStationUp() {
        Radio station = new Radio();
        station.setCurrentStation(7);
        station.nextStation();
        assertEquals(8, station.getCurrentStation());
    }

    @Test

    public void shouldStationOverMaxUp() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.nextStation();
        assertEquals(0, station.getCurrentStation());
    }

    @Test

    public void shouldStationUnderMinDown() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.previousStation();
        assertEquals(9, station.getCurrentStation());
    }

    @Test

    public void shouldStationOverMax() {
        Radio station = new Radio();
        station.setCurrentStation(10);
        assertEquals(0, station.getCurrentStation());
    }

    @Test

    public void shouldStationUnderMin() {
        Radio station = new Radio();
        station.setCurrentStation(-1);
        assertEquals(9, station.getCurrentStation());
    }

    @Test

    public void shouldVolumeUp() {
        Radio volume = new Radio();
        volume.setVolume(7);
        volume.volumeUp();
        assertEquals(8, volume.getVolume());
    }

    @Test

    public void shouldVolumeDown() {
        Radio volume = new Radio();
        volume.setVolume(2);
        volume.volumeDown();
        assertEquals(1, volume.getVolume());
    }

    @Test

    public void shouldVolumeOverMaxUp() {
        Radio volume = new Radio();
        volume.setVolume(10);
        volume.volumeUp();
        assertEquals(10, volume.getVolume());
    }

    @Test

    public void shouldVolumeOverMax() {
        Radio volume = new Radio();
        volume.setVolume(11);
        assertEquals(10, volume.getVolume());
    }

    @Test

    public void shouldVolumeUnderMin() {
        Radio volume = new Radio();
        volume.setVolume(-1);
        assertEquals(0, volume.getVolume());
    }

    @Test

    public void shouldVolumeZero() {
        Radio volume = new Radio();
        volume.setVolume(0);
        volume.volumeDown();
        assertEquals(0, volume.getVolume());
    }


}