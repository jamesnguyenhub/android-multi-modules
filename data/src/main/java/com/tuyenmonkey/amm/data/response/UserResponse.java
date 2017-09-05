package com.tuyenmonkey.amm.data.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Tuyen Monkey on 9/5/17.
 */

public class UserResponse implements Parcelable {
  @SerializedName("id") private int id;
  @SerializedName("login") private String login;
  @SerializedName("avatarUrl") private String avatarUrl;

  protected UserResponse(Parcel in) {
    id = in.readInt();
    login = in.readString();
    avatarUrl = in.readString();
  }

  public static final Creator<UserResponse> CREATOR = new Creator<UserResponse>() {
    @Override public UserResponse createFromParcel(Parcel in) {
      return new UserResponse(in);
    }

    @Override public UserResponse[] newArray(int size) {
      return new UserResponse[size];
    }
  };

  public int getId() {
    return id;
  }

  public String getLogin() {
    return login;
  }

  public String getAvatarUrl() {
    return avatarUrl;
  }

  @Override public int describeContents() {
    return 0;
  }

  @Override public void writeToParcel(Parcel dest, int flags) {
    dest.writeInt(id);
    dest.writeString(login);
    dest.writeString(avatarUrl);
  }
}
