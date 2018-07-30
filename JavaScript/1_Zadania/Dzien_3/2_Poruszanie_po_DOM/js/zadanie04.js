document.addEventListener("DOMContentLoaded", function(e) {
	var first = document.getElementsByClassName('first')[0];
	var zmiennaFirst1 = first.firstElementChild,
		zmiennaFirst2 = first.children[2],
	second = document.getElementById('second'),
		zmiennaSecond1 = second.parentElement,
		zmiennaSecond2 = second.children[3],
		third = document.querySelector('[data-ex="third"]')
		zmiennaThird1 =  third.parentElement.parentElement;
		zmiennaThird2 = third.lastElementChild,
		zmiennaThird3 = third.firstElementChild,
		zmiennaThird4 = third.children[third.children.length/2-1],
		forth = document.querySelector('div [class=forth]'),
		zmiennaForth1 = forth.parentElement,
		forthArticle = forth.children.querySelector('#article'),
		zmiennaForth2 = forthArticle[0],
		zmiennaForth3 =  forth.children.querySelector('p')[1];
})
