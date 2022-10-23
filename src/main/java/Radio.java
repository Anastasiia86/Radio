import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int minVolume = 0;
    private int maxVolume = 100;


    public Radio(int quantityStations) {
        this.maxStation = quantityStations - 1;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void setPrevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;

        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setVolumeUp() {
        if (currentVolume < maxVolume) {

            currentVolume = currentVolume + 1;
        }

    }

    public void setVolumeDown() {
        if (currentVolume > minVolume) {

            currentVolume = currentVolume - 1;
        }
    }
}