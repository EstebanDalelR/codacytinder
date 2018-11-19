package com.google.android.gms.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

final class jo {
    /* renamed from: a */
    long f16215a;
    /* renamed from: b */
    final String f16216b;
    /* renamed from: c */
    final String f16217c;
    /* renamed from: d */
    final long f16218d;
    /* renamed from: e */
    final long f16219e;
    /* renamed from: f */
    final long f16220f;
    /* renamed from: g */
    final long f16221g;
    /* renamed from: h */
    final List<ajr> f16222h;

    jo(String str, pt ptVar) {
        this(str, ptVar.f16399b, ptVar.f16400c, ptVar.f16401d, ptVar.f16402e, ptVar.f16403f, ptVar.f16405h != null ? ptVar.f16405h : lh.m20033b(ptVar.f16404g));
        this.f16215a = (long) ptVar.f16398a.length;
    }

    private jo(String str, String str2, long j, long j2, long j3, long j4, List<ajr> list) {
        this.f16216b = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        this.f16217c = str2;
        this.f16218d = j;
        this.f16219e = j2;
        this.f16220f = j3;
        this.f16221g = j4;
        this.f16222h = list;
    }

    /* renamed from: a */
    static jo m19943a(kn knVar) throws IOException {
        if (iq.m27347a((InputStream) knVar) == 538247942) {
            return new jo(iq.m27349a(knVar), iq.m27349a(knVar), iq.m27356b((InputStream) knVar), iq.m27356b((InputStream) knVar), iq.m27356b((InputStream) knVar), iq.m27356b((InputStream) knVar), iq.m27358b(knVar));
        }
        throw new IOException();
    }

    /* renamed from: a */
    final boolean m19944a(OutputStream outputStream) {
        try {
            iq.m27350a(outputStream, 538247942);
            iq.m27352a(outputStream, this.f16216b);
            iq.m27352a(outputStream, this.f16217c == null ? "" : this.f16217c);
            iq.m27351a(outputStream, this.f16218d);
            iq.m27351a(outputStream, this.f16219e);
            iq.m27351a(outputStream, this.f16220f);
            iq.m27351a(outputStream, this.f16221g);
            List<ajr> list = this.f16222h;
            if (list != null) {
                iq.m27350a(outputStream, list.size());
                for (ajr ajr : list) {
                    iq.m27352a(outputStream, ajr.m19223a());
                    iq.m27352a(outputStream, ajr.m19224b());
                }
            } else {
                iq.m27350a(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e) {
            cg.m19569b("%s", e.toString());
            return false;
        }
    }
}
