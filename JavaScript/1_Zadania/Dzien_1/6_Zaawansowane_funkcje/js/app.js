/**
 * Created by Agata on 21.01.2016.
 */



var id = setInterval(function() {
    console.log('jestem wywoływana co dwie sekundy');
}, 2000
)


clearInterval(id)

function boilEgg (sec) {
	var ms = sec * 1000;
	var interval = setInterval(function () {
		console.log('jajko się gotuje');	
	}, 5000);
	var timeout = setTimeout(function() {
		clearInterval(interval);
		console.log('jajko się ugotowało');
	}, ms);
	
}

boilEgg(30);

function max () {
	var maximum = arguments[0];
	for(var i=0; i<arguments.length; i++)
		if(arguments[i]>maximum) maximum = arguments[i];
	return maximum;
}

console.log(max(5, 29, 6, 4, 34, 56, 2, 3));
