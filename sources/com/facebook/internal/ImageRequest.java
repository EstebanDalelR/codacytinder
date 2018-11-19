package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import com.facebook.FacebookSdk;
import com.tinder.api.ManagerWebServices;
import java.util.Locale;

public class ImageRequest {
    /* renamed from: a */
    private Context f4627a;
    /* renamed from: b */
    private Uri f4628b;
    /* renamed from: c */
    private Callback f4629c;
    /* renamed from: d */
    private boolean f4630d;
    /* renamed from: e */
    private Object f4631e;

    public interface Callback {
        void onCompleted(C1732n c1732n);
    }

    /* renamed from: com.facebook.internal.ImageRequest$a */
    public static class C1685a {
        /* renamed from: a */
        private Context f4622a;
        /* renamed from: b */
        private Uri f4623b;
        /* renamed from: c */
        private Callback f4624c;
        /* renamed from: d */
        private boolean f4625d;
        /* renamed from: e */
        private Object f4626e;

        public C1685a(Context context, Uri uri) {
            C1749x.m6064a((Object) uri, "imageUri");
            this.f4622a = context;
            this.f4623b = uri;
        }

        /* renamed from: a */
        public C1685a m5728a(Callback callback) {
            this.f4624c = callback;
            return this;
        }

        /* renamed from: a */
        public C1685a m5729a(Object obj) {
            this.f4626e = obj;
            return this;
        }

        /* renamed from: a */
        public C1685a m5730a(boolean z) {
            this.f4625d = z;
            return this;
        }

        /* renamed from: a */
        public ImageRequest m5731a() {
            return new ImageRequest();
        }
    }

    /* renamed from: a */
    public static Uri m5732a(String str, int i, int i2) {
        C1749x.m6065a(str, ManagerWebServices.PARAM_USER_ID);
        i = Math.max(i, 0);
        i2 = Math.max(i2, 0);
        if (i == 0 && i2 == 0) {
            throw new IllegalArgumentException("Either width or height must be greater than 0");
        }
        str = Uri.parse(C1747v.m6055b()).buildUpon().path(String.format(Locale.US, "%s/%s/picture", new Object[]{FacebookSdk.m3995f(), str}));
        if (i2 != 0) {
            str.appendQueryParameter("height", String.valueOf(i2));
        }
        if (i != 0) {
            str.appendQueryParameter("width", String.valueOf(i));
        }
        str.appendQueryParameter("migration_overrides", "{october_2012:true}");
        return str.build();
    }

    private ImageRequest(C1685a c1685a) {
        this.f4627a = c1685a.f4622a;
        this.f4628b = c1685a.f4623b;
        this.f4629c = c1685a.f4624c;
        this.f4630d = c1685a.f4625d;
        this.f4631e = c1685a.f4626e == null ? new Object() : c1685a.f4626e;
    }

    /* renamed from: a */
    public Context m5733a() {
        return this.f4627a;
    }

    /* renamed from: b */
    public Uri m5734b() {
        return this.f4628b;
    }

    /* renamed from: c */
    public Callback m5735c() {
        return this.f4629c;
    }

    /* renamed from: d */
    public boolean m5736d() {
        return this.f4630d;
    }

    /* renamed from: e */
    public Object m5737e() {
        return this.f4631e;
    }
}
