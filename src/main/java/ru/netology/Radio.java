package ru.netology;

public class Radio {
    private int currentStation;
    private int volume;
    private int minStation = 0;
    private int maxStation = 9;
    private int minVol = 0;
    private int maxVol = 10;


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = minStation;
            return;
        }

        if (currentStation < minStation) {
            this.currentStation = maxStation;
            return;
        }
        this.currentStation = currentStation;

    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation++;
    }

    public void previousStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation--;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > maxVol) {
            this.volume = maxVol;
            return;
        }

        if (volume < minVol) {
            this.volume = minVol;
            return;
        }
        this.volume = volume;

    }

    public void volumeUp() {
        if (volume == maxVol) {
            return;
        }
        volume += 1;
    }

    public void volumeDown() {
        if (volume == minVol) {
            return;
        }
        volume -= 1;
    }

}