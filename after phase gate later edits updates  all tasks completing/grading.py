
from datetime import date, datetime

# Main program
subjects = []
scores = []
studentNames = []
studentTotalScores = []
studentAverageScores = []

print("Enter Teachers name:")
teacherName = input()

print("How many students do you have?:")
numberOfStudents = int(input())

print("How many subjects does each student offer?")
numberOfSubjects = int(input())

for i in range(numberOfSubjects):
    print("Enter name of subject #number" + str(i + 1) + ":")
    subjectName = input()
    subjects.append(subjectName)

for i in range(numberOfStudents):
    print("\nENTERING SCORES FOR STUDENT NUMBER#" + str(i + 1))
    print("Enter name of student #" + str(i + 1) + ":")
    currentStudentName = input()
    studentNames.append(currentStudentName)

    totalScore = 0

    for j in range(numberOfSubjects):
        print("Enter score for " + subjects[j] + ":")
        score = int(input())
        scores.append(score)
        totalScore += score

    studentTotalScores.append(totalScore)
    average = totalScore / numberOfSubjects
    studentAverageScores.append(average)

    print("Saving >>>>>>>>>>>>>>>.")
    print("Saved successfully")
displayClassSummary(teacherName, subjects, scores, studentNames, studentTotalScores, studentAverageScores, numberOfStudents, numberOfSubjects)

def displayClassSummary(teacherName, subjects, scores, studentNames, studentTotalScores, studentAverageScores, numberOfStudents, numberOfSubjects):
    print("Teacher Name:", teacherName)
    print("Date:", date.today())
    print("Time:", datetime.now())

    print("------")

    # Calculate positions
    positions = []
    for currentStudentIndex in range(numberOfStudents):
        position = 1
        for comparisonStudentIndex in range(numberOfStudents):
            if studentTotalScores[comparisonStudentIndex] > studentTotalScores[currentStudentIndex]:
                position += 1
        positions.append(position)

    # Display tabular summary
    print("\nCLASS SUMMARY")
    print("STUDENT\t", end="")
    for subject in subjects:
        print(subject + "\t", end="")
    print("TOT\tAVE\tPOS")

    # Display each student's scores and summary
for studentIndex in range(numberOfStudents):
    print(studentNames[studentIndex] + "\t", end="")
    for subjectIndex in range(numberOfSubjects):
        scorePosition = studentIndex * numberOfSubjects + subjectIndex
        print(str(scores[scorePosition]) + "\t", end="")
    print(str(studentTotalScores[studentIndex]) + "\t" + str(studentAverageScores[studentIndex]) + "\t" + str(positions[studentIndex]))

# Subject Analysis
print("\nSUBJECT ANALYSIS")
for subjectIndex in range(numberOfSubjects):

    firstScore = scores[subjectIndex]  

    highestScore = firstScore
    lowestScore = firstScore
  
    totalScoreForSubject = 0
    numberOfPasses = 0
    numberOfFails = 0
    topScoringStudent = studentNames[0]
    lowestScoringStudent = studentNames[0]

    for studentIndex in range(numberOfStudents):
        scorePosition = studentIndex * numberOfSubjects + subjectIndex
        currentScore = scores[scorePosition]
        totalScoreForSubject += currentScore

        if currentScore >= 50:
            numberOfPasses += 1
        else:
            numberOfFails += 1

        if currentScore > highestScore:
            highestScore = currentScore
            topScoringStudent = studentNames[studentIndex]
        if currentScore < lowestScore:
            lowestScore = currentScore
            lowestScoringStudent = studentNames[studentIndex]

    averageScoreForSubject = totalScoreForSubject / numberOfStudents
    print("Subject:", subjects[subjectIndex])
    print("Highest scoring student:", topScoringStudent, "scoring", highestScore)
    print("Lowest scoring student:", lowestScoringStudent, "scoring", lowestScore)
    print("Total Score:", totalScoreForSubject)
    print("Average Score: {:.2f}".format(averageScoreForSubject))
    print("Passes:", numberOfPasses)
    print("Fails:", numberOfFails)
    print("---------------------")

print("\nTHANK YOU FOR USING LAGBAJA SCHOOL SYSTEM!")


