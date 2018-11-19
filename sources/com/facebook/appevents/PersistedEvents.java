package com.facebook.appevents;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

class PersistedEvents implements Serializable {
    private static final long serialVersionUID = 20160629001L;
    /* renamed from: a */
    private HashMap<AccessTokenAppIdPair, List<AppEvent>> f4514a = new HashMap();

    static class SerializationProxyV1 implements Serializable {
        private static final long serialVersionUID = 20160629001L;
        /* renamed from: a */
        private final HashMap<AccessTokenAppIdPair, List<AppEvent>> f4513a;

        private SerializationProxyV1(HashMap<AccessTokenAppIdPair, List<AppEvent>> hashMap) {
            this.f4513a = hashMap;
        }

        private Object readResolve() {
            return new PersistedEvents(this.f4513a);
        }
    }

    public PersistedEvents(HashMap<AccessTokenAppIdPair, List<AppEvent>> hashMap) {
        this.f4514a.putAll(hashMap);
    }

    /* renamed from: a */
    public Set<AccessTokenAppIdPair> m5540a() {
        return this.f4514a.keySet();
    }

    /* renamed from: a */
    public List<AppEvent> m5539a(AccessTokenAppIdPair accessTokenAppIdPair) {
        return (List) this.f4514a.get(accessTokenAppIdPair);
    }

    /* renamed from: b */
    public boolean m5542b(AccessTokenAppIdPair accessTokenAppIdPair) {
        return this.f4514a.containsKey(accessTokenAppIdPair);
    }

    /* renamed from: a */
    public void m5541a(AccessTokenAppIdPair accessTokenAppIdPair, List<AppEvent> list) {
        if (this.f4514a.containsKey(accessTokenAppIdPair)) {
            ((List) this.f4514a.get(accessTokenAppIdPair)).addAll(list);
        } else {
            this.f4514a.put(accessTokenAppIdPair, list);
        }
    }

    private Object writeReplace() {
        return new SerializationProxyV1(this.f4514a);
    }
}
