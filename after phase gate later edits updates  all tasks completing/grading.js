
// Main program
const subjects = [];
const scores = [];
const studentNames = [];
const studentTotalScores = [];
const studentAverageScores = [];
const prompt=require("prompt-sync")();
const teacherName = prompt("Enter Teacher's name:");

const numberOfStudents = parseInt(prompt("How many students do you have?:"));
const numberOfSubjects = parseInt(prompt("How many subjects does each student offer?"));

for (let subjectCounter = 0; subjectCounter < numberOfSubjects; subjectCounter++) {
    const subjectName = prompt("Enter name of subject #number" + (subjectCounter + 1) + ":");
    subjects.push(subjectName);
}

for (let studentCounter = 0; studentCounter < numberOfStudents; studentCounter++) {
    console.log("\nENTERING SCORES FOR STUDENT NUMBER#" + (studentCounter + 1));
    const currentStudentName = prompt("Enter name of student #" + (studentCounter + 1) + ":");
    studentNames.push(currentStudentName);

    let totalScore = 0;

    for (let j = 0; j < numberOfSubjects; j++) {
        const score = parseInt(prompt("Enter score for " + subjects[j] + ":"));
        scores.push(score);
        totalScore += score;
    }

    studentTotalScores.push(totalScore);
    const average = totalScore / numberOfSubjects;
    studentAverageScores.push(average);

    console.log("Saving >>>>>>>>>>>>>>>.");
    console.log("Saved successfully");
}

displayClassSummary(
    teacherName,
    subjects,
    scores,
    studentNames,
    studentTotalScores,
    studentAverageScores,
    numberOfStudents,
    numberOfSubjects
);

function displayClassSummary(
    teacherName,
    subjects,
    scores,
    studentNames,
    studentTotalScores,
    studentAverageScores,
    numberOfStudents,
    numberOfSubjects
) {
    console.log("Teacher Name:", teacherName);
    console.log("Date:", new Date());
    console.log("Time:", new Date().toLocaleTimeString());
    console.log("------");

    // Calculate positions
    const positions = [];
    for (let currentStudentIndex = 0; currentStudentIndex < numberOfStudents; currentStudentIndex++) {
        let position = 1;
        for (let comparisonStudentIndex = 0; comparisonStudentIndex < numberOfStudents; comparisonStudentIndex++) {
            if (studentTotalScores[comparisonStudentIndex] > studentTotalScores[currentStudentIndex]) {
                position++;
            }
        }
        positions.push(position);
    }

    // Display tabular summary
    console.log("\nCLASS SUMMARY");
    let header = "STUDENT\t";
    for (const subject of subjects) {
        header += subject + "\t";
    }
    header += "TOT\tAVE\tPOS";
    console.log(header);

    for (let studentIndex = 0; studentIndex < numberOfStudents; studentIndex++) {
        let row = studentNames[studentIndex] + "\t";
        for (let subjectIndex = 0; subjectIndex < numberOfSubjects; subjectIndex++) {
            const scorePosition = studentIndex * numberOfSubjects + subjectIndex;
            row += scores[scorePosition] + "\t";
        }
        row += studentTotalScores[studentIndex] + "\t" + studentAverageScores[studentIndex].toFixed(2) + "\t" + positions[studentIndex];
        console.log(row);
    }

    // Subject Analysis
    console.log("\nSUBJECT ANALYSIS");
 for (let subjectIndex = 0; subjectIndex < numberOfSubjects; subjectIndex++) {
        const firstScore = scores[subjectIndex];
        let highestScore = firstScore;
        let lowestScore = firstScore;
        let totalScoreForSubject = 0;
        let numberOfPasses = 0;
        let numberOfFails = 0;
        let topScoringStudent = studentNames[0];
        let lowestScoringStudent = studentNames[0];

        for (let studentIndex = 0; studentIndex < numberOfStudents; studentIndex++) {
            const scorePosition = studentIndex * numberOfSubjects + subjectIndex;
            const currentScore = scores[scorePosition];
            totalScoreForSubject += currentScore;

            if (currentScore >= 50) {
                numberOfPasses++;
            } else {
                numberOfFails++;
            }

            if (currentScore > highestScore) {
                highestScore = currentScore;
                topScoringStudent = studentNames[studentIndex];
            }
            if (currentScore < lowestScore) {
                lowestScore = currentScore;
                lowestScoringStudent = studentNames[studentIndex];
            }
        }

        const averageScoreForSubject = totalScoreForSubject / numberOfStudents;
        console.log("Subject:", subjects[subjectIndex]);
        console.log("Highest scoring student:", topScoringStudent, "scoring", highestScore);
        console.log("Lowest scoring student:", lowestScoringStudent, "scoring", lowestScore);
        console.log("Total Score:", totalScoreForSubject);
        console.log("Average Score:", averageScoreForSubject);
        console.log("Passes:", numberOfPasses);
        console.log("Fails:", numberOfFails);
        console.log("---------------------");
    }

    console.log("\nTHANK YOU FOR USING LAGBAJA SCHOOL SYSTEM!");
}
