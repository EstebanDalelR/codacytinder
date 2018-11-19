package com.google.android.gms.ads.identifier;

import android.net.Uri;
import android.net.Uri.Builder;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.util.Log;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.identifier.a */
final class C2367a extends Thread {
    /* renamed from: a */
    private /* synthetic */ Map f7074a;

    C2367a(AdvertisingIdClient advertisingIdClient, Map map) {
        this.f7074a = map;
    }

    public final void run() {
        String message;
        Throwable e;
        String str;
        String str2;
        C2369c c2369c = new C2369c();
        Map map = this.f7074a;
        Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String message2 : map.keySet()) {
            buildUpon.appendQueryParameter(message2, (String) map.get(message2));
        }
        String uri = buildUpon.build().toString();
        HttpURLConnection httpURLConnection;
        StringBuilder stringBuilder;
        try {
            httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < Callback.DEFAULT_DRAG_ANIMATION_DURATION || responseCode >= MapboxConstants.ANIMATION_DURATION) {
                stringBuilder = new StringBuilder(String.valueOf(uri).length() + 65);
                stringBuilder.append("Received non-success response code ");
                stringBuilder.append(responseCode);
                stringBuilder.append(" from pinging URL: ");
                stringBuilder.append(uri);
                Log.w("HttpUrlPinger", stringBuilder.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            str = "HttpUrlPinger";
            message2 = e.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(uri).length() + 32) + String.valueOf(message2).length());
            str2 = "Error while parsing ping URL: ";
            stringBuilder.append(str2);
            stringBuilder.append(uri);
            stringBuilder.append(". ");
            stringBuilder.append(message2);
            Log.w(str, stringBuilder.toString(), e);
        } catch (IOException e3) {
            e = e3;
            str = "HttpUrlPinger";
            message2 = e.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(uri).length() + 27) + String.valueOf(message2).length());
            str2 = "Error while pinging URL: ";
            stringBuilder.append(str2);
            stringBuilder.append(uri);
            stringBuilder.append(". ");
            stringBuilder.append(message2);
            Log.w(str, stringBuilder.toString(), e);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }
}
