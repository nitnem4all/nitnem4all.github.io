window.addEventListener("DOMContentLoaded" ,function(){
//get the form elements defined in your html above::

var form = document.getElementById("my-form");
// var button = document.getElementById("my-form-button");
var status = document.getElementById("status");

//success and error functions::
function success(){
    form.reset();
    status.classList.add('success');
    status.innerHTML = "Thanks! We Will Be In Touch With You Soon..";
}

function error(){
    form.reset();
    status.classList.add('error');
    status.innerHTML = "Oops! There Was A Problem! Please Try Again Later..";
}
// Handle The Form Submission Event::

form.addEventListener("submit", function(ev) {
    ev.preventDefault();
    var data= new FormData(form);
    ajax(form.method , form.action , data , success , error);
} );
} );

//Helper Function for sending form request::

function ajax(method, url, data, success, error){
    var xhr = new XMLHttpRequest();
    xhr.open(method, url);
    xhr.setRequestHeader("Accept","apllication/json");
    xhr.onreadystatechange = function() {
        if(xhr.readyState !== XMLHttpRequest.DONE) return;
        if(xhr.status === 200){
            success(xhr.response , xhr.responseType);
        }
        else{
            error(xhr.status , xhr.response , xhr.responseType);
        }
    };
    xhr.send(data);
}