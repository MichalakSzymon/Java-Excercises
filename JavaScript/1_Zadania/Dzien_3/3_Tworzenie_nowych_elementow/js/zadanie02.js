document.addEventListener("DOMContentLoaded", function(e) {
	var button = document.querySelector('a.button');
	var list = document.querySelector('ul.menu');
	button.addEventListener('click', function () {
		var countlist = list.children.length,
		element = document.createElement('li');
		element.innerText = "Element " + (countlist+1) + " - w chwili dodania było "+ countlist + " elementów";
		list.appendChild(element);
	});

})
