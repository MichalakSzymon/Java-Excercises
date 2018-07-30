document.addEventListener("DOMContentLoaded", function(e) {
	var buttons = document.getElementsByClassName('moveBtn');
	var list1 = document.getElementById('list1');
	var list2 = document.getElementById('list2'); 
	Array.prototype.forEach.call(buttons, function (button) {
		button.addEventListener('click', function () {
			var element = this.parentElement,
				listId = element.parentElement.id,
				newElement = element.cloneNode(true);
			if(listId === 'list1') {
				list2.appendChild(newElement);
			} else {
				list1.appendChild(newElement);
			}
			element.parentElement.removeChild(element);
	});
});
})
