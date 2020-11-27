package countingvotes;

import java.util.List;

public class RecountRacket {

    /**
     *
     * @param numVotes the number of votes to count, {@code numVotes >= 0}
     * @param friendsList the list of friends, {@code friendsList} is not null
     * @return
     */
    public static long countingTime(long numVotes, List<Friend> friendsList) {
        // TODO: Implement this method
        return -1;
    }

    /**
     * @param numVotes         the number of votes to count, {@code numVotes >= 0}
     * @param timeInSeconds    the time available to count the votes, {@code timeInSeconds >= 0}
     * @param contractorSalary the cost to hire one contractor, {@code contractorSalary >= 0}
     * @return the maximum amount you can earn from counting votes by yourself and possibly hiring some contractors
     */
    public static long maximumReward(long numVotes, long timeInSeconds, long contractorSalary) {
        // TODO: Implement this method
        return -1;
    }


    public static class Friend implements Comparable<Friend> {
        /*
            Representation Invariant:
                startTime >= 1
                startTime <= endTime
            Abstraction Function:
                represents a friend that is available for a time interval that
                starts at startTime and ends at endTime, both limits inclusive
         */
        public final long startTime;
        public final long endTime;

        /**
         * Create a new Friend
         * @param _startTime the start of the available interval, {@code _startTime >= 1}
         * @param _endTime the end of the available interval, {@code _endTime >= startTime}
         */
        public Friend(long _startTime, long _endTime) {
            startTime = _startTime;
            endTime   = _endTime;
        }

        public int compareTo(Friend other) {
            if (this == other) {
                return 0;
            }
            if (this.startTime < other.startTime) {
                return -1;
            }
            if (this.startTime == other.startTime) {
                if (this.endTime < other.endTime) {
                    return -1;
                }
            }
            return 1;
        }
    }

}
