package com.example.akinadeibrahim.test;

/**
 * Created by Akinade Ibrahim on 4/29/2018.
 */
//C:\Users\Akinade Ibrahim\AndroidStudioProjects\Test\app\src\main\java\com\example\akinadeibrahim\test\ServerResponse.java

import com.example.akinadeibrahim.test.ServerRequest;
import com.example.akinadeibrahim.test.ServerResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {
    @POST("payment/public/createusers/")
    Call<ServerResponse> operation(@Body ServerRequest request);

}
