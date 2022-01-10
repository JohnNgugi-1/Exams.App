



function getScore(form) {
	var numChoi = 4;
var hey = document.getElementsByClassName("questions");
var h;
var kala = document.getElementsByClassName("y");
for(v=0;v<kala.length;v++){
	kala[v].style.backgroundColor = "yellow";
}
if(hey.length >= 90){
	h = 90;
}else{
	h = hey.length;
}


  var correct = 0;
  var currElt;
  var currSelection;
 document.getElementById("after_submit").style.visibility = "visible"; 
  for (i=0; i<hey.length; i++) {
    currElt = i*numChoi;
    for (j=0; j<numChoi; j++) {
      currSelection = form.elements[currElt + j];
      if (currSelection.checked) {
        if (currSelection.value == "j") {
          correct++;
          break;
        }
      }
    }
  }
  var texts = ["Outstanding", "Excellent", "Very Good", "Good", "Good", "Pass", "Fair", "Try Harder", "Try Harder", "Poor", "Very Poor", "Fail"];
	var messages = ["Grade A", "Grade A-", "Grade B+", "Grade B", "Grade B-", "Grade C+", "Grade C", "Grade C-", "Grade D+", "Grade D", "Grade D-", "Grade E"];
	var score;

	if (correct >= 40) {
		score = 0;
	}

	if (correct > 37 && correct < 40) {
		score = 1;
	}
if (correct >= 35 && correct <= 37) {
		score = 2;
	}
if (correct > 32 && correct < 35) {
		score = 3;
	}
if (correct >= 30 && correct <= 32) {
		score = 4;
	}
if (correct > 27 && correct < 30) {
		score = 5;
	}
if (correct >= 25 && correct <= 27) {
		score = 6;
	}
if (correct > 22 && correct < 25) {
		score = 7;
	}
if (correct >= 20 && correct <= 22) {
		score = 8;
	}
if (correct > 17 && correct < 20) {
		score = 9;
	}
if (correct >= 15 && correct <= 17) {
		score = 10;
	}
if (correct >= 0 && correct < 15) {
		score = 11;
	}

  document.getElementById("number_correct").innerHTML = "You got " + correct + " out of "+h+" correct";
  correct = Math.round(correct/h*100);
  document.getElementById("percentage").innerHTML = "Marks " + correct + "%";
  
  document.getElementById("text").innerHTML = texts[score];
  document.getElementById("message").innerHTML = messages[score];
  
}
