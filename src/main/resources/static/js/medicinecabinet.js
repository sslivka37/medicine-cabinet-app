console.log("start");
var medtimes = document.querySelectorAll(".frequencyCheck");

function hideTimes() {
  medtimes.forEach(m => {
    if (m.innerText === "weekly") {
      m.parentNode.style.display = "none";
      console.log("hidden");
    }
  });
}
hideTimes();    
   


function showIfDaily() {
  if (medicationFrequency.innerText() === "daily") {
    medicationToShowToday.style.display = "block";
    alert(test);
  } else {
    medicationToShowToday.style.display = "none";
  }
}

function showIfEveryFourHours() {
  if (medicationFrequency.innerText() === "Every 4 Hours") {
    medicationToShowToday.style.display = "block";
  } else {
    medicationToShowToday.style.display = "none";
  }
}

function showIfEveryEightHours() {
  if (medicationFrequency === "Every 8 Hours") {
    medicationToShowToday.style.display = "block";
  } else {
    medicationToShowToday.style.display = "none";
  }
}

function showIfEveryTwelveHours() {
  if (medicationFrequency === "Every 12 Hours") {
    medicationToShowToday.style.display = "block";
  } else {
    medicationToShowToday.style.display = "none";
  }
}


//functions for weekly, build out one for every day?

//if mediction frequency is weekly- monday, and today is monday, show medication......tues, weds, thurs, fri, sat, sun...

//function showIfDayOfWeekMatchesToday(){
//	if(medicationFrequency ===)
//}
