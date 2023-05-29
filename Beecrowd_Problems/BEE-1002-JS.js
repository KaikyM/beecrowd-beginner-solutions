var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var R = parseFloat(input);
var Pi = 3.14159;
var Area = Pi * Math.pow(R, 2);
console.log("A=" + Area.toFixed(4));
