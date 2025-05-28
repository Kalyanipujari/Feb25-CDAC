
function calculate_result()
{
    Student_name = document.getElementById('name').value;
    Student_roll = document.getElementById('rollno').value;
    mark1=parseInt(document.getElementById('marks1').value);
    mark2=parseInt(document.getElementById('marks2').value);
    mark3=parseInt(document.getElementById('marks3').value);
    mark4=parseInt(document.getElementById('marks4').value);
    mark5=parseInt(document.getElementById('marks5').value);
    para_tag = document.getElementsByTagName('p');
    para = document.getElementById('para');
    const pattern = /^[a-zA-Z\s]+$/;
    if(Student_name == "" || Student_roll=="" || Student_roll == 0 || !pattern.test(Student_name))
    {
        alert("Please Enter Name & roll No");
    }
    else if (
        mark1 < 1 || mark1 > 100 ||
        mark2 < 1 || mark2 > 100 ||
        mark3 < 1 || mark3 > 100 ||
        mark4 < 1 || mark4 > 100 ||
        mark5 < 1 || mark5 > 100
      ) 
    {
        alert("Please enter all the values between 1 and 100");
    }
    else {
        average = (mark1+mark2+mark3+mark4+mark5)/5;
        if(average>=90){
            para.style.backgroundColor = "green";
            para.style.color = "white";
            para.innerHTML = 'Conratulations!! Its : Grade A';
        }
        else if(average>=75)
        {
            para.style.backgroundColor = "green";
            para.style.color = "white";
            para.innerHTML = 'Grade B';
        }
        else if(average>=50)
        {
            para.style.backgroundColor = "green";
            para.style.color = "white";
            para.innerHTML = 'Grade C';
        }
        else{
            para.style.backgroundColor = "red";
            para.style.color = "white";
            para.innerHTML = 'Fail';
        }
    }
   
}
function customreset(){
    document.getElementById('para').innerHTML = "";
    document.getElementById('para').style.backgroundColor = "";
    document.getElementById('para').style.color = "";
}