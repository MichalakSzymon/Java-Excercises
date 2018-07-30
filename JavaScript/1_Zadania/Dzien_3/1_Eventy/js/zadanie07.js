

document.addEventListener("DOMContentLoaded", function () {
	var box = document.getElementById('box');
	box.addEventListener('mousemove', function(event) {	
	var globalX = document.querySelector("#globalX");
	globalX.innerText=event.clientX;	
	var globalY = document.querySelector("#globalY");
	globalY.innerText=event.clientY;	
	var localX = document.querySelector("#localX");
	localX.innerText=event.screenX;	
	var localY = document.querySelector("#localY");
	localY.innerText=event.screenY;
});
});
