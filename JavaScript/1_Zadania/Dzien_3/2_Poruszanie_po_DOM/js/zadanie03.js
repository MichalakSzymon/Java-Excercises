document.addEventListener("DOMContentLoaded", function(e) {
	var buttons = document.getElementsByClassName('button');
	Array.prototype.forEach.call(buttons, function (button) {
		button.addEventListener('click', function() {
				var randomColor = "#" + Math.floor(Math.random()*16777215).toString(16);
				var parent = this.parentElement;
				parent.style.backgroundColor = randomColor;
		});
	});	
})
