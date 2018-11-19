package com.facebook.accountkit.internal;

import android.content.res.Resources;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.facebook.accountkit.internal.n */
final class C1238n {
    /* renamed from: a */
    private static final Map<String, String> f3319a = new HashMap();
    /* renamed from: b */
    private static final Map<String, String> f3320b = new HashMap();

    static {
        f3319a.put(af.f3454e, "af_ZA");
        f3319a.put("ar", "ar_AR");
        f3319a.put("az", "az_AZ");
        f3319a.put("be", "be_BY");
        f3319a.put("bg", "bg_BG");
        f3319a.put("bn", "bn_IN");
        f3319a.put("bs", "bs_BA");
        f3319a.put("ca", "ca_ES");
        f3319a.put("ck", "ck_US");
        f3319a.put("cs", "cs_CZ");
        f3319a.put("cy", "cy_GB");
        f3319a.put("da", "da_DK");
        f3319a.put("de", "de_DE");
        f3319a.put("el", "el_GR");
        f3319a.put("eo", "eo_EO");
        f3319a.put("et", "et_EE");
        f3319a.put("es", "es_LA");
        f3319a.put("eu", "eu_ES");
        f3319a.put("fa", "fa_IR");
        f3319a.put("fi", "fi_FI");
        f3319a.put("fil", "tl_PH");
        f3319a.put("fo", "fo_FO");
        f3319a.put("fr", "fr_FR");
        f3319a.put("fy", "fy_NL");
        f3319a.put("ga", "ga_IE");
        f3319a.put("gl", "gl_ES");
        f3319a.put("gu", "gu_IN");
        f3319a.put("he", "he_IL");
        f3319a.put("hi", "hi_IN");
        f3319a.put("hr", "hr_HR");
        f3319a.put("hu", "hu_HU");
        f3319a.put("hy", "hy_AM");
        f3319a.put("id", "id_ID");
        f3319a.put("in", "id_ID");
        f3319a.put("is", "is_IS");
        f3319a.put("it", "it_IT");
        f3319a.put("iw", "he_IL");
        f3319a.put("ja", "ja_JP");
        f3319a.put("ka", "ka_GE");
        f3319a.put("km", "km_KH");
        f3319a.put("kn", "kn_IN");
        f3319a.put("ko", "ko_KR");
        f3319a.put("ku", "ku_TR");
        f3319a.put("la", "la_VA");
        f3319a.put("lv", "lv_LV");
        f3319a.put("mk", "mk_MK");
        f3319a.put("ml", "ml_IN");
        f3319a.put("mr", "mr_IN");
        f3319a.put("ms", "ms_MY");
        f3319a.put("nb", "nb_NO");
        f3319a.put("ne", "ne_NP");
        f3319a.put("nl", "nl_NL");
        f3319a.put("nn", "nn_NO");
        f3319a.put("pa", "pa_IN");
        f3319a.put("pl", "pl_PL");
        f3319a.put("ps", "ps_AF");
        f3319a.put("pt", "pt_BR");
        f3319a.put("ro", "ro_RO");
        f3319a.put("ru", "ru_RU");
        f3319a.put("sk", "sk_SK");
        f3319a.put("sl", "sl_SI");
        f3319a.put("sq", "sq_AL");
        f3319a.put("sr", "sr_RS");
        f3319a.put("sv", "sv_SE");
        f3319a.put("sw", "sw_KE");
        f3319a.put("ta", "ta_IN");
        f3319a.put("te", "te_IN");
        f3319a.put("th", "th_TH");
        f3319a.put("tl", "tl_PH");
        f3319a.put("tr", "tr_TR");
        f3319a.put("uk", "uk_UA");
        f3319a.put("vi", "vi_VN");
        f3319a.put("zh", "zh_CN");
        f3320b.put("es_ES", "es_ES");
        f3320b.put("fr_CA", "fr_CA");
        f3320b.put("pt_PT", "pt_PT");
        f3320b.put("zh_TW", "zh_TW");
        f3320b.put("zh_HK", "zh_HK");
        f3320b.put("fb_HA", "fb_HA");
    }

    /* renamed from: a */
    public static String m4384a() {
        Locale locale = Resources.getSystem().getConfiguration().locale;
        String language = locale.getLanguage();
        String country = locale.getCountry();
        country = String.format("%s_%s", new Object[]{language, country});
        if (f3320b.containsKey(country)) {
            return (String) f3320b.get(country);
        }
        country = (String) f3319a.get(language);
        return country != null ? country : "en_US";
    }
}
