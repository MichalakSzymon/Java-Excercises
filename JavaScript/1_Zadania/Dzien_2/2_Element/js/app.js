/**
 * Created by Jacek on 2016-01-11.
 */

document.addEventListener("DOMContentLoaded", function(){
    var homeElement = document.getElementById("home");
    var childElements = document.querySelector(".oferts").children;
    var banner = document.querySelector(".ban");
    var blocks = document.querySelectorAll(".block");
    var links = document.querySelector(".links").children;

    /*
    Poniżej napisz kod rozwiązujący zadania
     */
	/* 
	  zadanie 1
	 */
		
		
	 var homeElementClass = homeElement.className,
		 homeElementId = homeElement.id;
	 homeElement.id = homeElementClass;
	 homeElement.class = homeElementId;
		 
	console.log(homeElement + ": " + typeof homeElement);
	for(var i=0; i<childElements.length; i++)
		console.log(childElements[i] + ": " + typeof childElements[i]);
	console.log(banner + ": " + typeof(banner));
	for(var i=0; i<blocks.length; i++)
		console.log(blocks[i] + ": " + typeof blocks[i]);
	for(var i=0; i<links.length; i++)
		console.log(links[i] + ": " + typeof links[i]);


// zadanie 3		
for(var i=0; i<blocks.length; i++) {
	console.log(blocks[i].innerHTML);
	console.log(blocks[i].outerHTML);
}

for(var i=0; i<blocks.length; i++) 
		blocks[i].innerHTML = "Nowa wartość diva o klasie blocks";

for(var i=0; i<blocks.length; i++)
	console.log(blocks[i].innerHTML);

// zadanie 4
console.log(homeElement.id);

// zadanie 5
for(var i=0; i<childElements.length; i++)
	console.log(childElements[i].tagName)

// zadanie 6
for(var i=0; i<links.length; i++)
	console.log(links[i].dataset);
	
// zadanie 7
console.log(banner.classList);
console.log(typeof banner.classList);
console.log(banner.className);
console.log(typeof banner.className);


});
