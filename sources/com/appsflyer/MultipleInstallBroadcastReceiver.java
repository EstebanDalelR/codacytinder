package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;

public class MultipleInstallBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra != null) {
                if ("AppsFlyer_Test".equals(stringExtra) && intent.getStringExtra("TestIntegrationMode") != null) {
                    C3010d.m11689c().m11731a(context, intent);
                    return;
                } else if (context.getSharedPreferences("appsflyer-data", 0).getString("referrer", null) != null) {
                    C3010d.m11689c().m11732a(context, stringExtra);
                    return;
                }
            }
            AFLogger.m3083d("MultipleInstallBroadcastReceiver called");
            C3010d.m11689c().m11731a(context, intent);
            for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER"), 0)) {
                String action = intent.getAction();
                if (resolveInfo.activityInfo.packageName.equals(context.getPackageName()) && "com.android.vending.INSTALL_REFERRER".equals(action) && !getClass().getName().equals(resolveInfo.activityInfo.name)) {
                    StringBuilder stringBuilder = new StringBuilder("trigger onReceive: class: ");
                    stringBuilder.append(resolveInfo.activityInfo.name);
                    AFLogger.m3083d(stringBuilder.toString());
                    try {
                        ((BroadcastReceiver) Class.forName(resolveInfo.activityInfo.name).newInstance()).onReceive(context, intent);
                    } catch (Throwable th) {
                        StringBuilder stringBuilder2 = new StringBuilder("error in BroadcastReceiver ");
                        stringBuilder2.append(resolveInfo.activityInfo.name);
                        AFLogger.m3073a(stringBuilder2.toString(), th);
                    }
                }
            }
        }
    }
}
