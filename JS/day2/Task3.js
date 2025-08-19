//1.task 3 
//you know the like sysytem for facebook .people can like blog posta / 
//we want to create the text to be displayed to like 
//IMPLEMENT THE FUNCTION WHICH TAKES ARRAY CONTAINING NAMES OF PEOPLE WHO LIKE AN ITEM
//IT MUST RETURN TEXT
//[] NO ONE LIKES THIS
//["PETER"] PETER LIKES THIS
//[}PETER,}JACOB-PETER AND JACON LIKE THIS
//ALEX JACONB MARK MARK AND TWO OTHERS 





function getLikes(...stringArray) {
let result = [];
for (let string of stringArray) {
result.push(string);

console.log( "number of Likes is", string);
for (let count= 0; count <result.Length; count++) {
count(result[string])++;

result.forEach((string) => console.log(count++));
}
} 

for (let count= 0; count <result.Length; count++) {
result[i]=count ;


result.forEach((element) => console.log(count++));


console.log( "number of Likes is", count);


}
return result;

}



console.log(getLikes("Geoffrey", "John", "Ade","Musa","David"));

console.log(getLikes("Alex", "John", "Ade"));



