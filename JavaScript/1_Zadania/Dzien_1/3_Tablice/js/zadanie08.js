function age(array) {
array.sort();
    return "Najstarsza osoba urodziła się w " + array[0] + " i ma " + (2017-array[0]) + " lata, a najmłodsza osoba urodziła się w " + array[array.length-1] + " i ma " + (2017-array[array.length-1]) + " lata";  

}


var array = [1990, 1992, 1989, 1923, 2001, 2015];
console.log(age(array));
