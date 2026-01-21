# Countdown Timer (Java)

A simple **console-based countdown timer** written in Java.  
The program allows the user to enter hours, minutes, and seconds, then counts down in real time while updating the display on a **single console line**.

---

## Features

- Accepts user input for hours, minutes, and seconds
- Converts all time into total seconds for accurate countdown logic
- Displays remaining time in `HH:MM:SS` format
- Updates the countdown **on the same line** (no console spam)
- Uses `Thread.sleep(1000)` for real-time countdown
- Beginner-friendly and easy to understand

---

## How It Works

1. The user enters hours, minutes, and seconds
2. The program converts the input into **total seconds**
3. A countdown loop runs from the total seconds down to zero
4. Each second:
   - The remaining time is recalculated
   - The console line is overwritten using `\r`
   - Output is flushed to ensure immediate display
5. When the timer reaches zero, the program ends

---

## Technologies Used

- Java
- Scanner (user input)
- Console output (`System.out.printf`)
- Thread handling (`Thread.sleep`)

## Author 
Kaelin Kesavjee
