package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.C2302k;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: com.google.android.exoplayer2.extractor.flv.c */
final class C3628c extends TagPayloadReader {
    /* renamed from: b */
    private long f10987b = -9223372036854775807L;

    /* renamed from: a */
    protected boolean mo2278a(C2302k c2302k) {
        return true;
    }

    public C3628c() {
        super(null);
    }

    /* renamed from: a */
    public long m13655a() {
        return this.f10987b;
    }

    /* renamed from: a */
    protected void mo2277a(C2302k c2302k, long j) throws ParserException {
        if (C3628c.m13647b(c2302k) != 2) {
            throw new ParserException();
        }
        if ("onMetaData".equals(C3628c.m13650e(c2302k)) != null && C3628c.m13647b(c2302k) == 8) {
            c2302k = C3628c.m13653h(c2302k);
            if (c2302k.containsKey(ManagerWebServices.PARAM_DURATION) != null) {
                c2302k = ((Double) c2302k.get(ManagerWebServices.PARAM_DURATION)).doubleValue();
                if (c2302k > 0.0d) {
                    this.f10987b = (long) (c2302k * 1000000.0d);
                }
            }
        }
    }

    /* renamed from: b */
    private static int m13647b(C2302k c2302k) {
        return c2302k.m8395g();
    }

    /* renamed from: c */
    private static Boolean m13648c(C2302k c2302k) {
        boolean z = true;
        if (c2302k.m8395g() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: d */
    private static Double m13649d(C2302k c2302k) {
        return Double.valueOf(Double.longBitsToDouble(c2302k.m8405q()));
    }

    /* renamed from: e */
    private static String m13650e(C2302k c2302k) {
        int h = c2302k.m8396h();
        int d = c2302k.m8389d();
        c2302k.m8390d(h);
        return new String(c2302k.f6929a, d, h);
    }

    /* renamed from: f */
    private static ArrayList<Object> m13651f(C2302k c2302k) {
        int u = c2302k.m8409u();
        ArrayList<Object> arrayList = new ArrayList(u);
        for (int i = 0; i < u; i++) {
            arrayList.add(C3628c.m13646a(c2302k, C3628c.m13647b(c2302k)));
        }
        return arrayList;
    }

    /* renamed from: g */
    private static HashMap<String, Object> m13652g(C2302k c2302k) {
        HashMap<String, Object> hashMap = new HashMap();
        while (true) {
            String e = C3628c.m13650e(c2302k);
            int b = C3628c.m13647b(c2302k);
            if (b == 9) {
                return hashMap;
            }
            hashMap.put(e, C3628c.m13646a(c2302k, b));
        }
    }

    /* renamed from: h */
    private static HashMap<String, Object> m13653h(C2302k c2302k) {
        int u = c2302k.m8409u();
        HashMap<String, Object> hashMap = new HashMap(u);
        for (int i = 0; i < u; i++) {
            hashMap.put(C3628c.m13650e(c2302k), C3628c.m13646a(c2302k, C3628c.m13647b(c2302k)));
        }
        return hashMap;
    }

    /* renamed from: i */
    private static Date m13654i(C2302k c2302k) {
        Date date = new Date((long) C3628c.m13649d(c2302k).doubleValue());
        c2302k.m8390d(2);
        return date;
    }

    /* renamed from: a */
    private static Object m13646a(C2302k c2302k, int i) {
        if (i == 8) {
            return C3628c.m13653h(c2302k);
        }
        switch (i) {
            case 0:
                return C3628c.m13649d(c2302k);
            case 1:
                return C3628c.m13648c(c2302k);
            case 2:
                return C3628c.m13650e(c2302k);
            case 3:
                return C3628c.m13652g(c2302k);
            default:
                switch (i) {
                    case 10:
                        return C3628c.m13651f(c2302k);
                    case 11:
                        return C3628c.m13654i(c2302k);
                    default:
                        return null;
                }
        }
    }
}
