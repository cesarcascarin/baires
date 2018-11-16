package com.gbm.cesaraguirre.baires;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface GithubService {

    @GET("search/repositories?q=topic:kotlin")
    Call<Response> listRepos();
}
