package com.google.android.exoplayer2.upstream.cache;

import android.support.annotation.Nullable;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.upstream.cache.j */
final class C3720j extends C2280a {
    /* renamed from: g */
    private static final Pattern f11726g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    /* renamed from: h */
    private static final Pattern f11727h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    /* renamed from: i */
    private static final Pattern f11728i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* renamed from: a */
    public static File m14134a(File file, int i, long j, long j2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(i);
        stringBuilder.append(".");
        stringBuilder.append(j);
        stringBuilder.append(".");
        stringBuilder.append(j2);
        stringBuilder.append(".v3.exo");
        return new File(file, stringBuilder.toString());
    }

    /* renamed from: a */
    public static C3720j m14132a(String str, long j) {
        return new C3720j(str, j, -1, -9223372036854775807L, null);
    }

    /* renamed from: b */
    public static C3720j m14135b(String str, long j) {
        return new C3720j(str, j, -1, -9223372036854775807L, null);
    }

    /* renamed from: a */
    public static C3720j m14133a(String str, long j, long j2) {
        return new C3720j(str, j, j2, -9223372036854775807L, null);
    }

    @Nullable
    /* renamed from: a */
    public static C3720j m14131a(File file, C2283d c2283d) {
        CharSequence name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            file = C3720j.m14136b(file, c2283d);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        File file2 = file;
        file = f11728i.matcher(name);
        if (!file.matches()) {
            return null;
        }
        long length = file2.length();
        String a = c2283d.m8276a(Integer.parseInt(file.group(1)));
        if (a == null) {
            c2283d = null;
        } else {
            C2283d c3720j = new C3720j(a, Long.parseLong(file.group(2)), length, Long.parseLong(file.group(3)), file2);
        }
        return c2283d;
    }

    @Nullable
    /* renamed from: b */
    private static File m14136b(File file, C2283d c2283d) {
        String i;
        CharSequence name = file.getName();
        Matcher matcher = f11727h.matcher(name);
        if (matcher.matches()) {
            i = C2314v.m8501i(matcher.group(1));
            if (i == null) {
                return null;
            }
        }
        matcher = f11726g.matcher(name);
        if (!matcher.matches()) {
            return null;
        }
        i = matcher.group(1);
        c2283d = C3720j.m14134a(file.getParentFile(), c2283d.m8281c(i), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)));
        if (file.renameTo(c2283d) == null) {
            return null;
        }
        return c2283d;
    }

    private C3720j(String str, long j, long j2, long j3, @Nullable File file) {
        super(str, j, j2, j3, file);
    }

    /* renamed from: a */
    public C3720j m14137a(int i) {
        C2289a.m8313b(this.d);
        long currentTimeMillis = System.currentTimeMillis();
        return new C3720j(this.a, this.b, this.c, currentTimeMillis, C3720j.m14134a(this.e.getParentFile(), i, this.b, currentTimeMillis));
    }
}
