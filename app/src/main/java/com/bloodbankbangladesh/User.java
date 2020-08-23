package com.bloodbankbangladesh;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Sanjoy Kumar on 1/5/2018.
 */

@IgnoreExtraProperties
public class User {

    public String username;
    public String email;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

}
// [END blog_user_class]
