// program of world population growth
// over the next 75 years, 
//assuming a constant annual growth rate of 0.84%,
// based on current estimates.


// current affairs August 2025, the world population is
//vapproximately 8.24 billion.


let totalPopulation = 8.24;
let yearlySum = totalPopulation;

for (let i = 0; i < 75; i++) {
    let yearlyIncrease = totalPopulation * 0.0084;
    yearlySum += yearlyIncrease;
}

console.log("population in billion after 75years is:" , yearlySum);
