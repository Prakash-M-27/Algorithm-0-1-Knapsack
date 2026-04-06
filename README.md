📦 0/1 Knapsack (Dynamic Programming)
📘 Course

Algorithm

🧠 Project Title

0/1 Knapsack (DP Version)

📌 Description

The 0/1 Knapsack Problem is a classic optimization problem in computer science.
This project implements a Dynamic Programming (DP) approach to efficiently determine the maximum value that can be obtained within a given weight capacity.

Each item can either be:

Included (1)
Excluded (0)

The goal is to maximize the total value without exceeding the knapsack's capacity.

🎯 Objective
To understand and implement Dynamic Programming
To solve real-world resource allocation problems
To optimize decision-making under constraints
⚙️ Algorithm Used

Dynamic Programming (Bottom-Up Approach)

Key Idea:

A 2D table is used where:

dp[i][w] represents the maximum value achievable
using the first i items and capacity w.
🧾 Features
Efficient solution using DP
Handles multiple items and capacities
User input support
Clear and structured implementation
🛠️ Technologies Used
Java
Scanner (for user input)
▶️ How to Run

Compile the program:

javac Knapsack.java

Run the program:

java Knapsack
Provide input:
Number of items
Weights of items
Values of items
Knapsack capacity
💡 Example

Input:

Enter number of items: 3
Enter weights: 10 20 30
Enter values: 60 100 120
Enter capacity: 50

Output:

Maximum value = 220
🌍 SDG Goal Alignment
SDG 12 – Responsible Consumption and Production

This project supports SDG 12 by:

Promoting efficient use of resources
Reducing wastage in allocation
Helping in optimal decision-making
📈 Time and Space Complexity
Time Complexity: O(n × W)
Space Complexity: O(n × W)

Where:

n = number of items
W = capacity of knapsack
📚 Conclusion

The 0/1 Knapsack problem demonstrates how Dynamic Programming can be used to solve complex optimization problems efficiently. This approach ensures the best possible outcome while respecting given constraints.
