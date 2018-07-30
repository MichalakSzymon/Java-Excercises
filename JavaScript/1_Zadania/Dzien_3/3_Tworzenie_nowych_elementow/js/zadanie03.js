document.addEventListener("DOMContentLoaded", function(e) {
	var button = document.querySelector('#remove');
	button.addEventListener('click', function () {
		button.parentElement.removeChild(button);
	});

})

