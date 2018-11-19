package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@zzzv
public final class hy implements zzaju {
    @Nullable
    /* renamed from: a */
    private final String f23323a;

    public hy() {
        this(null);
    }

    public hy(@Nullable String str) {
        this.f23323a = str;
    }

    @WorkerThread
    public final void zzck(String str) {
        String str2;
        String valueOf;
        StringBuilder stringBuilder;
        HttpURLConnection httpURLConnection;
        try {
            str2 = "Pinging URL: ";
            valueOf = String.valueOf(str);
            hx.m19911b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            aja.m19216a();
            hn.m19869a(true, httpURLConnection, this.f23323a);
            hq hqVar = new hq();
            hqVar.m19905a(httpURLConnection, null);
            int responseCode = httpURLConnection.getResponseCode();
            hqVar.m19904a(httpURLConnection, responseCode);
            if (responseCode < Callback.DEFAULT_DRAG_ANIMATION_DURATION || responseCode >= MapboxConstants.ANIMATION_DURATION) {
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 65);
                stringBuilder2.append("Received non-success response code ");
                stringBuilder2.append(responseCode);
                stringBuilder2.append(" from pinging URL: ");
                stringBuilder2.append(str);
                hx.m19916e(stringBuilder2.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            str2 = e.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(str2).length());
            valueOf = "Error while parsing ping URL: ";
            stringBuilder.append(valueOf);
            stringBuilder.append(str);
            stringBuilder.append(". ");
            stringBuilder.append(str2);
            hx.m19916e(stringBuilder.toString());
        } catch (IOException e2) {
            str2 = e2.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(str2).length());
            valueOf = "Error while pinging URL: ";
            stringBuilder.append(valueOf);
            stringBuilder.append(str);
            stringBuilder.append(". ");
            stringBuilder.append(str2);
            hx.m19916e(stringBuilder.toString());
        } catch (RuntimeException e3) {
            str2 = e3.getMessage();
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(str2).length());
            valueOf = "Error while pinging URL: ";
            stringBuilder.append(valueOf);
            stringBuilder.append(str);
            stringBuilder.append(". ");
            stringBuilder.append(str2);
            hx.m19916e(stringBuilder.toString());
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }
}
