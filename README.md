# Terminal Calculator

A simple prefix calculator that performs operations on multiple numbers.

## Setup Instructions (Important!)

Before running the calculator, you must:

1. Make sure you have Java (JDK) installed on your computer
   - To check, open terminal and type: `java --version`
   - If not installed, download from [Oracle's website](https://www.oracle.com/java/technologies/downloads/)

2. After unzipping the files:
   ```bash
   cd path/to/unzipped/files    # Navigate to the folder containing CommandLine.java
   javac CommandLine.java       # Compile the program (creates CommandLine.class)
   ```

## How to Use

Run calculations using this format:
```bash
java CommandLine <operator> <number1> <number2> [more numbers...]
```

### Examples:

```bash
# Addition
java CommandLine + 5 3 2      # Result: 10 (5 + 3 + 2)

# Subtraction
java CommandLine '-' 10 3 2   # Result: 5 (10 - 3 - 2)

# Multiplication (MUST use quotes or escape character)
java CommandLine '*' 2 3 4    # Result: 24 (2 * 3 * 4)
   or
java CommandLine \* 2 3 4     # Same result

# Division
java CommandLine '/' 24 2 2   # Result: 6 (24 / 2 / 2)
```