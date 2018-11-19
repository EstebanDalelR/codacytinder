package com.google.android.m4b.maps.ct;

/* renamed from: com.google.android.m4b.maps.ct.c */
public abstract class C6648c<MessageType extends C6656q> implements C5279t<MessageType> {
    /* renamed from: a */
    private static final C5262h f24928a = C5262h.m23371a();

    /* renamed from: b */
    private MessageType m29673b(C5255d c5255d, C5262h c5262h) {
        C6656q c6656q;
        try {
            c5255d = c5255d.mo5383d();
            c6656q = (C6656q) mo7226a((C5257e) c5255d, c5262h);
            c5255d.m23292a(0);
            return c6656q;
        } catch (C5255d c5255d2) {
            throw c5255d2.m23418a(c6656q);
        } catch (C5255d c5255d22) {
            throw c5255d22;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5369a(C5255d c5255d, C5262h c5262h) {
        c5255d = m29673b(c5255d, c5262h);
        if (c5255d == null || c5255d.mo7578j() != null) {
            return c5255d;
        }
        if ((c5255d instanceof C7527a) != null) {
            C7527a c7527a = (C7527a) c5255d;
            c5262h = new C5290w();
        } else if ((c5255d instanceof C8083b) != null) {
            C8083b c8083b = (C8083b) c5255d;
            c5262h = new C5290w();
        } else {
            c5262h = new C5290w();
        }
        throw new C5274m(c5262h.getMessage()).m23418a(c5255d);
    }
}
