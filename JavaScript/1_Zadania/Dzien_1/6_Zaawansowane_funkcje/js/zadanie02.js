/**
 * Zagnieżdżanie funkcji.
 * Prześledź krok po kroku każdą linijkę kodu. Każdą!
 * Spróbuj napisać komentarze dla każdej z linijek kodu
 */


// deklaracja funkcji nadrzędnej
function jeden() {

    //deklaracja zmiennej
    var zmienna1 = 1;

    //deklaracja funkcji podrzędnej
    function dwa() {

        //wydrukowanie zmiennej z funkcji nadrzędnej (można)
        console.log(zmienna1);

        // deklaracja zmiennej w funkcji podrzędnej
        var zmienna2 = 3;
    }

    //wywołanie funkcji podrzędnej
    dwa();

    //próba wydrukowania zmiennej z funkcji podrzędnej poza nią (w funkcji nadrzednej) (nie można)
    console.log(zmienna2)
}

//Wywołanie funkcji nadrzednej
jeden()
