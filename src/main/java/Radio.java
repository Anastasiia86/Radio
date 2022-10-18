public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxStation;

    public Radio (){
        this.maxStation = 9;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
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
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setVolumeUp() {
        if (currentVolume < 10) {

            currentVolume = currentVolume + 1;
        }

    }

    public void setVolumeDown() {
        if (currentVolume > 0) {

            currentVolume = currentVolume - 1;
        }
    }
}