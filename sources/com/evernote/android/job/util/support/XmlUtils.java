package com.evernote.android.job.util.support;

import android.util.Xml;
import com.facebook.ads.AudienceNetworkActivity;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

final class XmlUtils {

    public interface ReadMapCallback {
        Object readThisUnknownObjectXml(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException;
    }

    public interface WriteMapCallback {
        void writeUnknownObject(Object obj, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException;
    }

    /* renamed from: a */
    public static final void m3904a(Map map, OutputStream outputStream) throws XmlPullParserException, IOException {
        XmlSerializer c1151a = new C1151a();
        c1151a.setOutput(outputStream, AudienceNetworkActivity.WEBVIEW_ENCODING);
        c1151a.startDocument(null, Boolean.valueOf(true));
        c1151a.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        m3905a(map, null, c1151a);
        c1151a.endDocument();
    }

    /* renamed from: a */
    public static final void m3905a(Map map, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        m3906a(map, str, xmlSerializer, null);
    }

    /* renamed from: a */
    public static final void m3906a(Map map, String str, XmlSerializer xmlSerializer, WriteMapCallback writeMapCallback) throws XmlPullParserException, IOException {
        if (map == null) {
            xmlSerializer.startTag(null, ManagerWebServices.NULL_STRING_VALUE);
            xmlSerializer.endTag(null, ManagerWebServices.NULL_STRING_VALUE);
            return;
        }
        xmlSerializer.startTag(null, "map");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        m3907a(map, xmlSerializer, writeMapCallback);
        xmlSerializer.endTag(null, "map");
    }

    /* renamed from: a */
    public static final void m3907a(Map map, XmlSerializer xmlSerializer, WriteMapCallback writeMapCallback) throws XmlPullParserException, IOException {
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                m3902a(entry.getValue(), (String) entry.getKey(), xmlSerializer, writeMapCallback);
            }
        }
    }

    /* renamed from: a */
    public static final void m3903a(List list, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (list == null) {
            xmlSerializer.startTag(null, ManagerWebServices.NULL_STRING_VALUE);
            xmlSerializer.endTag(null, ManagerWebServices.NULL_STRING_VALUE);
            return;
        }
        xmlSerializer.startTag(null, "list");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        str = list.size();
        for (int i = 0; i < str; i++) {
            m3901a(list.get(i), null, xmlSerializer);
        }
        xmlSerializer.endTag(null, "list");
    }

    /* renamed from: a */
    public static final void m3908a(Set set, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (set == null) {
            xmlSerializer.startTag(null, ManagerWebServices.NULL_STRING_VALUE);
            xmlSerializer.endTag(null, ManagerWebServices.NULL_STRING_VALUE);
            return;
        }
        xmlSerializer.startTag(null, "set");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        for (Object a : set) {
            m3901a(a, null, xmlSerializer);
        }
        xmlSerializer.endTag(null, "set");
    }

