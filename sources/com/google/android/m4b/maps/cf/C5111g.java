package com.google.android.m4b.maps.cf;

import android.opengl.GLES20;
import android.opengl.GLU;
import android.util.Log;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.cf.C5108f.C5107a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.cf.g */
public final class C5111g {
    /* renamed from: b */
    private static final List<WeakReference<C5113h>> f18983b = new ArrayList();
    /* renamed from: c */
    private static final List<WeakReference<C5122u>> f18984c = new ArrayList();
    /* renamed from: g */
    private static String f18985g;
    /* renamed from: a */
    private final C6592c f18986a;
    /* renamed from: d */
    private int f18987d;
    /* renamed from: e */
    private int f18988e;
    /* renamed from: f */
    private int f18989f;

    /* renamed from: com.google.android.m4b.maps.cf.g$a */
    public static class C5109a {
        /* renamed from: a */
        public int f18978a;
        /* renamed from: b */
        private Object f18979b;
        /* renamed from: c */
        private C5109a f18980c;

        /* renamed from: a */
        public final C5108f m22791a() {
            return (C5108f) this.f18979b;
        }

        /* renamed from: b */
        public final C5106e m22792b() {
            return (C5106e) this.f18979b;
        }

        /* renamed from: c */
        public final C5101b m22793c() {
            return (C5101b) this.f18979b;
        }
    }

    /* renamed from: com.google.android.m4b.maps.cf.g$b */
    public static class C5110b {
        /* renamed from: a */
        private C5109a f18981a;
        /* renamed from: b */
        private C5109a f18982b;

        /* renamed from: a */
        private synchronized C5109a m22794a() {
            C5109a c5109a;
            c5109a = this.f18981a;
            if (c5109a != null) {
                this.f18981a = c5109a.f18980c;
                if (this.f18981a == null) {
                    this.f18982b = null;
                }
            }
            return c5109a;
        }
    }

    /* renamed from: com.google.android.m4b.maps.cf.g$c */
    public class C6592c implements C5119p {
        /* renamed from: a */
        public final C5120q mo5293a(Class<? extends C5120q> cls) {
            StringBuilder stringBuilder;
            C5120q c5120q = null;
            WeakReference weakReference = (WeakReference) c5120q.get(cls);
            C5120q c5120q2 = weakReference != null ? (C5120q) weakReference.get() : c5120q;
            if (c5120q2 == null) {
                try {
                    C5120q c5120q3 = (C5120q) cls.newInstance();
                    c5120q.put(cls, new WeakReference(c5120q3));
                    c5120q2 = c5120q3;
                } catch (Throwable e) {
                    if (C4728u.m21050a("EntityRenderer", 6)) {
                        cls = String.valueOf(cls);
                        stringBuilder = new StringBuilder(String.valueOf(cls).length() + 42);
                        stringBuilder.append("Failed to instantiate ShaderProgram class ");
                        stringBuilder.append(cls);
                        Log.e("EntityRenderer", stringBuilder.toString(), e);
                    }
                    return c5120q;
                } catch (Throwable e2) {
                    if (C4728u.m21050a("EntityRenderer", 6)) {
                        cls = String.valueOf(cls);
                        stringBuilder = new StringBuilder(String.valueOf(cls).length() + 42);
                        stringBuilder.append("Failed to instantiate ShaderProgram class ");
                        stringBuilder.append(cls);
                        Log.e("EntityRenderer", stringBuilder.toString(), e2);
                    }
                    return c5120q;
                }
            }
            return c5120q2;
        }
    }

    /* renamed from: b */
    final void m22798b() {
        C6592c c6592c = this.f18986a;
        Map map = null;
        for (WeakReference weakReference : map.values()) {
            C5120q c5120q = (C5120q) weakReference.get();
            if (c5120q != null) {
                c5120q.m22818a(C5107a.NOT_LIVE_WITH_NEW_CONTEXT);
            }
        }
        for (int i = 0; i < C5113h.f18999a; i++) {
            map[i] = map;
        }
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3415, iArr, 0);
        this.f18987d = iArr[0];
        this.f18988e = (int) Math.pow(2.0d, (double) (this.f18987d - 1));
        if (f18985g == null) {
            f18985g = GLES20.glGetString(7939);
            if (C4728u.m21050a("EntityRenderer", 4)) {
                String str = "EntityRenderer";
                String str2 = "GL_EXTENSIONS = ";
                String valueOf = String.valueOf(f18985g);
                Log.i(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
        }
    }

    /* renamed from: a */
    public static void m22796a(String str, String str2) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            if (C4728u.m21050a(str, 6)) {
                String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 23) + String.valueOf(valueOf).length());
                stringBuilder.append(str2);
                stringBuilder.append(": glError ");
                stringBuilder.append(valueOf);
                stringBuilder.append("  ");
                stringBuilder.append(glGetError);
                Log.e(str, stringBuilder.toString());
            }
            Thread.dumpStack();
            System.exit(1);
            throw new C5114i(glGetError);
        }
    }

    /* renamed from: c */
    public final C5119p m22799c() {
        return this.f18986a;
    }

    /* renamed from: a */
    final void m22797a() {
        Set<C5118o> set;
        while (true) {
            set = null;
            C5109a a = set.m22794a();
            if (a == null) {
                break;
            }
            try {
                switch (a.f18978a) {
                    case 0:
                        a.m22791a().m22789a(this, C5107a.LIVE);
                        break;
                    case 1:
                        a.m22791a().m22789a(this, C5107a.LIVE);
                        break;
                    case 2:
                        set.m29458a(a.m22793c());
                        break;
                    case 3:
                        set.m29460b(a.m22793c());
                        break;
                    case 4:
                        a.m22792b().m22784a(this, C5107a.LIVE);
                        set.add(a.m22792b().m22786x());
                        set.add(a.m22792b());
                        byte z = a.m22792b().m22788z();
                        for (int i = 0; i < 5; i++) {
                            if (((1 << i) & z) != 0) {
                                set.m22806a(a.m22792b());
                            }
                        }
                        break;
                    case 5:
                        throw new UnsupportedOperationException("Remove camera not implemented");
                    default:
                        break;
                }
            } catch (Throwable e) {
                if (C4728u.m21050a("EntityRenderer", 6)) {
                    Log.e("EntityRenderer", "applyPending failed", e);
                }
            }
        }
        set.m29457a();
        for (C5118o a2 : set) {
            a2.mo7147a();
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C5106e) it.next()).m22787y();
        }
        it = set.iterator();
        while (it.hasNext()) {
            it.next();
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        this.f18989f++;
    }
}
