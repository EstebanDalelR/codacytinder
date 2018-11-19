package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.Nullable;
import java.util.Arrays;

@TargetApi(21)
/* renamed from: com.google.android.exoplayer2.audio.b */
public final class C2027b {
    /* renamed from: a */
    public static final C2027b f5558a = new C2027b(new int[]{2}, 2);
    /* renamed from: b */
    private final int[] f5559b;
    /* renamed from: c */
    private final int f5560c;

    /* renamed from: a */
    public static C2027b m7295a(Context context) {
        return C2027b.m7296a(context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    static C2027b m7296a(Intent intent) {
        if (intent != null) {
            if (intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
                return new C2027b(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0));
            }
        }
        return f5558a;
    }

    C2027b(int[] iArr, int i) {
        if (iArr != null) {
            this.f5559b = Arrays.copyOf(iArr, iArr.length);
            Arrays.sort(this.f5559b);
        } else {
            this.f5559b = new int[null];
        }
        this.f5560c = i;
    }

    /* renamed from: a */
    public boolean m7297a(int i) {
        return Arrays.binarySearch(this.f5559b, i) >= 0;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2027b)) {
            return false;
        }
        C2027b c2027b = (C2027b) obj;
        if (!Arrays.equals(this.f5559b, c2027b.f5559b) || this.f5560c != c2027b.f5560c) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f5560c + (Arrays.hashCode(this.f5559b) * 31);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AudioCapabilities[maxChannelCount=");
        stringBuilder.append(this.f5560c);
        stringBuilder.append(", supportedEncodings=");
        stringBuilder.append(Arrays.toString(this.f5559b));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
