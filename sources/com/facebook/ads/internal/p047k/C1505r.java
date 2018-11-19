package com.facebook.ads.internal.p047k;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;
import com.facebook.ads.internal.p036c.C1381c;
import com.facebook.ads.internal.view.C1605e;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.k.r */
public class C1505r extends AsyncTask<String, Void, Bitmap[]> {
    /* renamed from: a */
    private static final String f4169a = "r";
    /* renamed from: b */
    private final WeakReference<Context> f4170b;
    /* renamed from: c */
    private final WeakReference<ImageView> f4171c;
    /* renamed from: d */
    private final WeakReference<C1605e> f4172d;
    /* renamed from: e */
    private C1506s f4173e;

    public C1505r(ImageView imageView) {
        this.f4170b = new WeakReference(imageView.getContext());
        this.f4172d = null;
        this.f4171c = new WeakReference(imageView);
    }

    public C1505r(C1605e c1605e) {
        this.f4170b = new WeakReference(c1605e.getContext());
        this.f4172d = new WeakReference(c1605e);
        this.f4171c = null;
    }

    /* renamed from: a */
    public C1505r m5299a(C1506s c1506s) {
        this.f4173e = c1506s;
        return this;
    }

    /* renamed from: a */
    protected void m5300a(Bitmap[] bitmapArr) {
        if (this.f4171c != null) {
            ImageView imageView = (ImageView) this.f4171c.get();
            if (imageView != null) {
                imageView.setImageBitmap(bitmapArr[0]);
            }
        }
        if (this.f4172d != null) {
            C1605e c1605e = (C1605e) this.f4172d.get();
            if (c1605e != null) {
                c1605e.m5480a(bitmapArr[0], bitmapArr[1]);
            }
        }
        if (this.f4173e != null) {
            this.f4173e.mo1724a();
        }
    }

    /* renamed from: a */
    public void m5301a(String... strArr) {
        executeOnExecutor(THREAD_POOL_EXECUTOR, strArr);
    }

    /* renamed from: b */
    protected Bitmap[] m5302b(String... strArr) {
        Throwable th;
        String str;
        String str2;
        StringBuilder stringBuilder;
        String str3 = strArr[0];
        Context context = (Context) this.f4170b.get();
        String str4 = null;
        if (context == null) {
            return new Bitmap[]{null, null};
        }
        Bitmap a;
        try {
            a = C1381c.m4810a(context).m4814a(str3);
            try {
                if (!(this.f4172d == null || this.f4172d.get() == null || a == null)) {
                    try {
                        ae aeVar = new ae(a);
                        aeVar.m5176a(Math.round(((float) a.getWidth()) / 40.0f));
                        str4 = aeVar.m5175a();
                    } catch (Throwable th2) {
                        th = th2;
                        str = a;
                        str2 = f4169a;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Error downloading image: ");
                        stringBuilder.append(str3);
                        Log.e(str2, stringBuilder.toString(), th);
                        C1482c.m5218a(C1481b.m5215a(th, null));
                        str4 = str;
                        return new Bitmap[]{a, str4};
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                str = null;
                str2 = f4169a;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Error downloading image: ");
                stringBuilder.append(str3);
                Log.e(str2, stringBuilder.toString(), th);
                C1482c.m5218a(C1481b.m5215a(th, null));
                str4 = str;
                return new Bitmap[]{a, str4};
            }
        } catch (Throwable th4) {
            th = th4;
            a = null;
            str = a;
            str2 = f4169a;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Error downloading image: ");
            stringBuilder.append(str3);
            Log.e(str2, stringBuilder.toString(), th);
            C1482c.m5218a(C1481b.m5215a(th, null));
            str4 = str;
            return new Bitmap[]{a, str4};
        }
        return new Bitmap[]{a, str4};
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m5302b((String[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m5300a((Bitmap[]) obj);
    }
}
