package com.gknsvs.criptomoneyexc.service;

import com.gknsvs.criptomoneyexc.model.CryptoModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {
    //https://api.nomics.com/v1/prices?key=50b857ed0770ac4dfa3f90736d06fd94616485c2
    @GET("prices?key=50b857ed0770ac4dfa3f90736d06fd94616485c2")
    Call<List<CryptoModel>> getData();
}
