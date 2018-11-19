package com.github.pwittchen.reactivenetwork.library.rx2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.NetworkInfo.State;
import android.support.annotation.NonNull;

/* renamed from: com.github.pwittchen.reactivenetwork.library.rx2.a */
public class C1995a {
    /* renamed from: a */
    private State f5410a;
    /* renamed from: b */
    private DetailedState f5411b;
    /* renamed from: c */
    private int f5412c;
    /* renamed from: d */
    private int f5413d;
    /* renamed from: e */
    private boolean f5414e;
    /* renamed from: f */
    private boolean f5415f;
    /* renamed from: g */
    private boolean f5416g;
    /* renamed from: h */
    private String f5417h;
    /* renamed from: i */
    private String f5418i;
    /* renamed from: j */
    private String f5419j;
    /* renamed from: k */
    private String f5420k;

    /* renamed from: com.github.pwittchen.reactivenetwork.library.rx2.a$a */
    public static class C1994a {
        /* renamed from: a */
        private State f5399a = State.DISCONNECTED;
        /* renamed from: b */
        private DetailedState f5400b = DetailedState.IDLE;
        /* renamed from: c */
        private int f5401c = -1;
        /* renamed from: d */
        private int f5402d = -1;
        /* renamed from: e */
        private boolean f5403e = false;
        /* renamed from: f */
        private boolean f5404f = false;
        /* renamed from: g */
        private boolean f5405g = false;
        /* renamed from: h */
        private String f5406h = "NONE";
        /* renamed from: i */
        private String f5407i = "NONE";
        /* renamed from: j */
        private String f5408j = "";
        /* renamed from: k */
        private String f5409k = "";

        /* renamed from: a */
        public C1994a m7190a(State state) {
            this.f5399a = state;
            return this;
        }

        /* renamed from: a */
        public C1994a m7189a(DetailedState detailedState) {
            this.f5400b = detailedState;
            return this;
        }

        /* renamed from: a */
        public C1994a m7188a(int i) {
            this.f5401c = i;
            return this;
        }

        /* renamed from: b */
        public C1994a m7194b(int i) {
            this.f5402d = i;
            return this;
        }

        /* renamed from: a */
        public C1994a m7192a(boolean z) {
            this.f5403e = z;
            return this;
        }

        /* renamed from: b */
        public C1994a m7196b(boolean z) {
            this.f5404f = z;
            return this;
        }

        /* renamed from: c */
        public C1994a m7198c(boolean z) {
            this.f5405g = z;
            return this;
        }

        /* renamed from: a */
        public C1994a m7191a(String str) {
            this.f5406h = str;
            return this;
        }

        /* renamed from: b */
        public C1994a m7195b(String str) {
            this.f5407i = str;
            return this;
        }

        /* renamed from: c */
        public C1994a m7197c(String str) {
            this.f5408j = str;
            return this;
        }

        /* renamed from: d */
        public C1994a m7199d(String str) {
            this.f5409k = str;
            return this;
        }

        /* renamed from: a */
        public C1995a m7193a() {
            return new C1995a(this);
        }
    }

    /* renamed from: a */
    public static C1995a m7200a() {
        return new C1994a().m7193a();
    }

    /* renamed from: a */
    public static C1995a m7201a(@NonNull Context context) {
        C1996b.m7207a(context, "context == null");
        return C1995a.m7202a(context, C1995a.m7204b(context));
    }

