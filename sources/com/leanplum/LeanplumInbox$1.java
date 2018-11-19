package com.leanplum;

import java.util.Comparator;

final class LeanplumInbox$1 implements Comparator<String> {
    /* renamed from: a */
    private /* synthetic */ LeanplumInbox f21126a;

    LeanplumInbox$1(LeanplumInbox leanplumInbox) {
        this.f21126a = leanplumInbox;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj2;
        obj = this.f21126a.messageForId((String) obj);
        if (obj == null) {
            return -1;
        }
        obj2 = this.f21126a.messageForId(str);
        if (obj2 == null) {
            return 1;
        }
        obj = obj.getDeliveryTimestamp();
        if (obj == null) {
            return -1;
        }
        obj2 = obj2.getDeliveryTimestamp();
        if (obj2 == null) {
            return 1;
        }
        return obj.compareTo(obj2);
    }

    /* renamed from: a */
    private int m25013a(String str, String str2) {
        str = this.f21126a.messageForId(str);
        if (str == null) {
            return -1;
        }
        str2 = this.f21126a.messageForId(str2);
        if (str2 == null) {
            return 1;
        }
        str = str.getDeliveryTimestamp();
        if (str == null) {
            return -1;
        }
        str2 = str2.getDeliveryTimestamp();
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }
}
