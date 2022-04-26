/*
Every student receives a grade in the inclusive range from 0 to 100.
Any grade less than 40 is a failing grade.

Sam is a professor at the university and likes to round each student's according to these rules:
    - If the difference between the grade and the next multiple of is less than 3, round up to the next multiple of 5.
    - If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade. 

THIS IMPLEMENTATION TAKES ONLY 1 GRADE AT A TIME
*/
#include <functional>
#include <iostream>
#include <ostream>
#include <string>
using namespace std;

int main() {
  cout << "++ Grade Counter ++" << endl;
  string promptMessage = "Enter grade (i.e 45), exit with -1:";
  string grade;
  cout << promptMessage << endl;
  cin >> grade;
  while (grade != "-1") {
    int gradeNumber = stoi(grade);
    if (gradeNumber < 38 || gradeNumber % 5 == 0) {
      cout << "Grade " << gradeNumber << " not rounded. => " << gradeNumber
           << endl;
    } else {
      int nextMultipleOf5 = gradeNumber;
      while (nextMultipleOf5 % 5 != 0) {
        nextMultipleOf5++;
      }
      int diff = nextMultipleOf5 - gradeNumber;
      if (diff < 3) {
        // Write-Host "Grade $grade rounded. => $nextMultipleOf5"
        cout << "Grade " << gradeNumber << " rounded. => " << nextMultipleOf5
             << endl;
      } else {
        cout << "Grade " << gradeNumber << " not rounded. => " << gradeNumber
             << endl;
      }
    }
    cout << promptMessage << endl;
    cin >> grade;
  }
  return 0;
}