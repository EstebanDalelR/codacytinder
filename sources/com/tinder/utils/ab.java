package com.tinder.utils;

import io.fabric.sdk.android.services.events.C15645a;
import java.util.Locale;

@Deprecated
public class ab {
    /* renamed from: a */
    public static String m57607a() {
        Locale locale = Locale.getDefault();
        if (locale.getLanguage().equals("ms")) {
            return "ml";
        }
        if (locale.toString().startsWith(Locale.CHINESE.toString())) {
            return locale.toString().replace(C15645a.ROLL_OVER_FILE_NAME_SEPARATOR, "-");
        }
        return locale.getLanguage();
    }

    /* renamed from: b */
    public static String m57609b() {
        return m57608a(Locale.getDefault());
    }

    /* renamed from: a */
    public static String m57608a(Locale locale) {
        if (locale.getLanguage().equals("ms")) {
            return "ml".toUpperCase();
        }
        return locale.getCountry();
    }
}
