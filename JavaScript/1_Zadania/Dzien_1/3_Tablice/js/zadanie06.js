function factors (a) {
    var result=[];    
    if(parseInt(a)>0) {      
      for(var i=a; i>0; i--) {
        if(a%i==0)
            result.push(i);
        }

    }
    return result;
} 

console.log(factors(2));
console.log(factors(54));
console.log(factors(-4));
console.log(factors('a'));
