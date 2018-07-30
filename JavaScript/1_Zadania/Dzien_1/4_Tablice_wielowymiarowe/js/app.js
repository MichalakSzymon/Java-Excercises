function checkArray (array) {
    var result = [];
    for(var i=0; i<array.length; i++) {
        result[i]=true;
    }
    for(var i=0; i<array.length; i++) {
        for(var j=0; j<array[i].length; j++) {
            if(array[i][j]%2!==0) {            
                result[i]=false;
                break;    
            }  
        }
    }
return result;    
}


console.log(checkArray([
    [11, 12],
    [42, 2],
    [-4, -120],
    [0, 0],
    [1, 34]]));


function print2DArray (array) {
    for(var i=0; i<array.length; i++)
        for(var j=0; j<array[i].length; j++) {
            console.log(array[i][j]);
        }
}

print2DArray([
    [11, 12],
    [42, 2],
    [-4, -120],
    [0, 0],
    [1, 34]]);


function create2DArray (rows,columns) {
    var number=0;    
    var array=[];
    var column=[];
    for(var i=0; i<rows; i++) { 
        for(var j=0; j<columns; j++) {
            column.push(number);  
            number++;
        }
        array.push(column);
        column=[];
    }
    return array;
}
var tab = create2DArray(3,3);
for(var i=0; i<tab.length; i++)
    console.log(tab[i]);

print2DArray(create2DArray(3,3));
