//1.your function takes two argument
//your function takes two arguments
//current fsthers age(years)
//current age of son(years)

//calculate how many  years ago 
//father was twice as old as son(or in how many years time to come)
//he will be twice as old
//the answer is always greater or equal to 0 no matter if it was in the past or future




function isTwiceOld(ageSon, ageFather) {
for (let minimumAgeFather = 18; minimumAgeFather  < 100; minimumAgeFather ++) {
ageFather = minimumAgeFather ;
if (ageFather === 2 * ageSon) {
console.log("Age of son when father is twice as old as son:");
console.log(ageFather);
return true;
} 
else {
console.log("Father is not twice as old as son at age:");
console.log(ageFather);
}
}
return false;
}


console.log(isTwiceOld(20, 60));  
isTwiceOld(10, 80);               
