function circle (r) {
    if (typeof r !== "number") {
        return false;            
    }
    var pi=3.14;
    var obwod = 2* pi * r;
    var pole = pi*r*r;
    return "obwod: " + obwod + ", pole: " + pole;
}

console.log(circle('a'));
console.log(circle(3));
