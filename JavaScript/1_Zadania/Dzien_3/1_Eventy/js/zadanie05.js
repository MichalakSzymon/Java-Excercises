document.addEventListener("DOMContentLoaded", function () {
	var buttons = document.querySelectorAll("button");
	for (var i=0; i<buttons.length; i++) {
		buttons[i].addEventListener("click", function (e) {
			var count = document.querySelector(".counter");
			count.innerText = parseInt(count.innerText)+1;
	});
}
})
