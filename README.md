**CPEN 221 / Fall 2020 / Exercise 12**

# Counting Votes

You are a reputed [psephologist](https://en.wikipedia.org/wiki/Psephology) who has been hired by Donald Trump to lead the recounting of all the votes in the recent U.S. election.

## Task 1: How much time do you need to count the votes?

There are `numVotes` number of votes to count. You can count one vote per second. You can also get some friends to help you with the counting, and they would count at the same speed as you. On the other hand, your friends are busy and can only help between a given start time and an end time. (Each of your friends has a possibly different availability interval.) How much time would you need to finish the count?

You are given the total number of votes and you have a list of friends as well as their availabilities. It is useful to note that someone who can start help at time `t` and finish help at time `t` is available to help you for that one second (time `t`).

### Examples

1. `numVotes = 32000` and you have no friends. You will complete the counting in 32000 seconds.
2. `numVotes = 32000` and you have one friend who is available for the time interval 10001-16000 (measured in seconds from when you start counting, and both limits inclusive that means your friend can help for 6000 seconds). In this case, you would count alone for 10000 seconds, then you and your friend can count 12000 votes in the next 6000 seconds. You would then count the last 10000 votes by yourself and would finish in 26000 seconds.
3. `numVotes = 32000` and you have two friends that can help you. One friend can help in the interval 10001-16000 and the other can help in the interval 13001-24000. In this case, you would count the first 10000 votes alone. Then you will be assisted by one friend and the two of you can count 6000 votes until 13000. From 13001 until 16000, a total of 9000 votes can be counted. At this point, a total of 25000 votes have been counted. There are two of you left to count the remaining 7000 votes and that would take you 3500 seconds. The total time would therefore be 10000 + 3000 + 3000 + 3500 = 19500 seconds.
4. `numVotes = 32001` and you have one friend that can help in the interval 11000-20001. You will count the first 10999 votes alone. Then you and your friend, together, can count 18004 votes until time 20001. You will count the remaining 2997 votes by yourself and finish at time 22999.

**TODO**: Implement `RecountRacket.countingTime`.

## Task 2: How much can you earn?

There are `numVotes` number of votes to be counted in all. You can count one vote per second and Trump agrees to pay you $1 for each vote you count. However, time is running out for Trump and you. You only have `timeInSeconds` to finish the counting.

You would like to maximize your earnings. You have no friends but you have the option of hiring reliable contractors to aid you with the counting effort. You can hire one or more contractors at the start of any second -- and for the purpose of this task it takes a negligible amount of time to hire one or more contractors. Each contractor requires a one-time payment of `contractorSalary`. You start with $0 and you can only hire a contractor if you have earned enough from Trump at the time of hiring. 

A contractor counts votes at the same speed as you do but a contractor does not require more than the one-time payment so you accumulate more revenue from their counting. Once hired, a contractor stays until all votes are counted.

What is the maximum amount you can earn from Trump in this recount racket? 

**TODO**: Implement `RecountRacket.maximumReward`.

### Examples

1. `numVotes = 470000, timeInSeconds = 1000000, contractorSalary = 50`: the best option is for you to count all the votes yourself and the maximum you can earn is 470000.
2. `numVotes = 470000, timeInSeconds = 100000, contractorSalary = 500000`: contractors are too expensive so the most you can earn is 100000.
3. `numVotes = 470000, timeInSeconds = 100000, contractorSalary = 57000`: you may be able to hire a contractor but doing so is not beneficial so the maximum you can earn is 100000.
4. `numVotes = 470000, timeInSeconds = 100000, contractorSalary = 42000`: you can earn 116000 by hiring one contractor after 42000 seconds. You would then earn 58000 + 58000 = 116000.
5. `numVotes = 470000, timeInSeconds = 4, contractorSalary = 1`: 
    * first second: only you count and each a dollar;
    * second second: hire a contractor and then you both count so you have two dollars;
    * third second: hire two more contractors and then you and three contractors count so that you have four dollars;
    * fourth second: you hire one additional contract, and you and four contractors count 5 votes. You end with 3 + 5 = 8 dollars.
6. `numVotes = 123456, timeInSeconds = 47, contractorSalary = 10`: the maximum you can earn is 215. 

### Submission Instructions

+ Submit your work to the Github classroom repository that was created for you.
+ **Do not alter the directory/folder structure. You should retain the structure as in this repository.**
+ Do not wait until the last minute to push your work to Github. It is a good idea to push your work at intermediate points as well. _We would recommend that you get your Git and Github workflow set up at the start._

### What Should You Implement / Guidelines

+ You should implement all the methods that are indicated with `TODO`.
+ Passing the provided tests is the minimum requirement. Use the tests to identify cases that need to be handled. Passing the provided tests is *not sufficient* to infer that your implementation is complete and that you will get full credit. Additional tests will be used to evaluate your work. The provided tests are to guide you.
+ You can implement additional helper methods if you need to but you should keep these methods `private` to the appropriate classes.
+ You do not need to implement new classes.
+ You can use additional **standard** Java libraries by importing them.
+ Do not throw new exceptions unless the specification for the method permits exceptions.


## Honour Code

By submitting your work to Github you agree to the following:

+ You did not consult with any other person for the purpose of completing this activity.
+ You did not aid any other person in the class in completing their activity.
+ If you consulted any external sources, such as resources available on the World Wide Web, in completing the examination then you have cited the source. (You do not need to cite class notes or Sun/Oracle Java documentation.)
+ You are not aware of any infractions of the honour code for this activity.