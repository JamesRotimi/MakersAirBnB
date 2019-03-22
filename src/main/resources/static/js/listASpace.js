$(document).ready(function() {

    $('.sign-up-form').submit(function(event) {
        event.preventDefault();

        var title = $.trim($('#InputTitle').val());
        var location = $.trim($('#InputLocation').val());
        var description = $.trim($('#InputDescription').val());
//        var pictureUrl = $.trim($('#pictureUrl').val());

        if(!title || title=="Title") {
          alert('Please enter a title');
          return false;
        };

        if(!location || location=='Location') {
          alert('Please enter a location');
          return false;
        };

         if(!description || description=='Description') {
          alert('Please enter a description');
          return false;
         };

          console.log(title);
          console.log(location);
          console.log(description);

        $.post(
            "http://localhost:8080/spaces",
             {"title": title, "location": location, "description": description},
             function (response) {
                console.log(response);
                window.location = "/spaces"
             },
             "json"
        );
    });

})