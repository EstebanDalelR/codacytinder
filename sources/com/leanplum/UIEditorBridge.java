package com.leanplum;

import com.leanplum.p069a.C2594s;
import com.leanplum.p069a.bf;
import com.leanplum.p069a.bo;
import com.leanplum.p069a.bq;
import java.util.List;
import java.util.Map;

public class UIEditorBridge {
    public static void setInterfaceUpdateBlock(CacheUpdateBlock cacheUpdateBlock) {
        bq.b(cacheUpdateBlock);
    }

    public static void setEventsUpdateBlock(CacheUpdateBlock cacheUpdateBlock) {
        bq.c(cacheUpdateBlock);
    }

    public static List<Map<String, Object>> getUpdateRuleDiffs() {
        return bq.c();
    }

    public static List<Map<String, Object>> getEventRuleDiffs() {
        return bq.d();
    }

    public static boolean isSocketConnected() {
        return bf.m25063a() != null && bf.m25063a().m25080d();
    }

    public static <T> void socketSendEvent(String str, Map<String, T> map) {
        if (bf.m25063a() != null && str != null) {
            bf.m25063a().m25076a(str, (Map) map);
        }
    }

    public static String fileRelativeToDocuments(String str) {
        return C2594s.d(str);
    }

    public static void handleException(Throwable th) {
        bo.a(th);
    }
}
