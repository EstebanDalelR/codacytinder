package com.google.android.m4b.maps.p102b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.widget.ImageView.ScaleType;
import com.facebook.ads.AdError;
import com.google.android.m4b.maps.p101a.C4522h;
import com.google.android.m4b.maps.p101a.C4525k;
import com.google.android.m4b.maps.p101a.C4525k.C4524a;
import com.google.android.m4b.maps.p101a.C4529m;
import com.google.android.m4b.maps.p101a.C4529m.C4527a;
import com.google.android.m4b.maps.p101a.C4529m.C4528b;
import com.google.android.m4b.maps.p101a.C4531o;
import com.google.android.m4b.maps.p101a.C4535s;
import com.google.android.m4b.maps.p101a.C6304j;

/* renamed from: com.google.android.m4b.maps.b.g */
public class C6424g extends C4525k<Bitmap> {
    /* renamed from: f */
    private static final Object f23835f = new Object();
    /* renamed from: a */
    private final C4528b<Bitmap> f23836a;
    /* renamed from: b */
    private final Config f23837b;
    /* renamed from: c */
    private final int f23838c;
    /* renamed from: d */
    private final int f23839d;
    /* renamed from: e */
    private ScaleType f23840e;

    /* renamed from: a */
    protected final /* synthetic */ void mo4886a(Object obj) {
        this.f23836a.mo4906a((Bitmap) obj);
    }

    private C6424g(String str, C4528b<Bitmap> c4528b, int i, int i2, ScaleType scaleType, Config config, C4527a c4527a) {
        super(0, str, c4527a);
        m20426a((C4531o) new C4531o(AdError.NETWORK_ERROR_CODE, 2, 2.0f));
        this.f23836a = c4528b;
        this.f23837b = config;
        this.f23838c = i;
        this.f23839d = i2;
        this.f23840e = scaleType;
    }

    @Deprecated
    public C6424g(String str, C4528b<Bitmap> c4528b, int i, int i2, Config config, C4527a c4527a) {
        this(str, c4528b, 0, 0, ScaleType.CENTER_INSIDE, config, c4527a);
    }

    /* renamed from: m */
    public final C4524a mo4904m() {
        return C4524a.LOW;
    }

    /* renamed from: a */
    private static int m28068a(int i, int i2, int i3, int i4, ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        } else {
            if (i == 0) {
                return (int) (((double) i3) * (((double) i2) / ((double) i4)));
            } else if (i2 == 0) {
                return i;
            } else {
                double d = ((double) i4) / ((double) i3);
                double d2;
                if (scaleType == ScaleType.CENTER_CROP) {
                    d2 = (double) i2;
                    if (((double) i) * d < d2) {
                        i = (int) (d2 / d);
                    }
                    return i;
                }
                d2 = (double) i2;
                if (((double) i) * d > d2) {
                    i = (int) (d2 / d);
                }
                return i;
            }
        }
    }

    /* renamed from: a */
    protected final C4529m<Bitmap> mo4885a(C4522h c4522h) {
        C4529m<Bitmap> a;
        synchronized (f23835f) {
            try {
                Object decodeByteArray;
                byte[] bArr = c4522h.f16797b;
                Options options = new Options();
                if (this.f23838c == 0 && this.f23839d == 0) {
                    options.inPreferredConfig = this.f23837b;
                    decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                } else {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    int i = options.outWidth;
                    int i2 = options.outHeight;
                    int a2 = C6424g.m28068a(this.f23838c, this.f23839d, i, i2, this.f23840e);
                    int a3 = C6424g.m28068a(this.f23839d, this.f23838c, i2, i, this.f23840e);
                    options.inJustDecodeBounds = false;
                    options.inSampleSize = C6424g.m28067a(i, i2, a2, a3);
                    decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    if (decodeByteArray != null && (decodeByteArray.getWidth() > a2 || decodeByteArray.getHeight() > a3)) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, a2, a3, true);
                        decodeByteArray.recycle();
                        decodeByteArray = createScaledBitmap;
                    }
                }
                if (decodeByteArray == null) {
                    a = C4529m.m20454a(new C6304j(c4522h));
                } else {
                    a = C4529m.m20455a(decodeByteArray, C4738d.m21079a(c4522h));
                }
            } catch (Throwable e) {
                C4535s.m20470c("Caught OOM for %d byte image, url=%s", Integer.valueOf(c4522h.f16797b.length), m20434c());
                return C4529m.m20454a(new C6304j(e));
            }
        }
        return a;
    }

    /* renamed from: a */
    private static int m28067a(int i, int i2, int i3, int i4) {
        i = Math.min(((double) i) / ((double) i3), ((double) i2) / ((double) i4));
        i3 = 1065353216;
        while (true) {
            i4 = 1073741824 * i3;
            if (((double) i4) > i) {
                return (int) i3;
            }
            i3 = i4;
        }
    }
}
