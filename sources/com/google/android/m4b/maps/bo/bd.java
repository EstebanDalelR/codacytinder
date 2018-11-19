package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ax.C4699a;
import com.google.android.m4b.maps.ax.C4699a.C7436c;
import com.google.android.m4b.maps.ax.C4701c;
import com.google.android.m4b.maps.bo.C6516c.C4844a;
import com.google.android.m4b.maps.bo.C6522m.C4849a;
import com.google.android.m4b.maps.bo.aq.C4837a;
import com.google.android.m4b.maps.bo.bi.C4841a;

public interface bd extends Comparable<bd> {

    /* renamed from: com.google.android.m4b.maps.bo.bd$a */
    public enum C4839a {
        SPOTLIGHT {
            /* renamed from: a */
            public final bd mo5117a(C4662a c4662a) {
                return (bg.m21669a(c4662a.m20835d(1)) == bg.f17762r && c4662a.m20845j(10)) ? new C4837a().m21542a(c4662a.m20843h(10)).m21543a() : null;
            }
        },
        SPOTLIGHT_DIFFTILE {
            /* renamed from: a */
            public final bd mo5117a(C4662a c4662a) {
                return (bg.m21669a(c4662a.m20835d(1)) == bg.f17766v && c4662a.m20845j(27)) ? new ap(c4662a.m20842g(27)) : null;
            }

            /* renamed from: a */
            public final bg mo5118a() {
                return bg.f17766v;
            }
        },
        HIGHLIGHT {
            /* renamed from: a */
            public final bd mo5117a(C4662a c4662a) {
                return (bg.m21669a(c4662a.m20835d(1)) == bg.f17763s && c4662a.m20845j(9)) ? new C4849a().m21756a(c4662a.m20843h(9)).m21757a() : null;
            }
        },
        INDOOR {
            /* renamed from: a */
            public final bd mo5117a(C4662a c4662a) {
                return (bg.m21669a(c4662a.m20835d(1)) == bg.f17758n && c4662a.m20845j(6)) ? C6526r.m28761a(new C4701c(C7436c.m32017b(c4662a.m20843h(6)), Integer.MIN_VALUE)) : null;
            }
        },
        TRANSIT {
            /* renamed from: a */
            public final bd mo5117a(C4662a c4662a) {
                if (bg.m21669a(c4662a.m20835d(1)) != bg.f17757m) {
                    return null;
                }
                C4841a c4841a = new C4841a();
                if (c4662a.m20845j(9)) {
                    c4841a.m21687a(C4699a.m20895a(c4662a.m20843h(9)));
                }
                int k = c4662a.m20846k(12);
                for (int i = 0; i < k; i++) {
                    c4841a.m21686a(c4662a.m20826b(12, i));
                }
                c4662a = c4841a.m21688a();
                if (c4662a.mo5116a(bg.f17757m)) {
                    return c4662a;
                }
                return null;
            }
        },
        MAPS_ENGINE {
            /* renamed from: a */
            public final bd mo5117a(C4662a c4662a) {
                bg a = bg.m21669a(c4662a.m20835d(1));
                if (a != bg.f17768x) {
                    if (a != bg.f17767w) {
                        return null;
                    }
                }
                bd c6529z = new C6529z(c4662a.m20842g(29));
                if (c6529z.mo5116a(a) != null) {
                    return c6529z;
                }
                return null;
            }
        },
        ALTERNATE_PAINTFE {
            /* renamed from: a */
            public final bd mo5117a(C4662a c4662a) {
                bg.m21669a(c4662a.m20835d(1));
                return c4662a.m20845j(13) ? new C4844a().m21738a(c4662a.m20843h(13)).m21739a() : null;
            }
        };

        /* renamed from: a */
        public abstract bd mo5117a(C4662a c4662a);

        /* renamed from: a */
        public bg mo5118a() {
            return null;
        }
    }

    /* renamed from: a */
    C4839a mo5113a();

    /* renamed from: a */
    void mo5114a(C4662a c4662a);

    /* renamed from: a */
    boolean mo5115a(bd bdVar);

    /* renamed from: a */
    boolean mo5116a(bg bgVar);
}
