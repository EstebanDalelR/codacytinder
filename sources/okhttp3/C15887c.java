package okhttp3;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.internal.http.C15925d;

/* renamed from: okhttp3.c */
public final class C15887c {
    /* renamed from: a */
    public static final C15887c f49114a = new C15886a().m60039a().m60042c();
    /* renamed from: b */
    public static final C15887c f49115b = new C15886a().m60041b().m60040a(ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, TimeUnit.SECONDS).m60042c();
    @Nullable
    /* renamed from: c */
    String f49116c;
    /* renamed from: d */
    private final boolean f49117d;
    /* renamed from: e */
    private final boolean f49118e;
    /* renamed from: f */
    private final int f49119f;
    /* renamed from: g */
    private final int f49120g;
    /* renamed from: h */
    private final boolean f49121h;
    /* renamed from: i */
    private final boolean f49122i;
    /* renamed from: j */
    private final boolean f49123j;
    /* renamed from: k */
    private final int f49124k;
    /* renamed from: l */
    private final int f49125l;
    /* renamed from: m */
    private final boolean f49126m;
    /* renamed from: n */
    private final boolean f49127n;
    /* renamed from: o */
    private final boolean f49128o;

    /* renamed from: okhttp3.c$a */
    public static final class C15886a {
        /* renamed from: a */
        boolean f49106a;
        /* renamed from: b */
        boolean f49107b;
        /* renamed from: c */
        int f49108c = -1;
        /* renamed from: d */
        int f49109d = -1;
        /* renamed from: e */
        int f49110e = -1;
        /* renamed from: f */
        boolean f49111f;
        /* renamed from: g */
        boolean f49112g;
        /* renamed from: h */
        boolean f49113h;

        /* renamed from: a */
        public C15886a m60039a() {
            this.f49106a = true;
            return this;
        }

