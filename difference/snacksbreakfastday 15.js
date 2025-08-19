//build a function that return array of integer from n to 1 where n greater 0 eg
//input 5
//output is [5,4,3,2,1]

function getArray(n) {

  const result = [ ];
  for (let i = n; i >= 1; i--) {
    result.push(i);
  }
  return result;
}


console.log(getArray(5)); // Output: [5, 4, 3, 2, 1]
console.log(getArray(10));
