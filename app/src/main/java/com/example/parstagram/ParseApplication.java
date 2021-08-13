package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("1WMQorSlaxgT8g8rN02ZKpn7KfbgmpVWlO6E0vCr")
                .clientKey("2wR8h93Pe0e4jZh7oL07r34jH178jtfkTlbu4yuO")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
