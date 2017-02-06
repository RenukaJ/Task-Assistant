function processUrl() {
    var longURL = $("#longUrlId").val();
    debugger;
    $.ajax({
//    url: "${createLink(controller: 'URL', action: 'shortenUrl')}",
        url: appContext + '/task/shortenUrl', //http://localhost:8080/TaskManager/task/shortenUrl
        data: {'longURL': longURL},
        type: 'POST',
        success: function (data) {

            $("#shortUrlId").val(data.shortUrl);
//        var a = document.getElementById("shortUrlId");
//        a.value = data.shortURL;
            //alert(data.shortUrl);
        }
    });
}

function shareUrl() {
    var longURL = window.location.href;
    debugger;
    $.ajax({
//    url: "${createLink(controller: 'URL', action: 'shortenUrl')}",
        url: appContext + '/task/shortenUrl', //http://localhost:8080/TaskManager/task/shortenUrl   
        data: {'longURL': longURL},
        type: 'POST',
        success: function (data) {

            $("#shareUrlId").val(data.shortUrl);
//        var a = document.getElementById("shortUrlId");
//        a.value = data.shortURL;
            //alert(data.shortUrl);
        }
    });
}





function callUrl() {
    debugger;
    $.ajax({
//    url: "${createLink(controller: 'URL', action: 'shortenUrl')}",
        //url: appContext + '/task/callFromUrl',//http://localhost:8080/TaskManager/task/shortenUrl

        type: 'POST',
        data: {},
//        url: "${createLink(action:'callFromUrl', controller:'Task')}/"
        url: appContext + '/page/callFromUrl', //http://localhost:8080/TaskManager/task/shortenUrl
        success: function (data) {
        }
    });
}


function callTask() {
    debugger;
    $.ajax({
//    url: "${createLink(controller: 'URL', action: 'shortenUrl')}",
        //url: appContext + '/task/callFromUrl',//http://localhost:8080/TaskManager/task/shortenUrl

        type: 'POST',
        data: {},
//        url: "${createLink(action:'callFromUrl', controller:'Task')}/"
        url: appContext + '/page/callFromTask', //http://localhost:8080/TaskManager/task/shortenUrl
        success: function (data) {
        }
    });
}

//$("#submitId").click(function () {
//    debugger;
//    alert("in submitId click function");
//    //e.processUrl();
//    var val = $("#longUrlId").val();
//    $('#tbl_id').append('<tr><td>' + val + '</td></tr>');
//});
function processUrlTable() {
    var longURL = $("#longUrlId").val();
    debugger;
    $.ajax({
//    url: "${createLink(controller: 'URL', action: 'shortenUrl')}",
        url: appContext + '/task/shortenUrl', //http://localhost:8080/TaskManager/task/shortenUrl
        data: {'longURL': longURL},
        type: 'POST',
        success: function (data) {

            $("#shortUrlId").val(data.shortUrl);
//        var a = document.getElementById("shortUrlId");
//        a.value = data.shortURL;
            //alert(data.shortUrl);
            var val1 = $("#longUrlId").val();
            var val2 = $("#shortUrlId").val();
            $('#tbl_id').append('<tr><td>' + val1 + '</td><td>' + val2 + '</td></tr>');
            $("#longUrlId").val("");
            $("#shortUrlId").val("");
        }
    });


}