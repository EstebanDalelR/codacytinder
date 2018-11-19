package com.foursquare.pilgrim;

import android.support.annotation.Nullable;
import com.foursquare.pilgrim.WifiScanResult.C1961a;

/* renamed from: com.foursquare.pilgrim.a */
abstract class C3513a extends WifiScanResult {
    /* renamed from: a */
    private final long f10599a;
    /* renamed from: b */
    private final String f10600b;
    /* renamed from: c */
    private final String f10601c;
    /* renamed from: d */
    private final int f10602d;
    /* renamed from: e */
    private final int f10603e;

    /* renamed from: com.foursquare.pilgrim.a$a */
    static final class C3512a implements C1961a {
        /* renamed from: a */
        private Long f10594a;
        /* renamed from: b */
        private String f10595b;
        /* renamed from: c */
        private String f10596c;
        /* renamed from: d */
        private Integer f10597d;
        /* renamed from: e */
        private Integer f10598e;

        C3512a() {
        }

        /* renamed from: a */
        public C1961a m13299a(long j) {
            this.f10594a = Long.valueOf(j);
            return this;
        }

        /* renamed from: a */
        public C1961a mo2030a(@Nullable String str) {
            this.f10595b = str;
            return this;
        }

        /* renamed from: b */
        public C1961a mo2033b(@Nullable String str) {
            this.f10596c = str;
            return this;
        }

        /* renamed from: a */
        public C1961a mo2029a(int i) {
            this.f10597d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: b */
        public C1961a mo2032b(int i) {
            this.f10598e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public WifiScanResult mo2031a() {
            String str = "";
            if (this.f10594a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" timestamp");
                str = stringBuilder.toString();
            }
            if (this.f10597d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" frequency");
                str = stringBuilder.toString();
            }
            if (this.f10598e == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" rssi");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_WifiScanResult(this.f10594a.longValue(), this.f10595b, this.f10596c, this.f10597d.intValue(), this.f10598e.intValue());
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    C3513a(long j, @Nullable String str, @Nullable String str2, int i, int i2) {
        this.f10599a = j;
        this.f10600b = str;
        this.f10601c = str2;
        this.f10602d = i;
        this.f10603e = i2;
    }

    public long timestamp() {
        return this.f10599a;
    }

    @Nullable
    public String ssid() {
        return this.f10600b;
    }

    @Nullable
    public String bssid() {
        return this.f10601c;
    }

    public int frequency() {
        return this.f10602d;
    }

    public int rssi() {
        return this.f10603e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WifiScanResult{timestamp=");
        stringBuilder.append(this.f10599a);
        stringBuilder.append(", ssid=");
        stringBuilder.append(this.f10600b);
        stringBuilder.append(", bssid=");
        stringBuilder.append(this.f10601c);
        stringBuilder.append(", frequency=");
        stringBuilder.append(this.f10602d);
        stringBuilder.append(", rssi=");
        stringBuilder.append(this.f10603e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
        r7 = this;
        r0 = 1;
        if (r8 != r7) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r8 instanceof com.foursquare.pilgrim.WifiScanResult;
        r2 = 0;
        if (r1 == 0) goto L_0x0056;
    L_0x0009:
        r8 = (com.foursquare.pilgrim.WifiScanResult) r8;
        r3 = r7.f10599a;
        r5 = r8.timestamp();
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 != 0) goto L_0x0054;
    L_0x0015:
        r1 = r7.f10600b;
        if (r1 != 0) goto L_0x0020;
    L_0x0019:
        r1 = r8.ssid();
        if (r1 != 0) goto L_0x0054;
    L_0x001f:
        goto L_0x002c;
    L_0x0020:
        r1 = r7.f10600b;
        r3 = r8.ssid();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0054;
    L_0x002c:
        r1 = r7.f10601c;
        if (r1 != 0) goto L_0x0037;
    L_0x0030:
        r1 = r8.bssid();
        if (r1 != 0) goto L_0x0054;
    L_0x0036:
        goto L_0x0043;
    L_0x0037:
        r1 = r7.f10601c;
        r3 = r8.bssid();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0054;
    L_0x0043:
        r1 = r7.f10602d;
        r3 = r8.frequency();
        if (r1 != r3) goto L_0x0054;
    L_0x004b:
        r1 = r7.f10603e;
        r8 = r8.rssi();
        if (r1 != r8) goto L_0x0054;
    L_0x0053:
        goto L_0x0055;
    L_0x0054:
        r0 = 0;
    L_0x0055:
        return r0;
    L_0x0056:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((int) ((this.f10599a >>> 32) ^ this.f10599a)) ^ 1000003) * 1000003) ^ (this.f10600b == null ? 0 : this.f10600b.hashCode())) * 1000003;
        if (this.f10601c != null) {
            i = this.f10601c.hashCode();
        }
        return ((((hashCode ^ i) * 1000003) ^ this.f10602d) * 1000003) ^ this.f10603e;
    }
}
