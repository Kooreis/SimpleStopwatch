# Python Documentation

# Python Stopwatch

This Python script creates a simple stopwatch. The stopwatch can be started, stopped, and the elapsed time can be checked. The script runs in an infinite loop until the user decides to quit.

## Libraries Used

- `time`: This is a built-in Python library that provides various time-related functions. In this script, it is used to get the current time in seconds since the epoch (a fixed point in time, specifically January 1, 1970, 00:00:00 (UTC)).

## Class: Stopwatch

This class represents a stopwatch. It has three attributes: `start_time`, `stop_time`, and `running`.

- `start_time`: The time when the stopwatch was started.
- `stop_time`: The time when the stopwatch was stopped.
- `running`: A boolean indicating whether the stopwatch is currently running.

The class has three methods: `start`, `stop`, and `elapsed_time`.

- `start`: This method starts the stopwatch by setting `start_time` to the current time and `running` to True.
- `stop`: This method stops the stopwatch by setting `stop_time` to the current time and `running` to False. If the stopwatch is not running, this method does nothing.
- `elapsed_time`: This method returns the elapsed time. If the stopwatch is running, it returns the difference between the current time and `start_time`. If the stopwatch is not running, it returns the difference between `stop_time` and `start_time`.

## Function: main

This function creates a `Stopwatch` object and enters an infinite loop. In each iteration of the loop, it prompts the user to enter a command. The possible commands are "start", "stop", "elapsed", and "quit".

- "start": Starts the stopwatch.
- "stop": Stops the stopwatch.
- "elapsed": Prints the elapsed time.
- "quit": Breaks the loop and ends the script.

## Running the Script

To run the script, simply execute it with a Python interpreter. The script will prompt you to enter commands. Enter "start" to start the stopwatch, "stop" to stop it, "elapsed" to check the elapsed time, and "quit" to quit the script.

---

# C# Documentation

# Stopwatch Program in C#

This repository contains a simple console application written in C# that functions as a stopwatch. The user can start, stop, reset the stopwatch, and exit the program.

## Script Explanation

The script starts by importing two namespaces:

- `System`: This namespace contains fundamental classes and base classes that define commonly-used value and reference data types, events and event handlers, interfaces, attributes, and processing exceptions.

- `System.Diagnostics`: This namespace provides classes that allow you to interact with system processes, event logs, and performance counters.

The `Program` class is the main class of the script. It contains the `Main` method, which is the entry point of the application.

In the `Main` method, a `Stopwatch` object is created. This object can measure elapsed time for one interval, or the total of elapsed time across multiple intervals.

The program then enters a loop, where it waits for user input. The user can enter one of four commands:

- `start`: Starts the stopwatch.
- `stop`: Stops the stopwatch and prints the elapsed time.
- `reset`: Resets the stopwatch.
- `exit`: Exits the program.

These commands are handled in a `switch` statement.

## Usage

To use the program, simply run it in a console. You will be prompted to enter a command. Enter `start` to start the stopwatch, `stop` to stop the stopwatch and print the elapsed time, `reset` to reset the stopwatch, or `exit` to exit the program.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

[MIT](https://choosealicense.com/licenses/mit/)

---

# Java Documentation

# Java Stopwatch

This is a simple Java program that simulates a stopwatch. The stopwatch starts when the user inputs 's' and stops when the user inputs 'e'. The elapsed time between the start and stop is then calculated and displayed in milliseconds.

## Code Explanation

The script is written in Java and uses the `java.util.Scanner` library for reading user input.

### Imported Libraries

- `java.util.Scanner`: This is a simple text scanner which can parse primitive types and strings using regular expressions. In this script, it is used to read the user's input from the console.

### Class: Stopwatch

This class contains the main logic for the stopwatch. It has two main methods: `start()` and `stop()`. 

- `start()`: This method records the current time in milliseconds when the user starts the stopwatch.
- `stop()`: This method records the current time in milliseconds when the user stops the stopwatch. It then calculates the elapsed time by subtracting the start time from the stop time and displays this time to the user.

### Main Method

The `main()` method is the entry point for the program. It creates an instance of the Stopwatch class and a Scanner object to read the user's input. It then waits for the user to start and stop the stopwatch, calling the appropriate methods on the Stopwatch object.

## Usage

To use this script, simply run it in a Java environment. When prompted, press 's' to start the stopwatch and 'e' to stop it. The elapsed time will be displayed in the console.

---
