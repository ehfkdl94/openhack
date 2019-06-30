package com.example.jylee.honorticket;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kch on 2018. 5. 14..
 */

public class ValidateRequest extends StringRequest {

    final static private String URL = "http://ehfkdl94.cafe24.com/UserValidate.php";
    private Map<String, String> parameters;

    public ValidateRequest(String uid, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);//해당 URL에 POST방식으로 파마미터들을 전송함
        parameters = new HashMap<>();
        parameters.put("uid", uid);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return parameters;
    }
}
