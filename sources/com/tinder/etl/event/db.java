package com.tinder.etl.event;

import java.util.HashMap;
import java.util.Map;

public final class db implements EtlEvent {
    /* renamed from: a */
    private String f36374a;
    /* renamed from: b */
    private String f36375b;
    /* renamed from: c */
    private String f36376c;
    /* renamed from: d */
    private String f36377d;
    /* renamed from: e */
    private String f36378e;
    /* renamed from: f */
    private String f36379f;
    /* renamed from: g */
    private Number f36380g;
    /* renamed from: h */
    private Number f36381h;
    /* renamed from: i */
    private Number f36382i;
    /* renamed from: j */
    private Number f36383j;
    /* renamed from: k */
    private String f36384k;

    /* renamed from: com.tinder.etl.event.db$a */
    public static class C9026a {
        /* renamed from: a */
        private db f31248a;

        private C9026a() {
            this.f31248a = new db();
        }

        /* renamed from: a */
        public final C9026a m37982a(String str) {
            this.f31248a.f36374a = str;
            return this;
        }

        /* renamed from: b */
        public final C9026a m37985b(String str) {
            this.f31248a.f36375b = str;
            return this;
        }

        /* renamed from: c */
        public final C9026a m37987c(String str) {
            this.f31248a.f36376c = str;
            return this;
        }

        /* renamed from: d */
        public final C9026a m37989d(String str) {
            this.f31248a.f36377d = str;
            return this;
        }

        /* renamed from: e */
        public final C9026a m37990e(String str) {
            this.f31248a.f36378e = str;
            return this;
        }

        /* renamed from: f */
        public final C9026a m37991f(String str) {
            this.f31248a.f36379f = str;
            return this;
        }

        /* renamed from: a */
        public final C9026a m37981a(Number number) {
            this.f31248a.f36380g = number;
            return this;
        }

        /* renamed from: b */
        public final C9026a m37984b(Number number) {
            this.f31248a.f36381h = number;
            return this;
        }

        /* renamed from: c */
        public final C9026a m37986c(Number number) {
            this.f31248a.f36382i = number;
            return this;
        }

        /* renamed from: d */
        public final C9026a m37988d(Number number) {
            this.f31248a.f36383j = number;
            return this;
        }

        /* renamed from: g */
        public final C9026a m37992g(String str) {
            this.f31248a.f36384k = str;
            return this;
        }

        /* renamed from: a */
        public db m37983a() {
            return this.f31248a;
        }
    }

    /* renamed from: com.tinder.etl.event.db$b */
    public class C11235b extends fw {
        /* renamed from: a */
        final /* synthetic */ db f36372a;

        /* renamed from: a */
        public String mo10346a() {
            return "Chat.Like";
        }

        public C11235b(db dbVar, Map<EtlField<?>, Object> map) {
            this.f36372a = dbVar;
            super(map);
        }
    }

    /* renamed from: com.tinder.etl.event.db$c */
    private final class C11236c implements DescriptorFactory<C11235b, db> {
        /* renamed from: a */
        final /* synthetic */ db f36373a;

        private C11236c(db dbVar) {
            this.f36373a = dbVar;
        }

        public /* synthetic */ fw createDescriptor(EtlEvent etlEvent) {
            return m44477a((db) etlEvent);
        }

        /* renamed from: a */
        public final C11235b m44477a(db dbVar) {
            Map hashMap = new HashMap();
            if (dbVar.f36374a != null) {
                hashMap.put(new ec(), dbVar.f36374a);
            }
            if (dbVar.f36375b != null) {
                hashMap.put(new ed(), dbVar.f36375b);
            }
            if (dbVar.f36376c != null) {
                hashMap.put(new ee(), dbVar.f36376c);
            }
            if (dbVar.f36377d != null) {
                hashMap.put(new ll(), dbVar.f36377d);
            }
            if (dbVar.f36378e != null) {
                hashMap.put(new lx(), dbVar.f36378e);
            }
            if (dbVar.f36379f != null) {
                hashMap.put(new ml(), dbVar.f36379f);
            }
            if (dbVar.f36380g != null) {
                hashMap.put(new mm(), dbVar.f36380g);
            }
            if (dbVar.f36381h != null) {
                hashMap.put(new mp(), dbVar.f36381h);
            }
            if (dbVar.f36382i != null) {
                hashMap.put(new nx(), dbVar.f36382i);
            }
            if (dbVar.f36383j != null) {
                hashMap.put(new ny(), dbVar.f36383j);
            }
            if (dbVar.f36384k != null) {
                hashMap.put(new ov(), dbVar.f36384k);
            }
            return new C11235b(this.f36373a, hashMap);
        }
    }

    private db() {
    }

    /* renamed from: a */
    public static C9026a m44478a() {
        return new C9026a();
    }

    public final DescriptorFactory<C11235b, db> getDescriptorFactory() {
        return new C11236c();
    }
}
