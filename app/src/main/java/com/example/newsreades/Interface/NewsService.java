package com.example.newsreades.Interface;

import com.example.newsreades.Model.News;
import com.example.newsreades.Model.WebSite;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface NewsService {

    //zamieniono
//    @GET("v2/sources?language=en")
    @GET("v2/sources?language=en&apiKey=ebf2594446e446979534e33a14f3e79b")
    Call<WebSite> getSources();

    @GET
    Call<News> getNewestArticles(@Url String url);
}
