//Co oznaca poniższy kod dowiecie się w dalszej części modułu
document.addEventListener("DOMContentLoaded", function(){
    /*
    Poniżej napisz kod rozwiązujący zadania
     */
     function zadanie1() {
		 var article = document.querySelector("article.first");
		 var h2 = article.getElementsByTagName("h2");
		 console.log("Ilość nagłówków h2: " + h2.length);
		 var oferts = article.getElementsByClassName("oferts");
		 console.log("Ilość ofert: " + oferts.length);
		 for (var i = 0; i<oferts.length; i++) {
			console.log(oferts[i]); 
			};
		var div = article.getElementsByTagName("div");
		console.log("ilość divów: " + div.length);
		for(var i = 0; i<div.length; i++)
			console.log(div[i]);
	 }
	zadanie1();

	function zadanie2 () {
		var element = document.querySelector("nav > ul > li:nth-child(5)");
	}

	zadanie2();
	
	function zadanie3 () {
		var element = document.querySelector("#home");
		var element2 = document.getElementById("home");
		console.log(element);
		var firstli = document.querySelector("li:not([data-direction])");
		console.log(firstli);
		var firstBlock = document.querySelector(".block");
	}
	
	zadanie3();
	
	function zadanie4 () {
		 var li = document.querySelectorAll("nav li");
		 console.log(li.length);
		 var paragraf = document.querySelectorAll("div p");
		 console.log(paragraf.length);
		 var article = document.querySelector("article.first");
		var div = article.getElementsByTagName("div");
		console.log("ilość divów: " + div.length);
	}
	
	zadanie4();
});

	
