package com.testApp.testingandroidsdk;

import android.app.Application;

import com.moengage.core.LogLevel;
import com.moengage.core.MoEngage;
import com.moengage.core.config.LogConfig;
import com.moengage.core.config.NotificationConfig;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        MoEngage moEngage =
                new MoEngage.Builder(this, "ZKFY8P9IN0GZL5MM6A2XVUJB")
                        .configureLogs(new LogConfig
                                (LogLevel.VERBOSE,true))
                        .configureNotificationMetaData(
                                new NotificationConfig(
                                        R.drawable.ic_stat_name,
                                        R.drawable.ic_launcher_background
                                )
                        )
                        .build();
        MoEngage.initialise(moEngage);
    }
}
