function calculateTip(amount, raiting) {
    switch(raiting) {
        case "Very good service":
            return amount*0.25;
        case "Good service":
            return amount*0.2;
        case "Neutral service":
            return amount*0.15;
        case "Bad service":
            return 0;
        default: 
            return "Opis nieczytelny";
    }
}

console.log(calculateTip(100, "nieźle")); 
console.log(calculateTip(100, "Bad service")); 
console.log(calculateTip(100, "Very good service")); 


