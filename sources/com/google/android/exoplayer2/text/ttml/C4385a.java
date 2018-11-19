package com.google.android.exoplayer2.text.ttml;

import android.util.Log;
import com.google.android.exoplayer2.text.C4258a;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.C2315w;
import com.leanplum.BuildConfig;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.google.android.exoplayer2.text.ttml.a */
public final class C4385a extends C4258a {
    /* renamed from: a */
    private static final Pattern f14535a = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    /* renamed from: b */
    private static final Pattern f14536b = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    /* renamed from: c */
    private static final Pattern f14537c = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    /* renamed from: d */
    private static final Pattern f14538d = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    /* renamed from: e */
    private static final Pattern f14539e = Pattern.compile("^(\\d+) (\\d+)$");
    /* renamed from: f */
    private static final C2235b f14540f = new C2235b(30.0f, 1, 1);
    /* renamed from: g */
    private static final C2234a f14541g = new C2234a(32, 15);
    /* renamed from: h */
    private final XmlPullParserFactory f14542h;

    /* renamed from: com.google.android.exoplayer2.text.ttml.a$a */
    private static final class C2234a {
        /* renamed from: a */
        final int f6583a;
        /* renamed from: b */
        final int f6584b;

        C2234a(int i, int i2) {
            this.f6583a = i;
            this.f6584b = i2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.ttml.a$b */
    private static final class C2235b {
        /* renamed from: a */
        final float f6585a;
        /* renamed from: b */
        final int f6586b;
        /* renamed from: c */
        final int f6587c;

        C2235b(float f, int i, int i2) {
            this.f6585a = f;
            this.f6586b = i;
            this.f6587c = i2;
        }
    }

    /* renamed from: a */
    protected /* synthetic */ Subtitle mo3740a(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        return m18124b(bArr, i, z);
    }

    public C4385a() {
        super("TtmlDecoder");
        try {
            this.f14542h = XmlPullParserFactory.newInstance();
            this.f14542h.setNamespaceAware(true);
        } catch (Throwable e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: b */
    protected C3708e m18124b(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        try {
            XmlPullParser newPullParser = this.f14542h.newPullParser();
            Map hashMap = new HashMap();
            Map hashMap2 = new HashMap();
            C3708e c3708e = null;
            hashMap2.put("", new C2237c(null));
            int i2 = 0;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            bArr = new LinkedList();
            C2235b c2235b = f14540f;
            C2234a c2234a = f14541g;
            for (i = newPullParser.getEventType(); i != 1; i = newPullParser.getEventType()) {
                C2236b c2236b = (C2236b) bArr.peekLast();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (i == 2) {
                        if ("tt".equals(name) != 0) {
                            c2235b = m18116a(newPullParser);
                            c2234a = m18115a(newPullParser, f14541g);
                        }
                        if (C4385a.m18122b(name) == 0) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Ignoring unsupported tag: ");
                            stringBuilder.append(newPullParser.getName());
                            Log.i("TtmlDecoder", stringBuilder.toString());
                            i2++;
                        } else if ("head".equals(name) != 0) {
                            m18118a(newPullParser, hashMap, hashMap2, c2234a);
                        } else {
                            try {
                                C2236b a = m18117a(newPullParser, c2236b, hashMap2, c2235b);
                                bArr.addLast(a);
                                if (c2236b != null) {
                                    c2236b.m8023a(a);
                                }
                            } catch (int i3) {
                                Log.w("TtmlDecoder", "Suppressing parser error", i3);
                                i2++;
                            }
                        }
                    } else if (i3 == 4) {
                        c2236b.m8023a(C2236b.m8014a(newPullParser.getText()));
                    } else if (i3 == 3) {
                        if (newPullParser.getName().equals("tt") != 0) {
                            c3708e = new C3708e((C2236b) bArr.getLast(), hashMap, hashMap2);
                        }
                        bArr.removeLast();
                    }
                } else if (i3 == 2) {
                    i2++;
                } else if (i3 == 3) {
                    i2--;
                }
                newPullParser.next();
            }
            return c3708e;
        } catch (byte[] bArr2) {
            throw new SubtitleDecoderException("Unable to decode source", bArr2);
        } catch (byte[] bArr22) {
            throw new IllegalStateException("Unexpected error when reading input.", bArr22);
        }
    }

    /* renamed from: a */
    private C2235b m18116a(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split(" ");
            if (split.length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f = ((float) Integer.parseInt(split[0])) / ((float) Integer.parseInt(split[1]));
        }
        int i = f14540f.f6586b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = f14540f.f6587c;
        xmlPullParser = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (xmlPullParser != null) {
            i2 = Integer.parseInt(xmlPullParser);
        }
        return new C2235b(((float) parseInt) * f, i, i2);
    }

    /* renamed from: a */
    private com.google.android.exoplayer2.text.ttml.C4385a.C2234a m18115a(org.xmlpull.v1.XmlPullParser r6, com.google.android.exoplayer2.text.ttml.C4385a.C2234a r7) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
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
        r5 = this;
        r0 = "http://www.w3.org/ns/ttml#parameter";
        r1 = "cellResolution";
        r6 = r6.getAttributeValue(r0, r1);
        if (r6 != 0) goto L_0x000b;
    L_0x000a:
        return r7;
    L_0x000b:
        r0 = f14539e;
        r0 = r0.matcher(r6);
        r1 = r0.matches();
        if (r1 != 0) goto L_0x002e;
    L_0x0017:
        r0 = "TtmlDecoder";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Ignoring malformed cell resolution: ";
        r1.append(r2);
        r1.append(r6);
        r6 = r1.toString();
        android.util.Log.w(r0, r6);
        return r7;
    L_0x002e:
        r1 = 1;
        r1 = r0.group(r1);	 Catch:{ NumberFormatException -> 0x006a }
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x006a }
        r2 = 2;	 Catch:{ NumberFormatException -> 0x006a }
        r0 = r0.group(r2);	 Catch:{ NumberFormatException -> 0x006a }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x006a }
        if (r1 == 0) goto L_0x004b;	 Catch:{ NumberFormatException -> 0x006a }
    L_0x0042:
        if (r0 != 0) goto L_0x0045;	 Catch:{ NumberFormatException -> 0x006a }
    L_0x0044:
        goto L_0x004b;	 Catch:{ NumberFormatException -> 0x006a }
    L_0x0045:
        r2 = new com.google.android.exoplayer2.text.ttml.a$a;	 Catch:{ NumberFormatException -> 0x006a }
        r2.<init>(r1, r0);	 Catch:{ NumberFormatException -> 0x006a }
        return r2;	 Catch:{ NumberFormatException -> 0x006a }
    L_0x004b:
        r2 = new com.google.android.exoplayer2.text.SubtitleDecoderException;	 Catch:{ NumberFormatException -> 0x006a }
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x006a }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x006a }
        r4 = "Invalid cell resolution ";	 Catch:{ NumberFormatException -> 0x006a }
        r3.append(r4);	 Catch:{ NumberFormatException -> 0x006a }
        r3.append(r1);	 Catch:{ NumberFormatException -> 0x006a }
        r1 = " ";	 Catch:{ NumberFormatException -> 0x006a }
        r3.append(r1);	 Catch:{ NumberFormatException -> 0x006a }
        r3.append(r0);	 Catch:{ NumberFormatException -> 0x006a }
        r0 = r3.toString();	 Catch:{ NumberFormatException -> 0x006a }
        r2.<init>(r0);	 Catch:{ NumberFormatException -> 0x006a }
        throw r2;	 Catch:{ NumberFormatException -> 0x006a }
    L_0x006a:
        r0 = "TtmlDecoder";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Ignoring malformed cell resolution: ";
        r1.append(r2);
        r1.append(r6);
        r6 = r1.toString();
        android.util.Log.w(r0, r6);
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.a.a(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.text.ttml.a$a):com.google.android.exoplayer2.text.ttml.a$a");
    }

    /* renamed from: a */
    private Map<String, TtmlStyle> m18118a(XmlPullParser xmlPullParser, Map<String, TtmlStyle> map, Map<String, C2237c> map2, C2234a c2234a) throws IOException, XmlPullParserException {
        do {
            xmlPullParser.next();
            if (C2315w.m8505b(xmlPullParser, "style")) {
                String c = C2315w.m8506c(xmlPullParser, "style");
                TtmlStyle a = m18114a(xmlPullParser, new TtmlStyle());
                if (c != null) {
                    for (Object obj : m18120a(c)) {
                        a.m7992a((TtmlStyle) map.get(obj));
                    }
                }
                if (a.m8008i() != null) {
                    map.put(a.m8008i(), a);
                }
            } else if (C2315w.m8505b(xmlPullParser, "region")) {
                C2237c b = m18121b(xmlPullParser, c2234a);
                if (b != null) {
                    map2.put(b.f6599a, b);
                }
            }
        } while (!C2315w.m8503a(xmlPullParser, "head"));
        return map;
    }

    /* renamed from: b */
    private com.google.android.exoplayer2.text.ttml.C2237c m18121b(org.xmlpull.v1.XmlPullParser r12, com.google.android.exoplayer2.text.ttml.C4385a.C2234a r13) {
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
        r11 = this;
        r0 = "id";
        r2 = com.google.android.exoplayer2.util.C2315w.m8506c(r12, r0);
        r0 = 0;
        if (r2 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r1 = "origin";
        r1 = com.google.android.exoplayer2.util.C2315w.m8506c(r12, r1);
        if (r1 == 0) goto L_0x0112;
    L_0x0012:
        r3 = f14538d;
        r3 = r3.matcher(r1);
        r4 = r3.matches();
        if (r4 == 0) goto L_0x00fb;
    L_0x001e:
        r4 = 1;
        r5 = r3.group(r4);	 Catch:{ NumberFormatException -> 0x00e4 }
        r5 = java.lang.Float.parseFloat(r5);	 Catch:{ NumberFormatException -> 0x00e4 }
        r6 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;	 Catch:{ NumberFormatException -> 0x00e4 }
        r5 = r5 / r6;	 Catch:{ NumberFormatException -> 0x00e4 }
        r7 = 2;	 Catch:{ NumberFormatException -> 0x00e4 }
        r3 = r3.group(r7);	 Catch:{ NumberFormatException -> 0x00e4 }
        r3 = java.lang.Float.parseFloat(r3);	 Catch:{ NumberFormatException -> 0x00e4 }
        r3 = r3 / r6;
        r8 = "extent";
        r8 = com.google.android.exoplayer2.util.C2315w.m8506c(r12, r8);
        if (r8 == 0) goto L_0x00dc;
    L_0x003c:
        r9 = f14538d;
        r8 = r9.matcher(r8);
        r9 = r8.matches();
        if (r9 == 0) goto L_0x00c5;
    L_0x0048:
        r9 = r8.group(r4);	 Catch:{ NumberFormatException -> 0x00ae }
        r9 = java.lang.Float.parseFloat(r9);	 Catch:{ NumberFormatException -> 0x00ae }
        r9 = r9 / r6;	 Catch:{ NumberFormatException -> 0x00ae }
        r8 = r8.group(r7);	 Catch:{ NumberFormatException -> 0x00ae }
        r8 = java.lang.Float.parseFloat(r8);	 Catch:{ NumberFormatException -> 0x00ae }
        r8 = r8 / r6;
        r0 = "displayAlign";
        r12 = com.google.android.exoplayer2.util.C2315w.m8506c(r12, r0);
        r0 = 0;
        if (r12 == 0) goto L_0x0099;
    L_0x0063:
        r12 = com.google.android.exoplayer2.util.C2314v.m8493d(r12);
        r1 = -1;
        r6 = r12.hashCode();
        r10 = -1364013995; // 0xffffffffaeb2cc55 float:-8.1307995E-11 double:NaN;
        if (r6 == r10) goto L_0x0081;
    L_0x0071:
        r10 = 92734940; // 0x58705dc float:1.2697491E-35 double:4.5817148E-316;
        if (r6 == r10) goto L_0x0077;
    L_0x0076:
        goto L_0x008a;
    L_0x0077:
        r6 = "after";
        r12 = r12.equals(r6);
        if (r12 == 0) goto L_0x008a;
    L_0x007f:
        r1 = 1;
        goto L_0x008a;
    L_0x0081:
        r6 = "center";
        r12 = r12.equals(r6);
        if (r12 == 0) goto L_0x008a;
    L_0x0089:
        r1 = 0;
    L_0x008a:
        switch(r1) {
            case 0: goto L_0x0092;
            case 1: goto L_0x008e;
            default: goto L_0x008d;
        };
    L_0x008d:
        goto L_0x0099;
    L_0x008e:
        r3 = r3 + r8;
        r4 = r3;
        r6 = 2;
        goto L_0x009b;
    L_0x0092:
        r12 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r8 = r8 / r12;
        r3 = r3 + r8;
        r4 = r3;
        r6 = 1;
        goto L_0x009b;
    L_0x0099:
        r4 = r3;
        r6 = 0;
    L_0x009b:
        r12 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r13 = r13.f6584b;
        r13 = (float) r13;
        r12 = r12 / r13;
        r13 = new com.google.android.exoplayer2.text.ttml.c;
        r0 = 0;
        r8 = 1;
        r1 = r13;
        r3 = r5;
        r5 = r0;
        r7 = r9;
        r9 = r12;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);
        return r13;
    L_0x00ae:
        r12 = "TtmlDecoder";
        r13 = new java.lang.StringBuilder;
        r13.<init>();
        r2 = "Ignoring region with malformed extent: ";
        r13.append(r2);
        r13.append(r1);
        r13 = r13.toString();
        android.util.Log.w(r12, r13);
        return r0;
    L_0x00c5:
        r12 = "TtmlDecoder";
        r13 = new java.lang.StringBuilder;
        r13.<init>();
        r2 = "Ignoring region with unsupported extent: ";
        r13.append(r2);
        r13.append(r1);
        r13 = r13.toString();
        android.util.Log.w(r12, r13);
        return r0;
    L_0x00dc:
        r12 = "TtmlDecoder";
        r13 = "Ignoring region without an extent";
        android.util.Log.w(r12, r13);
        return r0;
    L_0x00e4:
        r12 = "TtmlDecoder";
        r13 = new java.lang.StringBuilder;
        r13.<init>();
        r2 = "Ignoring region with malformed origin: ";
        r13.append(r2);
        r13.append(r1);
        r13 = r13.toString();
        android.util.Log.w(r12, r13);
        return r0;
    L_0x00fb:
        r12 = "TtmlDecoder";
        r13 = new java.lang.StringBuilder;
        r13.<init>();
        r2 = "Ignoring region with unsupported origin: ";
        r13.append(r2);
        r13.append(r1);
        r13 = r13.toString();
        android.util.Log.w(r12, r13);
        return r0;
    L_0x0112:
        r12 = "TtmlDecoder";
        r13 = "Ignoring region without an origin";
        android.util.Log.w(r12, r13);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.a.b(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.text.ttml.a$a):com.google.android.exoplayer2.text.ttml.c");
    }

    /* renamed from: a */
    private String[] m18120a(String str) {
        return str.split("\\s+");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private com.google.android.exoplayer2.text.ttml.TtmlStyle m18114a(org.xmlpull.v1.XmlPullParser r12, com.google.android.exoplayer2.text.ttml.TtmlStyle r13) {
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
        r11 = this;
        r0 = r12.getAttributeCount();
        r1 = 0;
        r2 = r13;
        r13 = 0;
    L_0x0007:
        if (r13 >= r0) goto L_0x0219;
    L_0x0009:
        r3 = r12.getAttributeValue(r13);
        r4 = r12.getAttributeName(r13);
        r5 = r4.hashCode();
        r6 = 4;
        r7 = 3;
        r8 = 2;
        r9 = -1;
        r10 = 1;
        switch(r5) {
            case -1550943582: goto L_0x006f;
            case -1224696685: goto L_0x0065;
            case -1065511464: goto L_0x005b;
            case -879295043: goto L_0x0050;
            case -734428249: goto L_0x0046;
            case 3355: goto L_0x003c;
            case 94842723: goto L_0x0032;
            case 365601008: goto L_0x0028;
            case 1287124693: goto L_0x001e;
            default: goto L_0x001d;
        };
    L_0x001d:
        goto L_0x0079;
    L_0x001e:
        r5 = "backgroundColor";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x0026:
        r4 = 1;
        goto L_0x007a;
    L_0x0028:
        r5 = "fontSize";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x0030:
        r4 = 4;
        goto L_0x007a;
    L_0x0032:
        r5 = "color";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x003a:
        r4 = 2;
        goto L_0x007a;
    L_0x003c:
        r5 = "id";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x0044:
        r4 = 0;
        goto L_0x007a;
    L_0x0046:
        r5 = "fontWeight";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x004e:
        r4 = 5;
        goto L_0x007a;
    L_0x0050:
        r5 = "textDecoration";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x0058:
        r4 = 8;
        goto L_0x007a;
    L_0x005b:
        r5 = "textAlign";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x0063:
        r4 = 7;
        goto L_0x007a;
    L_0x0065:
        r5 = "fontFamily";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x006d:
        r4 = 3;
        goto L_0x007a;
    L_0x006f:
        r5 = "fontStyle";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x0077:
        r4 = 6;
        goto L_0x007a;
    L_0x0079:
        r4 = -1;
    L_0x007a:
        switch(r4) {
            case 0: goto L_0x0201;
            case 1: goto L_0x01de;
            case 2: goto L_0x01bb;
            case 3: goto L_0x01b2;
            case 4: goto L_0x0190;
            case 5: goto L_0x0180;
            case 6: goto L_0x0170;
            case 7: goto L_0x00f1;
            case 8: goto L_0x007f;
            default: goto L_0x007d;
        };
    L_0x007d:
        goto L_0x0215;
    L_0x007f:
        r3 = com.google.android.exoplayer2.util.C2314v.m8493d(r3);
        r4 = r3.hashCode();
        r5 = -1461280213; // 0xffffffffa8e6a22b float:-2.5605459E-14 double:NaN;
        if (r4 == r5) goto L_0x00ba;
    L_0x008c:
        r5 = -1026963764; // 0xffffffffc2c9c6cc float:-100.888275 double:NaN;
        if (r4 == r5) goto L_0x00b0;
    L_0x0091:
        r5 = 913457136; // 0x36723ff0 float:3.6098027E-6 double:4.5130779E-315;
        if (r4 == r5) goto L_0x00a6;
    L_0x0096:
        r5 = 1679736913; // 0x641ec051 float:1.1713774E22 double:8.29900303E-315;
        if (r4 == r5) goto L_0x009c;
    L_0x009b:
        goto L_0x00c3;
    L_0x009c:
        r4 = "linethrough";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x00c3;
    L_0x00a4:
        r7 = 0;
        goto L_0x00c4;
    L_0x00a6:
        r4 = "nolinethrough";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x00c3;
    L_0x00ae:
        r7 = 1;
        goto L_0x00c4;
    L_0x00b0:
        r4 = "underline";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x00c3;
    L_0x00b8:
        r7 = 2;
        goto L_0x00c4;
    L_0x00ba:
        r4 = "nounderline";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x00c3;
    L_0x00c2:
        goto L_0x00c4;
    L_0x00c3:
        r7 = -1;
    L_0x00c4:
        switch(r7) {
            case 0: goto L_0x00e7;
            case 1: goto L_0x00dd;
            case 2: goto L_0x00d3;
            case 3: goto L_0x00c9;
            default: goto L_0x00c7;
        };
    L_0x00c7:
        goto L_0x0215;
    L_0x00c9:
        r2 = r11.m18113a(r2);
        r2 = r2.m7997b(r1);
        goto L_0x0215;
    L_0x00d3:
        r2 = r11.m18113a(r2);
        r2 = r2.m7997b(r10);
        goto L_0x0215;
    L_0x00dd:
        r2 = r11.m18113a(r2);
        r2 = r2.m7994a(r1);
        goto L_0x0215;
    L_0x00e7:
        r2 = r11.m18113a(r2);
        r2 = r2.m7994a(r10);
        goto L_0x0215;
    L_0x00f1:
        r3 = com.google.android.exoplayer2.util.C2314v.m8493d(r3);
        r4 = r3.hashCode();
        switch(r4) {
            case -1364013995: goto L_0x0125;
            case 100571: goto L_0x011b;
            case 3317767: goto L_0x0111;
            case 108511772: goto L_0x0107;
            case 109757538: goto L_0x00fd;
            default: goto L_0x00fc;
        };
    L_0x00fc:
        goto L_0x012e;
    L_0x00fd:
        r4 = "start";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x012e;
    L_0x0105:
        r6 = 1;
        goto L_0x012f;
    L_0x0107:
        r4 = "right";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x012e;
    L_0x010f:
        r6 = 2;
        goto L_0x012f;
    L_0x0111:
        r4 = "left";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x012e;
    L_0x0119:
        r6 = 0;
        goto L_0x012f;
    L_0x011b:
        r4 = "end";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x012e;
    L_0x0123:
        r6 = 3;
        goto L_0x012f;
    L_0x0125:
        r4 = "center";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x012e;
    L_0x012d:
        goto L_0x012f;
    L_0x012e:
        r6 = -1;
    L_0x012f:
        switch(r6) {
            case 0: goto L_0x0164;
            case 1: goto L_0x0158;
            case 2: goto L_0x014c;
            case 3: goto L_0x0140;
            case 4: goto L_0x0134;
            default: goto L_0x0132;
        };
    L_0x0132:
        goto L_0x0215;
    L_0x0134:
        r2 = r11.m18113a(r2);
        r3 = android.text.Layout.Alignment.ALIGN_CENTER;
        r2 = r2.m7991a(r3);
        goto L_0x0215;
    L_0x0140:
        r2 = r11.m18113a(r2);
        r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        r2 = r2.m7991a(r3);
        goto L_0x0215;
    L_0x014c:
        r2 = r11.m18113a(r2);
        r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        r2 = r2.m7991a(r3);
        goto L_0x0215;
    L_0x0158:
        r2 = r11.m18113a(r2);
        r3 = android.text.Layout.Alignment.ALIGN_NORMAL;
        r2 = r2.m7991a(r3);
        goto L_0x0215;
    L_0x0164:
        r2 = r11.m18113a(r2);
        r3 = android.text.Layout.Alignment.ALIGN_NORMAL;
        r2 = r2.m7991a(r3);
        goto L_0x0215;
    L_0x0170:
        r2 = r11.m18113a(r2);
        r4 = "italic";
        r3 = r4.equalsIgnoreCase(r3);
        r2 = r2.m8002d(r3);
        goto L_0x0215;
    L_0x0180:
        r2 = r11.m18113a(r2);
        r4 = "bold";
        r3 = r4.equalsIgnoreCase(r3);
        r2 = r2.m8000c(r3);
        goto L_0x0215;
    L_0x0190:
        r4 = r11.m18113a(r2);	 Catch:{ SubtitleDecoderException -> 0x019b }
        com.google.android.exoplayer2.text.ttml.C4385a.m18119a(r3, r4);	 Catch:{ SubtitleDecoderException -> 0x019a }
        r2 = r4;
        goto L_0x0215;
    L_0x019a:
        r2 = r4;
    L_0x019b:
        r4 = "TtmlDecoder";
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "Failed parsing fontSize value: ";
        r5.append(r6);
        r5.append(r3);
        r3 = r5.toString();
        android.util.Log.w(r4, r3);
        goto L_0x0215;
    L_0x01b2:
        r2 = r11.m18113a(r2);
        r2 = r2.m7993a(r3);
        goto L_0x0215;
    L_0x01bb:
        r2 = r11.m18113a(r2);
        r4 = com.google.android.exoplayer2.util.C2293d.m8329a(r3);	 Catch:{ IllegalArgumentException -> 0x01c7 }
        r2.m7990a(r4);	 Catch:{ IllegalArgumentException -> 0x01c7 }
        goto L_0x0215;
    L_0x01c7:
        r4 = "TtmlDecoder";
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "Failed parsing color value: ";
        r5.append(r6);
        r5.append(r3);
        r3 = r5.toString();
        android.util.Log.w(r4, r3);
        goto L_0x0215;
    L_0x01de:
        r2 = r11.m18113a(r2);
        r4 = com.google.android.exoplayer2.util.C2293d.m8329a(r3);	 Catch:{ IllegalArgumentException -> 0x01ea }
        r2.m7995b(r4);	 Catch:{ IllegalArgumentException -> 0x01ea }
        goto L_0x0215;
    L_0x01ea:
        r4 = "TtmlDecoder";
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "Failed parsing background value: ";
        r5.append(r6);
        r5.append(r3);
        r3 = r5.toString();
        android.util.Log.w(r4, r3);
        goto L_0x0215;
    L_0x0201:
        r4 = "style";
        r5 = r12.getName();
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0215;
    L_0x020d:
        r2 = r11.m18113a(r2);
        r2 = r2.m7996b(r3);
    L_0x0215:
        r13 = r13 + 1;
        goto L_0x0007;
    L_0x0219:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.a.a(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.text.ttml.TtmlStyle):com.google.android.exoplayer2.text.ttml.TtmlStyle");
    }

    /* renamed from: a */
    private TtmlStyle m18113a(TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private com.google.android.exoplayer2.text.ttml.C2236b m18117a(org.xmlpull.v1.XmlPullParser r23, com.google.android.exoplayer2.text.ttml.C2236b r24, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.C2237c> r25, com.google.android.exoplayer2.text.ttml.C4385a.C2235b r26) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        /*
        r22 = this;
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r3 = r26;
        r4 = "";
        r5 = r23.getAttributeCount();
        r6 = 0;
        r12 = r0.m18114a(r1, r6);
        r17 = r6;
        r10 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r13 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r15 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r6 = r4;
        r4 = 0;
    L_0x0026:
        if (r4 >= r5) goto L_0x00a1;
    L_0x0028:
        r7 = r1.getAttributeName(r4);
        r8 = r1.getAttributeValue(r4);
        r20 = r7.hashCode();
        switch(r20) {
            case -934795532: goto L_0x0060;
            case 99841: goto L_0x0056;
            case 100571: goto L_0x004c;
            case 93616297: goto L_0x0042;
            case 109780401: goto L_0x0038;
            default: goto L_0x0037;
        };
    L_0x0037:
        goto L_0x006a;
    L_0x0038:
        r9 = "style";
        r7 = r7.equals(r9);
        if (r7 == 0) goto L_0x006a;
    L_0x0040:
        r7 = 3;
        goto L_0x006b;
    L_0x0042:
        r9 = "begin";
        r7 = r7.equals(r9);
        if (r7 == 0) goto L_0x006a;
    L_0x004a:
        r7 = 0;
        goto L_0x006b;
    L_0x004c:
        r9 = "end";
        r7 = r7.equals(r9);
        if (r7 == 0) goto L_0x006a;
    L_0x0054:
        r7 = 1;
        goto L_0x006b;
    L_0x0056:
        r9 = "dur";
        r7 = r7.equals(r9);
        if (r7 == 0) goto L_0x006a;
    L_0x005e:
        r7 = 2;
        goto L_0x006b;
    L_0x0060:
        r9 = "region";
        r7 = r7.equals(r9);
        if (r7 == 0) goto L_0x006a;
    L_0x0068:
        r7 = 4;
        goto L_0x006b;
    L_0x006a:
        r7 = -1;
    L_0x006b:
        switch(r7) {
            case 0: goto L_0x0097;
            case 1: goto L_0x008f;
            case 2: goto L_0x0087;
            case 3: goto L_0x007b;
            case 4: goto L_0x0071;
            default: goto L_0x006e;
        };
    L_0x006e:
        r7 = r25;
        goto L_0x009e;
    L_0x0071:
        r7 = r25;
        r9 = r7.containsKey(r8);
        if (r9 == 0) goto L_0x009e;
    L_0x0079:
        r6 = r8;
        goto L_0x009e;
    L_0x007b:
        r7 = r25;
        r8 = r0.m18120a(r8);
        r9 = r8.length;
        if (r9 <= 0) goto L_0x009e;
    L_0x0084:
        r17 = r8;
        goto L_0x009e;
    L_0x0087:
        r7 = r25;
        r8 = com.google.android.exoplayer2.text.ttml.C4385a.m18112a(r8, r3);
        r15 = r8;
        goto L_0x009e;
    L_0x008f:
        r7 = r25;
        r8 = com.google.android.exoplayer2.text.ttml.C4385a.m18112a(r8, r3);
        r13 = r8;
        goto L_0x009e;
    L_0x0097:
        r7 = r25;
        r8 = com.google.android.exoplayer2.text.ttml.C4385a.m18112a(r8, r3);
        r10 = r8;
    L_0x009e:
        r4 = r4 + 1;
        goto L_0x0026;
    L_0x00a1:
        if (r2 == 0) goto L_0x00c3;
    L_0x00a3:
        r3 = r2.f6591d;
        r7 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r5 == 0) goto L_0x00c8;
    L_0x00ae:
        r3 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1));
        if (r3 == 0) goto L_0x00b8;
    L_0x00b2:
        r3 = r2.f6591d;
        r18 = r10 + r3;
        r10 = r18;
    L_0x00b8:
        r3 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1));
        if (r3 == 0) goto L_0x00c8;
    L_0x00bc:
        r3 = r2.f6591d;
        r18 = r13 + r3;
        r13 = r18;
        goto L_0x00c8;
    L_0x00c3:
        r7 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
    L_0x00c8:
        r3 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1));
        if (r3 != 0) goto L_0x00de;
    L_0x00cc:
        r3 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1));
        if (r3 == 0) goto L_0x00d3;
    L_0x00d0:
        r2 = r10 + r15;
        goto L_0x00df;
    L_0x00d3:
        if (r2 == 0) goto L_0x00de;
    L_0x00d5:
        r3 = r2.f6592e;
        r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r5 == 0) goto L_0x00de;
    L_0x00db:
        r2 = r2.f6592e;
        goto L_0x00df;
    L_0x00de:
        r2 = r13;
    L_0x00df:
        r7 = r23.getName();
        r8 = r10;
        r10 = r2;
        r13 = r17;
        r14 = r6;
        r1 = com.google.android.exoplayer2.text.ttml.C2236b.m8015a(r7, r8, r10, r12, r13, r14);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.a.a(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.text.ttml.b, java.util.Map, com.google.android.exoplayer2.text.ttml.a$b):com.google.android.exoplayer2.text.ttml.b");
    }

    /* renamed from: b */
    private static boolean m18122b(String str) {
        if (!(str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals(BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER) || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("smpte:image") || str.equals("smpte:data"))) {
            if (str.equals("smpte:information") == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m18119a(String str, TtmlStyle ttmlStyle) throws SubtitleDecoderException {
        Matcher matcher;
        String[] split = str.split("\\s+");
        if (split.length == 1) {
            matcher = f14537c.matcher(str);
        } else if (split.length == 2) {
            matcher = f14537c.matcher(split[1]);
            Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            ttmlStyle = new StringBuilder();
            ttmlStyle.append("Invalid number of entries for fontSize: ");
            ttmlStyle.append(split.length);
            ttmlStyle.append(".");
            throw new SubtitleDecoderException(ttmlStyle.toString());
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            Object obj = -1;
            int hashCode = group.hashCode();
            if (hashCode != 37) {
                if (hashCode != 3240) {
                    if (hashCode == 3592) {
                        if (group.equals("px")) {
                            obj = null;
                        }
                    }
                } else if (group.equals("em")) {
                    obj = 1;
                }
            } else if (group.equals("%")) {
                obj = 2;
            }
            switch (obj) {
                case null:
                    ttmlStyle.m7999c(1);
                    break;
                case 1:
                    ttmlStyle.m7999c(2);
                    break;
                case 2:
                    ttmlStyle.m7999c(3);
                    break;
                default:
                    ttmlStyle = new StringBuilder();
                    ttmlStyle.append("Invalid unit for fontSize: '");
                    ttmlStyle.append(group);
                    ttmlStyle.append("'.");
                    throw new SubtitleDecoderException(ttmlStyle.toString());
            }
            ttmlStyle.m7989a(Float.valueOf(matcher.group(1)).floatValue());
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid expression for fontSize: '");
        stringBuilder.append(str);
        stringBuilder.append("'.");
        throw new SubtitleDecoderException(stringBuilder.toString());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static long m18112a(java.lang.String r14, com.google.android.exoplayer2.text.ttml.C4385a.C2235b r15) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        /*
        r0 = f14535a;
        r0 = r0.matcher(r14);
        r1 = r0.matches();
        r2 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r4 = 5;
        r5 = 4;
        r6 = 3;
        r7 = 2;
        r8 = 1;
        if (r1 == 0) goto L_0x0079;
    L_0x0016:
        r14 = r0.group(r8);
        r8 = java.lang.Long.parseLong(r14);
        r10 = 3600; // 0xe10 float:5.045E-42 double:1.7786E-320;
        r8 = r8 * r10;
        r8 = (double) r8;
        r14 = r0.group(r7);
        r10 = java.lang.Long.parseLong(r14);
        r12 = 60;
        r10 = r10 * r12;
        r10 = (double) r10;
        r8 = r8 + r10;
        r14 = r0.group(r6);
        r6 = java.lang.Long.parseLong(r14);
        r6 = (double) r6;
        r8 = r8 + r6;
        r14 = r0.group(r5);
        r5 = 0;
        if (r14 == 0) goto L_0x0048;
    L_0x0043:
        r10 = java.lang.Double.parseDouble(r14);
        goto L_0x0049;
    L_0x0048:
        r10 = r5;
    L_0x0049:
        r14 = 0;
        r8 = r8 + r10;
        r14 = r0.group(r4);
        if (r14 == 0) goto L_0x005b;
    L_0x0051:
        r10 = java.lang.Long.parseLong(r14);
        r14 = (float) r10;
        r1 = r15.f6585a;
        r14 = r14 / r1;
        r10 = (double) r14;
        goto L_0x005c;
    L_0x005b:
        r10 = r5;
    L_0x005c:
        r14 = 0;
        r8 = r8 + r10;
        r14 = 6;
        r14 = r0.group(r14);
        if (r14 == 0) goto L_0x0073;
    L_0x0065:
        r0 = java.lang.Long.parseLong(r14);
        r0 = (double) r0;
        r14 = r15.f6586b;
        r4 = (double) r14;
        r0 = r0 / r4;
        r14 = r15.f6585a;
        r14 = (double) r14;
        r5 = r0 / r14;
    L_0x0073:
        r14 = 0;
        r8 = r8 + r5;
        r8 = r8 * r2;
        r14 = (long) r8;
        return r14;
    L_0x0079:
        r0 = f14536b;
        r0 = r0.matcher(r14);
        r1 = r0.matches();
        if (r1 == 0) goto L_0x010b;
    L_0x0085:
        r14 = r0.group(r8);
        r9 = java.lang.Double.parseDouble(r14);
        r14 = r0.group(r7);
        r0 = -1;
        r1 = r14.hashCode();
        r11 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        if (r1 == r11) goto L_0x00db;
    L_0x009a:
        r5 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        if (r1 == r5) goto L_0x00d1;
    L_0x009e:
        r5 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        if (r1 == r5) goto L_0x00c7;
    L_0x00a2:
        r5 = 3494; // 0xda6 float:4.896E-42 double:1.7263E-320;
        if (r1 == r5) goto L_0x00bd;
    L_0x00a6:
        switch(r1) {
            case 115: goto L_0x00b3;
            case 116: goto L_0x00aa;
            default: goto L_0x00a9;
        };
    L_0x00a9:
        goto L_0x00e5;
    L_0x00aa:
        r1 = "t";
        r14 = r14.equals(r1);
        if (r14 == 0) goto L_0x00e5;
    L_0x00b2:
        goto L_0x00e6;
    L_0x00b3:
        r1 = "s";
        r14 = r14.equals(r1);
        if (r14 == 0) goto L_0x00e5;
    L_0x00bb:
        r4 = 2;
        goto L_0x00e6;
    L_0x00bd:
        r1 = "ms";
        r14 = r14.equals(r1);
        if (r14 == 0) goto L_0x00e5;
    L_0x00c5:
        r4 = 3;
        goto L_0x00e6;
    L_0x00c7:
        r1 = "m";
        r14 = r14.equals(r1);
        if (r14 == 0) goto L_0x00e5;
    L_0x00cf:
        r4 = 1;
        goto L_0x00e6;
    L_0x00d1:
        r1 = "h";
        r14 = r14.equals(r1);
        if (r14 == 0) goto L_0x00e5;
    L_0x00d9:
        r4 = 0;
        goto L_0x00e6;
    L_0x00db:
        r1 = "f";
        r14 = r14.equals(r1);
        if (r14 == 0) goto L_0x00e5;
    L_0x00e3:
        r4 = 4;
        goto L_0x00e6;
    L_0x00e5:
        r4 = -1;
    L_0x00e6:
        switch(r4) {
            case 0: goto L_0x0100;
            case 1: goto L_0x00fb;
            case 2: goto L_0x0107;
            case 3: goto L_0x00f4;
            case 4: goto L_0x00ef;
            case 5: goto L_0x00ea;
            default: goto L_0x00e9;
        };
    L_0x00e9:
        goto L_0x0107;
    L_0x00ea:
        r14 = r15.f6587c;
        r14 = (double) r14;
        r9 = r9 / r14;
        goto L_0x0107;
    L_0x00ef:
        r14 = r15.f6585a;
        r14 = (double) r14;
        r9 = r9 / r14;
        goto L_0x0107;
    L_0x00f4:
        r14 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r9 = r9 / r14;
        goto L_0x0107;
    L_0x00fb:
        r14 = 4633641066610819072; // 0x404e000000000000 float:0.0 double:60.0;
        r9 = r9 * r14;
        goto L_0x0107;
    L_0x0100:
        r14 = 4660134898793709568; // 0x40ac200000000000 float:0.0 double:3600.0;
        r9 = r9 * r14;
    L_0x0107:
        r9 = r9 * r2;
        r14 = (long) r9;
        return r14;
    L_0x010b:
        r15 = new com.google.android.exoplayer2.text.SubtitleDecoderException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Malformed time expression: ";
        r0.append(r1);
        r0.append(r14);
        r14 = r0.toString();
        r15.<init>(r14);
        throw r15;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.a.a(java.lang.String, com.google.android.exoplayer2.text.ttml.a$b):long");
    }
}
