package com.bumptech.glide.load.model;

import android.util.Log;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.p026d.C0979a;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.bumptech.glide.load.model.k */
public class C3064k implements Encoder<InputStream> {
    public String getId() {
        return "";
    }

    public /* synthetic */ boolean encode(Object obj, OutputStream outputStream) {
        return m12011a((InputStream) obj, outputStream);
    }

    /* renamed from: a */
    public boolean m12011a(InputStream inputStream, OutputStream outputStream) {
        byte[] b = C0979a.m3383a().m3385b();
        while (true) {
            try {
                int read = inputStream.read(b);
                if (read != -1) {
                    outputStream.write(b, 0, read);
                } else {
                    C0979a.m3383a().m3384a(b);
                    return true;
                }
            } catch (InputStream inputStream2) {
                if (Log.isLoggable("StreamEncoder", 3) != null) {
                    Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", inputStream2);
                }
                C0979a.m3383a().m3384a(b);
                return false;
            } catch (Throwable th) {
                C0979a.m3383a().m3384a(b);
            }
        }
    }
}
