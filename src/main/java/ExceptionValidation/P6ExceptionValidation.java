package ExceptionValidation;

//- 이메일이 @email.com 이 포함 되어 있는지 확인
//- 이메일의 길이가 11~20 인지 판단
//- 닉네임이 한글인지 판단
//- 닉네임의 길이가 1~20인지 판단

import java.util.List;

public class P6ExceptionValidation {

    private static final String EMAIL_FORMAT = "@email.com";

    public static boolean p6ExceptionValidation(String email, String userName){

        return isEmailFormat(email);
    }


    private static boolean isEmailFormat(String email) {
        return email.endsWith(EMAIL_FORMAT);
    }

}
