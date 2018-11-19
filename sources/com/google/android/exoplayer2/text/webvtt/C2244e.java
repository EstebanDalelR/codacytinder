package com.google.android.exoplayer2.text.webvtt;

import android.support.annotation.NonNull;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan.Standard;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.google.android.exoplayer2.text.webvtt.C3710d.C2241a;
import com.google.android.exoplayer2.util.C2302k;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.text.webvtt.e */
public final class C2244e {
    /* renamed from: a */
    public static final Pattern f6644a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    /* renamed from: b */
    private static final Pattern f6645b = Pattern.compile("(\\S+?):(\\S+)");
    /* renamed from: c */
    private final StringBuilder f6646c = new StringBuilder();

    /* renamed from: com.google.android.exoplayer2.text.webvtt.e$a */
    private static final class C2242a {
        /* renamed from: e */
        private static final String[] f6637e = new String[0];
        /* renamed from: a */
        public final String f6638a;
        /* renamed from: b */
        public final int f6639b;
        /* renamed from: c */
        public final String f6640c;
        /* renamed from: d */
        public final String[] f6641d;

        private C2242a(String str, int i, String str2, String[] strArr) {
            this.f6639b = i;
            this.f6638a = str;
            this.f6640c = str2;
            this.f6641d = strArr;
        }

        /* renamed from: a */
        public static C2242a m8081a(String str, int i) {
            str = str.trim();
            if (str.isEmpty()) {
                return null;
            }
            String str2;
            String trim;
            int indexOf = str.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                trim = str.substring(indexOf).trim();
                str = str.substring(0, indexOf);
                str2 = trim;
            }
            str = str.split("\\.");
            trim = str[0];
            if (str.length > 1) {
                str = (String[]) Arrays.copyOfRange(str, 1, str.length);
            } else {
                str = f6637e;
            }
            return new C2242a(trim, i, str2, str);
        }

