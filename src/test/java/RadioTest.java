import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @ParameterizedTest
    @CsvSource({
            " 4, 4",
            " 2, -6, 0",
            " 1, 12, 0",
            " 1, -1, 0",
            " 2, 0, 0",
            " 5, 1, 1",
            " 3, 8, 8",
            " 0, 9, 9",
            " 3, 10, 0"
    })

    public void setSelectStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            " 4, 5",
            " 0, 0, 1",
            " 3, 2, 3",
            " 2, 8, 9",
            " 1, 9, 0"
    })

    public void setNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.setNextStation();

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            " 4, 3",
            " 1, 0, 9",
            " 3, 2, 1",
            " 2, 7, 7",
            " 3, 9, 8"
    })

    public void setPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setPrevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            " 5, 6",
            " 1; 0; 1",
            " 2; 1; 2",
            " 2; 9; 10",
            " 7; 10; 10"
    })
    public void setVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.setVolumeUp();

        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "7, 8",
            "0, 0, 1",
            "2, 1, 0",
            "5, 9, 8",
            "3, 10, 9"
    })
    public void setVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.setVolumeDown();


        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}


