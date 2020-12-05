package countingvotes;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertEquals;

public class RecountRacketTest2 {

    /* the timeout interval per test is 60 seconds */
    private static int TIMEOUT = 60;

    @Rule
    public Timeout globalTimeout = Timeout.seconds(TIMEOUT);

    @Test
    public void test_470000_1000000_50() {
        long numVotes = 470000;
        long timeInSeconds = 1000000;
        long contractorSalary = 50;
        long maxReward = 470000;
        assertEquals(maxReward, RecountRacket.maximumReward(numVotes, timeInSeconds, contractorSalary));
    }

    @Test
    public void test_470000_1000000_500000() {
        long numVotes = 470000;
        long timeInSeconds = 1000000;
        long contractorSalary = 500000;
        long maxReward = 470000;
        assertEquals(maxReward, RecountRacket.maximumReward(numVotes, timeInSeconds, contractorSalary));
    }

    @Test
    public void test_470000_100000_57000() {
        long numVotes = 470000;
        long timeInSeconds = 100000;
        long contractorSalary = 57000;
        long maxReward = 100000;
        assertEquals(maxReward, RecountRacket.maximumReward(numVotes, timeInSeconds, contractorSalary));
    }

    @Test
    public void test_470000_100000_42000() {
        long numVotes = 470000;
        long timeInSeconds = 100000;
        long contractorSalary = 42000;
        long maxReward = 116000;
        assertEquals(maxReward, RecountRacket.maximumReward(numVotes, timeInSeconds, contractorSalary));
    }

    @Test
    public void test_470000_4_1() {
        long numVotes = 470000;
        long timeInSeconds = 4;
        long contractorSalary = 1;
        long maxReward = 8;
        assertEquals(maxReward, RecountRacket.maximumReward(numVotes, timeInSeconds, contractorSalary));
    }

    @Test
    public void test_123456_47_10() {
        long numVotes = 123456;
        long timeInSeconds = 47;
        long contractorSalary = 10;
        long maxReward = 215;
        assertEquals(maxReward, RecountRacket.maximumReward(numVotes, timeInSeconds, contractorSalary));
    }

    @Test
    public void test_300_47_10() {
        long numVotes = 300;
        long timeInSeconds = 47;
        long contractorSalary = 10;
        long maxReward = 190;
        assertEquals(maxReward, RecountRacket.maximumReward(numVotes, timeInSeconds, contractorSalary));
    }

    @Test
    public void test_300_10_0() {
        long numVotes = 300;
        long timeInSeconds = 10;
        long contractorSalary = 0;
        long maxReward = 300;
        assertEquals(maxReward, RecountRacket.maximumReward(numVotes, timeInSeconds, contractorSalary));
    }

    @Test
    public void test_77310_48562_6() {
        long numVotes = 77310;
        long timeInSeconds = 48562;
        long contractorSalary = 6;
        long maxReward = 77304;
        assertEquals(maxReward, RecountRacket.maximumReward(numVotes, timeInSeconds, contractorSalary));
    }

    @Test
    public void test_3_8_4() {
        long numVotes = 3;
        long timeInSeconds = 8;
        long contractorSalary = 4;
        long maxReward = 3;
        assertEquals(maxReward, RecountRacket.maximumReward(numVotes, timeInSeconds, contractorSalary));
    }

    @Test
    public void test_23310457_32752_307() {
        long numVotes = 23310457;
        long timeInSeconds = 32752;
        long contractorSalary = 307;
        long maxReward = 23078672;
        assertEquals(maxReward, RecountRacket.maximumReward(numVotes, timeInSeconds, contractorSalary));
    }

    @Test
    public void test_222766778_110712_7761() {
        long numVotes = 222766778;
        long timeInSeconds = 110712;
        long contractorSalary = 7761;
        long maxReward = 187167071;
        assertEquals(maxReward, RecountRacket.maximumReward(numVotes, timeInSeconds, contractorSalary));
    }
}
