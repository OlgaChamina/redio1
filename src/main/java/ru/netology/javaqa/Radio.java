package ru.netology.javaqa;

public class Radio {
    private int currentFrequency;
    private int currentVolume;

    public int getCurrentFrequency() {
        return currentFrequency;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentFrequency(int newCurrentFrequency) {
        if (newCurrentFrequency > 9) {
            return;
        }
        if (newCurrentFrequency < 0) {        //по логике вещей, отрицательной частоты нет, и кнопки -1 быть не может, но на всякий случай
            return;
        }
        currentFrequency = newCurrentFrequency;
    }

    public void next() {
        if (currentFrequency < 9) {
            currentFrequency = currentFrequency + 1;
        } else currentFrequency = 0;
    }

    public void prev() {
        if (currentFrequency > 0) {
            currentFrequency = currentFrequency - 1;
        } else currentFrequency = 9;

    }

    public void setCurrentVolume(int newCurrentVolume) {

        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
