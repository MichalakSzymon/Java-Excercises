document.addEventListener("DOMContentLoaded", function(e) {
	var listContainer = document.getElementsByClassName('listContainer');
	Array.prototype.forEach.call(listContainer, function (el) {
		el.addEventListener('mouseover', function (event) {
			this.classList.add('hovered');
			var li = this.getElementsByTagName('li');
			Array.prototype.forEach.call(li, function(v,k) {
				if(k==0) {
					v.style.backgroundColor='red';
				}
				else if(k==li.length-1) {
					v.style.backgroundColor='blue';
				}
				else 
					v.style.backgroundColor='green';
			});
		});
	});
})
