package p000a.p001a;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: a.a.a */
public final class C0001a {
    /* renamed from: a */
    static volatile C0000a[] f1a = f2b;
    /* renamed from: b */
    private static final C0000a[] f2b = new C0000a[0];
    /* renamed from: c */
    private static final List<C0000a> f3c = new ArrayList();
    /* renamed from: d */
    private static final C0000a f4d = new C26721();

    /* renamed from: a.a.a$a */
    public static abstract class C0000a {
        /* renamed from: a */
        final ThreadLocal<String> f0a = new ThreadLocal();

        /* renamed from: a */
        protected abstract void mo1a(int i, @Nullable String str, @NotNull String str2, @Nullable Throwable th);

        @Deprecated
        /* renamed from: a */
        protected boolean m8a(int i) {
            return true;
        }

        @Nullable
        /* renamed from: a */
        String m2a() {
            String str = (String) this.f0a.get();
            if (str != null) {
                this.f0a.remove();
            }
            return str;
        }

        /* renamed from: a */
        public void mo3a(String str, Object... objArr) {
            m0a(2, null, str, objArr);
        }

        /* renamed from: b */
        public void mo6b(String str, Object... objArr) {
            m0a(3, null, str, objArr);
        }

        /* renamed from: a */
        public void mo5a(Throwable th, String str, Object... objArr) {
            m0a(3, th, str, objArr);
        }

        /* renamed from: a */
        public void mo4a(Throwable th) {
            m0a(3, th, null, new Object[0]);
        }

        /* renamed from: c */
        public void mo9c(String str, Object... objArr) {
            m0a(4, null, str, objArr);
        }

        /* renamed from: d */
        public void mo12d(String str, Object... objArr) {
            m0a(5, null, str, objArr);
        }

        /* renamed from: b */
        public void mo8b(Throwable th, String str, Object... objArr) {
            m0a(5, th, str, objArr);
        }

        /* renamed from: b */
        public void mo7b(Throwable th) {
            m0a(5, th, null, new Object[0]);
        }

        /* renamed from: e */
        public void mo13e(String str, Object... objArr) {
            m0a(6, null, str, objArr);
        }

        /* renamed from: c */
        public void mo11c(Throwable th, String str, Object... objArr) {
            m0a(6, th, str, objArr);
        }

        /* renamed from: c */
        public void mo10c(Throwable th) {
            m0a(6, th, null, new Object[0]);
        }

        /* renamed from: f */
        public void mo14f(String str, Object... objArr) {
            m0a(7, null, str, objArr);
        }

        /* renamed from: a */
        public void mo2a(int i, String str, Object... objArr) {
            m0a(i, null, str, objArr);
        }

        /* renamed from: a */
        protected boolean m9a(@Nullable String str, int i) {
            return m8a(i);
        }

        /* renamed from: a */
        private void m0a(int i, Throwable th, String str, Object... objArr) {
            String a = m2a();
            if (m9a(a, i)) {
                if (str != null && str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    if (objArr != null && objArr.length > 0) {
                        str = m19g(str, objArr);
                    }
                    if (th != null) {
                        objArr = new StringBuilder();
                        objArr.append(str);
                        objArr.append("\n");
                        objArr.append(m1d(th));
                        str = objArr.toString();
                    }
                } else if (th != null) {
                    str = m1d(th);
                } else {
                    return;
                }
                mo1a(i, a, str, th);
            }
        }

        /* renamed from: g */
        protected String m19g(@NotNull String str, @NotNull Object[] objArr) {
            return String.format(str, objArr);
        }

        /* renamed from: d */
        private String m1d(Throwable th) {
            Writer stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter(stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }
    }

    /* renamed from: a.a.a$1 */
    static class C26721 extends C0000a {
        C26721() {
        }

        /* renamed from: a */
        public void mo3a(String str, Object... objArr) {
            for (C0000a a : C0001a.f1a) {
                a.mo3a(str, objArr);
            }
        }

        /* renamed from: b */
        public void mo6b(String str, Object... objArr) {
            for (C0000a b : C0001a.f1a) {
                b.mo6b(str, objArr);
            }
        }

        /* renamed from: a */
        public void mo5a(Throwable th, String str, Object... objArr) {
            for (C0000a a : C0001a.f1a) {
                a.mo5a(th, str, objArr);
            }
        }

