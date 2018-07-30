document.addEventListener("DOMContentLoaded", function () {
	var divs = document.querySelectorAll("div");
	for (var i=0; i<divs.length; i++) {
		divs[i].addEventListener("click", function (e) {
			var randomColor = "#" + Math.floor(Math.random()*16777215).toString(16);
			this.style.backgroundColor = randomColor;
	});
}
})
