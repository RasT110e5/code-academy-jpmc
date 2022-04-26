<#
Every student receives a grade in the inclusive range from 0 to 100.
Any grade less than 40 is a failing grade.

Sam is a professor at the university and likes to round each student's according to these rules:
    - If the difference between the grade and the next multiple of is less than 3, round up to the next multiple of 5.
    - If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade. 
#>
Write-Host "++ Grade Rounder ++"
$promptMessage = "Enter grade or grades (45 | 40,90,100), exit with -1"
[String]$grades = Read-Host -Prompt $promptMessage 
while ($grades -ne -1) {
    [int16[]] $grades = $grades.Split(',')
    foreach ($grade in $grades) {
        if ($grade -lt 38 -or $grade % 5 -eq 0) {
            Write-Host "Grade $grade not rounded. => $grade"
        } else {
            $nextMultipleOf5 = $grade
            while ($nextMultipleOf5 % 5 -ne 0) {
                $nextMultipleOf5++
            }
            $diff = $nextMultipleOf5 - $grade
            if ($diff -lt 3) {
                Write-Host "Grade $grade rounded. => $nextMultipleOf5"
            } else {
                Write-Host "Grade $grade not rounded. => $grade"
            }
        }
    }
    [String]$grades = Read-Host -Prompt $promptMessage
}