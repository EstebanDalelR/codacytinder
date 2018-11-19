package com.squareup.okhttp;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.squareup.okhttp.internal.http.C6045d;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.okhttp.c */
public final class C6000c {
    /* renamed from: a */
    public static final C6000c f21934a = new C5999a().m25789a().m25793d();
    /* renamed from: b */
    public static final C6000c f21935b = new C5999a().m25792c().m25790a(ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, TimeUnit.SECONDS).m25793d();
    /* renamed from: c */
    String f21936c;
    /* renamed from: d */
    private final boolean f21937d;
    /* renamed from: e */
    private final boolean f21938e;
    /* renamed from: f */
    private final int f21939f;
    /* renamed from: g */
    private final int f21940g;
    /* renamed from: h */
    private final boolean f21941h;
    /* renamed from: i */
    private final boolean f21942i;
    /* renamed from: j */
    private final boolean f21943j;
    /* renamed from: k */
    private final int f21944k;
    /* renamed from: l */
    private final int f21945l;
    /* renamed from: m */
    private final boolean f21946m;
    /* renamed from: n */
    private final boolean f21947n;

    /* renamed from: com.squareup.okhttp.c$a */
    public static final class C5999a {
        /* renamed from: a */
        boolean f21927a;
        /* renamed from: b */
        boolean f21928b;
        /* renamed from: c */
        int f21929c = -1;
        /* renamed from: d */
        int f21930d = -1;
        /* renamed from: e */
        int f21931e = -1;
        /* renamed from: f */
        boolean f21932f;
        /* renamed from: g */
        boolean f21933g;

        /* renamed from: a */
        public C5999a m25789a() {
            this.f21927a = true;
            return this;
        }

        /* renamed from: b */
        public C5999a m25791b() {
            this.f21928b = true;
            return this;
        }

