/**
 * 
 */

function show(){
	var obj=new Date;
	var res="";
	res += "Today's date " + obj.getDate() + "<br/>";
	var month=obj.getMonth();
	month+=1;
	res +="Month is "+ month + "<br/>";
	res += "Year is  " + obj.getFullYear() + "<br/>";
	res += "Hours  " + obj.getHours() + "<br/>";
	res += "Minutes " + obj.getMinutes() + "<br/>";
	res += "Seconds " + obj.getSeconds() + "<br/>";
	document.getElementById("res").innerHTML=res;
	
	
}