document.addEventListener("DOMContentLoaded", function(e) {
	var buttons = document.getElementsByClassName('deleteBtn');
	Array.prototype.forEach.call(buttons, function(button) {
		button.addEventListener ('click', function () {
		var row = button.parentElement.parentElement,
			table = row.parentElement;
		table.removeChild(row);
	});
	});
});
