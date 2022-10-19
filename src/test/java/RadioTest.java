import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test

    public void setSelectStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);


        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test

    public void setNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNextStation();


        Assertions.assertEquals(0, radio.getCurrentStation());
    }


    @Test

    public void setPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setPrevStation();


        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test

    public void setPrevStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setPrevStation();


        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void setBelowMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.setPrevStation();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test

    public void setNextStationBetween0and9() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.setNextStation();


        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void setStationOverMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.setNextStation();


        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void setOverMaxStation1() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.setNextStation();


        Assertions.assertEquals(0, radio.getCurrentStation());
    }


    @Test
    void setBelowMinStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setPrevStation();


        Assertions.assertEquals(9, radio.getCurrentStation());
    }


    @Test

    public void setVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(25);
        radio.setVolumeUp();


        Assertions.assertEquals(26, radio.getCurrentVolume());
    }

    @Test

    public void setVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(30);
        radio.setVolumeDown();


        Assertions.assertEquals(29, radio.getCurrentVolume());
    }

    @Test

    public void setVolumeBetween0and100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(35);
        radio.setVolumeUp();


        Assertions.assertEquals(36, radio.getCurrentVolume());
    }

    @Test
    public void setOverMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setVolumeUp();


        Assertions.assertEquals(100, radio.getCurrentVolume());

    }

    @Test
    public void setBelowMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.setVolumeUp();


        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void setOverMaxVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.setVolumeUp();


        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void setBelowMinVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.setVolumeDown();


        Assertions.assertEquals(0, radio.getCurrentVolume());
    }


}