        /* renamed from: a */
        public C5999a m25790a(int i, TimeUnit timeUnit) {
            if (i < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("maxStale < 0: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            i = timeUnit.toSeconds((long) i);
            this.f21930d = i > 2147483647L ? ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : (int) i;
            return this;
        }

        /* renamed from: c */
        public C5999a m25792c() {
            this.f21932f = true;
            return this;
        }

        /* renamed from: d */
        public C6000c m25793d() {
            return new C6000c();
        }
    }

    private C6000c(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, String str) {
        this.f21937d = z;
        this.f21938e = z2;
        this.f21939f = i;
        this.f21940g = i2;
        this.f21941h = z3;
        this.f21942i = z4;
        this.f21943j = z5;
        this.f21944k = i3;
        this.f21945l = i4;
        this.f21946m = z6;
        this.f21947n = z7;
        this.f21936c = str;
    }

    private C6000c(C5999a c5999a) {
        this.f21937d = c5999a.f21927a;
        this.f21938e = c5999a.f21928b;
        this.f21939f = c5999a.f21929c;
        this.f21940g = -1;
        this.f21941h = false;
        this.f21942i = false;
        this.f21943j = false;
        this.f21944k = c5999a.f21930d;
        this.f21945l = c5999a.f21931e;
        this.f21946m = c5999a.f21932f;
        this.f21947n = c5999a.f21933g;
    }

    /* renamed from: a */
    public boolean m25796a() {
        return this.f21937d;
    }

    /* renamed from: b */
    public boolean m25797b() {
        return this.f21938e;
    }

    /* renamed from: c */
    public int m25798c() {
        return this.f21939f;
    }

    /* renamed from: d */
    public boolean m25799d() {
        return this.f21941h;
    }

    /* renamed from: e */
    public boolean m25800e() {
        return this.f21942i;
    }

    /* renamed from: f */
    public boolean m25801f() {
        return this.f21943j;
    }

    /* renamed from: g */
    public int m25802g() {
        return this.f21944k;
    }

    /* renamed from: h */
    public int m25803h() {
        return this.f21945l;
    }

    /* renamed from: i */
    public boolean m25804i() {
        return this.f21946m;
    }

    /* renamed from: a */
    public static C6000c m25794a(C6066n c6066n) {
        C6066n c6066n2 = c6066n;
        int a = c6066n.m26282a();
        Object obj = 1;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i3 = -1;
        int i4 = -1;
        boolean z6 = false;
        boolean z7 = false;
        for (int i5 = 0; i5 < a; i5++) {
            int a2;
            int a3;
            String trim;
            int a4;
            String trim2;
            String a5 = c6066n2.m26283a(i5);
            String b = c6066n2.m26286b(i5);
            if (a5.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = b;
                    int i6;
                    for (i6 = 0; i6 < b.length(); i6 = a2) {
                        a3 = C6045d.m26134a(b, i6, "=,;");
                        trim = b.substring(i6, a3).trim();
                        if (!(a3 == b.length() || b.charAt(a3) == ',')) {
                            if (b.charAt(a3) == ';') {
                                a4 = C6045d.m26133a(b, a3 + 1);
                                if (a4 < b.length() || b.charAt(a4) != '\"') {
                                    a2 = C6045d.m26134a(b, a4, ",;");
                                    trim2 = b.substring(a4, a2).trim();
                                } else {
                                    a4++;
                                    a2 = C6045d.m26134a(b, a4, "\"");
                                    trim2 = b.substring(a4, a2);
                                    a2++;
                                }
                                if (!"no-cache".equalsIgnoreCase(trim)) {
                                    z = true;
                                } else if (!"no-store".equalsIgnoreCase(trim)) {
                                    z2 = true;
                                } else if (!"max-age".equalsIgnoreCase(trim)) {
                                    i = C6045d.m26135b(trim2, -1);
                                } else if (!"s-maxage".equalsIgnoreCase(trim)) {
                                    i2 = C6045d.m26135b(trim2, -1);
                                } else if (!"private".equalsIgnoreCase(trim)) {
                                    z3 = true;
                                } else if (!"public".equalsIgnoreCase(trim)) {
                                    z4 = true;
                                } else if (!"must-revalidate".equalsIgnoreCase(trim)) {
                                    z5 = true;
                                } else if (!"max-stale".equalsIgnoreCase(trim)) {
                                    i3 = C6045d.m26135b(trim2, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                                } else if (!"min-fresh".equalsIgnoreCase(trim)) {
                                    i4 = C6045d.m26135b(trim2, -1);
                                } else if (!"only-if-cached".equalsIgnoreCase(trim)) {
                                    z6 = true;
                                } else if (!"no-transform".equalsIgnoreCase(trim)) {
                                    z7 = true;
                                }
                            }
                        }
                        a2 = a3 + 1;
                        trim2 = null;
                        if (!"no-cache".equalsIgnoreCase(trim)) {
                            z = true;
                        } else if (!"no-store".equalsIgnoreCase(trim)) {
                            z2 = true;
                        } else if (!"max-age".equalsIgnoreCase(trim)) {
                            i = C6045d.m26135b(trim2, -1);
                        } else if (!"s-maxage".equalsIgnoreCase(trim)) {
                            i2 = C6045d.m26135b(trim2, -1);
                        } else if (!"private".equalsIgnoreCase(trim)) {
                            z3 = true;
                        } else if (!"public".equalsIgnoreCase(trim)) {
                            z4 = true;
                        } else if (!"must-revalidate".equalsIgnoreCase(trim)) {
                            z5 = true;
                        } else if (!"max-stale".equalsIgnoreCase(trim)) {
                            i3 = C6045d.m26135b(trim2, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                        } else if (!"min-fresh".equalsIgnoreCase(trim)) {
                            i4 = C6045d.m26135b(trim2, -1);
                        } else if (!"only-if-cached".equalsIgnoreCase(trim)) {
                            z6 = true;
                        } else if (!"no-transform".equalsIgnoreCase(trim)) {
                            z7 = true;
                        }
                    }
                }
            } else if (!a5.equalsIgnoreCase("Pragma")) {
            }
            obj = null;
            while (i6 < b.length()) {
                a3 = C6045d.m26134a(b, i6, "=,;");
                trim = b.substring(i6, a3).trim();
                if (b.charAt(a3) == ';') {
                    a4 = C6045d.m26133a(b, a3 + 1);
                    if (a4 < b.length()) {
                    }
                    a2 = C6045d.m26134a(b, a4, ",;");
                    trim2 = b.substring(a4, a2).trim();
                    if (!"no-cache".equalsIgnoreCase(trim)) {
                        z = true;
                    } else if (!"no-store".equalsIgnoreCase(trim)) {
                        z2 = true;
                    } else if (!"max-age".equalsIgnoreCase(trim)) {
                        i = C6045d.m26135b(trim2, -1);
                    } else if (!"s-maxage".equalsIgnoreCase(trim)) {
                        i2 = C6045d.m26135b(trim2, -1);
                    } else if (!"private".equalsIgnoreCase(trim)) {
                        z3 = true;
                    } else if (!"public".equalsIgnoreCase(trim)) {
                        z4 = true;
                    } else if (!"must-revalidate".equalsIgnoreCase(trim)) {
                        z5 = true;
                    } else if (!"max-stale".equalsIgnoreCase(trim)) {
                        i3 = C6045d.m26135b(trim2, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                    } else if (!"min-fresh".equalsIgnoreCase(trim)) {
                        i4 = C6045d.m26135b(trim2, -1);
                    } else if (!"only-if-cached".equalsIgnoreCase(trim)) {
                        z6 = true;
                    } else if (!"no-transform".equalsIgnoreCase(trim)) {
                        z7 = true;
                    }
                } else {
                    a2 = a3 + 1;
                    trim2 = null;
                    if (!"no-cache".equalsIgnoreCase(trim)) {
                        z = true;
                    } else if (!"no-store".equalsIgnoreCase(trim)) {
                        z2 = true;
                    } else if (!"max-age".equalsIgnoreCase(trim)) {
                        i = C6045d.m26135b(trim2, -1);
                    } else if (!"s-maxage".equalsIgnoreCase(trim)) {
                        i2 = C6045d.m26135b(trim2, -1);
                    } else if (!"private".equalsIgnoreCase(trim)) {
                        z3 = true;
                    } else if (!"public".equalsIgnoreCase(trim)) {
                        z4 = true;
                    } else if (!"must-revalidate".equalsIgnoreCase(trim)) {
                        z5 = true;
                    } else if (!"max-stale".equalsIgnoreCase(trim)) {
                        i3 = C6045d.m26135b(trim2, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                    } else if (!"min-fresh".equalsIgnoreCase(trim)) {
                        i4 = C6045d.m26135b(trim2, -1);
                    } else if (!"only-if-cached".equalsIgnoreCase(trim)) {
                        z6 = true;
                    } else if (!"no-transform".equalsIgnoreCase(trim)) {
                        z7 = true;
                    }
                }
            }
        }
        return new C6000c(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, obj == null ? null : str);
    }

    public String toString() {
        String str = this.f21936c;
        if (str != null) {
            return str;
        }
        str = m25795j();
        this.f21936c = str;
        return str;
    }

    /* renamed from: j */
    private String m25795j() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.f21937d) {
            stringBuilder.append("no-cache, ");
        }
        if (this.f21938e) {
            stringBuilder.append("no-store, ");
        }
        if (this.f21939f != -1) {
            stringBuilder.append("max-age=");
            stringBuilder.append(this.f21939f);
            stringBuilder.append(", ");
        }
        if (this.f21940g != -1) {
            stringBuilder.append("s-maxage=");
            stringBuilder.append(this.f21940g);
            stringBuilder.append(", ");
        }
        if (this.f21941h) {
            stringBuilder.append("private, ");
        }
        if (this.f21942i) {
            stringBuilder.append("public, ");
        }
        if (this.f21943j) {
            stringBuilder.append("must-revalidate, ");
        }
        if (this.f21944k != -1) {
            stringBuilder.append("max-stale=");
            stringBuilder.append(this.f21944k);
            stringBuilder.append(", ");
        }
        if (this.f21945l != -1) {
            stringBuilder.append("min-fresh=");
            stringBuilder.append(this.f21945l);
            stringBuilder.append(", ");
        }
        if (this.f21946m) {
            stringBuilder.append("only-if-cached, ");
        }
        if (this.f21947n) {
            stringBuilder.append("no-transform, ");
        }
        if (stringBuilder.length() == 0) {
            return "";
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        return stringBuilder.toString();
    }
}