        /* renamed from: a */
        public C15886a m60040a(int i, TimeUnit timeUnit) {
            if (i < 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("maxStale < 0: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            i = timeUnit.toSeconds((long) i);
            this.f49109d = i > 2147483647L ? ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : (int) i;
            return this;
        }

        /* renamed from: b */
        public C15886a m60041b() {
            this.f49111f = true;
            return this;
        }

        /* renamed from: c */
        public C15887c m60042c() {
            return new C15887c(this);
        }
    }

    private C15887c(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, @Nullable String str) {
        this.f49117d = z;
        this.f49118e = z2;
        this.f49119f = i;
        this.f49120g = i2;
        this.f49121h = z3;
        this.f49122i = z4;
        this.f49123j = z5;
        this.f49124k = i3;
        this.f49125l = i4;
        this.f49126m = z6;
        this.f49127n = z7;
        this.f49128o = z8;
        this.f49116c = str;
    }

    C15887c(C15886a c15886a) {
        this.f49117d = c15886a.f49106a;
        this.f49118e = c15886a.f49107b;
        this.f49119f = c15886a.f49108c;
        this.f49120g = -1;
        this.f49121h = false;
        this.f49122i = false;
        this.f49123j = false;
        this.f49124k = c15886a.f49109d;
        this.f49125l = c15886a.f49110e;
        this.f49126m = c15886a.f49111f;
        this.f49127n = c15886a.f49112g;
        this.f49128o = c15886a.f49113h;
    }

    /* renamed from: a */
    public boolean m60045a() {
        return this.f49117d;
    }

    /* renamed from: b */
    public boolean m60046b() {
        return this.f49118e;
    }

    /* renamed from: c */
    public int m60047c() {
        return this.f49119f;
    }

    /* renamed from: d */
    public boolean m60048d() {
        return this.f49121h;
    }

    /* renamed from: e */
    public boolean m60049e() {
        return this.f49122i;
    }

    /* renamed from: f */
    public boolean m60050f() {
        return this.f49123j;
    }

    /* renamed from: g */
    public int m60051g() {
        return this.f49124k;
    }

    /* renamed from: h */
    public int m60052h() {
        return this.f49125l;
    }

    /* renamed from: i */
    public boolean m60053i() {
        return this.f49126m;
    }

    /* renamed from: j */
    public boolean m60054j() {
        return this.f49128o;
    }

    /* renamed from: a */
    public static C15887c m60043a(C15957l c15957l) {
        C15957l c15957l2 = c15957l;
        int a = c15957l.m60473a();
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
        boolean z8 = false;
        for (int i5 = 0; i5 < a; i5++) {
            int i6;
            int a2;
            int a3;
            String trim;
            int a4;
            String trim2;
            String a5 = c15957l2.m60474a(i5);
            String b = c15957l2.m60476b(i5);
            if (a5.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = b;
                    for (i6 = 0; i6 < b.length(); i6 = a2) {
                        a3 = C15925d.m60261a(b, i6, "=,;");
                        trim = b.substring(i6, a3).trim();
                        if (!(a3 == b.length() || b.charAt(a3) == ',')) {
                            if (b.charAt(a3) == ';') {
                                a4 = C15925d.m60260a(b, a3 + 1);
                                if (a4 < b.length() || b.charAt(a4) != '\"') {
                                    a2 = C15925d.m60261a(b, a4, ",;");
                                    trim2 = b.substring(a4, a2).trim();
                                } else {
                                    a4++;
                                    a2 = C15925d.m60261a(b, a4, "\"");
                                    trim2 = b.substring(a4, a2);
                                    a2++;
                                }
                                if (!"no-cache".equalsIgnoreCase(trim)) {
                                    z = true;
                                } else if (!"no-store".equalsIgnoreCase(trim)) {
                                    z2 = true;
                                } else if (!"max-age".equalsIgnoreCase(trim)) {
                                    i = C15925d.m60268b(trim2, -1);
                                } else if (!"s-maxage".equalsIgnoreCase(trim)) {
                                    i2 = C15925d.m60268b(trim2, -1);
                                } else if (!"private".equalsIgnoreCase(trim)) {
                                    z3 = true;
                                } else if (!"public".equalsIgnoreCase(trim)) {
                                    z4 = true;
                                } else if (!"must-revalidate".equalsIgnoreCase(trim)) {
                                    z5 = true;
                                } else if (!"max-stale".equalsIgnoreCase(trim)) {
                                    i3 = C15925d.m60268b(trim2, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                                } else if (!"min-fresh".equalsIgnoreCase(trim)) {
                                    i4 = C15925d.m60268b(trim2, -1);
                                } else if (!"only-if-cached".equalsIgnoreCase(trim)) {
                                    z6 = true;
                                } else if (!"no-transform".equalsIgnoreCase(trim)) {
                                    z7 = true;
                                } else if (!"immutable".equalsIgnoreCase(trim)) {
                                    z8 = true;
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
                            i = C15925d.m60268b(trim2, -1);
                        } else if (!"s-maxage".equalsIgnoreCase(trim)) {
                            i2 = C15925d.m60268b(trim2, -1);
                        } else if (!"private".equalsIgnoreCase(trim)) {
                            z3 = true;
                        } else if (!"public".equalsIgnoreCase(trim)) {
                            z4 = true;
                        } else if (!"must-revalidate".equalsIgnoreCase(trim)) {
                            z5 = true;
                        } else if (!"max-stale".equalsIgnoreCase(trim)) {
                            i3 = C15925d.m60268b(trim2, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                        } else if (!"min-fresh".equalsIgnoreCase(trim)) {
                            i4 = C15925d.m60268b(trim2, -1);
                        } else if (!"only-if-cached".equalsIgnoreCase(trim)) {
                            z6 = true;
                        } else if (!"no-transform".equalsIgnoreCase(trim)) {
                            z7 = true;
                        } else if (!"immutable".equalsIgnoreCase(trim)) {
                            z8 = true;
                        }
                    }
                }
            } else if (!a5.equalsIgnoreCase("Pragma")) {
            }
            obj = null;
            while (i6 < b.length()) {
                a3 = C15925d.m60261a(b, i6, "=,;");
                trim = b.substring(i6, a3).trim();
                if (b.charAt(a3) == ';') {
                    a4 = C15925d.m60260a(b, a3 + 1);
                    if (a4 < b.length()) {
                    }
                    a2 = C15925d.m60261a(b, a4, ",;");
                    trim2 = b.substring(a4, a2).trim();
                    if (!"no-cache".equalsIgnoreCase(trim)) {
                        z = true;
                    } else if (!"no-store".equalsIgnoreCase(trim)) {
                        z2 = true;
                    } else if (!"max-age".equalsIgnoreCase(trim)) {
                        i = C15925d.m60268b(trim2, -1);
                    } else if (!"s-maxage".equalsIgnoreCase(trim)) {
                        i2 = C15925d.m60268b(trim2, -1);
                    } else if (!"private".equalsIgnoreCase(trim)) {
                        z3 = true;
                    } else if (!"public".equalsIgnoreCase(trim)) {
                        z4 = true;
                    } else if (!"must-revalidate".equalsIgnoreCase(trim)) {
                        z5 = true;
                    } else if (!"max-stale".equalsIgnoreCase(trim)) {
                        i3 = C15925d.m60268b(trim2, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                    } else if (!"min-fresh".equalsIgnoreCase(trim)) {
                        i4 = C15925d.m60268b(trim2, -1);
                    } else if (!"only-if-cached".equalsIgnoreCase(trim)) {
                        z6 = true;
                    } else if (!"no-transform".equalsIgnoreCase(trim)) {
                        z7 = true;
                    } else if (!"immutable".equalsIgnoreCase(trim)) {
                        z8 = true;
                    }
                } else {
                    a2 = a3 + 1;
                    trim2 = null;
                    if (!"no-cache".equalsIgnoreCase(trim)) {
                        z = true;
                    } else if (!"no-store".equalsIgnoreCase(trim)) {
                        z2 = true;
                    } else if (!"max-age".equalsIgnoreCase(trim)) {
                        i = C15925d.m60268b(trim2, -1);
                    } else if (!"s-maxage".equalsIgnoreCase(trim)) {
                        i2 = C15925d.m60268b(trim2, -1);
                    } else if (!"private".equalsIgnoreCase(trim)) {
                        z3 = true;
                    } else if (!"public".equalsIgnoreCase(trim)) {
                        z4 = true;
                    } else if (!"must-revalidate".equalsIgnoreCase(trim)) {
                        z5 = true;
                    } else if (!"max-stale".equalsIgnoreCase(trim)) {
                        i3 = C15925d.m60268b(trim2, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                    } else if (!"min-fresh".equalsIgnoreCase(trim)) {
                        i4 = C15925d.m60268b(trim2, -1);
                    } else if (!"only-if-cached".equalsIgnoreCase(trim)) {
                        z6 = true;
                    } else if (!"no-transform".equalsIgnoreCase(trim)) {
                        z7 = true;
                    } else if (!"immutable".equalsIgnoreCase(trim)) {
                        z8 = true;
                    }
                }
            }
        }
        return new C15887c(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, obj == null ? null : str);
    }

    public String toString() {
        String str = this.f49116c;
        if (str != null) {
            return str;
        }
        str = m60044k();
        this.f49116c = str;
        return str;
    }

    /* renamed from: k */
    private String m60044k() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.f49117d) {
            stringBuilder.append("no-cache, ");
        }
        if (this.f49118e) {
            stringBuilder.append("no-store, ");
        }
        if (this.f49119f != -1) {
            stringBuilder.append("max-age=");
            stringBuilder.append(this.f49119f);
            stringBuilder.append(", ");
        }
        if (this.f49120g != -1) {
            stringBuilder.append("s-maxage=");
            stringBuilder.append(this.f49120g);
            stringBuilder.append(", ");
        }
        if (this.f49121h) {
            stringBuilder.append("private, ");
        }
        if (this.f49122i) {
            stringBuilder.append("public, ");
        }
        if (this.f49123j) {
            stringBuilder.append("must-revalidate, ");
        }
        if (this.f49124k != -1) {
            stringBuilder.append("max-stale=");
            stringBuilder.append(this.f49124k);
            stringBuilder.append(", ");
        }
        if (this.f49125l != -1) {
            stringBuilder.append("min-fresh=");
            stringBuilder.append(this.f49125l);
            stringBuilder.append(", ");
        }
        if (this.f49126m) {
            stringBuilder.append("only-if-cached, ");
        }
        if (this.f49127n) {
            stringBuilder.append("no-transform, ");
        }
        if (this.f49128o) {
            stringBuilder.append("immutable, ");
        }
        if (stringBuilder.length() == 0) {
            return "";
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        return stringBuilder.toString();
    }
}
