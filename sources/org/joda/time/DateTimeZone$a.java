package org.joda.time;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.format.C19316b;
import org.joda.time.format.DateTimeFormatterBuilder;

final class DateTimeZone$a {
    /* renamed from: a */
    static final Map<String, String> f60068a = m68917b();
    /* renamed from: b */
    static final C19316b f60069b = m68916a();

    /* renamed from: a */
    private static C19316b m68916a() {
        return new DateTimeFormatterBuilder().m69111a(null, true, 2, 4).m69119a().m69164a(new DateTimeZone$LazyInit$1());
    }

    /* renamed from: b */
    private static Map<String, String> m68917b() {
        Map hashMap = new HashMap();
        hashMap.put("GMT", "UTC");
        hashMap.put("WET", "WET");
        hashMap.put("CET", "CET");
        hashMap.put("MET", "CET");
        hashMap.put("ECT", "CET");
        hashMap.put("EET", "EET");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("HST", "Pacific/Honolulu");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("MST", "America/Denver");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("EST", "America/New_York");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("NST", "Pacific/Auckland");
        return Collections.unmodifiableMap(hashMap);
    }
}
