package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;

public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra != null) {
                if (stringExtra.contains("AppsFlyer_Test") && intent.getStringExtra("TestIntegrationMode") != null) {
                    C3010d.m11689c().m11731a(context, intent);
                    return;
                } else if (context.getSharedPreferences("appsflyer-data", 0).getString("referrer", null) != null) {
                    C3010d.m11689c().m11732a(context, stringExtra);
                    return;
                }
            }
            stringExtra = AppsFlyerProperties.m3086a().m3090a("referrer_timestamp");
            long currentTimeMillis = System.currentTimeMillis();
            if (stringExtra == null || currentTimeMillis - Long.valueOf(stringExtra).longValue() >= DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL) {
                AFLogger.m3083d("SingleInstallBroadcastReceiver called");
                C3010d.m11689c().m11731a(context, intent);
                AppsFlyerProperties.m3086a().m3092a("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
            }
        }
    }
}
