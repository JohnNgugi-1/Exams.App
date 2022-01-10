var timeInMinutes = 165;
var currentTime = Date.parse(new Date());
var deadline = new Date(currentTime + timeInMinutes*60*1000);
 
 
function getTimeRemaining(endtime){
    var t = Date.parse(endtime) - Date.parse(new Date());
    var seconds = Math.floor( (t/1000) % 60 );
    var minutes = Math.floor( (t/1000/60) % 60 );
    var hours = Math.floor( (t/(1000*60*60)) % 24 );
    return {
        'total': t,
        'hours': hours,
        'minutes': minutes,
        'seconds': seconds
    };
}
 
function initializeClock(id, endtime){
    var clock = document.getElementById(id);
    function updateClock(){
        var t = getTimeRemaining(endtime);
        var hoursSpan = clock.querySelector('.hours');
        var minutesSpan = clock.querySelector('.minutes');
        var secondsSpan = clock.querySelector('.seconds');
        hoursSpan.innerHTML = t.hours;
        minutesSpan.innerHTML = t.minutes;
        secondsSpan.innerHTML = ('0' + t.seconds).slice(-2);
        if(t.total<=0){
		 
       clearInterval(timeinterval);
	    Android.playAudio("Time is up!");
            
        }
 
    }
 
    updateClock(); // run function once at first to avoid delay
    var timeinterval = setInterval(updateClock,1000);
}
 
initializeClock('clockdiv', deadline);