        /* renamed from: a */
        public static C2242a m8080a() {
            return new C2242a("", 0, "", new String[0]);
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.webvtt.e$b */
    private static final class C2243b implements Comparable<C2243b> {
        /* renamed from: a */
        public final int f6642a;
        /* renamed from: b */
        public final WebvttCssStyle f6643b;

        public /* synthetic */ int compareTo(@NonNull Object obj) {
            return m8082a((C2243b) obj);
        }

        public C2243b(int i, WebvttCssStyle webvttCssStyle) {
            this.f6642a = i;
            this.f6643b = webvttCssStyle;
        }

        /* renamed from: a */
        public int m8082a(@NonNull C2243b c2243b) {
            return this.f6642a - c2243b.f6642a;
        }
    }

    /* renamed from: a */
    public boolean m8097a(C2302k c2302k, C2241a c2241a, List<WebvttCssStyle> list) {
        Object z = c2302k.m8414z();
        if (z == null) {
            return false;
        }
        Matcher matcher = f6644a.matcher(z);
        if (matcher.matches()) {
            return C2244e.m8091a(null, matcher, c2302k, c2241a, this.f6646c, list);
        }
        CharSequence z2 = c2302k.m8414z();
        if (z2 == null) {
            return false;
        }
        Matcher matcher2 = f6644a.matcher(z2);
        if (!matcher2.matches()) {
            return false;
        }
        return C2244e.m8091a(z.trim(), matcher2, c2302k, c2241a, this.f6646c, list);
    }

    /* renamed from: a */
    static void m8087a(java.lang.String r5, com.google.android.exoplayer2.text.webvtt.C3710d.C2241a r6) {
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
        r0 = f6645b;
        r5 = r0.matcher(r5);
    L_0x0006:
        r0 = r5.find();
        if (r0 == 0) goto L_0x0089;
    L_0x000c:
        r0 = 1;
        r0 = r5.group(r0);
        r1 = 2;
        r1 = r5.group(r1);
        r2 = "line";	 Catch:{ NumberFormatException -> 0x006d }
        r2 = r2.equals(r0);	 Catch:{ NumberFormatException -> 0x006d }
        if (r2 == 0) goto L_0x0022;	 Catch:{ NumberFormatException -> 0x006d }
    L_0x001e:
        com.google.android.exoplayer2.text.webvtt.C2244e.m8093b(r1, r6);	 Catch:{ NumberFormatException -> 0x006d }
        goto L_0x0006;	 Catch:{ NumberFormatException -> 0x006d }
    L_0x0022:
        r2 = "align";	 Catch:{ NumberFormatException -> 0x006d }
        r2 = r2.equals(r0);	 Catch:{ NumberFormatException -> 0x006d }
        if (r2 == 0) goto L_0x0032;	 Catch:{ NumberFormatException -> 0x006d }
    L_0x002a:
        r0 = com.google.android.exoplayer2.text.webvtt.C2244e.m8092b(r1);	 Catch:{ NumberFormatException -> 0x006d }
        r6.m8071a(r0);	 Catch:{ NumberFormatException -> 0x006d }
        goto L_0x0006;	 Catch:{ NumberFormatException -> 0x006d }
    L_0x0032:
        r2 = "position";	 Catch:{ NumberFormatException -> 0x006d }
        r2 = r2.equals(r0);	 Catch:{ NumberFormatException -> 0x006d }
        if (r2 == 0) goto L_0x003e;	 Catch:{ NumberFormatException -> 0x006d }
    L_0x003a:
        com.google.android.exoplayer2.text.webvtt.C2244e.m8094c(r1, r6);	 Catch:{ NumberFormatException -> 0x006d }
        goto L_0x0006;	 Catch:{ NumberFormatException -> 0x006d }
    L_0x003e:
        r2 = "size";	 Catch:{ NumberFormatException -> 0x006d }
        r2 = r2.equals(r0);	 Catch:{ NumberFormatException -> 0x006d }
        if (r2 == 0) goto L_0x004e;	 Catch:{ NumberFormatException -> 0x006d }
    L_0x0046:
        r0 = com.google.android.exoplayer2.text.webvtt.C2245g.m8100b(r1);	 Catch:{ NumberFormatException -> 0x006d }
        r6.m8078c(r0);	 Catch:{ NumberFormatException -> 0x006d }
        goto L_0x0006;	 Catch:{ NumberFormatException -> 0x006d }
    L_0x004e:
        r2 = "WebvttCueParser";	 Catch:{ NumberFormatException -> 0x006d }
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x006d }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x006d }
        r4 = "Unknown cue setting ";	 Catch:{ NumberFormatException -> 0x006d }
        r3.append(r4);	 Catch:{ NumberFormatException -> 0x006d }
        r3.append(r0);	 Catch:{ NumberFormatException -> 0x006d }
        r0 = ":";	 Catch:{ NumberFormatException -> 0x006d }
        r3.append(r0);	 Catch:{ NumberFormatException -> 0x006d }
        r3.append(r1);	 Catch:{ NumberFormatException -> 0x006d }
        r0 = r3.toString();	 Catch:{ NumberFormatException -> 0x006d }
        android.util.Log.w(r2, r0);	 Catch:{ NumberFormatException -> 0x006d }
        goto L_0x0006;
    L_0x006d:
        r0 = "WebvttCueParser";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Skipping bad cue setting: ";
        r1.append(r2);
        r2 = r5.group();
        r1.append(r2);
        r1 = r1.toString();
        android.util.Log.w(r0, r1);
        goto L_0x0006;
    L_0x0089:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.e.a(java.lang.String, com.google.android.exoplayer2.text.webvtt.d$a):void");
    }

    /* renamed from: a */
    static void m8089a(String str, String str2, C2241a c2241a, List<WebvttCssStyle> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Stack stack = new Stack();
        List arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == ManagerWebServices.QUERY_AMPERSAND) {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    C2244e.m8086a(str2.substring(i, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    int i3 = 1;
                    Object obj = str2.charAt(i2) == '/' ? 1 : null;
                    i2 = C2244e.m8084a(str2, i2);
                    int i4 = i2 - 2;
                    Object obj2 = str2.charAt(i4) == '/' ? 1 : null;
                    if (obj != null) {
                        i3 = 2;
                    }
                    i += i3;
                    if (obj2 == null) {
                        i4 = i2 - 1;
                    }
                    String substring = str2.substring(i, i4);
                    String d = C2244e.m8096d(substring);
                    if (d != null) {
                        if (C2244e.m8095c(d)) {
                            if (obj != null) {
                                while (!stack.isEmpty()) {
                                    C2242a c2242a = (C2242a) stack.pop();
                                    C2244e.m8088a(str, c2242a, spannableStringBuilder, list, arrayList);
                                    if (c2242a.f6638a.equals(d)) {
                                        break;
                                    }
                                }
                            } else if (obj2 == null) {
                                stack.push(C2242a.m8081a(substring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = i2;
            }
        }
        while (stack.isEmpty() == null) {
            C2244e.m8088a(str, (C2242a) stack.pop(), spannableStringBuilder, list, arrayList);
        }
        C2244e.m8088a(str, C2242a.m8080a(), spannableStringBuilder, list, arrayList);
        c2241a.m8072a(spannableStringBuilder);
    }

    /* renamed from: a */
    private static boolean m8091a(java.lang.String r5, java.util.regex.Matcher r6, com.google.android.exoplayer2.util.C2302k r7, com.google.android.exoplayer2.text.webvtt.C3710d.C2241a r8, java.lang.StringBuilder r9, java.util.List<com.google.android.exoplayer2.text.webvtt.WebvttCssStyle> r10) {
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
        r0 = 0;
        r1 = 1;
        r2 = r6.group(r1);	 Catch:{ NumberFormatException -> 0x004a }
        r2 = com.google.android.exoplayer2.text.webvtt.C2245g.m8098a(r2);	 Catch:{ NumberFormatException -> 0x004a }
        r2 = r8.m8070a(r2);	 Catch:{ NumberFormatException -> 0x004a }
        r3 = 2;	 Catch:{ NumberFormatException -> 0x004a }
        r3 = r6.group(r3);	 Catch:{ NumberFormatException -> 0x004a }
        r3 = com.google.android.exoplayer2.text.webvtt.C2245g.m8098a(r3);	 Catch:{ NumberFormatException -> 0x004a }
        r2.m8076b(r3);	 Catch:{ NumberFormatException -> 0x004a }
        r2 = 3;
        r6 = r6.group(r2);
        com.google.android.exoplayer2.text.webvtt.C2244e.m8087a(r6, r8);
        r9.setLength(r0);
    L_0x0025:
        r6 = r7.m8414z();
        r0 = android.text.TextUtils.isEmpty(r6);
        if (r0 != 0) goto L_0x0042;
    L_0x002f:
        r0 = r9.length();
        if (r0 <= 0) goto L_0x003a;
    L_0x0035:
        r0 = "\n";
        r9.append(r0);
    L_0x003a:
        r6 = r6.trim();
        r9.append(r6);
        goto L_0x0025;
    L_0x0042:
        r6 = r9.toString();
        com.google.android.exoplayer2.text.webvtt.C2244e.m8089a(r5, r6, r8, r10);
        return r1;
    L_0x004a:
        r5 = "WebvttCueParser";
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = "Skipping cue with bad header: ";
        r7.append(r8);
        r6 = r6.group();
        r7.append(r6);
        r6 = r7.toString();
        android.util.Log.w(r5, r6);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.e.a(java.lang.String, java.util.regex.Matcher, com.google.android.exoplayer2.util.k, com.google.android.exoplayer2.text.webvtt.d$a, java.lang.StringBuilder, java.util.List):boolean");
    }

    /* renamed from: b */
    private static void m8093b(String str, C2241a c2241a) throws NumberFormatException {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            c2241a.m8075b(C2244e.m8083a(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            c2241a.m8075b(Integer.MIN_VALUE);
        }
        if (str.endsWith("%")) {
            c2241a.m8068a(C2245g.m8100b(str)).m8069a(0);
            return;
        }
        str = Integer.parseInt(str);
        if (str < null) {
            str--;
        }
        c2241a.m8068a((float) str).m8069a(1);
    }

    /* renamed from: c */
    private static void m8094c(String str, C2241a c2241a) throws NumberFormatException {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            c2241a.m8079c(C2244e.m8083a(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            c2241a.m8079c(Integer.MIN_VALUE);
        }
        c2241a.m8074b(C2245g.m8100b(str));
    }

    /* renamed from: a */
    private static int m8083a(String str) {
        Object obj;
        StringBuilder stringBuilder;
        int hashCode = str.hashCode();
        if (hashCode != -1364013995) {
            if (hashCode != -1074341483) {
                if (hashCode != 100571) {
                    if (hashCode == 109757538) {
                        if (str.equals("start")) {
                            obj = null;
                            switch (obj) {
                                case null:
                                    return 0;
                                case 1:
                                case 2:
                                    return 1;
                                case 3:
                                    return 2;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Invalid anchor value: ");
                                    stringBuilder.append(str);
                                    Log.w("WebvttCueParser", stringBuilder.toString());
                                    return Integer.MIN_VALUE;
                            }
                        }
                    }
                } else if (str.equals("end")) {
                    obj = 3;
                    switch (obj) {
                        case null:
                            return 0;
                        case 1:
                        case 2:
                            return 1;
                        case 3:
                            return 2;
                        default:
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Invalid anchor value: ");
                            stringBuilder.append(str);
                            Log.w("WebvttCueParser", stringBuilder.toString());
                            return Integer.MIN_VALUE;
                    }
                }
            } else if (str.equals("middle")) {
                obj = 2;
                switch (obj) {
                    case null:
                        return 0;
                    case 1:
                    case 2:
                        return 1;
                    case 3:
                        return 2;
                    default:
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid anchor value: ");
                        stringBuilder.append(str);
                        Log.w("WebvttCueParser", stringBuilder.toString());
                        return Integer.MIN_VALUE;
                }
            }
        } else if (str.equals("center")) {
            obj = 1;
            switch (obj) {
                case null:
                    return 0;
                case 1:
                case 2:
                    return 1;
                case 3:
                    return 2;
                default:
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid anchor value: ");
                    stringBuilder.append(str);
                    Log.w("WebvttCueParser", stringBuilder.toString());
                    return Integer.MIN_VALUE;
            }
        }
        obj = -1;
        switch (obj) {
            case null:
                return 0;
            case 1:
            case 2:
                return 1;
            case 3:
                return 2;
            default:
                stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid anchor value: ");
                stringBuilder.append(str);
                Log.w("WebvttCueParser", stringBuilder.toString());
                return Integer.MIN_VALUE;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private static android.text.Layout.Alignment m8092b(java.lang.String r3) {
        /*
        r0 = r3.hashCode();
        switch(r0) {
            case -1364013995: goto L_0x003a;
            case -1074341483: goto L_0x0030;
            case 100571: goto L_0x0026;
            case 3317767: goto L_0x001c;
            case 108511772: goto L_0x0012;
            case 109757538: goto L_0x0008;
            default: goto L_0x0007;
        };
    L_0x0007:
        goto L_0x0044;
    L_0x0008:
        r0 = "start";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0044;
    L_0x0010:
        r0 = 0;
        goto L_0x0045;
    L_0x0012:
        r0 = "right";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0044;
    L_0x001a:
        r0 = 5;
        goto L_0x0045;
    L_0x001c:
        r0 = "left";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0044;
    L_0x0024:
        r0 = 1;
        goto L_0x0045;
    L_0x0026:
        r0 = "end";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0044;
    L_0x002e:
        r0 = 4;
        goto L_0x0045;
    L_0x0030:
        r0 = "middle";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0044;
    L_0x0038:
        r0 = 3;
        goto L_0x0045;
    L_0x003a:
        r0 = "center";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0044;
    L_0x0042:
        r0 = 2;
        goto L_0x0045;
    L_0x0044:
        r0 = -1;
    L_0x0045:
        switch(r0) {
            case 0: goto L_0x0066;
            case 1: goto L_0x0066;
            case 2: goto L_0x0063;
            case 3: goto L_0x0063;
            case 4: goto L_0x0060;
            case 5: goto L_0x0060;
            default: goto L_0x0048;
        };
    L_0x0048:
        r0 = "WebvttCueParser";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Invalid alignment value: ";
        r1.append(r2);
        r1.append(r3);
        r3 = r1.toString();
        android.util.Log.w(r0, r3);
        r3 = 0;
        return r3;
    L_0x0060:
        r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        return r3;
    L_0x0063:
        r3 = android.text.Layout.Alignment.ALIGN_CENTER;
        return r3;
    L_0x0066:
        r3 = android.text.Layout.Alignment.ALIGN_NORMAL;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.e.b(java.lang.String):android.text.Layout$Alignment");
    }

    /* renamed from: a */
    private static int m8084a(String str, int i) {
        i = str.indexOf(62, i);
        return i == -1 ? str.length() : i + 1;
    }

    /* renamed from: a */
    private static void m8086a(String str, SpannableStringBuilder spannableStringBuilder) {
        Object obj;
        StringBuilder stringBuilder;
        int hashCode = str.hashCode();
        if (hashCode != 3309) {
            if (hashCode != 3464) {
                if (hashCode != 96708) {
                    if (hashCode == 3374865) {
                        if (str.equals("nbsp")) {
                            obj = 2;
                            switch (obj) {
                                case null:
                                    spannableStringBuilder.append('<');
                                    return;
                                case 1:
                                    spannableStringBuilder.append('>');
                                    return;
                                case 2:
                                    spannableStringBuilder.append(' ');
                                    return;
                                case 3:
                                    spannableStringBuilder.append(ManagerWebServices.QUERY_AMPERSAND);
                                    return;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("ignoring unsupported entity: '&");
                                    stringBuilder.append(str);
                                    stringBuilder.append(";'");
                                    Log.w("WebvttCueParser", stringBuilder.toString());
                                    return;
                            }
                        }
                    }
                } else if (str.equals("amp")) {
                    obj = 3;
                    switch (obj) {
                        case null:
                            spannableStringBuilder.append('<');
                            return;
                        case 1:
                            spannableStringBuilder.append('>');
                            return;
                        case 2:
                            spannableStringBuilder.append(' ');
                            return;
                        case 3:
                            spannableStringBuilder.append(ManagerWebServices.QUERY_AMPERSAND);
                            return;
                        default:
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("ignoring unsupported entity: '&");
                            stringBuilder.append(str);
                            stringBuilder.append(";'");
                            Log.w("WebvttCueParser", stringBuilder.toString());
                            return;
                    }
                }
            } else if (str.equals("lt")) {
                obj = null;
                switch (obj) {
                    case null:
                        spannableStringBuilder.append('<');
                        return;
                    case 1:
                        spannableStringBuilder.append('>');
                        return;
                    case 2:
                        spannableStringBuilder.append(' ');
                        return;
                    case 3:
                        spannableStringBuilder.append(ManagerWebServices.QUERY_AMPERSAND);
                        return;
                    default:
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("ignoring unsupported entity: '&");
                        stringBuilder.append(str);
                        stringBuilder.append(";'");
                        Log.w("WebvttCueParser", stringBuilder.toString());
                        return;
                }
            }
        } else if (str.equals("gt")) {
            obj = 1;
            switch (obj) {
                case null:
                    spannableStringBuilder.append('<');
                    return;
                case 1:
                    spannableStringBuilder.append('>');
                    return;
                case 2:
                    spannableStringBuilder.append(' ');
                    return;
                case 3:
                    spannableStringBuilder.append(ManagerWebServices.QUERY_AMPERSAND);
                    return;
                default:
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("ignoring unsupported entity: '&");
                    stringBuilder.append(str);
                    stringBuilder.append(";'");
                    Log.w("WebvttCueParser", stringBuilder.toString());
                    return;
            }
        }
        obj = -1;
        switch (obj) {
            case null:
                spannableStringBuilder.append('<');
                return;
            case 1:
                spannableStringBuilder.append('>');
                return;
            case 2:
                spannableStringBuilder.append(' ');
                return;
            case 3:
                spannableStringBuilder.append(ManagerWebServices.QUERY_AMPERSAND);
                return;
            default:
                stringBuilder = new StringBuilder();
                stringBuilder.append("ignoring unsupported entity: '&");
                stringBuilder.append(str);
                stringBuilder.append(";'");
                Log.w("WebvttCueParser", stringBuilder.toString());
                return;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    private static boolean m8095c(java.lang.String r3) {
        /*
        r0 = r3.hashCode();
        r1 = 0;
        r2 = 1;
        switch(r0) {
            case 98: goto L_0x003c;
            case 99: goto L_0x0032;
            case 105: goto L_0x0028;
            case 117: goto L_0x001e;
            case 118: goto L_0x0014;
            case 3314158: goto L_0x000a;
            default: goto L_0x0009;
        };
    L_0x0009:
        goto L_0x0046;
    L_0x000a:
        r0 = "lang";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0046;
    L_0x0012:
        r3 = 3;
        goto L_0x0047;
    L_0x0014:
        r0 = "v";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0046;
    L_0x001c:
        r3 = 5;
        goto L_0x0047;
    L_0x001e:
        r0 = "u";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0046;
    L_0x0026:
        r3 = 4;
        goto L_0x0047;
    L_0x0028:
        r0 = "i";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0046;
    L_0x0030:
        r3 = 2;
        goto L_0x0047;
    L_0x0032:
        r0 = "c";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0046;
    L_0x003a:
        r3 = 1;
        goto L_0x0047;
    L_0x003c:
        r0 = "b";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0046;
    L_0x0044:
        r3 = 0;
        goto L_0x0047;
    L_0x0046:
        r3 = -1;
    L_0x0047:
        switch(r3) {
            case 0: goto L_0x004b;
            case 1: goto L_0x004b;
            case 2: goto L_0x004b;
            case 3: goto L_0x004b;
            case 4: goto L_0x004b;
            case 5: goto L_0x004b;
            default: goto L_0x004a;
        };
    L_0x004a:
        return r1;
    L_0x004b:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.e.c(java.lang.String):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static void m8088a(java.lang.String r7, com.google.android.exoplayer2.text.webvtt.C2244e.C2242a r8, android.text.SpannableStringBuilder r9, java.util.List<com.google.android.exoplayer2.text.webvtt.WebvttCssStyle> r10, java.util.List<com.google.android.exoplayer2.text.webvtt.C2244e.C2243b> r11) {
        /*
        r0 = r8.f6639b;
        r1 = r9.length();
        r2 = r8.f6638a;
        r3 = r2.hashCode();
        r4 = 0;
        r5 = 2;
        r6 = 1;
        switch(r3) {
            case 0: goto L_0x004f;
            case 98: goto L_0x0045;
            case 99: goto L_0x003b;
            case 105: goto L_0x0031;
            case 117: goto L_0x0027;
            case 118: goto L_0x001d;
            case 3314158: goto L_0x0013;
            default: goto L_0x0012;
        };
    L_0x0012:
        goto L_0x0059;
    L_0x0013:
        r3 = "lang";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0059;
    L_0x001b:
        r2 = 4;
        goto L_0x005a;
    L_0x001d:
        r3 = "v";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0059;
    L_0x0025:
        r2 = 5;
        goto L_0x005a;
    L_0x0027:
        r3 = "u";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0059;
    L_0x002f:
        r2 = 2;
        goto L_0x005a;
    L_0x0031:
        r3 = "i";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0059;
    L_0x0039:
        r2 = 1;
        goto L_0x005a;
    L_0x003b:
        r3 = "c";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0059;
    L_0x0043:
        r2 = 3;
        goto L_0x005a;
    L_0x0045:
        r3 = "b";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0059;
    L_0x004d:
        r2 = 0;
        goto L_0x005a;
    L_0x004f:
        r3 = "";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0059;
    L_0x0057:
        r2 = 6;
        goto L_0x005a;
    L_0x0059:
        r2 = -1;
    L_0x005a:
        r3 = 33;
        switch(r2) {
            case 0: goto L_0x0072;
            case 1: goto L_0x0069;
            case 2: goto L_0x0060;
            case 3: goto L_0x007a;
            case 4: goto L_0x007a;
            case 5: goto L_0x007a;
            case 6: goto L_0x007a;
            default: goto L_0x005f;
        };
    L_0x005f:
        return;
    L_0x0060:
        r2 = new android.text.style.UnderlineSpan;
        r2.<init>();
        r9.setSpan(r2, r0, r1, r3);
        goto L_0x007a;
    L_0x0069:
        r2 = new android.text.style.StyleSpan;
        r2.<init>(r5);
        r9.setSpan(r2, r0, r1, r3);
        goto L_0x007a;
    L_0x0072:
        r2 = new android.text.style.StyleSpan;
        r2.<init>(r6);
        r9.setSpan(r2, r0, r1, r3);
    L_0x007a:
        r11.clear();
        com.google.android.exoplayer2.text.webvtt.C2244e.m8090a(r10, r7, r8, r11);
        r7 = r11.size();
    L_0x0084:
        if (r4 >= r7) goto L_0x0094;
    L_0x0086:
        r8 = r11.get(r4);
        r8 = (com.google.android.exoplayer2.text.webvtt.C2244e.C2243b) r8;
        r8 = r8.f6643b;
        com.google.android.exoplayer2.text.webvtt.C2244e.m8085a(r9, r8, r0, r1);
        r4 = r4 + 1;
        goto L_0x0084;
    L_0x0094:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.e.a(java.lang.String, com.google.android.exoplayer2.text.webvtt.e$a, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }

    /* renamed from: a */
    private static void m8085a(SpannableStringBuilder spannableStringBuilder, WebvttCssStyle webvttCssStyle, int i, int i2) {
        if (webvttCssStyle != null) {
            if (webvttCssStyle.m8037b() != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(webvttCssStyle.m8037b()), i, i2, 33);
            }
            if (webvttCssStyle.m8043c()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
            if (webvttCssStyle.m8045d()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (webvttCssStyle.m8048g()) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(webvttCssStyle.m8047f()), i, i2, 33);
            }
            if (webvttCssStyle.m8050i()) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(webvttCssStyle.m8049h()), i, i2, 33);
            }
            if (webvttCssStyle.m8046e() != null) {
                spannableStringBuilder.setSpan(new TypefaceSpan(webvttCssStyle.m8046e()), i, i2, 33);
            }
            if (webvttCssStyle.m8051j() != null) {
                spannableStringBuilder.setSpan(new Standard(webvttCssStyle.m8051j()), i, i2, 33);
            }
            switch (webvttCssStyle.m8052k()) {
                case 1:
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) webvttCssStyle.m8053l(), true), i, i2, 33);
                    break;
                case 2:
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(webvttCssStyle.m8053l()), i, i2, 33);
                    break;
                case 3:
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(webvttCssStyle.m8053l() / 100.0f), i, i2, 33);
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: d */
    private static String m8096d(String str) {
        str = str.trim();
        if (str.isEmpty()) {
            return null;
        }
        return str.split("[ \\.]")[0];
    }

    /* renamed from: a */
    private static void m8090a(List<WebvttCssStyle> list, String str, C2242a c2242a, List<C2243b> list2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            WebvttCssStyle webvttCssStyle = (WebvttCssStyle) list.get(i);
            int a = webvttCssStyle.m8031a(str, c2242a.f6638a, c2242a.f6641d, c2242a.f6640c);
            if (a > 0) {
                list2.add(new C2243b(a, webvttCssStyle));
            }
        }
        Collections.sort(list2);
    }
}
