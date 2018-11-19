package com.appsflyer.p022a;

import java.util.Scanner;

/* renamed from: com.appsflyer.a.b */
public class C0918b {
    /* renamed from: a */
    private String f2402a;
    /* renamed from: b */
    private String f2403b;
    /* renamed from: c */
    private String f2404c;
    /* renamed from: d */
    private String f2405d;

    public C0918b(String str, String str2, String str3) {
        this.f2404c = str;
        this.f2403b = str2;
        this.f2402a = str3;
    }

    public C0918b(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        while (scanner.hasNextLine() != null) {
            cArr = scanner.nextLine();
            if (cArr.startsWith("url=")) {
                this.f2404c = cArr.substring(4).trim();
            } else if (cArr.startsWith("version=")) {
                this.f2402a = cArr.substring(8).trim();
            } else if (cArr.startsWith("data=")) {
                this.f2403b = cArr.substring(5).trim();
            }
        }
        scanner.close();
    }

    /* renamed from: a */
    public String m3111a() {
        return this.f2402a;
    }

    /* renamed from: b */
    public String m3113b() {
        return this.f2403b;
    }

    /* renamed from: c */
    public String m3114c() {
        return this.f2404c;
    }

    /* renamed from: d */
    public String m3115d() {
        return this.f2405d;
    }

    /* renamed from: a */
    public void m3112a(String str) {
        this.f2405d = str;
    }
}
