package com.bloodbankbangladesh;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Sanjoy Kumar on 1/5/2018.
 */

@IgnoreExtraProperties
public class Comment {

    public String uid;
    public String author;
    public String text;

    public Comment() {
        // Default constructor required for calls to DataSnapshot.getValue(Comment.class)
    }

    public Comment(String uid, String author, String text) {
        this.uid = uid;
        this.author = author;
        this.text = text;
    }

}
// [END comment_class]
