package com.example.jylee.honorticket;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kch on 2018. 5. 14..
 */

public class RegisterRequest extends StringRequest {

    final static private String URL = "http://ehfkdl94.cafe24.com/UserRegister.php";
    private Map<String, String> parameters;

    public RegisterRequest(String uid,  String uname, String pw, String email, String phnum, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);//해당 URL에 POST방식으로 파마미터들을 전송함
        parameters = new HashMap<>();
        parameters.put("uid", uid);
        parameters.put("uname", uname);
        parameters.put("pw", pw);
        parameters.put("email", email);
        parameters.put("phnum", phnum);
        System.out.println("log2 : " + uid + pw + uname + email + phnum);

    }

    @Override
    protected Map<String, String> getParams()  {
        return parameters;
    }
}

