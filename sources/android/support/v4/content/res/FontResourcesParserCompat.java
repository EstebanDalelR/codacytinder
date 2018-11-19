package android.support.v4.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.annotation.ArrayRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.p007a.C0123a.C0122b;
import android.support.v4.provider.C0539a;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({Scope.LIBRARY_GROUP})
public class FontResourcesParserCompat {

    public interface FamilyResourceEntry {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FetchStrategy {
    }

    /* renamed from: android.support.v4.content.res.FontResourcesParserCompat$b */
    public static final class C0437b {
        @NonNull
        /* renamed from: a */
        private final String f1476a;
        /* renamed from: b */
        private int f1477b;
        /* renamed from: c */
        private boolean f1478c;
        /* renamed from: d */
        private int f1479d;

        public C0437b(@NonNull String str, int i, boolean z, int i2) {
            this.f1476a = str;
            this.f1477b = i;
            this.f1478c = z;
            this.f1479d = i2;
        }

        @NonNull
        /* renamed from: a */
        public String m1654a() {
            return this.f1476a;
        }

        /* renamed from: b */
        public int m1655b() {
            return this.f1477b;
        }

        /* renamed from: c */
        public boolean m1656c() {
            return this.f1478c;
        }

        /* renamed from: d */
        public int m1657d() {
            return this.f1479d;
        }
    }

    /* renamed from: android.support.v4.content.res.FontResourcesParserCompat$a */
    public static final class C2840a implements FamilyResourceEntry {
        @NonNull
        /* renamed from: a */
        private final C0437b[] f9031a;

        public C2840a(@NonNull C0437b[] c0437bArr) {
            this.f9031a = c0437bArr;
        }

        @NonNull
        /* renamed from: a */
        public C0437b[] m11242a() {
            return this.f9031a;
        }
    }

    /* renamed from: android.support.v4.content.res.FontResourcesParserCompat$c */
    public static final class C2841c implements FamilyResourceEntry {
        @NonNull
        /* renamed from: a */
        private final C0539a f9032a;
        /* renamed from: b */
        private final int f9033b;
        /* renamed from: c */
        private final int f9034c;

        public C2841c(@NonNull C0539a c0539a, int i, int i2) {
            this.f9032a = c0539a;
            this.f9034c = i;
            this.f9033b = i2;
        }

        @NonNull
        /* renamed from: a */
        public C0539a m11243a() {
            return this.f9032a;
        }

        /* renamed from: b */
        public int m11244b() {
            return this.f9034c;
        }

        /* renamed from: c */
        public int m11245c() {
            return this.f9033b;
        }
    }

    @Nullable
    /* renamed from: a */
    public static FamilyResourceEntry m1658a(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2 || next == 1) {
                if (next != 2) {
                    return m1662b(xmlPullParser, resources);
                }
                throw new XmlPullParserException("No start tag found");
            }
        }
        if (next != 2) {
            return m1662b(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @Nullable
    /* renamed from: b */
    private static FamilyResourceEntry m1662b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m1663c(xmlPullParser, resources);
        }
        m1661a(xmlPullParser);
        return null;
    }

    @Nullable
    /* renamed from: c */
    private static FamilyResourceEntry m1663c(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0122b.FontFamily);
        String string = obtainAttributes.getString(C0122b.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C0122b.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C0122b.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C0122b.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C0122b.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C0122b.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            List arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m1664d(xmlPullParser, resources));
                    } else {
                        m1661a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty() != null) {
                return null;
            }
            return new C2840a((C0437b[]) arrayList.toArray(new C0437b[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m1661a(xmlPullParser);
        }
        return new C2841c(new C0539a(string, string2, string3, m1659a(resources, resourceId)), integer, integer2);
    }

    /* renamed from: a */
    public static List<List<byte[]>> m1659a(Resources resources, @ArrayRes int i) {
        List<List<byte[]>> list = null;
        if (i != 0) {
            TypedArray obtainTypedArray = resources.obtainTypedArray(i);
            if (obtainTypedArray.length() > 0) {
                list = new ArrayList();
                if ((obtainTypedArray.getResourceId(0, 0) != 0 ? 1 : null) != null) {
                    for (i = 0; i < obtainTypedArray.length(); i++) {
                        list.add(m1660a(resources.getStringArray(obtainTypedArray.getResourceId(i, 0))));
                    }
                } else {
                    list.add(m1660a(resources.getStringArray(i)));
                }
            }
            obtainTypedArray.recycle();
        }
        return list != null ? list : Collections.emptyList();
    }

    /* renamed from: a */
    private static List<byte[]> m1660a(String[] strArr) {
        List<byte[]> arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* renamed from: d */
    private static C0437b m1664d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        resources = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0122b.FontFamilyFont);
        int i = resources.getInt(resources.hasValue(C0122b.FontFamilyFont_fontWeight) ? C0122b.FontFamilyFont_fontWeight : C0122b.FontFamilyFont_android_fontWeight, 400);
        boolean z = true;
        if (1 != resources.getInt(resources.hasValue(C0122b.FontFamilyFont_fontStyle) ? C0122b.FontFamilyFont_fontStyle : C0122b.FontFamilyFont_android_fontStyle, 0)) {
            z = false;
        }
        int i2 = resources.hasValue(C0122b.FontFamilyFont_font) ? C0122b.FontFamilyFont_font : C0122b.FontFamilyFont_android_font;
        int resourceId = resources.getResourceId(i2, 0);
        String string = resources.getString(i2);
        resources.recycle();
        while (xmlPullParser.next() != 3) {
            m1661a(xmlPullParser);
        }
        return new C0437b(string, i, z, resourceId);
    }

    /* renamed from: a */
    private static void m1661a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
                default:
                    break;
            }
        }
    }
}
