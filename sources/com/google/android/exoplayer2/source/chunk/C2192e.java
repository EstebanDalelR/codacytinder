package com.google.android.exoplayer2.source.chunk;

import android.util.Log;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException;

/* renamed from: com.google.android.exoplayer2.source.chunk.e */
public final class C2192e {
    /* renamed from: a */
    public static boolean m7863a(TrackSelection trackSelection, int i, Exception exception) {
        return C2192e.m7864a(trackSelection, i, exception, 60000);
    }

    /* renamed from: a */
    public static boolean m7864a(TrackSelection trackSelection, int i, Exception exception, long j) {
        if (!C2192e.m7865a(exception)) {
            return null;
        }
        boolean blacklist = trackSelection.blacklist(i, j);
        exception = ((InvalidResponseCodeException) exception).f11660c;
        if (blacklist) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Blacklisted: duration=");
            stringBuilder.append(j);
            stringBuilder.append(", responseCode=");
            stringBuilder.append(exception);
            stringBuilder.append(", format=");
            stringBuilder.append(trackSelection.getFormat(i));
            Log.w("ChunkedTrackBlacklist", stringBuilder.toString());
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Blacklisting failed (cannot blacklist last enabled track): responseCode=");
            stringBuilder2.append(exception);
            stringBuilder2.append(", format=");
            stringBuilder2.append(trackSelection.getFormat(i));
            Log.w("ChunkedTrackBlacklist", stringBuilder2.toString());
        }
        return blacklist;
    }

    /* renamed from: a */
    public static boolean m7865a(Exception exception) {
        boolean z = false;
        if (!(exception instanceof InvalidResponseCodeException)) {
            return false;
        }
        exception = ((InvalidResponseCodeException) exception).f11660c;
        if (exception == 404 || exception == 410) {
            z = true;
        }
        return z;
    }
}
