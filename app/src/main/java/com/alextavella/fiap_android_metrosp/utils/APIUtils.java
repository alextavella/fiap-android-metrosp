package com.alextavella.fiap_android_metrosp.utils;

import com.alextavella.fiap_android_metrosp.api.MetroAPI;
import com.alextavella.fiap_android_metrosp.api.RetrofitClient;

/**
 * Created by alextavella on 26/06/17.
 */

public class APIUtils {

    public static final String BASE_URL = "http://172.16.71.62:3000";

    public static MetroAPI getAndroidAPIService() {
        return RetrofitClient
                .getClient(BASE_URL)
                .create(MetroAPI.class);
    }
}
