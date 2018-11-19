package de.psdev.licensesdialog;

import android.util.Xml;
import de.psdev.licensesdialog.licenses.License;
import de.psdev.licensesdialog.model.Notice;
import de.psdev.licensesdialog.model.Notices;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: de.psdev.licensesdialog.d */
public final class C15545d {
    /* renamed from: h */
    private static void m58061h(XmlPullParser xmlPullParser) {
    }

    /* renamed from: a */
    public static Notices m58052a(InputStream inputStream) throws Exception {
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            newPullParser.setInput(inputStream, null);
            newPullParser.nextTag();
            Notices a = C15545d.m58053a(newPullParser);
            return a;
        } finally {
            inputStream.close();
        }
    }

    /* renamed from: a */
    private static Notices m58053a(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        Notices notices = new Notices();
        xmlPullParser.require(2, null, "notices");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("notice".equals(xmlPullParser.getName())) {
                    notices.addNotice(C15545d.m58055b(xmlPullParser));
                } else {
                    C15545d.m58061h(xmlPullParser);
                }
            }
        }
        return notices;
    }

    /* renamed from: b */
    private static Notice m58055b(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str = null;
        xmlPullParser.require(2, null, "notice");
        String str2 = null;
        String str3 = str2;
        License license = str3;
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("name".equals(name)) {
                    str = C15545d.m58056c(xmlPullParser);
                } else if ("url".equals(name)) {
                    str2 = C15545d.m58057d(xmlPullParser);
                } else if ("copyright".equals(name)) {
                    str3 = C15545d.m58058e(xmlPullParser);
                } else if ("license".equals(name)) {
                    license = C15545d.m58059f(xmlPullParser);
                } else {
                    C15545d.m58061h(xmlPullParser);
                }
            }
        }
        return new Notice(str, str2, str3, license);
    }

    /* renamed from: c */
    private static String m58056c(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        return C15545d.m58054a(xmlPullParser, "name");
    }

    /* renamed from: d */
    private static String m58057d(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        return C15545d.m58054a(xmlPullParser, "url");
    }

    /* renamed from: e */
    private static String m58058e(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        return C15545d.m58054a(xmlPullParser, "copyright");
    }

    /* renamed from: f */
    private static License m58059f(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        return C15538a.m58027a(C15545d.m58054a(xmlPullParser, "license"));
    }

    /* renamed from: a */
    private static String m58054a(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, null, str);
        String g = C15545d.m58060g(xmlPullParser);
        xmlPullParser.require(3, null, str);
        return g;
    }

    /* renamed from: g */
    private static String m58060g(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str = "";
        if (xmlPullParser.next() != 4) {
            return str;
        }
        str = xmlPullParser.getText();
        xmlPullParser.nextTag();
        return str;
    }
}
