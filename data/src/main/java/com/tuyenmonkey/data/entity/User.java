package com.tuyenmonkey.data.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Tuyen Monkey on 5/8/17.
 */

public class User {
  @SerializedName("id") private long id;
  @SerializedName("login") private String login;
  @SerializedName("avatar") private String avatarUrl;
  @SerializedName("gravatar_id") private String gravatarId;
  @SerializedName("id") private String url;
  @SerializedName("html_url") private String htmlUrl;
  @SerializedName("followers_url") private String followersUrl;
}
