package com.example.jylee.honorticket;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kch on 2018. 5. 14..
 */

public class LoginRequest extends StringRequest {

    final static private String URL = "http://ehfkdl94.cafe24.com/Login.php";
    private Map<String, String> parameters;

//    public LoginRequest(String uid, String uname, Response.Listener<String> listener){
    public LoginRequest(String uid, String pw, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);//해당 URL에 POST방식으로 파마미터들을 전송함
        parameters = new HashMap<>();
        parameters.put("uid", uid);
        parameters.put("pw", pw);
//        parameters.put("uname", uname);

    }

    @Override
    protected Map<String, String> getParams()  {
        return parameters;
    }
}
