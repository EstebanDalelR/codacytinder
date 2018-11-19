package com.google.i18n.phonenumbers.internal;

import com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc;
import java.util.regex.Pattern;

/* renamed from: com.google.i18n.phonenumbers.internal.a */
public final class C6952a implements MatcherApi {
    /* renamed from: a */
    private final C5628b f25451a = new C5628b(100);

    /* renamed from: a */
    public static MatcherApi m30469a() {
        return new C6952a();
    }

    private C6952a() {
    }

    public boolean matchNationalNumber(CharSequence charSequence, PhoneNumberDesc phoneNumberDesc, boolean z) {
        phoneNumberDesc = phoneNumberDesc.m24610a();
        if (phoneNumberDesc.length() == 0) {
            return null;
        }
        return C6952a.m30470a(charSequence, this.f25451a.m24681a(phoneNumberDesc), z);
    }

    /* renamed from: a */
    private static boolean m30470a(CharSequence charSequence, Pattern pattern, boolean z) {
        charSequence = pattern.matcher(charSequence);
        if (charSequence.lookingAt() == null) {
            return null;
        }
        if (charSequence.matches() != null) {
            z = true;
        }
        return z;
    }
}
