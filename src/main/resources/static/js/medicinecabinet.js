function myFunction() {
	document.getElementById("myDropdown").classList.toggle("show");
}

window.onclick = function(event) {
	if (!event.target.matches('.dropbtn')) {
		var dropdowns = document.getElementsByClassName("dropdown-content");
		var i;
		for (i = 0; i < dropdowns.length; i++){
			var openDropdown = dropdowns[i];
			if (openDropdown.classList.contains('show')) {
				openDropdown.classList.remove('show');
			}
		}
	}
}

//function to show daily medications in medication for today template
var listOfMedications = [[${medications}]]
var medicationToShowToday = document.getElementById("eachMedicationForToday");
var medicationFrequency = document.getElementById("frequencyCheck");

function showDaily(){
	for(i = 0; i<listOfMedications.length; i++){
	if (medicationFrequency === "daily" || medicationFrequency === "Every 4 Hours" || medicationFrequency ==="Every 8 Hours" || medicationFrequency ==="Every 12 Hours"){
		medicationToShowToday.style.display ="block";
	} else {
		medicationToShowToday.style.display ="none";
	}
}}