    /* renamed from: a */
    public static final void m3909a(byte[] bArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (bArr == null) {
            xmlSerializer.startTag(null, ManagerWebServices.NULL_STRING_VALUE);
            xmlSerializer.endTag(null, ManagerWebServices.NULL_STRING_VALUE);
            return;
        }
        xmlSerializer.startTag(null, "byte-array");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(str));
        StringBuilder stringBuilder = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b >> 4;
            stringBuilder.append(i >= 10 ? (i + 97) - 10 : i + 48);
            int i2 = b & 255;
            stringBuilder.append(i2 >= 10 ? (i2 + 97) - 10 : i2 + 48);
        }
        xmlSerializer.text(stringBuilder.toString());
        xmlSerializer.endTag(null, "byte-array");
    }

    /* renamed from: a */
    public static final void m3911a(int[] iArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (iArr == null) {
            xmlSerializer.startTag(null, ManagerWebServices.NULL_STRING_VALUE);
            xmlSerializer.endTag(null, ManagerWebServices.NULL_STRING_VALUE);
            return;
        }
        xmlSerializer.startTag(null, "int-array");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(str));
        for (int num : iArr) {
            xmlSerializer.startTag(null, "item");
            xmlSerializer.attribute(null, "value", Integer.toString(num));
            xmlSerializer.endTag(null, "item");
        }
        xmlSerializer.endTag(null, "int-array");
    }

    /* renamed from: a */
    public static final void m3912a(long[] jArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (jArr == null) {
            xmlSerializer.startTag(null, ManagerWebServices.NULL_STRING_VALUE);
            xmlSerializer.endTag(null, ManagerWebServices.NULL_STRING_VALUE);
            return;
        }
        xmlSerializer.startTag(null, "long-array");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(str));
        for (long l : jArr) {
            xmlSerializer.startTag(null, "item");
            xmlSerializer.attribute(null, "value", Long.toString(l));
            xmlSerializer.endTag(null, "item");
        }
        xmlSerializer.endTag(null, "long-array");
    }

    /* renamed from: a */
    public static final void m3910a(double[] dArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (dArr == null) {
            xmlSerializer.startTag(null, ManagerWebServices.NULL_STRING_VALUE);
            xmlSerializer.endTag(null, ManagerWebServices.NULL_STRING_VALUE);
            return;
        }
        xmlSerializer.startTag(null, "double-array");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(str));
        for (double d : dArr) {
            xmlSerializer.startTag(null, "item");
            xmlSerializer.attribute(null, "value", Double.toString(d));
            xmlSerializer.endTag(null, "item");
        }
        xmlSerializer.endTag(null, "double-array");
    }

    /* renamed from: a */
    public static final void m3913a(String[] strArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (strArr == null) {
            xmlSerializer.startTag(null, ManagerWebServices.NULL_STRING_VALUE);
            xmlSerializer.endTag(null, ManagerWebServices.NULL_STRING_VALUE);
            return;
        }
        xmlSerializer.startTag(null, "string-array");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        str = strArr.length;
        xmlSerializer.attribute(null, "num", Integer.toString(str));
        for (int i = 0; i < str; i++) {
            if (strArr[i] == null) {
                xmlSerializer.startTag(null, ManagerWebServices.NULL_STRING_VALUE);
                xmlSerializer.endTag(null, ManagerWebServices.NULL_STRING_VALUE);
            } else {
                xmlSerializer.startTag(null, "item");
                xmlSerializer.attribute(null, "value", strArr[i]);
                xmlSerializer.endTag(null, "item");
            }
        }
        xmlSerializer.endTag(null, "string-array");
    }

    /* renamed from: a */
    public static final void m3901a(Object obj, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        m3902a(obj, str, xmlSerializer, null);
    }

    /* renamed from: a */
    private static final void m3902a(Object obj, String str, XmlSerializer xmlSerializer, WriteMapCallback writeMapCallback) throws XmlPullParserException, IOException {
        if (obj == null) {
            xmlSerializer.startTag(null, ManagerWebServices.NULL_STRING_VALUE);
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.endTag(null, ManagerWebServices.NULL_STRING_VALUE);
        } else if (obj instanceof String) {
            xmlSerializer.startTag(null, ManagerWebServices.PARAM_TEASER_STRING);
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.text(obj.toString());
            xmlSerializer.endTag(null, ManagerWebServices.PARAM_TEASER_STRING);
        } else {
            if (obj instanceof Integer) {
                writeMapCallback = "int";
            } else if (obj instanceof Long) {
                writeMapCallback = "long";
            } else if (obj instanceof Float) {
                writeMapCallback = "float";
            } else if (obj instanceof Double) {
                writeMapCallback = "double";
            } else if (obj instanceof Boolean) {
                writeMapCallback = "boolean";
            } else if (obj instanceof byte[]) {
                m3909a((byte[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof int[]) {
                m3911a((int[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof long[]) {
                m3912a((long[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof double[]) {
                m3910a((double[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof String[]) {
                m3913a((String[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof Map) {
                m3905a((Map) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof List) {
                m3903a((List) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof Set) {
                m3908a((Set) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof CharSequence) {
                xmlSerializer.startTag(null, ManagerWebServices.PARAM_TEASER_STRING);
                if (str != null) {
                    xmlSerializer.attribute(null, "name", str);
                }
                xmlSerializer.text(obj.toString());
                xmlSerializer.endTag(null, ManagerWebServices.PARAM_TEASER_STRING);
                return;
            } else if (writeMapCallback != null) {
                writeMapCallback.writeUnknownObject(obj, str, xmlSerializer);
                return;
            } else {
                xmlSerializer = new StringBuilder();
                xmlSerializer.append("writeValueXml: unable to write value ");
                xmlSerializer.append(obj);
                throw new RuntimeException(xmlSerializer.toString());
            }
            xmlSerializer.startTag(null, writeMapCallback);
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.attribute(null, "value", obj.toString());
            xmlSerializer.endTag(null, writeMapCallback);
        }
    }

    /* renamed from: a */
    public static final HashMap<String, ?> m3898a(InputStream inputStream) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, null);
        return (HashMap) m3896a(newPullParser, new String[1]);
    }

    /* renamed from: a */
    public static final HashMap<String, ?> m3899a(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        return m3900a(xmlPullParser, str, strArr, null);
    }

    /* renamed from: a */
    public static final HashMap<String, ?> m3900a(XmlPullParser xmlPullParser, String str, String[] strArr, ReadMapCallback readMapCallback) throws XmlPullParserException, IOException {
        HashMap<String, ?> hashMap = new HashMap();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                hashMap.put(strArr[0], m3897a(xmlPullParser, strArr, readMapCallback));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str) != null) {
                    return hashMap;
                }
                readMapCallback = new StringBuilder();
                readMapCallback.append("Expected ");
                readMapCallback.append(str);
                readMapCallback.append(" end tag at: ");
                readMapCallback.append(xmlPullParser.getName());
                throw new XmlPullParserException(readMapCallback.toString());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        strArr = new StringBuilder();
        strArr.append("Document ended before ");
        strArr.append(str);
        strArr.append(" end tag");
        throw new XmlPullParserException(strArr.toString());
    }

    /* renamed from: b */
    public static final ArrayList m3914b(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        return m3915b(xmlPullParser, str, strArr, null);
    }

    /* renamed from: b */
    private static final ArrayList m3915b(XmlPullParser xmlPullParser, String str, String[] strArr, ReadMapCallback readMapCallback) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                arrayList.add(m3897a(xmlPullParser, strArr, readMapCallback));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str) != null) {
                    return arrayList;
                }
                readMapCallback = new StringBuilder();
                readMapCallback.append("Expected ");
                readMapCallback.append(str);
                readMapCallback.append(" end tag at: ");
                readMapCallback.append(xmlPullParser.getName());
                throw new XmlPullParserException(readMapCallback.toString());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        strArr = new StringBuilder();
        strArr.append("Document ended before ");
        strArr.append(str);
        strArr.append(" end tag");
        throw new XmlPullParserException(strArr.toString());
    }

    /* renamed from: c */
    public static final HashSet m3916c(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        return m3917c(xmlPullParser, str, strArr, null);
    }

    /* renamed from: c */
    private static final HashSet m3917c(XmlPullParser xmlPullParser, String str, String[] strArr, ReadMapCallback readMapCallback) throws XmlPullParserException, IOException {
        HashSet hashSet = new HashSet();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                hashSet.add(m3897a(xmlPullParser, strArr, readMapCallback));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str) != null) {
                    return hashSet;
                }
                readMapCallback = new StringBuilder();
                readMapCallback.append("Expected ");
                readMapCallback.append(str);
                readMapCallback.append(" end tag at: ");
                readMapCallback.append(xmlPullParser.getName());
                throw new XmlPullParserException(readMapCallback.toString());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        strArr = new StringBuilder();
        strArr.append("Document ended before ");
        strArr.append(str);
        strArr.append(" end tag");
        throw new XmlPullParserException(strArr.toString());
    }

    /* renamed from: d */
    public static final int[] m3918d(org.xmlpull.v1.XmlPullParser r4, java.lang.String r5, java.lang.String[] r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
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
        r6 = "num";	 Catch:{ NullPointerException -> 0x00c7, NumberFormatException -> 0x00bf }
        r0 = 0;	 Catch:{ NullPointerException -> 0x00c7, NumberFormatException -> 0x00bf }
        r6 = r4.getAttributeValue(r0, r6);	 Catch:{ NullPointerException -> 0x00c7, NumberFormatException -> 0x00bf }
        r6 = java.lang.Integer.parseInt(r6);	 Catch:{ NullPointerException -> 0x00c7, NumberFormatException -> 0x00bf }
        r4.next();
        r6 = new int[r6];
        r1 = 0;
        r2 = r4.getEventType();
    L_0x0015:
        r3 = 2;
        if (r2 != r3) goto L_0x005c;
    L_0x0018:
        r2 = r4.getName();
        r3 = "item";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0041;
    L_0x0024:
        r2 = "value";	 Catch:{ NullPointerException -> 0x0039, NumberFormatException -> 0x0031 }
        r2 = r4.getAttributeValue(r0, r2);	 Catch:{ NullPointerException -> 0x0039, NumberFormatException -> 0x0031 }
        r2 = java.lang.Integer.parseInt(r2);	 Catch:{ NullPointerException -> 0x0039, NumberFormatException -> 0x0031 }
        r6[r1] = r2;	 Catch:{ NullPointerException -> 0x0039, NumberFormatException -> 0x0031 }
        goto L_0x009c;
    L_0x0031:
        r4 = new org.xmlpull.v1.XmlPullParserException;
        r5 = "Not a number in value attribute in item";
        r4.<init>(r5);
        throw r4;
    L_0x0039:
        r4 = new org.xmlpull.v1.XmlPullParserException;
        r5 = "Need value attribute in item";
        r4.<init>(r5);
        throw r4;
    L_0x0041:
        r5 = new org.xmlpull.v1.XmlPullParserException;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r0 = "Expected item tag at: ";
        r6.append(r0);
        r4 = r4.getName();
        r6.append(r4);
        r4 = r6.toString();
        r5.<init>(r4);
        throw r5;
    L_0x005c:
        r3 = 3;
        if (r2 != r3) goto L_0x009c;
    L_0x005f:
        r2 = r4.getName();
        r2 = r2.equals(r5);
        if (r2 == 0) goto L_0x006a;
    L_0x0069:
        return r6;
    L_0x006a:
        r2 = r4.getName();
        r3 = "item";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0079;
    L_0x0076:
        r1 = r1 + 1;
        goto L_0x009c;
    L_0x0079:
        r6 = new org.xmlpull.v1.XmlPullParserException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Expected ";
        r0.append(r1);
        r0.append(r5);
        r5 = " end tag at: ";
        r0.append(r5);
        r4 = r4.getName();
        r0.append(r4);
        r4 = r0.toString();
        r6.<init>(r4);
        throw r6;
    L_0x009c:
        r2 = r4.next();
        r3 = 1;
        if (r2 != r3) goto L_0x0015;
    L_0x00a3:
        r4 = new org.xmlpull.v1.XmlPullParserException;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r0 = "Document ended before ";
        r6.append(r0);
        r6.append(r5);
        r5 = " end tag";
        r6.append(r5);
        r5 = r6.toString();
        r4.<init>(r5);
        throw r4;
    L_0x00bf:
        r4 = new org.xmlpull.v1.XmlPullParserException;
        r5 = "Not a number in num attribute in byte-array";
        r4.<init>(r5);
        throw r4;
    L_0x00c7:
        r4 = new org.xmlpull.v1.XmlPullParserException;
        r5 = "Need num attribute in byte-array";
        r4.<init>(r5);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.util.support.XmlUtils.d(org.xmlpull.v1.XmlPullParser, java.lang.String, java.lang.String[]):int[]");
    }

    /* renamed from: e */
    public static final long[] m3919e(org.xmlpull.v1.XmlPullParser r4, java.lang.String r5, java.lang.String[] r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
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
        r6 = "num";	 Catch:{ NullPointerException -> 0x00c7, NumberFormatException -> 0x00bf }
        r0 = 0;	 Catch:{ NullPointerException -> 0x00c7, NumberFormatException -> 0x00bf }
        r6 = r4.getAttributeValue(r0, r6);	 Catch:{ NullPointerException -> 0x00c7, NumberFormatException -> 0x00bf }
        r6 = java.lang.Integer.parseInt(r6);	 Catch:{ NullPointerException -> 0x00c7, NumberFormatException -> 0x00bf }
        r4.next();
        r6 = new long[r6];
        r1 = 0;
        r2 = r4.getEventType();
    L_0x0015:
        r3 = 2;
        if (r2 != r3) goto L_0x005c;
    L_0x0018:
        r2 = r4.getName();
        r3 = "item";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0041;
    L_0x0024:
        r2 = "value";	 Catch:{ NullPointerException -> 0x0039, NumberFormatException -> 0x0031 }
        r2 = r4.getAttributeValue(r0, r2);	 Catch:{ NullPointerException -> 0x0039, NumberFormatException -> 0x0031 }
        r2 = java.lang.Long.parseLong(r2);	 Catch:{ NullPointerException -> 0x0039, NumberFormatException -> 0x0031 }
        r6[r1] = r2;	 Catch:{ NullPointerException -> 0x0039, NumberFormatException -> 0x0031 }
        goto L_0x009c;
    L_0x0031:
        r4 = new org.xmlpull.v1.XmlPullParserException;
        r5 = "Not a number in value attribute in item";
        r4.<init>(r5);
        throw r4;
    L_0x0039:
        r4 = new org.xmlpull.v1.XmlPullParserException;
        r5 = "Need value attribute in item";
        r4.<init>(r5);
        throw r4;
    L_0x0041:
        r5 = new org.xmlpull.v1.XmlPullParserException;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r0 = "Expected item tag at: ";
        r6.append(r0);
        r4 = r4.getName();
        r6.append(r4);
        r4 = r6.toString();
        r5.<init>(r4);
        throw r5;
    L_0x005c:
        r3 = 3;
        if (r2 != r3) goto L_0x009c;
    L_0x005f:
        r2 = r4.getName();
        r2 = r2.equals(r5);
        if (r2 == 0) goto L_0x006a;
    L_0x0069:
        return r6;
    L_0x006a:
        r2 = r4.getName();
        r3 = "item";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0079;
    L_0x0076:
        r1 = r1 + 1;
        goto L_0x009c;
    L_0x0079:
        r6 = new org.xmlpull.v1.XmlPullParserException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Expected ";
        r0.append(r1);
        r0.append(r5);
        r5 = " end tag at: ";
        r0.append(r5);
        r4 = r4.getName();
        r0.append(r4);
        r4 = r0.toString();
        r6.<init>(r4);
        throw r6;
    L_0x009c:
        r2 = r4.next();
        r3 = 1;
        if (r2 != r3) goto L_0x0015;
    L_0x00a3:
        r4 = new org.xmlpull.v1.XmlPullParserException;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r0 = "Document ended before ";
        r6.append(r0);
        r6.append(r5);
        r5 = " end tag";
        r6.append(r5);
        r5 = r6.toString();
        r4.<init>(r5);
        throw r4;
    L_0x00bf:
        r4 = new org.xmlpull.v1.XmlPullParserException;
        r5 = "Not a number in num attribute in long-array";
        r4.<init>(r5);
        throw r4;
    L_0x00c7:
        r4 = new org.xmlpull.v1.XmlPullParserException;
        r5 = "Need num attribute in long-array";
        r4.<init>(r5);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.util.support.XmlUtils.e(org.xmlpull.v1.XmlPullParser, java.lang.String, java.lang.String[]):long[]");
    }

    /* renamed from: f */
    public static final double[] m3920f(org.xmlpull.v1.XmlPullParser r4, java.lang.String r5, java.lang.String[] r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
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
        r6 = "num";	 Catch:{ NullPointerException -> 0x00c7, NumberFormatException -> 0x00bf }
        r0 = 0;	 Catch:{ NullPointerException -> 0x00c7, NumberFormatException -> 0x00bf }
        r6 = r4.getAttributeValue(r0, r6);	 Catch:{ NullPointerException -> 0x00c7, NumberFormatException -> 0x00bf }
        r6 = java.lang.Integer.parseInt(r6);	 Catch:{ NullPointerException -> 0x00c7, NumberFormatException -> 0x00bf }
        r4.next();
        r6 = new double[r6];
        r1 = 0;
        r2 = r4.getEventType();
    L_0x0015:
        r3 = 2;
        if (r2 != r3) goto L_0x005c;
    L_0x0018:
        r2 = r4.getName();
        r3 = "item";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0041;
    L_0x0024:
        r2 = "value";	 Catch:{ NullPointerException -> 0x0039, NumberFormatException -> 0x0031 }
        r2 = r4.getAttributeValue(r0, r2);	 Catch:{ NullPointerException -> 0x0039, NumberFormatException -> 0x0031 }
        r2 = java.lang.Double.parseDouble(r2);	 Catch:{ NullPointerException -> 0x0039, NumberFormatException -> 0x0031 }
        r6[r1] = r2;	 Catch:{ NullPointerException -> 0x0039, NumberFormatException -> 0x0031 }
        goto L_0x009c;
    L_0x0031:
        r4 = new org.xmlpull.v1.XmlPullParserException;
        r5 = "Not a number in value attribute in item";
        r4.<init>(r5);
        throw r4;
    L_0x0039:
        r4 = new org.xmlpull.v1.XmlPullParserException;
        r5 = "Need value attribute in item";
        r4.<init>(r5);
        throw r4;
    L_0x0041:
        r5 = new org.xmlpull.v1.XmlPullParserException;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r0 = "Expected item tag at: ";
        r6.append(r0);
        r4 = r4.getName();
        r6.append(r4);
        r4 = r6.toString();
        r5.<init>(r4);
        throw r5;
    L_0x005c:
        r3 = 3;
        if (r2 != r3) goto L_0x009c;
    L_0x005f:
        r2 = r4.getName();
        r2 = r2.equals(r5);
        if (r2 == 0) goto L_0x006a;
    L_0x0069:
        return r6;
    L_0x006a:
        r2 = r4.getName();
        r3 = "item";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0079;
    L_0x0076:
        r1 = r1 + 1;
        goto L_0x009c;
    L_0x0079:
        r6 = new org.xmlpull.v1.XmlPullParserException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Expected ";
        r0.append(r1);
        r0.append(r5);
        r5 = " end tag at: ";
        r0.append(r5);
        r4 = r4.getName();
        r0.append(r4);
        r4 = r0.toString();
        r6.<init>(r4);
        throw r6;
    L_0x009c:
        r2 = r4.next();
        r3 = 1;
        if (r2 != r3) goto L_0x0015;
    L_0x00a3:
        r4 = new org.xmlpull.v1.XmlPullParserException;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r0 = "Document ended before ";
        r6.append(r0);
        r6.append(r5);
        r5 = " end tag";
        r6.append(r5);
        r5 = r6.toString();
        r4.<init>(r5);
        throw r4;
    L_0x00bf:
        r4 = new org.xmlpull.v1.XmlPullParserException;
        r5 = "Not a number in num attribute in double-array";
        r4.<init>(r5);
        throw r4;
    L_0x00c7:
        r4 = new org.xmlpull.v1.XmlPullParserException;
        r5 = "Need num attribute in double-array";
        r4.<init>(r5);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.util.support.XmlUtils.f(org.xmlpull.v1.XmlPullParser, java.lang.String, java.lang.String[]):double[]");
    }

    /* renamed from: g */
    public static final java.lang.String[] m3921g(org.xmlpull.v1.XmlPullParser r4, java.lang.String r5, java.lang.String[] r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
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
        r6 = "num";	 Catch:{ NullPointerException -> 0x00df, NumberFormatException -> 0x00d7 }
        r0 = 0;	 Catch:{ NullPointerException -> 0x00df, NumberFormatException -> 0x00d7 }
        r6 = r4.getAttributeValue(r0, r6);	 Catch:{ NullPointerException -> 0x00df, NumberFormatException -> 0x00d7 }
        r6 = java.lang.Integer.parseInt(r6);	 Catch:{ NullPointerException -> 0x00df, NumberFormatException -> 0x00d7 }
        r4.next();
        r6 = new java.lang.String[r6];
        r1 = 0;
        r2 = r4.getEventType();
    L_0x0015:
        r3 = 2;
        if (r2 != r3) goto L_0x0068;
    L_0x0018:
        r2 = r4.getName();
        r3 = "item";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x003e;
    L_0x0024:
        r2 = "value";	 Catch:{ NullPointerException -> 0x0036, NumberFormatException -> 0x002e }
        r2 = r4.getAttributeValue(r0, r2);	 Catch:{ NullPointerException -> 0x0036, NumberFormatException -> 0x002e }
        r6[r1] = r2;	 Catch:{ NullPointerException -> 0x0036, NumberFormatException -> 0x002e }
        goto L_0x00b4;
    L_0x002e:
        r4 = new org.xmlpull.v1.XmlPullParserException;
        r5 = "Not a number in value attribute in item";
        r4.<init>(r5);
        throw r4;
    L_0x0036:
        r4 = new org.xmlpull.v1.XmlPullParserException;
        r5 = "Need value attribute in item";
        r4.<init>(r5);
        throw r4;
    L_0x003e:
        r2 = r4.getName();
        r3 = "null";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x004d;
    L_0x004a:
        r6[r1] = r0;
        goto L_0x00b4;
    L_0x004d:
        r5 = new org.xmlpull.v1.XmlPullParserException;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r0 = "Expected item tag at: ";
        r6.append(r0);
        r4 = r4.getName();
        r6.append(r4);
        r4 = r6.toString();
        r5.<init>(r4);
        throw r5;
    L_0x0068:
        r3 = 3;
        if (r2 != r3) goto L_0x00b4;
    L_0x006b:
        r2 = r4.getName();
        r2 = r2.equals(r5);
        if (r2 == 0) goto L_0x0076;
    L_0x0075:
        return r6;
    L_0x0076:
        r2 = r4.getName();
        r3 = "item";
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x00b2;
    L_0x0082:
        r2 = r4.getName();
        r3 = "null";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x008f;
    L_0x008e:
        goto L_0x00b2;
    L_0x008f:
        r6 = new org.xmlpull.v1.XmlPullParserException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Expected ";
        r0.append(r1);
        r0.append(r5);
        r5 = " end tag at: ";
        r0.append(r5);
        r4 = r4.getName();
        r0.append(r4);
        r4 = r0.toString();
        r6.<init>(r4);
        throw r6;
    L_0x00b2:
        r1 = r1 + 1;
    L_0x00b4:
        r2 = r4.next();
        r3 = 1;
        if (r2 != r3) goto L_0x0015;
    L_0x00bb:
        r4 = new org.xmlpull.v1.XmlPullParserException;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r0 = "Document ended before ";
        r6.append(r0);
        r6.append(r5);
        r5 = " end tag";
        r6.append(r5);
        r5 = r6.toString();
        r4.<init>(r5);
        throw r4;
    L_0x00d7:
        r4 = new org.xmlpull.v1.XmlPullParserException;
        r5 = "Not a number in num attribute in string-array";
        r4.<init>(r5);
        throw r4;
    L_0x00df:
        r4 = new org.xmlpull.v1.XmlPullParserException;
        r5 = "Need num attribute in string-array";
        r4.<init>(r5);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.util.support.XmlUtils.g(org.xmlpull.v1.XmlPullParser, java.lang.String, java.lang.String[]):java.lang.String[]");
    }

    /* renamed from: a */
    public static final Object m3896a(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (eventType != 2) {
            StringBuilder stringBuilder;
            if (eventType == 3) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected end tag at: ");
                stringBuilder.append(xmlPullParser.getName());
                throw new XmlPullParserException(stringBuilder.toString());
            } else if (eventType == 4) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected text: ");
                stringBuilder.append(xmlPullParser.getText());
                throw new XmlPullParserException(stringBuilder.toString());
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    throw new XmlPullParserException("Unexpected end of document");
                }
            }
        }
        return m3897a(xmlPullParser, strArr, null);
    }

    /* renamed from: a */
    private static final Object m3897a(XmlPullParser xmlPullParser, String[] strArr, ReadMapCallback readMapCallback) throws XmlPullParserException, IOException {
        Object obj = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "name");
        String name = xmlPullParser.getName();
        if (!name.equals(ManagerWebServices.NULL_STRING_VALUE)) {
            if (name.equals(ManagerWebServices.PARAM_TEASER_STRING)) {
                readMapCallback = "";
                while (true) {
                    int next = xmlPullParser.next();
                    if (next == 1) {
                        throw new XmlPullParserException("Unexpected end of document in <string>");
                    } else if (next == 3) {
                        break;
                    } else if (next == 4) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(readMapCallback);
                        stringBuilder.append(xmlPullParser.getText());
                        readMapCallback = stringBuilder.toString();
                    } else if (next == 2) {
                        readMapCallback = new StringBuilder();
                        readMapCallback.append("Unexpected start tag in <string>: ");
                        readMapCallback.append(xmlPullParser.getName());
                        throw new XmlPullParserException(readMapCallback.toString());
                    }
                }
                if (xmlPullParser.getName().equals(ManagerWebServices.PARAM_TEASER_STRING)) {
                    strArr[0] = attributeValue;
                    return readMapCallback;
                }
                readMapCallback = new StringBuilder();
                readMapCallback.append("Unexpected end tag in <string>: ");
                readMapCallback.append(xmlPullParser.getName());
                throw new XmlPullParserException(readMapCallback.toString());
            }
            obj = m3895a(xmlPullParser, name);
            if (obj == null) {
                if (name.equals("int-array")) {
                    xmlPullParser = m3918d(xmlPullParser, "int-array", strArr);
                    strArr[0] = attributeValue;
                    return xmlPullParser;
                } else if (name.equals("long-array")) {
                    xmlPullParser = m3919e(xmlPullParser, "long-array", strArr);
                    strArr[0] = attributeValue;
                    return xmlPullParser;
                } else if (name.equals("double-array")) {
                    xmlPullParser = m3920f(xmlPullParser, "double-array", strArr);
                    strArr[0] = attributeValue;
                    return xmlPullParser;
                } else if (name.equals("string-array")) {
                    xmlPullParser = m3921g(xmlPullParser, "string-array", strArr);
                    strArr[0] = attributeValue;
                    return xmlPullParser;
                } else if (name.equals("map")) {
                    xmlPullParser.next();
                    xmlPullParser = m3899a(xmlPullParser, "map", strArr);
                    strArr[0] = attributeValue;
                    return xmlPullParser;
                } else if (name.equals("list")) {
                    xmlPullParser.next();
                    xmlPullParser = m3914b(xmlPullParser, "list", strArr);
                    strArr[0] = attributeValue;
                    return xmlPullParser;
                } else if (name.equals("set")) {
                    xmlPullParser.next();
                    xmlPullParser = m3916c(xmlPullParser, "set", strArr);
                    strArr[0] = attributeValue;
                    return xmlPullParser;
                } else if (readMapCallback != null) {
                    xmlPullParser = readMapCallback.readThisUnknownObjectXml(xmlPullParser, name);
                    strArr[0] = attributeValue;
                    return xmlPullParser;
                } else {
                    strArr = new StringBuilder();
                    strArr.append("Unknown tag: ");
                    strArr.append(name);
                    throw new XmlPullParserException(strArr.toString());
                }
            }
        }
        do {
            readMapCallback = xmlPullParser.next();
            if (readMapCallback == 1) {
                strArr = new StringBuilder();
                strArr.append("Unexpected end of document in <");
                strArr.append(name);
                strArr.append(">");
                throw new XmlPullParserException(strArr.toString());
            } else if (readMapCallback == 3) {
                if (xmlPullParser.getName().equals(name) != null) {
                    strArr[0] = attributeValue;
                    return obj;
                }
                readMapCallback = new StringBuilder();
                readMapCallback.append("Unexpected end tag in <");
                readMapCallback.append(name);
                readMapCallback.append(">: ");
                readMapCallback.append(xmlPullParser.getName());
                throw new XmlPullParserException(readMapCallback.toString());
            } else if (readMapCallback == 4) {
                readMapCallback = new StringBuilder();
                readMapCallback.append("Unexpected text in <");
                readMapCallback.append(name);
                readMapCallback.append(">: ");
                readMapCallback.append(xmlPullParser.getName());
                throw new XmlPullParserException(readMapCallback.toString());
            }
        } while (readMapCallback != 2);
        readMapCallback = new StringBuilder();
        readMapCallback.append("Unexpected start tag in <");
        readMapCallback.append(name);
        readMapCallback.append(">: ");
        readMapCallback.append(xmlPullParser.getName());
        throw new XmlPullParserException(readMapCallback.toString());
    }

    /* renamed from: a */
    private static final java.lang.Object m3895a(org.xmlpull.v1.XmlPullParser r2, java.lang.String r3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
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
        r0 = "int";	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        r0 = r3.equals(r0);	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        r1 = 0;	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        if (r0 == 0) goto L_0x0018;	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
    L_0x0009:
        r0 = "value";	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        r2 = r2.getAttributeValue(r1, r0);	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        r2 = java.lang.Integer.parseInt(r2);	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        return r2;	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
    L_0x0018:
        r0 = "long";	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        r0 = r3.equals(r0);	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        if (r0 == 0) goto L_0x002b;	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
    L_0x0020:
        r0 = "value";	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        r2 = r2.getAttributeValue(r1, r0);	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        r2 = java.lang.Long.valueOf(r2);	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        return r2;	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
    L_0x002b:
        r0 = "float";	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        r0 = r3.equals(r0);	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        if (r0 == 0) goto L_0x003e;	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
    L_0x0033:
        r0 = "value";	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        r2 = r2.getAttributeValue(r1, r0);	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        r2 = java.lang.Float.valueOf(r2);	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        return r2;	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
    L_0x003e:
        r0 = "double";	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        r0 = r3.equals(r0);	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        if (r0 == 0) goto L_0x0051;	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
    L_0x0046:
        r0 = "value";	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        r2 = r2.getAttributeValue(r1, r0);	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        r2 = java.lang.Double.valueOf(r2);	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        return r2;	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
    L_0x0051:
        r0 = "boolean";	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        r0 = r3.equals(r0);	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        if (r0 == 0) goto L_0x0064;	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
    L_0x0059:
        r0 = "value";	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        r2 = r2.getAttributeValue(r1, r0);	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ NullPointerException -> 0x0081, NumberFormatException -> 0x0065 }
        return r2;
    L_0x0064:
        return r1;
    L_0x0065:
        r2 = new org.xmlpull.v1.XmlPullParserException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Not a number in value attribute in <";
        r0.append(r1);
        r0.append(r3);
        r3 = ">";
        r0.append(r3);
        r3 = r0.toString();
        r2.<init>(r3);
        throw r2;
    L_0x0081:
        r2 = new org.xmlpull.v1.XmlPullParserException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Need value attribute in <";
        r0.append(r1);
        r0.append(r3);
        r3 = ">";
        r0.append(r3);
        r3 = r0.toString();
        r2.<init>(r3);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.util.support.XmlUtils.a(org.xmlpull.v1.XmlPullParser, java.lang.String):java.lang.Object");
    }
}
