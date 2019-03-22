$(document).ready(function() {

    var submit = false;
    var firstName = null;

    $('.sign-up-form').submit(function(event) {
        event.preventDefault();

        firstName = $.trim($('#InputFirstName').val());
        var lastName = $.trim($('#InputLastName').val());
        var emailAddress = $.trim($('#InputEmailAddress').val());
        var password = $.trim($('#InputPassword').val());

        if(!firstName || firstName=="First Name") {
          alert('Please enter your first name');
          return false;
        };

        if(!lastName || lastName=='Last Name') {
          alert('Please enter your Last name');
          return false;
        };

         if(!emailAddress || emailAddress=='Email Address') {
          alert('Please enter your email address');
          return false;
         };

         if(!password || password=='Password') {
            alert('Please enter your password');
            return false;
         };

        $.post("http://localhost:8080/users",
              {"firstName": firstName, "lastName": lastName, "emailAddress": emailAddress, "password": password},
               "json")
        submit = true;
        confirm_and_redirect();

    });

    function confirm_and_redirect(){
        if (submit){
          window.location = "/spaces";
          $('#welcomeUsername').text(`Welcome, ${firstName}`);
        };
        return true;
    };

})