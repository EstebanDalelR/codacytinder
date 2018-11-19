package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import java.io.IOException;

public final class wh extends zzffu<wh, C8168a> implements zzfhg {
    /* renamed from: d */
    private static final wh f29223d;
    /* renamed from: e */
    private static volatile zzfhk<wh> f29224e;

    /* renamed from: com.google.android.gms.internal.wh$a */
    public static final class C8168a extends C8036a<wh, C8168a> implements zzfhg {
        private C8168a() {
            super(wh.f29223d);
        }
    }

    static {
        zzffu whVar = new wh();
        f29223d = whVar;
        whVar.mo7626a(C4479g.f16690f, null, null);
        whVar.f28829b.m18929c();
    }

    private wh() {
    }

    /* renamed from: a */
    public static wh m34708a() {
        return f29223d;
    }

    /* renamed from: a */
    protected final Object mo7626a(int i, Object obj, Object obj2) {
        switch (wi.f16607a[i - 1]) {
            case 1:
                return new wh();
            case 2:
                return f29223d;
            case 3:
                return null;
            case 4:
                return new C8168a();
            case 5:
                return this;
            case 6:
                abk abk = (abk) obj;
                if (((abq) obj2) != null) {
                    Object obj3 = null;
                    while (obj3 == null) {
                        try {
                            int a = abk.mo4174a();
                            if (a == 0 || !m34113a(a, abk)) {
                                obj3 = 1;
                            }
                        } catch (zzfge e) {
                            throw new RuntimeException(e.m20323a(this));
                        } catch (IOException e2) {
                            throw new RuntimeException(new zzfge(e2.getMessage()).m20323a(this));
                        }
                    }
                    break;
                }
                throw new NullPointerException();
                break;
            case 7:
                break;
            case 8:
                if (f29224e == null) {
                    synchronized (wh.class) {
                        if (f29224e == null) {
                            f29224e = new C7363b(f29223d);
                        }
                    }
                }
                return f29224e;
            case 9:
                return Byte.valueOf((byte) 1);
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return f29223d;
    }

    public final void zza(zzffg zzffg) throws IOException {
        this.b.m18926a(zzffg);
    }

    public final int zzho() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        i = this.b.m18931e() + 0;
        this.c = i;
        return i;
    }
}
