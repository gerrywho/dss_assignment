$('#newUser').click(function() {

    var $username = $('#login').val();
    var $pwd = $('#password').val();
    alert($username + $pwd);

    var valid = validate($username, $pwd);
    if (valid) {
        $.ajax({
            type: 'POST',
            url: 'rest/users/addUser',
            contentType: 'application/json',
            data: JSON.stringify({
                "username": $username,
                "password": $pwd,
            }),
            async: false,

            success: function() {

                //$("#error").text("User added ");
                alert("User added");
               window.location.href="http://localhost:8080/HibernateTut-0.0.1-SNAPSHOT/index.html";
            },
            error: function() {

                //$("#error").text("This user already exists");
                alert("This user already exists");

            }
        });
    }

});

function validate(username, password) {

    //username
    var valid = true;
    if (username.length < 4) {
        alert("Username not valid");
        valid = false;
    }

    //password
    if (password.length < 6) {
        alert("Password should have at least 6 characters");
        valid = false;
    }

    if (!valid) {
        return false;
    }

    return true;

}