
// URLs to APIs


const fetchUrl = "http://localhost:8080/stuff";





// while we can use the onclick in the button to call a function
// we can also make an event by getting the tag we can and adding an event to it
// this can be done on pretty much any html tag
// https://www.w3schools.com/jsref/met_element_addeventlistener.asp

document.getElementById("Fetcher").addEventListener("click", function() {
	
	/* fetch is a way to get data from outside the current code and site

	*/
	fetch(fetchUrl).then(response => response.text()).then(data => useTheData(data));
});
// you can read more about it here
//https://developer.mozilla.org/en-US/docs/Web/API/Fetch_API/Using_Fetch



// This is just a normal function that has an argument 
function useTheData(data) {
	// lets print the data we just sent here.
	console.log(data);
	
	
//add into the html tag. 
	document.getElementById("stuffPlace").innerHTML=data;
}

