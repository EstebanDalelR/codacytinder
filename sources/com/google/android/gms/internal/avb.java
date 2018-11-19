package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.util.C2526k;
import java.io.InputStream;

final class avb implements zzajb<amm> {
    /* renamed from: a */
    private /* synthetic */ boolean f23182a;
    /* renamed from: b */
    private /* synthetic */ double f23183b;
    /* renamed from: c */
    private /* synthetic */ boolean f23184c;
    /* renamed from: d */
    private /* synthetic */ String f23185d;
    /* renamed from: e */
    private /* synthetic */ aux f23186e;

    avb(aux aux, boolean z, double d, boolean z2, String str) {
        this.f23186e = aux;
        this.f23182a = z;
        this.f23183b = d;
        this.f23184c = z2;
        this.f23185d = str;
    }

    @TargetApi(19)
    /* renamed from: a */
    private final amm m27261a(InputStream inputStream) {
        Bitmap decodeStream;
        Options options = new Options();
        options.inDensity = (int) (this.f23183b * 160.0d);
        if (!this.f23184c) {
            options.inPreferredConfig = Config.RGB_565;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
        } catch (Throwable e) {
            hx.m19912b("Error grabbing image.", e);
            decodeStream = null;
        }
        if (decodeStream == null) {
            this.f23186e.m19519a(2, this.f23182a);
            return null;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (C2526k.e() && ec.m27333a()) {
            int width = decodeStream.getWidth();
            int height = decodeStream.getHeight();
            int allocationByteCount = decodeStream.getAllocationByteCount();
            long j = uptimeMillis2 - uptimeMillis;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder stringBuilder = new StringBuilder(108);
            stringBuilder.append("Decoded image w: ");
            stringBuilder.append(width);
            stringBuilder.append(" h:");
            stringBuilder.append(height);
            stringBuilder.append(" bytes: ");
            stringBuilder.append(allocationByteCount);
            stringBuilder.append(" time: ");
            stringBuilder.append(j);
            stringBuilder.append(" on ui thread: ");
            stringBuilder.append(z);
            ec.m27332a(stringBuilder.toString());
        }
        return new amm(new BitmapDrawable(Resources.getSystem(), decodeStream), Uri.parse(this.f23185d), this.f23183b);
    }

    @TargetApi(19)
    public final /* synthetic */ Object zze(InputStream inputStream) {
        return m27261a(inputStream);
    }

    public final /* synthetic */ Object zzni() {
        this.f23186e.m19519a(2, this.f23182a);
        return null;
    }
}
