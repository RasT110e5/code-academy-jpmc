// Every student receives a grade in the inclusive range from 0 to 100.
// Any grade less than 40 is a failing grade.

// Sam is a professor at the university and likes to round each student's according to these rules:
//     - If the difference between the grade and the next multiple of is less than 3, round up to the next multiple of 5.
//     - If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade. 
const prompt = require("prompt-sync")({ sigint: true });
console.log("++ Grade Rounder ++")
promptMessage = "Enter grade or grades (45 | 40,90,100), exit with -1: "
grades = prompt(promptMessage)
while (grades != -1) {
    grades = grades.split(',').map(Number)
    grades.forEach(grade => {
        if (grade < 38 || grade % 5 == 0) {
            console.log("Grade " + grade + " not rounded. => " + grade)
        } else {
            nextMultipleOf5 = grade
            while (nextMultipleOf5 % 5 != 0) {
                nextMultipleOf5++
            }
            diff = nextMultipleOf5 - grade
            if (diff < 3) {
                console.log("Grade " + grade + " rounded. => " + nextMultipleOf5)
            } else {
                console.log("Grade " + grade + " not rounded. => " + grade)
            }
        }
    });
    grades = prompt(promptMessage)
}