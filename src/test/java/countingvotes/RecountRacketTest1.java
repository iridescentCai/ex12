package countingvotes;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class RecountRacketTest1 {

    /* the timeout interval per test is 60 seconds */
    private static int TIMEOUT = 60;

    @Rule
    public Timeout globalTimeout = Timeout.seconds(TIMEOUT);

    @Test
    public void test_0_1() {
        long numVotes = 0;
        List<RecountRacket.Friend> friendList = Arrays.asList(
                new RecountRacket.Friend(1, 1)
        );
        assertEquals(0, RecountRacket.countingTime(numVotes, friendList));
    }


    @Test
    public void test_4_1() {
        long numVotes = 4;
        List<RecountRacket.Friend> friendList = Arrays.asList(
            new RecountRacket.Friend(1, 1)
        );
        assertEquals(3, RecountRacket.countingTime(numVotes, friendList));
    }

    @Test
    public void test_5_2() {
        long numVotes = 5;
        List<RecountRacket.Friend> friendList = Arrays.asList(
                new RecountRacket.Friend(1, 2),
                new RecountRacket.Friend(1, 2)
        );
        assertEquals(2, RecountRacket.countingTime(numVotes, friendList));
    }

    @Test
    public void test_6_2() {
        long numVotes = 6;
        List<RecountRacket.Friend> friendList = Arrays.asList(
                new RecountRacket.Friend(1, 2),
                new RecountRacket.Friend(1, 2)
        );
        assertEquals(2, RecountRacket.countingTime(numVotes, friendList));
    }


    @Test
    public void test_32000_0() {
        long numVotes = 32000;
        List<RecountRacket.Friend> friendList = Arrays.asList(
        );
        assertEquals(32000, RecountRacket.countingTime(numVotes, friendList));
    }

    @Test
    public void test_32000_1() {
        long numVotes = 32000;
        List<RecountRacket.Friend> friendList = Arrays.asList(
            new RecountRacket.Friend(10001, 16000)
        );
        assertEquals(26000, RecountRacket.countingTime(numVotes, friendList));
    }

    @Test
    public void test_32000_2() {
        long numVotes = 32000;
        List<RecountRacket.Friend> friendList = Arrays.asList(
                new RecountRacket.Friend(10001, 16000),
                new RecountRacket.Friend(13001, 24000)
        );
        assertEquals(19500, RecountRacket.countingTime(numVotes, friendList));
    }

    @Test
    public void test_32000_3() {
        long numVotes = 32000;
        List<RecountRacket.Friend> friendList = Arrays.asList(
                new RecountRacket.Friend(1, 8000),
                new RecountRacket.Friend(1, 8000),
                new RecountRacket.Friend(1, 8000)
        );
        assertEquals(8000, RecountRacket.countingTime(numVotes, friendList));
    }


    @Test
    public void test_32001_1() {
        long numVotes = 32001;
        List<RecountRacket.Friend> friendList = Arrays.asList(
                new RecountRacket.Friend(11000, 20001)
        );
        assertEquals(22999, RecountRacket.countingTime(numVotes, friendList));
    }

    @Test
    public void test_47000_5() {
        long numVotes = 47000;
        List<RecountRacket.Friend> friendList = Arrays.asList(
                new RecountRacket.Friend(11000, 20001),
                new RecountRacket.Friend(1, 10),
                new RecountRacket.Friend(1, 10000),
                new RecountRacket.Friend(1, 10000),
                new RecountRacket.Friend(30, 30)
        );
        assertEquals(18994, RecountRacket.countingTime(numVotes, friendList));
    }

    @Test
    public void test_47000_6() {
        long numVotes = 47000;
        List<RecountRacket.Friend> friendList = Arrays.asList(
                new RecountRacket.Friend(11000, 20001),
                new RecountRacket.Friend(1, 10),
                new RecountRacket.Friend(1, 10000),
                new RecountRacket.Friend(1, 10000),
                new RecountRacket.Friend(30, 30),
                new RecountRacket.Friend(2, 5)
        );
        assertEquals(18992, RecountRacket.countingTime(numVotes, friendList));
    }

    @Test
    public void test_47000_9() {
        long numVotes = 47000;
        List<RecountRacket.Friend> friendList = Arrays.asList(
                new RecountRacket.Friend(11000, 20001),
                new RecountRacket.Friend(1, 10),
                new RecountRacket.Friend(1, 10000),
                new RecountRacket.Friend(1, 10000),
                new RecountRacket.Friend(30, 30),
                new RecountRacket.Friend(2, 2),
                new RecountRacket.Friend(2, 2),
                new RecountRacket.Friend(2, 2),
                new RecountRacket.Friend(2, 2)
        );
        assertEquals(18992, RecountRacket.countingTime(numVotes, friendList));
    }

    @Test
    public void test_47000_10() {
        long numVotes = 47000;
        List<RecountRacket.Friend> friendList = Arrays.asList(
                new RecountRacket.Friend(11000, 20001),
                new RecountRacket.Friend(1, 10),
                new RecountRacket.Friend(1, 10000),
                new RecountRacket.Friend(1, 10000),
                new RecountRacket.Friend(30, 30),
                new RecountRacket.Friend(2, 2),
                new RecountRacket.Friend(2, 2),
                new RecountRacket.Friend(2, 2),
                new RecountRacket.Friend(2, 2),
                new RecountRacket.Friend(14001, 14010)
        );
        assertEquals(18987, RecountRacket.countingTime(numVotes, friendList));
    }

    @Test
    public void test_45_5() {
        long numVotes = 45;
        List<RecountRacket.Friend> friendList = Arrays.asList(
                new RecountRacket.Friend(1, 1),
                new RecountRacket.Friend(2, 2),
                new RecountRacket.Friend(3, 3),
                new RecountRacket.Friend(5, 5),
                new RecountRacket.Friend(4, 5)
        );
        assertEquals(39, RecountRacket.countingTime(numVotes, friendList));
    }

}
