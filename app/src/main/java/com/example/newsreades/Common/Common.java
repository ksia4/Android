package com.example.newsreades.Common;

import com.example.newsreades.Interface.IconBetterIdeaService;
import com.example.newsreades.Interface.NewsService;
import com.example.newsreades.Model.IconBetterIdea;
import com.example.newsreades.Remote.IconBetterIdeaClient;
import com.example.newsreades.Remote.RetrofitClient;

public class Common {
    private static final String BASE_URL="https://newsapi.org/";

    public static final String API_KEY = "ebf2594446e446979534e33a14f3e79b";

    public static NewsService getNewsService() {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }

    public static IconBetterIdeaService getIconService() {
        return IconBetterIdeaClient.getClient().create(IconBetterIdeaService.class);
    }

    //https://newsapi.org/v2/top-headlines?country=us&apiKey=ebf2594446e446979534e33a14f3e79b
    public static String getApiUrl(String source, String sortBy, String apiKEY){

        StringBuilder apiUrl = new StringBuilder("https://newsapi.org/v2/top-headlines?sources=");

        return apiUrl.append(source)
                .append("&apiKey=")
                .append(apiKEY)
                .toString();

    }

}
