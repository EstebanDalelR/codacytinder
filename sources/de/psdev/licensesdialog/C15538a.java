package de.psdev.licensesdialog;

import de.psdev.licensesdialog.licenses.ApacheSoftwareLicense20;
import de.psdev.licensesdialog.licenses.BSD2ClauseLicense;
import de.psdev.licensesdialog.licenses.BSD3ClauseLicense;
import de.psdev.licensesdialog.licenses.CreativeCommonsAttributionNoDerivs30Unported;
import de.psdev.licensesdialog.licenses.GnuGeneralPublicLicense20;
import de.psdev.licensesdialog.licenses.GnuGeneralPublicLicense30;
import de.psdev.licensesdialog.licenses.GnuLesserGeneralPublicLicense21;
import de.psdev.licensesdialog.licenses.GnuLesserGeneralPublicLicense3;
import de.psdev.licensesdialog.licenses.ISCLicense;
import de.psdev.licensesdialog.licenses.License;
import de.psdev.licensesdialog.licenses.MITLicense;
import java.util.HashMap;
import java.util.Map;

/* renamed from: de.psdev.licensesdialog.a */
public final class C15538a {
    /* renamed from: a */
    private static final Map<String, License> f48003a = new HashMap(4);

    static {
        C15538a.m58028a();
    }

    /* renamed from: a */
    static void m58028a() {
        f48003a.clear();
        C15538a.m58029a(new ApacheSoftwareLicense20());
        C15538a.m58029a(new BSD2ClauseLicense());
        C15538a.m58029a(new BSD3ClauseLicense());
        C15538a.m58029a(new ISCLicense());
        C15538a.m58029a(new MITLicense());
        C15538a.m58029a(new GnuLesserGeneralPublicLicense21());
        C15538a.m58029a(new GnuLesserGeneralPublicLicense3());
        C15538a.m58029a(new CreativeCommonsAttributionNoDerivs30Unported());
        C15538a.m58029a(new GnuGeneralPublicLicense30());
        C15538a.m58029a(new GnuGeneralPublicLicense20());
    }

    /* renamed from: a */
    public static void m58029a(License license) {
        f48003a.put(license.mo12752a(), license);
    }

    /* renamed from: a */
    public static License m58027a(String str) {
        str = str.trim();
        if (f48003a.containsKey(str)) {
            return (License) f48003a.get(str);
        }
        throw new IllegalStateException(String.format("no such license available: %s, did you forget to register it?", new Object[]{str}));
    }
}
