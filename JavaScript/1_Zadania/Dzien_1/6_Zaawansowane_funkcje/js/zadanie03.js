/**
 * Funkcje wyższego rzędu.
 * Prześledź krok po kroku każdą linijkę kodu. Każdą!
 * Spróbuj napisać komentarze dla każdej z linijek kodu
 */

//deklaracja funkcji sortującej tablicę
function sortArray() {

    //deklaracja tablicy
    var points = [41, 3, 6, 1, 114, 54, 64];

    //funkcja sortująca
    points.sort(function(a, b) {
        //
        return a-b;
    });

   // zwraca posortowaną tablicą
    return points;
}

//wywołanie funkcji
sortArray();

console.log(sortArray());
