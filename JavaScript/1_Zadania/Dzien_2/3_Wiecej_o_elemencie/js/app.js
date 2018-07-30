/**
 * Created by Jacek on 2016-01-11.
 */

document.addEventListener("DOMContentLoaded", function() {
    /*
    Poniżej napisz kod rozwiązujący zadania
     */
	function zadanie1 () {
		var listElements = document.querySelectorAll(".ex1 li");
		Array.prototype.forEach.call(listElements, function (el, key) {
		if(typeof el.dataset.direction==='undefined')
			el.dataset.direction = "top";
		if(key%2==0) {
			el.style.backgroundColor="green";
		}
		if(key===4) {
			el.classList.add("big");
		}
		if(key%3==0) {
//			el.style.decoration.Underline;
		}
	})	
	}
	zadanie1();
	
	function zadanie2 () {
		var options = document.querySelectorAll(".ex2 option");
		Array.prototype.forEach.call(options, function(el) {
			var value = el.getAttribute('value');
			el.innerText = value;
			el.dataset.year = parseInt(value) + 20;
		});
	}
	zadanie2();
	
/*	function zadanie3 () {
	var ex3 = document.querySelectorAll('.ex3 > div');
	Array.prototype.forEach.call(ex3, function(el) {
	var className = el.getElementsByTagName("div")[0].className;
	switch (className) {
		case 'chrome':
			el.getElementsByTagName('a')[0].innerText = 'Chrome';
			break;
		case 'edge':
			el.getElementsByTagName('a')[0].setAttribute('href', 'www.microsoft.com');
			el.getElementsByClassName('edge')[0].style.backgroundImage = "url(assets/img/edge.png");
			break;
	}
	});
	}
	zadanie3();
*/	
	
	function zadanie4 () {
		var span = document.querySelectorAll(".ex4 span");
		Array.prototype.forEach.call(span, function(sp) {
			if(sp.id==="name") sp.innerText="A.K";
			if(sp.id==="fav_color") sp.innerText="black";	
			if(sp.id==="fav_meal") sp.innerText="people";
		});
	}
	zadanie4();
	
	function zadanie5 () {
		var list = document.querySelector(".ex5 ul");
		var listChildren = list.children;
		list.classList.add("menu");
		Array.prototype.forEach.call(listChildren, function(el) {
		 el.classList.remove("error");
		 el.classList.add("menuElement");
		});
		var li = document.querySelectorAll(".ex5 li");
		for(var i=0; i<li.length; i++) {
			if(!li[i].hasAttribute("class"))
				li[i].setAttribute("class", "menuElement");
		}
	}	
	zadanie5();

	function zadanie6 () {
		var list = document.querySelectorAll (".ex6 ul li");
		Array.prototype.forEach.call(list, function(el, key) {
//			el.dataset.id = key+1;
			el.setAttribute ("data-id", key+1);
		}
		);
	}
	zadanie6();
});
