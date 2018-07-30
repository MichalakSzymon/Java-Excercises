document.addEventListener("DOMContentLoaded", function () {
	var button = document.querySelectorAll("button");
	var count = document.querySelectorAll(".counter");
	for (var i=0; i<button.length; i++) {
	button[i].addEventListener("click", function (e) {
			count[i].innerText = parseInt(count[i].innerText)+1;		
	});
}
})
