String.prototype.upperLower = function () {
    var result = "";
    var k=1;
    for(var i=0; i<this.length; i++) {
        if (this[i]!="") { 
            k++;
            if( k%2 === 0) {
                result+=this[i].toUpperCase();        
            }       
            else {
                result+=this[i].toLowerCase();
            }
        }
        else {
            result +=" ";
        }
    }
    return result;
}


console.log("Smi esznie".upperLower());


var Car = function (color, type) {
    this.color=color;
    this.type=type;
    this.km=0;
};

Car.prototype.printCarInfo = function () {
    console.log("Typ auta: " + this.type + ", kolor: " + this.color + " Licznik:" + this.km)
};


Car.prototype.drive = function (km) {
    this.km+=km;
};

var seat = new Car ('white', 'Leon');
seat.printCarInfo();
    

Car.prototype.dateCheck = [];

Car.prototype.addDateCheck = function(date) {
    this.dateCheck.push(date);
}

Car.prototype.printDateCheck = function() {
   for(var i=0; i<=this.dateCheck.length; i++) {
    }
}

seat.addDateCheck("dzisiaj");
seat.printDateCheck;



var Rectangle = function (width, height) {
this.width=width;
this.height=height;
}

Rectangle.prototype.getArea = function() {
    return this.width*this.height;
}


Rectangle.prototype.getPerimiter = function() {
    return this.width*2+this.height*2;
}


var kwadrat = new Rectangle (3,3);
console.log(kwadrat.getArea());
console.log(kwadrat.getPerimiter());


var Calculator = function () {

}

Calculator.prototype.array = [];

Calculator.prototype.add = function (num1, num2) {
	var result= num1+num2
	this.array.push("added " + num1 + " to " + num2 + " got " + result);
	return result;
}

Calculator.prototype.multiply = function (num1, num2) {
	var result= num1*num2
	this.array.push("multiplied " + num1 + " with " + num2 + " got " + result);
	return result;
}
Calculator.prototype.subtract = function (num1, num2) {
	var result= num1-num2
	this.array.push("subtracted " + num1 + " from " + num2 + " got " + result);
	return result;
}
Calculator.prototype.divide = function (num1, num2) {
	var result= num1/num2
	this.array.push("divided " + num1 + " by " + num2 + " got " + result);
	return result;
}

	
Calculator.prototype.printOperations = function () {
	for(var i=0; i<this.array.length; i++) {
		console.log(this.array[i]);
// this.log.map(function(value, key, array)) {
// console.log(value);
// }
	}
}

Calculator.prototype.clearoperations = function () {
	return this.array=[];
}

var calc = new Calculator ();
calc.add(2,2);
calc.multiply(2,3);
calc.printOperations();
calc.clearoperations();
calc.printOperations();






