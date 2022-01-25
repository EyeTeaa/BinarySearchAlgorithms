import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    int[] oddArray = {3, 4, 7, 9, 12, 15, 22, 23, 24, 26, 27};
    int[] evenArray = {3, 4, 7, 9, 12, 15, 22, 23, 24, 26};


    //odd array tests

    @Test
    void searchNum15(){
        int expected = 5;
        int actual = Main.searchNum(oddArray, 15);
        assertEquals(expected, actual);
    }

    @Test
    void searchNum9() {
        int expected = 3;
        int actual = Main.searchNum(oddArray, 9);
        assertEquals(expected,actual);
    }

    @Test
    void searchNum12(){
        int expected = 4;
        int actual = Main.searchNum(oddArray, 12);
        assertEquals(expected, actual);
    }

    @Test
    void searchNum2(){
        int expected = -1;
        int actual = Main.searchNum(oddArray, 2);
        assertEquals(expected, actual);
    }

    @Test
    void searchNum3(){
        int expected = 0;
        int actual = Main.searchNum(oddArray, 3);
        assertEquals(expected, actual);
    }

    @Test
    void searchNum27(){
        int expected = 10;
        int actual = Main.searchNum(oddArray, 27);
        assertEquals(expected, actual);
    }

    @Test
    void searchNumN4(){
        int expected = -1;
        int actual = Main.searchNum(oddArray, -4);
        assertEquals(expected, actual);
    }


    //even array tests
    @Test
    void searchNumm1(){
        int expected = -1;
        int actual = Main.searchNum(evenArray, 1);
        assertEquals(expected, actual);
    }

    @Test
    void searchNumm12(){
        int expected = 4;
        int actual = Main.searchNum(evenArray, 12);
        assertEquals(expected, actual);
    }

    @Test
    void searchNummN11(){
        int expected = -1;
        int actual = Main.searchNum(evenArray, -11);
        assertEquals(expected, actual);
    }

    @Test
    void searchNumm3(){
        int expected = 0;
        int actual = Main.searchNum(evenArray, 3);
        assertEquals(expected, actual);
    }

    @Test
    void searchNumm26(){
        int expected = 9;
        int actual = Main.searchNum(evenArray, 26);
        assertEquals(expected, actual);
    }


}