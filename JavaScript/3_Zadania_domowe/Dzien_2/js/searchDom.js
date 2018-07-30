// 1.

var element = document.getElementById("menu");

function getDataInfo(element) {
	return Array.from(element.children).map( el => el.dataset.info);
}

console.log(getDataInfo(element));


// 2.

var main = document.getElementById("main-contener");

function getElementClass(element) {	
	return Array.from(element.classList);
}

console.log(getElementClass(main)); 

// 3.

var pink = document.getElementsByClassName("pink-color")[0];

function getElementText(element) {
	return element.innerText;
}

console.log(getElementText(pink));

// 4.

var images = Array.from(document.getElementsByClassName("images"));

function getElementAlt(element) {
	return element.map( el => el.getAttribute("alt"));
}

console.log(getElementAlt(images));

// 5.

var link = Array.from(document.getElementsByClassName("my-link"));

function getElementHref(element) {
	return element.map( el => el.getAttribute("href"));
}

console.log(getElementHref(link));
