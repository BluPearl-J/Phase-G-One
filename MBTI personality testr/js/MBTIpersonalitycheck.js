const prompt = require('prompt-sync')({ sigint: true });

let twentyQuestions = [];

const getQuestion = function (question, optionA, optionB) {
  twentyQuestions.push({ question, optionA, optionB });

  console.log(`\nQuestion: ${question}`);
  console.log(`1-A: ${optionA}`);
  console.log(`2-B: ${optionB}`);
};

// Question 1
let questionOne = `Question one`;
let optionOnea = `Expend energy, enjoy groups`;
let optionOneb = `Conserve energy, enjoy one-on-one`;
getQuestion(questionOne, optionOnea, optionOneb);

// Question 2
let questionTwo = `Question Two`;
let optionTwoa = `Interpret matters literally, rely on common sense`;
let optionTwob = `Look for meaning and possibilities, rely on hunches`;
getQuestion(questionTwo, optionTwoa, optionTwob);

// Question 3
let questionThree = `Question Three`;
let optionThreea = `Logical, thinking, questioning`;
let optionThreeb = `Empathetic, feeling, accommodating`;
getQuestion(questionThree, optionThreea, optionThreeb);

// Question 4
let questionFour = `Question Four`;
let optionFoura = `Organized, orderly`;
let optionFourb = `Flexible, adaptable`;
getQuestion(questionFour, optionFoura, optionFourb);

// Question 5
let questionFive = `Question Five`;
let optionFivea = `Practical, realistic, fact-minded`;
let optionFiveb = `Imaginative, innovative`;
getQuestion(questionFive, optionFivea, optionFiveb);

// Question 6
let questionSix = `Question Six`;
let optionSixa = `Prefer routine, think out loud`;
let optionSixb = `More reserved, think to yourself`;
getQuestion(questionSix, optionSixa, optionSixb);

// Question 7
let questionSeven = `Question Seven`;
let optionSevena = `Pragmatic, comfortable with risk`;
let optionSevenb = `Skeptical, cautious`;
getQuestion(questionSeven, optionSevena, optionSevenb);

// Question 8
let questionEight = `Question Eight`;
let optionEighta = `Candid, straightforward, frank`;
let optionEightb = `Tactful, kind, encouraging`;
getQuestion(questionEight, optionEighta, optionEightb);

// Question 9
let questionNine = `Question Nine`;
let optionNinea = `Quiet, reserved, listen well`;
let optionNineb = `Unplanned, spontaneous`;
getQuestion(questionNine, optionNinea, optionNineb);

// Question 10
let questionTen = `Question Ten`;
let optionTena = `Seek many tasks, public activities, interaction`;
let optionTenb = `Seek private, solitary activities with quiet`;
getQuestion(questionTen, optionTena, optionTenb);

// Question 11
let questionEleven = `Question Eleven`;
let optionElevena = `Standard, usual, conventional`;
let optionElevenb = `Different, unique, unusual`;
getQuestion(questionEleven, optionElevena, optionElevenb);

// Question 12
let questionTwelve = `Question Twelve`;
let optionTwelvea = `Firm, tend to criticize, hold the line`;
let optionTwelveb = `Easygoing, “live and let live”`;
getQuestion(questionTwelve, optionTwelvea, optionTwelveb);

// Question 13
let questionThirteen = `Question Thirteen`;
let optionThirteena = `External, communicative, express yourself`;
let optionThirteenb = `Internal, introspective, keep to yourself`;
getQuestion(questionThirteen, optionThirteena, optionThirteenb);

// Question 14
let questionFourteen = `Question Fourteen`;
let optionFourteena = `Focus on here-and-now`;
let optionFourteenb = `Look at the big picture, “big picture”`;
getQuestion(questionFourteen, optionFourteena, optionFourteenb);

// Question 15
let questionFifteen = `Question Fifteen`;
let optionFifteena = `Tough-minded, just`;
let optionFifteenb = `Tender-hearted, merciful`;
getQuestion(questionFifteen, optionFifteena, optionFifteenb);

// Question 16
let questionSixteen = `Question Sixteen`;
let optionSixteena = `Preparation, plan ahead`;
let optionSixteenb = `Go with the flow, adapt as you go`;
getQuestion(questionSixteen, optionSixteena, optionSixteenb);

// Question 17
let questionSeventeen = `Question Seventeen`;
let optionSeventeena = `Reflective, deliberate`;
let optionSeventeenb = `Flexible, deliberate`;
getQuestion(questionSeventeen, optionSeventeena, optionSeventeenb);

// Question 18
let questionEighteen = `Question Eighteen`;
let optionEighteena = `Facts, things, “what is”`;
let optionEighteenb = `Ideas, dreams, “what could be”`;
getQuestion(questionEighteen, optionEighteena, optionEighteenb);

// Question 19
let questionNineteen = `Question Nineteen`;
let optionNineteena = `Matter-of-fact, issue-oriented, principled`;
let optionNineteenb = `Sensitive, people-oriented, compassionate`;
getQuestion(questionNineteen, optionNineteena, optionNineteenb);

// Question 20
let questionTwenty = `Question Twenty`;
let optionTwentya = `Control, govern`;
let optionTwentyb = `Latitude, freedom`;
getQuestion(questionTwenty, optionTwentya, optionTwentyb);

// Print all elements in the array
console.log(`\n--- Printing 20 Questions ---`);
twentyQuestions.forEach((item, index) => {
  console.log(`\n${index + 1}. ${item.question}`);
  console.log(`   A: ${item.optionA}`);
  console.log(`   B: ${item.optionB}`);
});
