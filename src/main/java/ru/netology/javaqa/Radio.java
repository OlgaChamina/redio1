package ru.netology.javaqa;

public class Radio {
    private int minFrequency = 0;
    private int maxFrequency = 9;
    private int currentFrequency;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio() {

    }

    public Radio(int Range) {
        this.maxFrequency = minFrequency + Range - 1;
    }

    public int getCurrentFrequency() {
        return currentFrequency;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentFrequency(int newCurrentFrequency) {
        if (newCurrentFrequency > maxFrequency) {
            return;
        }
        if (newCurrentFrequency < minFrequency) {        //по логике вещей, отрицательной частоты нет, и кнопки -1 быть не может, но на всякий случай
            return;
        }
        currentFrequency = newCurrentFrequency;
    }

    public void next() {
        if (currentFrequency < maxFrequency) {
            currentFrequency = currentFrequency + 1;
        } else {
            currentFrequency = minFrequency;
        }

    }

    public void prev() {
        if (currentFrequency > minFrequency) {
            currentFrequency = currentFrequency - 1;
        } else {
            currentFrequency = maxFrequency;
        }

    }

    public void setCurrentVolume(int newCurrentVolume) {

        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