        /* renamed from: a */
        public void mo4a(Throwable th) {
            for (C0000a a : C0001a.f1a) {
                a.mo4a(th);
            }
        }

        /* renamed from: c */
        public void mo9c(String str, Object... objArr) {
            for (C0000a c : C0001a.f1a) {
                c.mo9c(str, objArr);
            }
        }

        /* renamed from: d */
        public void mo12d(String str, Object... objArr) {
            for (C0000a d : C0001a.f1a) {
                d.mo12d(str, objArr);
            }
        }

        /* renamed from: b */
        public void mo8b(Throwable th, String str, Object... objArr) {
            for (C0000a b : C0001a.f1a) {
                b.mo8b(th, str, objArr);
            }
        }

        /* renamed from: b */
        public void mo7b(Throwable th) {
            for (C0000a b : C0001a.f1a) {
                b.mo7b(th);
            }
        }

        /* renamed from: e */
        public void mo13e(String str, Object... objArr) {
            for (C0000a e : C0001a.f1a) {
                e.mo13e(str, objArr);
            }
        }

        /* renamed from: c */
        public void mo11c(Throwable th, String str, Object... objArr) {
            for (C0000a c : C0001a.f1a) {
                c.mo11c(th, str, objArr);
            }
        }

        /* renamed from: c */
        public void mo10c(Throwable th) {
            for (C0000a c : C0001a.f1a) {
                c.mo10c(th);
            }
        }

        /* renamed from: f */
        public void mo14f(String str, Object... objArr) {
            for (C0000a f : C0001a.f1a) {
                f.mo14f(str, objArr);
            }
        }

        /* renamed from: a */
        public void mo2a(int i, String str, Object... objArr) {
            for (C0000a a : C0001a.f1a) {
                a.mo2a(i, str, objArr);
            }
        }

        /* renamed from: a */
        protected void mo1a(int i, String str, @NotNull String str2, Throwable th) {
            throw new AssertionError("Missing override for log method.");
        }
    }

    /* renamed from: a */
    public static void m22a(@NonNls String str, Object... objArr) {
        f4d.mo3a(str, objArr);
    }

    /* renamed from: b */
    public static void m25b(@NonNls String str, Object... objArr) {
        f4d.mo6b(str, objArr);
    }

    /* renamed from: a */
    public static void m24a(Throwable th, @NonNls String str, Object... objArr) {
        f4d.mo5a(th, str, objArr);
    }

    /* renamed from: a */
    public static void m23a(Throwable th) {
        f4d.mo4a(th);
    }

    /* renamed from: c */
    public static void m28c(@NonNls String str, Object... objArr) {
        f4d.mo9c(str, objArr);
    }

    /* renamed from: d */
    public static void m31d(@NonNls String str, Object... objArr) {
        f4d.mo12d(str, objArr);
    }

    /* renamed from: b */
    public static void m27b(Throwable th, @NonNls String str, Object... objArr) {
        f4d.mo8b(th, str, objArr);
    }

    /* renamed from: b */
    public static void m26b(Throwable th) {
        f4d.mo7b(th);
    }

    /* renamed from: e */
    public static void m32e(@NonNls String str, Object... objArr) {
        f4d.mo13e(str, objArr);
    }

    /* renamed from: c */
    public static void m30c(Throwable th, @NonNls String str, Object... objArr) {
        f4d.mo11c(th, str, objArr);
    }

    /* renamed from: c */
    public static void m29c(Throwable th) {
        f4d.mo10c(th);
    }

    /* renamed from: f */
    public static void m33f(@NonNls String str, Object... objArr) {
        f4d.mo14f(str, objArr);
    }

    /* renamed from: a */
    public static void m20a(int i, @NonNls String str, Object... objArr) {
        f4d.mo2a(i, str, objArr);
    }

    /* renamed from: a */
    public static void m21a(@NotNull C0000a c0000a) {
        if (c0000a == null) {
            throw new NullPointerException("tree == null");
        } else if (c0000a == f4d) {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        } else {
            synchronized (f3c) {
                f3c.add(c0000a);
                f1a = (C0000a[]) f3c.toArray(new C0000a[f3c.size()]);
            }
        }
    }

    private C0001a() {
        throw new AssertionError("No instances.");
    }
}
