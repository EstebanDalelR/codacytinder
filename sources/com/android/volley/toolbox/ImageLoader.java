package com.android.volley.toolbox;

import android.graphics.Bitmap;
import com.android.volley.Response.ErrorListener;

public class ImageLoader {

    public interface ImageCache {
        Bitmap getBitmap(String str);

        void putBitmap(String str, Bitmap bitmap);
    }

    /* renamed from: com.android.volley.toolbox.ImageLoader$a */
    public class C0912a {
    }

    public interface ImageListener extends ErrorListener {
        void onResponse(C0912a c0912a, boolean z);
    }
}
