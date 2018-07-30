
document.addEventListener("DOMContentLoaded", function(e) {
	var button = document.querySelector('#remove');
	var list = document.getElementsByClassName('list')[0];
	button.addEventListener('click', function () {
		
		Array.prototype.forEach.call(list.children, function (child) {
//			Array.prototype.forEach.call(list.children, function (child) {
//				list.removeChild(child);
			list.innerHTML = "";
//		});
	});
			
	});

})

