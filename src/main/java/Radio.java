package ru.netology.javaqa;

public class Radio {

    private final int number = 10;
    private final int minNumber = 0;
    private final int maxNumber = 9;
    private int maxCurrentRadioStation = minNumber + number - 1;
    private int currentRadioStation;
    private final int minVolume = 0;
    private final int maxVolume = 100;
    private int currentSoundVolume;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int stationsCount) {

        this.maxCurrentRadioStation = minNumber + number - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minNumber) {
            return;
        }
        if (newCurrentRadioStation > maxNumber) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void next() {
        if (currentRadioStation < maxNumber) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minNumber;
        }
    }

    public void prev() {
        if (currentRadioStation > minNumber) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxNumber;
        }
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < minVolume) {
            newCurrentSoundVolume = minVolume;
        }
        if (newCurrentSoundVolume > maxVolume) {
            newCurrentSoundVolume = maxVolume;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }

    public void volumeUp() {
        if (currentSoundVolume < maxVolume) {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void volumeDown() {
        if (currentSoundVolume > minVolume) {
            currentSoundVolume = currentSoundVolume - 1;
        }
    }

}