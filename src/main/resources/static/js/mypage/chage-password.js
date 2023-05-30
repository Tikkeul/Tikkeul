$(document).ready(function() {
    $("#saveBtn").click(function() {
        // 현재 비밀번호, 새 비밀번호, 새 비밀번호 확인 값을 가져옴
        const oldPassword = $("#oldPassword").val();
        const newPassword = $("#newPassword").val();
        const newPasswordConfirm = $("#newPasswordConfirm").val();
        // 새 비밀번호가 영문, 숫자, 특수문자 조합의 8자 이상인지 확인
        const passwordRegex = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*[!@#$%^&*+=-]).{8,}$/;
        let k1=0;
        let k2=0;



        newPassword.blur(function () {
            if ((newPassword == newPasswordConfirm)) {
                $(".error-text:last-of-type").hide();
                $("#newPassword").css("borderColor", "")
                $("#newPasswordConfirm").css("borderColor", "")
                $("#passwordError").css("color", "")
                k1=1;
                return;
            } else {
                $(".error-text:last-of-type").show();
                $("#newPassword").css("borderColor", "#f66")
                $("#newPasswordConfirm").css("borderColor", "#f66")
                $("#passwordError").css("color", "red")
                k1=0;
                return;

            }

            if (!passwordRegex.test(newPassword)) {
                $("#passwordError").css("color", "red")
                $("#newPassword").css("borderColor", "#f66")
                $("#newPasswordConfirm").css("borderColor", "#f66")
                k2 =0;
                return;
            } else {
                $("#newPassword").css("borderColor",     "")
                $("#newPasswordConfirm").css("borderColor", "")
                k2 =1;
            }
        })

        newPasswordConfirm.blur(function () {
            if ((newPassword == newPasswordConfirm)) {
                $(".error-text:last-of-type").hide();
                $("#newPassword").css("borderColor", "")
                $("#newPasswordConfirm").css("borderColor", "")
                $("#passwordError").css("color", "")
                k1=1;
                return;
            } else {
                $(".error-text:last-of-type").show();
                $("#newPassword").css("borderColor", "#f66")
                $("#newPasswordConfirm").css("borderColor", "#f66")
                $("#passwordError").css("color", "red")
                k1=0;
                return;

            }

            if (!passwordRegex.test(newPassword)) {
                $("#passwordError").css("color", "red")
                $("#newPassword").css("borderColor", "#f66")
                $("#newPasswordConfirm").css("borderColor", "#f66")
                k2 =0;
                return;
            } else {
                $("#newPassword").css("borderColor",     "")
                $("#newPasswordConfirm").css("borderColor", "")
                k2 =1;
            }
        })


    });
});


