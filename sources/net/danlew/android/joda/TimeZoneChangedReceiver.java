package net.danlew.android.joda;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.TimeZone;
import org.joda.time.DateTimeZone;

public class TimeZoneChangedReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        context = intent.getStringExtra("time-zone");
        try {
            DateTimeZone.a(DateTimeZone.a(TimeZone.getDefault()));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TIMEZONE_CHANGED received, changed default timezone to \"");
            stringBuilder.append(context);
            stringBuilder.append("\"");
            Log.d("joda-time-android", stringBuilder.toString());
        } catch (Intent intent2) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Could not recognize timezone id \"");
            stringBuilder2.append(context);
            stringBuilder2.append("\"");
            Log.e("joda-time-android", stringBuilder2.toString(), intent2);
        }
    }
}
