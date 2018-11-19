package com.tinder.api.networkperf;

import com.tinder.api.ManagerWebServices;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0001¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\t"}, d2 = {"Lcom/tinder/api/networkperf/PerfEventUrlUtils;", "", "()V", "formatEndpoint", "", "url", "replaceMap", "", "trimProtocolAndQueryParams", "api_release"}, k = 1, mv = {1, 1, 10})
public final class PerfEventUrlUtils {
    @NotNull
    public static /* synthetic */ String formatEndpoint$default(PerfEventUrlUtils perfEventUrlUtils, String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = ae.a();
        }
        return perfEventUrlUtils.formatEndpoint(str, map);
    }

    @NotNull
    public final String formatEndpoint(@NotNull String str, @NotNull Map<String, String> map) {
        C2668g.b(str, "url");
        C2668g.b(map, "replaceMap");
        str = trimProtocolAndQueryParams(str);
        map = map.entrySet().iterator();
        String str2 = str;
        while (map.hasNext() != null) {
            Entry entry = (Entry) map.next();
            str2 = C19303i.a(str2, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
        }
        return str2;
    }

    private final String trimProtocolAndQueryParams(String str) {
        return C19303i.a(C19303i.a(C19303i.a(str, ManagerWebServices.QUERY_QUESTION_MARK, null, 2, null), "http://"), "https://");
    }
}
