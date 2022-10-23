import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test

    public void shouldSetSelectStation() {
        Radio radio = new Radio(17);
        radio.setCurrentStation(7);


        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationAll() {
        Radio radio = new Radio(16, 0, 15, 0, 100, 100);
        radio.setCurrentStation(16);
        Assertions.assertEquals(16, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeStation() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(8);
        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStation30() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(30);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }


    @Test

    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNextStation();


        Assertions.assertEquals(0, radio.getCurrentStation());
    }


    @Test

    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setPrevStation();


        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test

    public void shouldSetPrevStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setPrevStation();


        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldSetBelowMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);


        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetBelowMinStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setPrevStation();


        Assertions.assertEquals(8, radio.getCurrentStation());
    }


    @Test
    void shouldSetStationOverMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.setNextStation();


        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldSetOverMaxStation1() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.setNextStation();


        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeVolume() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(7);
        Assertions.assertEquals(7, radio.getCurrentVolume());
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
    public void setOverMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setVolumeUp();


        Assertions.assertEquals(100, radio.getCurrentVolume());

    }

    @Test
    public void shouldOverMaxVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.setVolumeUp();
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldOverMaxVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setVolumeUp();


        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void setBelowMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.setVolumeDown();


        Assertions.assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    public void setBelowMinVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setVolumeDown();


        Assertions.assertEquals(0, radio.getCurrentVolume());
    }


}
