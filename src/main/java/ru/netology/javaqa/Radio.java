package ru.netology.javaqa;

public class Radio {
    public int currentFrequency;

    public int getCurrentFrequency() {
        return currentFrequency;
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
        }
        if (currentFrequency >= 9) {
            currentFrequency = 0;
        }
    }

    public void prev() {
        if (currentFrequency > 0) {
            setCurrentFrequency(currentFrequency = currentFrequency - 1);
            ;
        }
        if (currentFrequency <= 0) {
            currentFrequency = 9;
        }
    }

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume <= 100) {
            setCurrentVolume(currentVolume = currentVolume - 1);
        }
        if (currentVolume <= 0) {
            setCurrentVolume(currentVolume = currentVolume - 1);
        }

    }

}
