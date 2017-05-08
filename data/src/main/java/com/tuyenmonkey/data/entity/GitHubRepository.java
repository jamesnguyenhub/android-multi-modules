package com.tuyenmonkey.data.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Tuyen Monkey on 5/8/17.
 */

public class GitHubRepository {
  @SerializedName("id") private long id;
  @SerializedName("name") private String name;
  @SerializedName("full_name") private String fullName;
  @SerializedName("user") private User user;
  @SerializedName("private") private boolean privateAccess;
  @SerializedName("html_url") private String htmlUrl;
}
