package com.google.android.exoplayer2.util;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.exoplayer2.util.w */
public final class C2315w {
    /* renamed from: a */
    public static boolean m8503a(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return (!C2315w.m8502a(xmlPullParser) || xmlPullParser.getName().equals(str) == null) ? null : true;
    }

    /* renamed from: a */
    public static boolean m8502a(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3 ? true : null;
    }

    /* renamed from: b */
    public static boolean m8505b(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return (!C2315w.m8504b(xmlPullParser) || xmlPullParser.getName().equals(str) == null) ? null : true;
    }

    /* renamed from: b */
    public static boolean m8504b(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2 ? true : null;
    }

    /* renamed from: c */
    public static String m8506c(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (str.equals(xmlPullParser.getAttributeName(i))) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}
