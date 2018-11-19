package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.internal.C6952a;
import com.google.i18n.phonenumbers.internal.MatcherApi;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class ShortNumberInfo {
    /* renamed from: a */
    private static final Logger f20853a = Logger.getLogger(ShortNumberInfo.class.getName());
    /* renamed from: b */
    private static final ShortNumberInfo f20854b = new ShortNumberInfo(C6952a.m30469a());
    /* renamed from: c */
    private static final Set<String> f20855c = new HashSet();
    /* renamed from: d */
    private final MatcherApi f20856d;
    /* renamed from: e */
    private final Map<Integer, List<String>> f20857e = C5622c.m24668a();

    public enum ShortNumberCost {
        TOLL_FREE,
        STANDARD_RATE,
        PREMIUM_RATE,
        UNKNOWN_COST
    }

    static {
        f20855c.add("BR");
        f20855c.add("CL");
        f20855c.add("NI");
    }

    ShortNumberInfo(MatcherApi matcherApi) {
        this.f20856d = matcherApi;
    }
}
