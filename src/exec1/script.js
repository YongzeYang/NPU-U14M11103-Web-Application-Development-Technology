$(document).ready(function(){
    $("#submit-button").click(function () {
        get_contact_form_info();
    });
});
function get_contact_form_info(){
    var email = $("#email").val();
    var message = $("#message").val();
    alert("Your email is " + email + " and your message is " + message);
}