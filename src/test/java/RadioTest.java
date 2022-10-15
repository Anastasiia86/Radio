import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test

    public void setSelectStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.setNextStation();

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setPrevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setNextStationBetween0and9() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.setNextStation();

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationOverMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldOverMaxStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNextStation();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationBelowMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.setPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetBelowMinStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test

    public void setVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.setVolumeUp();

        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.setVolumeDown();


        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setVolumeBetween0and10() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.setNextStation();

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldOverMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setVolumeUp();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldBelowMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.setVolumeUp();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldOverMaxVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.setVolumeUp();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldBelowMinVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.setVolumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}
