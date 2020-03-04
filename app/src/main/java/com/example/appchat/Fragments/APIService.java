package com.example.appchat.Fragments;


import com.example.appchat.Notifications.MyResponse;
import com.example.appchat.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAw7ol3nk:APA91bFAlSq19InXLaAPW8yi_TJEMP5R2IKm9EZ8Cr5byF5Be6vpjLD7zhUPIJ8H3RpQwOtoVeTpok0ZiBLGPSR-PNQeUXlHICMtKDIZl_38iHGkG_XlHpZyWH19Wo-1-po_rBCObz2P"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
