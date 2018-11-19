package okhttp3.internal.http;

import okhttp3.Protocol;

/* renamed from: okhttp3.internal.http.j */
public final class C15928j {
    /* renamed from: a */
    public final Protocol f49354a;
    /* renamed from: b */
    public final int f49355b;
    /* renamed from: c */
    public final String f49356c;

    public C15928j(Protocol protocol, int i, String str) {
        this.f49354a = protocol;
        this.f49355b = i;
        this.f49356c = str;
    }

    /* renamed from: a */
    public static okhttp3.internal.http.C15928j m60283a(java.lang.String r8) throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "HTTP/1.";
        r0 = r8.startsWith(r0);
        r1 = 4;
        r2 = 32;
        r3 = 9;
        if (r0 == 0) goto L_0x005c;
    L_0x000d:
        r0 = r8.length();
        if (r0 < r3) goto L_0x0045;
    L_0x0013:
        r0 = 8;
        r0 = r8.charAt(r0);
        if (r0 == r2) goto L_0x001c;
    L_0x001b:
        goto L_0x0045;
    L_0x001c:
        r0 = 7;
        r0 = r8.charAt(r0);
        r0 = r0 + -48;
        if (r0 != 0) goto L_0x0028;
    L_0x0025:
        r0 = okhttp3.Protocol.HTTP_1_0;
        goto L_0x0067;
    L_0x0028:
        r4 = 1;
        if (r0 != r4) goto L_0x002e;
    L_0x002b:
        r0 = okhttp3.Protocol.HTTP_1_1;
        goto L_0x0067;
    L_0x002e:
        r0 = new java.net.ProtocolException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unexpected status line: ";
        r1.append(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
    L_0x0045:
        r0 = new java.net.ProtocolException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unexpected status line: ";
        r1.append(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
    L_0x005c:
        r0 = "ICY ";
        r0 = r8.startsWith(r0);
        if (r0 == 0) goto L_0x00d5;
    L_0x0064:
        r0 = okhttp3.Protocol.HTTP_1_0;
        r3 = 4;
    L_0x0067:
        r4 = r8.length();
        r5 = r3 + 3;
        if (r4 >= r5) goto L_0x0086;
    L_0x006f:
        r0 = new java.net.ProtocolException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unexpected status line: ";
        r1.append(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
    L_0x0086:
        r4 = r8.substring(r3, r5);	 Catch:{ NumberFormatException -> 0x00be }
        r4 = java.lang.Integer.parseInt(r4);	 Catch:{ NumberFormatException -> 0x00be }
        r6 = "";
        r7 = r8.length();
        if (r7 <= r5) goto L_0x00b8;
    L_0x0096:
        r5 = r8.charAt(r5);
        if (r5 == r2) goto L_0x00b3;
    L_0x009c:
        r0 = new java.net.ProtocolException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unexpected status line: ";
        r1.append(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
    L_0x00b3:
        r3 = r3 + r1;
        r6 = r8.substring(r3);
    L_0x00b8:
        r8 = new okhttp3.internal.http.j;
        r8.<init>(r0, r4, r6);
        return r8;
    L_0x00be:
        r0 = new java.net.ProtocolException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unexpected status line: ";
        r1.append(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
    L_0x00d5:
        r0 = new java.net.ProtocolException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unexpected status line: ";
        r1.append(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.j.a(java.lang.String):okhttp3.internal.http.j");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f49354a == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        stringBuilder.append(' ');
        stringBuilder.append(this.f49355b);
        if (this.f49356c != null) {
            stringBuilder.append(' ');
            stringBuilder.append(this.f49356c);
        }
        return stringBuilder.toString();
    }
}