    /* renamed from: a */
    protected static C1995a m7202a(@NonNull Context context, ConnectivityManager connectivityManager) {
        C1996b.m7207a(context, "context == null");
        if (connectivityManager == null) {
            return C1995a.m7200a();
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo == null ? C1995a.m7200a() : C1995a.m7203a(activeNetworkInfo);
    }

    /* renamed from: a */
    private static C1995a m7203a(NetworkInfo networkInfo) {
        return new C1994a().m7190a(networkInfo.getState()).m7189a(networkInfo.getDetailedState()).m7188a(networkInfo.getType()).m7194b(networkInfo.getSubtype()).m7192a(networkInfo.isAvailable()).m7196b(networkInfo.isFailover()).m7198c(networkInfo.isRoaming()).m7191a(networkInfo.getTypeName()).m7195b(networkInfo.getSubtypeName()).m7197c(networkInfo.getReason()).m7199d(networkInfo.getExtraInfo()).m7193a();
    }

    protected C1995a() {
        this.f5410a = State.DISCONNECTED;
        this.f5411b = DetailedState.IDLE;
        this.f5412c = -1;
        this.f5413d = -1;
        this.f5414e = false;
        this.f5415f = false;
        this.f5416g = false;
        this.f5417h = "NONE";
        this.f5418i = "NONE";
        this.f5419j = "";
        this.f5420k = "";
    }

    protected C1995a(C1994a c1994a) {
        this.f5410a = c1994a.f5399a;
        this.f5411b = c1994a.f5400b;
        this.f5412c = c1994a.f5401c;
        this.f5413d = c1994a.f5402d;
        this.f5414e = c1994a.f5403e;
        this.f5415f = c1994a.f5404f;
        this.f5416g = c1994a.f5405g;
        this.f5417h = c1994a.f5406h;
        this.f5418i = c1994a.f5407i;
        this.f5419j = c1994a.f5408j;
        this.f5420k = c1994a.f5409k;
    }

    /* renamed from: b */
    private static ConnectivityManager m7204b(Context context) {
        return (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* renamed from: b */
    public State m7205b() {
        return this.f5410a;
    }

    /* renamed from: c */
    public String m7206c() {
        return this.f5417h;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = 0;
        if (r5 == 0) goto L_0x008d;
    L_0x0007:
        r2 = r4.getClass();
        r3 = r5.getClass();
        if (r2 == r3) goto L_0x0013;
    L_0x0011:
        goto L_0x008d;
    L_0x0013:
        r5 = (com.github.pwittchen.reactivenetwork.library.rx2.C1995a) r5;
        r2 = r4.f5412c;
        r3 = r5.f5412c;
        if (r2 == r3) goto L_0x001c;
    L_0x001b:
        return r1;
    L_0x001c:
        r2 = r4.f5413d;
        r3 = r5.f5413d;
        if (r2 == r3) goto L_0x0023;
    L_0x0022:
        return r1;
    L_0x0023:
        r2 = r4.f5414e;
        r3 = r5.f5414e;
        if (r2 == r3) goto L_0x002a;
    L_0x0029:
        return r1;
    L_0x002a:
        r2 = r4.f5415f;
        r3 = r5.f5415f;
        if (r2 == r3) goto L_0x0031;
    L_0x0030:
        return r1;
    L_0x0031:
        r2 = r4.f5416g;
        r3 = r5.f5416g;
        if (r2 == r3) goto L_0x0038;
    L_0x0037:
        return r1;
    L_0x0038:
        r2 = r4.f5410a;
        r3 = r5.f5410a;
        if (r2 == r3) goto L_0x003f;
    L_0x003e:
        return r1;
    L_0x003f:
        r2 = r4.f5411b;
        r3 = r5.f5411b;
        if (r2 == r3) goto L_0x0046;
    L_0x0045:
        return r1;
    L_0x0046:
        r2 = r4.f5417h;
        r3 = r5.f5417h;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0051;
    L_0x0050:
        return r1;
    L_0x0051:
        r2 = r4.f5418i;
        if (r2 == 0) goto L_0x0060;
    L_0x0055:
        r2 = r4.f5418i;
        r3 = r5.f5418i;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0065;
    L_0x005f:
        goto L_0x0064;
    L_0x0060:
        r2 = r5.f5418i;
        if (r2 == 0) goto L_0x0065;
    L_0x0064:
        return r1;
    L_0x0065:
        r2 = r4.f5419j;
        if (r2 == 0) goto L_0x0074;
    L_0x0069:
        r2 = r4.f5419j;
        r3 = r5.f5419j;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0079;
    L_0x0073:
        goto L_0x0078;
    L_0x0074:
        r2 = r5.f5419j;
        if (r2 == 0) goto L_0x0079;
    L_0x0078:
        return r1;
    L_0x0079:
        r2 = r4.f5420k;
        if (r2 == 0) goto L_0x0086;
    L_0x007d:
        r0 = r4.f5420k;
        r5 = r5.f5420k;
        r0 = r0.equals(r5);
        goto L_0x008c;
    L_0x0086:
        r5 = r5.f5420k;
        if (r5 != 0) goto L_0x008b;
    L_0x008a:
        goto L_0x008c;
    L_0x008b:
        r0 = 0;
    L_0x008c:
        return r0;
    L_0x008d:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.pwittchen.reactivenetwork.library.rx2.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((((((((this.f5410a.hashCode() * 31) + (this.f5411b != null ? this.f5411b.hashCode() : 0)) * 31) + this.f5412c) * 31) + this.f5413d) * 31) + this.f5414e) * 31) + this.f5415f) * 31) + this.f5416g) * 31) + this.f5417h.hashCode()) * 31) + (this.f5418i != null ? this.f5418i.hashCode() : 0)) * 31) + (this.f5419j != null ? this.f5419j.hashCode() : 0)) * 31;
        if (this.f5420k != null) {
            i = this.f5420k.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Connectivity{state=");
        stringBuilder.append(this.f5410a);
        stringBuilder.append(", detailedState=");
        stringBuilder.append(this.f5411b);
        stringBuilder.append(", type=");
        stringBuilder.append(this.f5412c);
        stringBuilder.append(", subType=");
        stringBuilder.append(this.f5413d);
        stringBuilder.append(", available=");
        stringBuilder.append(this.f5414e);
        stringBuilder.append(", failover=");
        stringBuilder.append(this.f5415f);
        stringBuilder.append(", roaming=");
        stringBuilder.append(this.f5416g);
        stringBuilder.append(", typeName='");
        stringBuilder.append(this.f5417h);
        stringBuilder.append('\'');
        stringBuilder.append(", subTypeName='");
        stringBuilder.append(this.f5418i);
        stringBuilder.append('\'');
        stringBuilder.append(", reason='");
        stringBuilder.append(this.f5419j);
        stringBuilder.append('\'');
        stringBuilder.append(", extraInfo='");
        stringBuilder.append(this.f5420k);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
