function openTab(evt,tabName) {
    var i, tabContent, tabLinks;
    tabContent = document.getElementsByClassName("tabContent");
    for ( i = 0; i < tabContent.length; i++) {
        tabContent[i].style.display = "none";
    }
    tabLinks = document.getElementsByClassName("tablink");
    for (i = 0; i < tabLinks.length; i++) {
        tabLinks[i].className = tabLinks[i].className.replace(" active", "");
        document.getElementById(tabName).style.display = "block";
       
    }
    evt.currentTarget.className += " active";
}
function validateEmail(email) {
    if (email == "") {
        return false;
    }
    var sp = email.split('@');
    if (sp.length != 2) {
        return false;
    }
    if (sp[0].length < 1) {
        return false;
    }
    if (email.split(" ") > 2) {
        return false;
        
    }
    var dotSplit = sp[1].split('.');
    if (dotSplit.length < 2) {
        return false;
    }
    if (dotSplit[0].length < 1 || dotSplit[1].length < 2 || dotSplit.length > 4) {
        return false;
    }
    return true;
}
//we used regular expression for validation.for [ABCEGHJKLMNPRSTVXY]this means one word from inside the [] \d means we need to have one number ()? means we can put space or not /i this means doesnt matter if its capital word or not
function validatePostal(postal) {
    var regex = new RegExp(/^[ABCEGHJKLMNPRSTVXY]\d[ABCEGHJKLMNPRSTVWXYZ]( )?\d[ABCEGHJKLMNPRSTVWXYZ]\d$/i);
    return regex.test(postal);
}

function RegristerData() {
    var email = document.getElementById("email");
    if (!validateEmail(email.value)) {
        alert("Email is not valid");
        return;
    }
    var password = document.getElementById("password");
    var passwordConfirm = document.getElementById("passwordConfirm");
    if (password.value !== passwordConfirm.value) {
        alert("Password is not match to password confirm");
        return;
    }
    var postalCode = document.getElementById("postCode");
    if (!validatePostal(postalCode.value)) {
        alert("Postal code is invalid");
        return;
    }
    var age =parseInt( document.getElementById("age").value);
    if (age < 1 || age > 100) {
        alert("Your age is not valid");
        return;
    }
    var fName = document.getElementById("firstName").value;
    var lName = document.getElementById("lastName").value;
    var address = document.getElementById("address").value;
    var city = document.getElementById("city").value;
    var province = document.getElementById("province").value;
    if (province === "") {
        alert("Select province please");
        return;
    }
    alert("Your information is: \nfirst name="+fName+"\nlast name="+lName+"\naddress="+address+"\n city="+city+"\npostal code="+postalCode+"\nprovince="+province+"\nage= "+age+"\npassword="+password+"\n email="+email);
}