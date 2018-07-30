function mathInfo() {
    var randomNumber = Math.floor(Math.random() * 100);
    //poniżej napisz rozwiązanie zadania
    if(randomNumber%2==0) console.log(randomNumber + ': Liczba jest parzysta')
    else console.log(randomNumber + ': Liczba jest nieparzysta');
    console.log('Dzielniki liczby: ');
    var result="";
    for(var i=0; i<=randomNumber; i++)
        if(randomNumber%i==0) result=result+ i + ", ";
    console.log(result);
    console.log(Math.pow(randomNumber, randomNumber%5));
}

//to wywołanie ma spowodować wyświetlenie w konsoli informacji z zadania
mathInfo();
