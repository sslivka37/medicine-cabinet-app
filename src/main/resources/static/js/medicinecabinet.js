function myFunction() {
  document.getElementById("myDropdown").classList.toggle("show");
}

window.onclick = function(event) {
  if (!event.target.matches(".dropbtn")) {
    var dropdowns = document.getElementsByClassName("dropdown-content");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains("show")) {
        openDropdown.classList.remove("show");
      }
    }
  }
};

//window.onclick = function(event) {
   // if (event.target.classList.contains('dropbtn')) {
    //    document.querySelector(".dropdown-content").classList.toggle('show')
   // }
//}



 // var listOfMedications = [[${medications}]];
 //    var medicationToShowToday = document.getElementById("eachMedicationForToday");
 //    var medicationFrequency = document.getElementById("frequencyCheck");

  




//function to show daily medications in medication for today template
//var listOfMedications = [[${medications}]]
//var medicationToShowToday = document.getElementById("eachMedicationForToday");
//var medicationFrequency = document.getElementById("frequencyCheck");




    
   
        

// function showIfDaily(){
// 	 for (i = 0; i < listofMedications.length; i++){	
// 		if (medicationFrequency.innerText(); === "daily"){
// 			medicationToShowToday.style.display ="block";
// 			alert(test);
// 		} else {
// 			medicationToShowToday.style.display ="none";
// 		}
// }}


// function showIfEveryFourHours(){
// 	if (medicationFrequency.innerText() ==="Every 4 Hours"){
// 		medicationToShowToday.style.display = "block";
// 	}else{
// 		medicationToShowToday.style.display = "none";
// 	}
// }


// function showIfEveryEightHours(){
// 	if(medicationFrequency === "Every 8 Hours"){
// 		medicationToShowToday.style.display = "block";
// 	} else {
// 		medicationToShowToday.style.display = "none";
// 	}
// }

// function showIfEveryTwelveHours(){
// 	if(medicationFrequency === "Every 12 Hours"){
// 		medicationToShowToday.style.display = "block";
// 	} else {
// 		medicationToShowToday.style.display = "none";
// 	}
// }

//functions for weekly, build out one for every day?

//if mediction frequency is weekly- monday, and today is monday, show medication......tues, weds, thurs, fri, sat, sun...

//function showIfDayOfWeekMatchesToday(){
//	if(medicationFrequency ===)
//}