package com.tuyenmonkey.amm.data;

import com.tuyenmonkey.amm.data.response.UserResponse;
import io.reactivex.Single;
import java.util.List;
import retrofit2.http.GET;

/**
 * Created by Tuyen Monkey on 9/5/17.
 */

public interface GitHubService {
  @GET("users") Single<List<UserResponse>> getUsers();
}
