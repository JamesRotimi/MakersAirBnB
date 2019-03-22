$(document).ready(function() {

  $.get(
        "http://localhost:8080/listOfSpaces",
        function(response) {
            console.log(response);
            const spaces = $('#spaces');
            response.forEach(function(space) {
                spaces.append(`
                   <div class="col-md-4">
                     <div class="card mb-4 box-shadow">
                         <img class="card-img-top" data-src="holder.js/100px225?theme=thumb&bg=55595c&fg=eceeef&text=Thumbnail" alt="Card image cap">
                         <div class="card-body" id=>
                             <div id="title">Title: ${space.title}</div>
                             <div id="location">Location: ${space.location}</div>
                             <p class="card-text">${space.description}</p>
                             <div class="d-flex justify-content-between align-items-center">
                             <div class="btn-group">
                                 <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                                 <button type="button" class="btn btn-sm btn-outline-secondary">Book</button>
                             </div>
                          </div>
                     </div>
                   </div>`
                );
            })
         },
        'json'
    );

});