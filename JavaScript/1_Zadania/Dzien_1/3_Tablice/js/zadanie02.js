function add(array) {
var sum=0;
for(var i=0; i<array.length; i++)
    sum+=array[i];
return sum;
}

function multiply(array) {
var multiply=1;
for(var i=0; i<array.length; i++)
    multiply*=array[i];
return multiply;
}


console.log(add([1,1,1,1]));
console.log(add([2,1,1,1]));
console.log(add([1,1,4,1]));
console.log(multiply([1,1,1,1]));
console.log(multiply([2,1,1,1]));
console.log(multiply([3,1,1,1]));
