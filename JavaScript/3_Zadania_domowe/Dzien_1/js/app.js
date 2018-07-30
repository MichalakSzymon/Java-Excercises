function getNumber(number, tab) {
	var check = false;
	for(var i=0; i<tab.length; i++)
		if(number===tab[i]) check=true;
	return check;

}

console.log(getNumber(2, [33, 54, 2, 1, 4, 100]));// => true
console.log(getNumber(5, [33, 54, 2, 1, 4, 100] ));// => false

function createIdentityMatrix (rows, columns) {
	var array = [];
    for(var i=0; i<rows; i++) {
		array[i]=[];
		for(var j=0; j<columns; j++) {
			if(i!=j) array[i][j]=0;
			else array[i][j]=1;
		}
	}
	return array;
}


var matrix = createIdentityMatrix(4,4);
for(var i=0; i<matrix.length; i++)
 for(var j=0; j<matrix[i].length; j++)
	console.log(matrix[i][j]);

var	Tree = function(type) {
	this.type = type;
	bloom = function () 
	{
		console.log("I'm blooming");
	}
};
	
var	babyGroot =	new	Tree ("humanoid");
console.log(babyGroot.type);
babyGroot.bloom;

console.log(babyGroot.hasOwnProperty(bloom));

function addTheSameNumbers (number, tab) {
	var suma=null;
	for(var i=0; i<tab.length; i++) {
		if(tab[i]===number) suma+=number;
	}
	return suma;
}

console.log(addTheSameNumbers(7, [4, 7, 24, 7, 0, 10]));// => 14
console.log(addTheSameNumbers(9, [33, 54, 2, 1, 9, 100]));// => 9
console.log(addTheSameNumbers(0, [33, 0, 2, 0, 9, 0]));// => 0
console.log(addTheSameNumbers(43, [6, 0, 2, 2, 3, 46]));// => null

function getLastNumbers () {
	var tab=arguments[arguments.length-1];
	var number = 0;
	if(arguments.length>1) number = arguments[0]
	var array = [];
	var j=0;
	for(var i=(tab.length - number); i < tab.length ; i++) {
		array[j]=tab[i];
		j++;	
	}
	return array;
}

console.log(getLastNumbers(2, [1,2,3,4,5,6,7]));// => [6, 7]
console.log(getLastNumbers(4, [6,7,8,10,11,12,13,14,15]));// => [12, 13, 14, 15]
console.log(getLastNumbers([-4,-3,-2,0,1,2,3,4]));// => []
console.log(getLastNumbers('ala', [-4,-3,-2,0,1,2,3,4]));// => []
