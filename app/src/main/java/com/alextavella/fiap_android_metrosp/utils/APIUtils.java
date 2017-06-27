package com.alextavella.fiap_android_metrosp.utils;

import com.alextavella.fiap_android_metrosp.api.LinhaAPI;
import com.alextavella.fiap_android_metrosp.api.RetrofitClient;

/**
 * Created by alextavella on 26/06/17.
 */

public class APIUtils {

    public static final String BASE_URL = "http://172.16.71.45:3000";

    public static LinhaAPI getAndroidAPIService() {
        return RetrofitClient
                .getClient(BASE_URL)
                .create(LinhaAPI.class);
    }
}
