package de.psdev.licensesdialog;

import android.content.Context;
import de.psdev.licensesdialog.C15548e.C15547b;
import de.psdev.licensesdialog.licenses.License;
import de.psdev.licensesdialog.model.Notice;
import de.psdev.licensesdialog.model.Notices;
import java.util.HashMap;
import java.util.Map;

/* renamed from: de.psdev.licensesdialog.c */
public final class C15544c {
    /* renamed from: a */
    private final Context f48027a;
    /* renamed from: b */
    private final Map<License, String> f48028b = new HashMap();
    /* renamed from: c */
    private Notices f48029c;
    /* renamed from: d */
    private Notice f48030d;
    /* renamed from: e */
    private String f48031e;
    /* renamed from: f */
    private boolean f48032f;

    /* renamed from: a */
    public static C15544c m58043a(Context context) {
        return new C15544c(context);
    }

    private C15544c(Context context) {
        this.f48027a = context;
        this.f48031e = context.getResources().getString(C15547b.notices_default_style);
        this.f48032f = null;
    }

    /* renamed from: a */
    public C15544c m58048a(Notices notices) {
        this.f48029c = notices;
        this.f48030d = null;
        return this;
    }

    /* renamed from: a */
    public C15544c m58049a(String str) {
        this.f48031e = str;
        return this;
    }

    /* renamed from: a */
    public C15544c m58050a(boolean z) {
        this.f48032f = z;
        return this;
    }

    /* renamed from: a */
    public String m58051a() {
        StringBuilder stringBuilder = new StringBuilder(500);
        m58045a(stringBuilder);
        if (this.f48030d != null) {
            m58046a(stringBuilder, this.f48030d);
        } else if (this.f48029c != null) {
            for (Notice a : this.f48029c.getNotices()) {
                m58046a(stringBuilder, a);
            }
        } else {
            throw new IllegalStateException("no notice(s) set");
        }
        m58047b(stringBuilder);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private void m58045a(StringBuilder stringBuilder) {
        stringBuilder.append("<!DOCTYPE html><html><head>");
        stringBuilder.append("<style type=\"text/css\">");
        stringBuilder.append(this.f48031e);
        stringBuilder.append("</style>");
        stringBuilder.append("</head><body>");
    }

    /* renamed from: a */
    private void m58046a(StringBuilder stringBuilder, Notice notice) {
        stringBuilder.append("<ul><li>");
        stringBuilder.append(notice.getName());
        String url = notice.getUrl();
        if (url != null && url.length() > 0) {
            stringBuilder.append(" (<a href=\"");
            stringBuilder.append(url);
            stringBuilder.append("\">");
            stringBuilder.append(url);
            stringBuilder.append("</a>)");
        }
        stringBuilder.append("</li></ul>");
        stringBuilder.append("<pre>");
        url = notice.getCopyright();
        if (url != null) {
            stringBuilder.append(url);
            stringBuilder.append("<br/><br/>");
        }
        stringBuilder.append(m58044a(notice.getLicense()));
        stringBuilder.append("</pre>");
    }

    /* renamed from: b */
    private void m58047b(StringBuilder stringBuilder) {
        stringBuilder.append("</body></html>");
    }

    /* renamed from: a */
    private String m58044a(License license) {
        if (license == null) {
            return "";
        }
        if (!this.f48028b.containsKey(license)) {
            this.f48028b.put(license, this.f48032f ? license.m58068d(this.f48027a) : license.m58067c(this.f48027a));
        }
        return (String) this.f48028b.get(license);
    }
}
