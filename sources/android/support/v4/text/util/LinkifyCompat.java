package android.support.v4.text.util;

import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.util.C0560k;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.text.util.Linkify.MatchFilter;
import android.text.util.Linkify.TransformFilter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class LinkifyCompat {
    /* renamed from: a */
    private static final String[] f1687a = new String[0];
    /* renamed from: b */
    private static final Comparator<C0545a> f1688b = new C05441();

    /* renamed from: android.support.v4.text.util.LinkifyCompat$1 */
    static class C05441 implements Comparator<C0545a> {
        C05441() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m1997a((C0545a) obj, (C0545a) obj2);
        }

        /* renamed from: a */
        public int m1997a(C0545a c0545a, C0545a c0545a2) {
            if (c0545a.f1685c < c0545a2.f1685c) {
                return -1;
            }
            if (c0545a.f1685c > c0545a2.f1685c || c0545a.f1686d < c0545a2.f1686d) {
                return 1;
            }
            if (c0545a.f1686d > c0545a2.f1686d) {
                return -1;
            }
            return null;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface LinkifyMask {
    }

    /* renamed from: android.support.v4.text.util.LinkifyCompat$a */
    private static class C0545a {
        /* renamed from: a */
        URLSpan f1683a;
        /* renamed from: b */
        String f1684b;
        /* renamed from: c */
        int f1685c;
        /* renamed from: d */
        int f1686d;

        C0545a() {
        }
    }

    /* renamed from: a */
    public static boolean m2002a(@NonNull Spannable spannable, int i) {
        if (VERSION.SDK_INT >= 27) {
            return Linkify.addLinks(spannable, i);
        }
        if (i == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            m2001a(arrayList, spannable, C0560k.f1729d, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, null);
        }
        if ((i & 2) != 0) {
            m2001a(arrayList, spannable, C0560k.f1730e, new String[]{"mailto:"}, null, null);
        }
        if ((i & 8) != 0) {
            m2000a(arrayList, spannable);
        }
        m2003b(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        i = arrayList.iterator();
        while (i.hasNext()) {
            C0545a c0545a = (C0545a) i.next();
            if (c0545a.f1683a == null) {
                m1999a(c0545a.f1684b, c0545a.f1685c, c0545a.f1686d, spannable);
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static java.lang.String m1998a(@android.support.annotation.NonNull java.lang.String r7, @android.support.annotation.NonNull java.lang.String[] r8, java.util.regex.Matcher r9, @android.support.annotation.Nullable android.text.util.Linkify.TransformFilter r10) {
        /*
        if (r10 == 0) goto L_0x0006;
    L_0x0002:
        r7 = r10.transformUrl(r9, r7);
    L_0x0006:
        r9 = 0;
        r10 = 0;
    L_0x0008:
        r0 = r8.length;
        r6 = 1;
        if (r10 >= r0) goto L_0x004f;
    L_0x000c:
        r1 = 1;
        r2 = 0;
        r3 = r8[r10];
        r4 = 0;
        r0 = r8[r10];
        r5 = r0.length();
        r0 = r7;
        r0 = r0.regionMatches(r1, r2, r3, r4, r5);
        if (r0 == 0) goto L_0x004c;
    L_0x001e:
        r1 = 0;
        r2 = 0;
        r3 = r8[r10];
        r4 = 0;
        r0 = r8[r10];
        r5 = r0.length();
        r0 = r7;
        r0 = r0.regionMatches(r1, r2, r3, r4, r5);
        if (r0 != 0) goto L_0x0050;
    L_0x0030:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r8[r10];
        r0.append(r1);
        r10 = r8[r10];
        r10 = r10.length();
        r7 = r7.substring(r10);
        r0.append(r7);
        r7 = r0.toString();
        goto L_0x0050;
    L_0x004c:
        r10 = r10 + 1;
        goto L_0x0008;
    L_0x004f:
        r6 = 0;
    L_0x0050:
        if (r6 != 0) goto L_0x0066;
    L_0x0052:
        r10 = r8.length;
        if (r10 <= 0) goto L_0x0066;
    L_0x0055:
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r8 = r8[r9];
        r10.append(r8);
        r10.append(r7);
        r7 = r10.toString();
    L_0x0066:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.text.util.LinkifyCompat.a(java.lang.String, java.lang.String[], java.util.regex.Matcher, android.text.util.Linkify$TransformFilter):java.lang.String");
    }

    /* renamed from: a */
    private static void m2001a(ArrayList<C0545a> arrayList, Spannable spannable, Pattern pattern, String[] strArr, MatchFilter matchFilter, TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                C0545a c0545a = new C0545a();
                c0545a.f1684b = m1998a(matcher.group(0), strArr, matcher, transformFilter);
                c0545a.f1685c = start;
                c0545a.f1686d = end;
                arrayList.add(c0545a);
            }
        }
    }

    /* renamed from: a */
    private static void m1999a(String str, int i, int i2, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i, i2, 33);
    }

    /* renamed from: a */
    private static void m2000a(java.util.ArrayList<android.support.v4.text.util.LinkifyCompat.C0545a> r5, android.text.Spannable r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r6 = r6.toString();
        r0 = 0;
    L_0x0005:
        r1 = android.webkit.WebView.findAddress(r6);	 Catch:{ UnsupportedOperationException -> 0x0044 }
        if (r1 == 0) goto L_0x0043;	 Catch:{ UnsupportedOperationException -> 0x0044 }
    L_0x000b:
        r2 = r6.indexOf(r1);	 Catch:{ UnsupportedOperationException -> 0x0044 }
        if (r2 >= 0) goto L_0x0012;	 Catch:{ UnsupportedOperationException -> 0x0044 }
    L_0x0011:
        goto L_0x0043;	 Catch:{ UnsupportedOperationException -> 0x0044 }
    L_0x0012:
        r3 = new android.support.v4.text.util.LinkifyCompat$a;	 Catch:{ UnsupportedOperationException -> 0x0044 }
        r3.<init>();	 Catch:{ UnsupportedOperationException -> 0x0044 }
        r4 = r1.length();	 Catch:{ UnsupportedOperationException -> 0x0044 }
        r4 = r4 + r2;	 Catch:{ UnsupportedOperationException -> 0x0044 }
        r2 = r2 + r0;	 Catch:{ UnsupportedOperationException -> 0x0044 }
        r3.f1685c = r2;	 Catch:{ UnsupportedOperationException -> 0x0044 }
        r0 = r0 + r4;	 Catch:{ UnsupportedOperationException -> 0x0044 }
        r3.f1686d = r0;	 Catch:{ UnsupportedOperationException -> 0x0044 }
        r6 = r6.substring(r4);	 Catch:{ UnsupportedOperationException -> 0x0044 }
        r2 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x0005 }
        r1 = java.net.URLEncoder.encode(r1, r2);	 Catch:{ UnsupportedEncodingException -> 0x0005 }
        r2 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x0044 }
        r2.<init>();	 Catch:{ UnsupportedOperationException -> 0x0044 }
        r4 = "geo:0,0?q=";	 Catch:{ UnsupportedOperationException -> 0x0044 }
        r2.append(r4);	 Catch:{ UnsupportedOperationException -> 0x0044 }
        r2.append(r1);	 Catch:{ UnsupportedOperationException -> 0x0044 }
        r1 = r2.toString();	 Catch:{ UnsupportedOperationException -> 0x0044 }
        r3.f1684b = r1;	 Catch:{ UnsupportedOperationException -> 0x0044 }
        r5.add(r3);	 Catch:{ UnsupportedOperationException -> 0x0044 }
        goto L_0x0005;
    L_0x0043:
        return;
    L_0x0044:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.text.util.LinkifyCompat.a(java.util.ArrayList, android.text.Spannable):void");
    }

    /* renamed from: b */
    private static void m2003b(ArrayList<C0545a> arrayList, Spannable spannable) {
        int i;
        int i2 = 0;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (i = 0; i < uRLSpanArr.length; i++) {
            C0545a c0545a = new C0545a();
            c0545a.f1683a = uRLSpanArr[i];
            c0545a.f1685c = spannable.getSpanStart(uRLSpanArr[i]);
            c0545a.f1686d = spannable.getSpanEnd(uRLSpanArr[i]);
            arrayList.add(c0545a);
        }
        Collections.sort(arrayList, f1688b);
        int size = arrayList.size();
        while (i2 < size - 1) {
            C0545a c0545a2 = (C0545a) arrayList.get(i2);
            int i3 = i2 + 1;
            C0545a c0545a3 = (C0545a) arrayList.get(i3);
            if (c0545a2.f1685c <= c0545a3.f1685c && c0545a2.f1686d > c0545a3.f1685c) {
                URLSpan uRLSpan;
                if (c0545a3.f1686d > c0545a2.f1686d) {
                    if (c0545a2.f1686d - c0545a2.f1685c <= c0545a3.f1686d - c0545a3.f1685c) {
                        i = c0545a2.f1686d - c0545a2.f1685c < c0545a3.f1686d - c0545a3.f1685c ? i2 : -1;
                        if (i != -1) {
                            uRLSpan = ((C0545a) arrayList.get(i)).f1683a;
                            if (uRLSpan != null) {
                                spannable.removeSpan(uRLSpan);
                            }
                            arrayList.remove(i);
                            size--;
                        }
                    }
                }
                i = i3;
                if (i != -1) {
                    uRLSpan = ((C0545a) arrayList.get(i)).f1683a;
                    if (uRLSpan != null) {
                        spannable.removeSpan(uRLSpan);
                    }
                    arrayList.remove(i);
                    size--;
                }
            }
            i2 = i3;
        }
    }
}
