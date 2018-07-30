document.addEventListener("DOMContentLoaded", function(e) {
	var addButton = document.getElementById('addBtn');
	var ordersTable = document.querySelector('#orders tbody');
	
	addButton.addEventListener('click', function () {
		var orderId = document.getElementById('orderId').value;
		var item = document.getElementById('item').value;
		var quantity = document.getElementById('quantity').value;
		var row = ordersTable.lastElementChild.cloneNode(true);
		row.children[0].innerText = orderId;
		row.children[1].innerText = item;
		row.children[2].innerText = quantity;
		
		ordersTable.appendChild(row);
		
	})
})
