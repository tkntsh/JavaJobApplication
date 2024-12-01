# Job Scheduling with Maximum Profit

This Java application demonstrates how to solve the problem of finding the maximum profit from a list of jobs, where each job has a start time, finish time, and associated profit. The solution is implemented using a variation of the **Longest Increasing Subsequence (LIS)** dynamic programming approach.

## Features

- **Dynamic Programming Approach**: Calculates the maximum profit from a list of non-overlapping jobs.
- **Sorting and Comparison**: Jobs are sorted by their start time to facilitate efficient comparisons.
- **Stream API Usage**: Modern Java constructs like `Arrays.stream` are used for processing arrays.

## How It Works

1. **Input Jobs**:
   - each job is represented as an object with three properties: start time, finish time, and profit.
   - jobs are provided as a list.

2. **Algorithm**:
   - jobs are sorted by their start time.
   - for each job, the algorithm calculates the maximum profit by considering non-overlapping previous jobs.
   - the final maximum profit is obtained by selecting the maximum value from the computed profits for all jobs.

3. **Output**:
   - the program prints the maximum profit from the list of jobs.

## Code Structure

- **`Job` Class**: Represents a job with start time, finish time, and profit.
- **`findMaxProfit` Method**: Core logic for calculating the maximum profit.
- **`main` Method**: Demonstrates the functionality by creating a list of jobs and invoking the solution.

## Example Usage

### Input
The program is initialized with the following jobs:
```java
List<Job> jobs = Arrays.asList(
    new Job(1, 3, 5),
    new Job(1, 2, 6),
    new Job(3, 5, 2)
);
