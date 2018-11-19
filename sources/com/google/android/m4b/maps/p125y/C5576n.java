package com.google.android.m4b.maps.p125y;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import java.util.Iterator;

/* renamed from: com.google.android.m4b.maps.y.n */
public final class C5576n {
    /* renamed from: a */
    private final C6846d f20573a;
    /* renamed from: b */
    private final boolean f20574b;
    /* renamed from: c */
    private final C5575b f20575c;
    /* renamed from: d */
    private final int f20576d;

    /* renamed from: com.google.android.m4b.maps.y.n$b */
    interface C5575b {
        /* renamed from: a */
        Iterator<String> mo5821a(C5576n c5576n, CharSequence charSequence);
    }

    /* renamed from: com.google.android.m4b.maps.y.n$a */
    static abstract class C6857a extends C5561b<String> {
        /* renamed from: a */
        final CharSequence f25412a;
        /* renamed from: b */
        private C6846d f25413b;
        /* renamed from: c */
        private boolean f25414c;
        /* renamed from: d */
        private int f25415d = 0;
        /* renamed from: e */
        private int f25416e;

        /* renamed from: a */
        abstract int mo7255a(int i);

        /* renamed from: b */
        abstract int mo7256b(int i);

        protected C6857a(C5576n c5576n, CharSequence charSequence) {
            this.f25413b = c5576n.f20573a;
            this.f25414c = c5576n.f20574b;
            this.f25416e = c5576n.f20576d;
            this.f25412a = charSequence;
        }

        /* renamed from: a */
        protected final /* synthetic */ Object mo5822a() {
            int i = this.f25415d;
            while (this.f25415d != -1) {
                int a = mo7255a(this.f25415d);
                if (a == -1) {
                    a = this.f25412a.length();
                    this.f25415d = -1;
                } else {
                    this.f25415d = mo7256b(a);
                }
                if (this.f25415d == i) {
                    this.f25415d++;
                    if (this.f25415d >= this.f25412a.length()) {
                        this.f25415d = -1;
                    }
                } else {
                    while (i < a && this.f25413b.mo7019a(this.f25412a.charAt(i))) {
                        i++;
                    }
                    while (a > i && this.f25413b.mo7019a(this.f25412a.charAt(a - 1))) {
                        a--;
                    }
                    if (this.f25414c && i == a) {
                        i = this.f25415d;
                    } else {
                        if (this.f25416e == 1) {
                            a = this.f25412a.length();
                            this.f25415d = -1;
                            while (a > i && this.f25413b.mo7019a(this.f25412a.charAt(a - 1))) {
                                a--;
                            }
                        } else {
                            this.f25416e--;
                        }
                        return this.f25412a.subSequence(i, a).toString();
                    }
                }
            }
            m24255b();
            return null;
        }
    }

    private C5576n(C5575b c5575b) {
        this(c5575b, false, C6846d.f25386f, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    private C5576n(C5575b c5575b, boolean z, C6846d c6846d, int i) {
        this.f20575c = c5575b;
        this.f20574b = null;
        this.f20573a = c6846d;
        this.f20576d = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    /* renamed from: a */
    public static C5576n m24310a(int i) {
        C5571j.m24298a(true, (Object) "The length may not be less than 1");
        return new C5576n(new C5575b(2) {
            /* renamed from: a */
            public final /* synthetic */ Iterator mo5821a(C5576n c5576n, CharSequence charSequence) {
                return new C6857a(this, c5576n, charSequence) {
                    /* renamed from: b */
                    private /* synthetic */ C68561 f28191b;

                    /* renamed from: b */
                    public final int mo7256b(int i) {
                        return i;
                    }

                    /* renamed from: a */
                    public final int mo7255a(int i) {
                        i += 2;
                        return i < this.a.length() ? i : -1;
                    }
                };
            }
        });
    }

    /* renamed from: a */
    public final Iterable<String> m24314a(final CharSequence charSequence) {
        C5571j.m24292a((Object) charSequence);
        return new Iterable<String>(this) {
            /* renamed from: b */
            private /* synthetic */ C5576n f20572b;

            public final Iterator<String> iterator() {
                return this.f20572b.f20575c.mo5821a(this.f20572b, charSequence);
            }

            public final String toString() {
                StringBuilder a = C5566g.m24266a(", ").m24272a(new StringBuilder("["), iterator());
                a.append(']');
                return a.toString();
            }
        };
    }
}
