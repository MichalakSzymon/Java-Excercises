function average (array) {
    var avg=0;   
    for(var i=0; i<array.length; i++) {
       avg+=array[i];         
   }
    avg=avg/array.length;
    return avg;
}

function distFromAvarage (array) {
    var avg = average (array);
    var result = [];
    for(var i=0; i<array.length; i++) {
       var j=array[i]-avg;
       if(j<0) j*=-1;
    result.push(j);
    }
return result;
}

console.log(distFromAvarage([1,2,3,4,5,6,7]));// => [3,2,1,0,1,2,3] (średnia z tablicy wejściowej to 4)
console.log(distFromAvarage([1,1,1,1]));// => [0,0,0,0] (średnia z tablicy wejściowej to 1)
console.log(distFromAvarage([2,8,3,7]));// => [3,3,2,2] (średnia z tablicy wejściowej to 5)
