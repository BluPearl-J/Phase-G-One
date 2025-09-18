const subjects = [];
const scores = [];
const studentNames = [];
const studentTotalScores = [];
const studentAverageScores = [];
const prompt = require("prompt-sync")();

let teacherName = prompt("Enter Teacher's name:");

if (typeof teacherName !== "string" || !isNaN(teacherName)||teacherName.trim() === "" ||
    containsPunctuation(teacherName)) {
    console.log("Error: Input must be a string.not number and cannot be punctuations");
    teacherName = prompt("Re-enter Teacher's name correctly:");
}

while (!isNaN(teacherName)||
    teacherName.trim() === "" ||
    containsPunctuation(teacherName)) {
    teacherName = prompt("Re-Enter Teacher's name correctly :");
}



let numberOfStudents = parseInt(prompt("How many students do you have?:"));
numberOfStudents =validateSubjects(numberOfStudents);

console.log("number of students inputted is valid ");

 

let numberOfSubjects = parseInt(prompt("How many subjects does each student offer?"));



numberOfSubjects =validateSubjects(numberOfSubjects);
console.log("number of subjects inputted is valid ");

askSubjectNames();
askStudentNames();

function containsPunctuation(str) {
    const punctuationMarks = [
        ".", ",", "!", "?", ";", ":", "'", "\"", "-", "_", "(", ")", "[", "]", "{", "}", "/", "\\", "@", "#", "$", "%", "^", "&", "*", "+", "=", "<", ">", "`", "~"
    ];

for (let i = 0; i < str.length; i++) {
if (punctuationMarks.includes(str[i])) {
return true;
}
}
return false;
}


function askSubjectNames(){

for (let subjectCounter = 0; subjectCounter < numberOfSubjects; subjectCounter++) {
    let subjectName = prompt("Enter name of subject #number" + (subjectCounter + 1) + ":");
    
    while (!isNaN(subjectName)||containsPunctuation(subjectName)||subjectName.trim() === "" ) {
        console.log("Error subject must be string type alphabets only");
        subjectName = prompt("Re-Enter Subject's name correctly :");     
    }
subjects.push(subjectName);
}
}

function askStudentNames(){

for (let studentCounter = 0; studentCounter < numberOfStudents; studentCounter++) {
    console.log("\nENTERING SCORES FOR STUDENT NUMBER#" + (studentCounter + 1));
    let currentStudentName = prompt("Enter name of student #" + (studentCounter + 1) + ":");
    

    while (!isNaN(currentStudentName)) {
        console.log("Error student Name must be string type");
        currentStudentName = prompt("Re-Enter Students name correctly :");
    }
    studentNames.push(currentStudentName);
    displaySubjects(); 
}
}


function validateSubjects(x) {
    x = Number(x);
    if (isNaN(x)) {}

    while (isNaN(x)) {
        console.log("Error: Input must be a number.");
        x = Number(prompt("Re-enter number correctly:"));
    }

    if (!Number.isInteger(x) || isNaN(x)) {
        console.log("Error: Number of" + x + "must be an integer.");
    }

    while (!Number.isInteger(x) || isNaN(x)) {
        x = Number(prompt("Re-Enter number correctly :"));
    }

    while (x <= 0 || isNaN(x)) {
        console.log("Error:" + x + "must be greater than zero.");
        x = Number(prompt("Re-Enter number correctly :"));
    }

    while (x > 100 || isNaN(x)) {
        console.log("Error: Number of subjects seems too high. Please enter a value between 1 and 100.");
        x = Number(prompt("Re-Enter number correctly :"));
    }

    console.log("Input is valid: " + x);
    return x;
}

function validateScore(score) {
    while (isNaN(score) || score < 0 || score > 100) {
        console.log("Error: Score must be a number between 0 and 100.");
        score = parseInt(prompt("Re-enter score for subject:"));
    }
    return score;
}


function displaySubjects() {
    let totalScore = 0;

    for (let j = 0; j < numberOfSubjects; j++) {
        const score = parseInt(prompt("ENTER SCORE for " + subjects[j] + ":"));
let result=validateScore(score);
        scores.push(result);
        
        totalScore += result;
    }

    studentTotalScores.push(totalScore);
    const average = totalScore / numberOfSubjects;
    studentAverageScores.push(average);

    console.log("Saving >>>>>>>>>>>>>>>.");
    console.log("Scores Saved successfully");
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

    console.log("\nCLASS SUMMARY");
    let header = "STUDENT\t";
    for (const subject of subjects) {
        header += subject + "\t";
    }
    header += "TOTAL\tAVERAGE\tPOS";
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




