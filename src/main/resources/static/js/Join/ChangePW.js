$("#password").on("keyup",function() {
    if ($("#password").val() == "") {
        $("#ppassword").html("비밀번호를 입력해주세요.")
        $("#password").css("borderColor", "#f66")
        $("#password").focus();
        return false;
    }
    else if ($("#password").val().length < 10 || $("#password").val().length > 20) {
        $("#ppassword").html("10자리 이상 20자리 이하로 입력해주세요.")
        $("#password").css("borderColor", "#f66")
        $("#password").focus();
        return false;
    }

    else {
        $("#ppassword").html("")
        $("#password").css("borderColor", "rgba(0, 0, 0, 0.08)")
        return false;
    }
});

$("#passwordcheck").on("keyup",function() {
    if ($("#passwordcheck").val() == "") {
        $("#ppasswordcheck").html("비밀번호를 입력해주세요.")
        $("#passwordcheck").css("borderColor", "#f66")
        $("#passwordcheck").focus();
        return false;
    }
    else if ($("#passwordcheck").val() != $("#password").val()) {
        $("#ppasswordcheck").html("비밀번호가 다릅니다.")
        $("#passwordcheck").css("borderColor", "#f66")
        $("#passwordcheck").focus();
        return false;
    }

    else {
        $("#ppasswordcheck").html("")
        $("#passwordcheck").css("borderColor", "rgba(0, 0, 0, 0.08)")
        return false;
    }
});