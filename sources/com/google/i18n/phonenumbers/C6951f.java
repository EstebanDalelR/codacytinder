package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.i18n.phonenumbers.f */
final class C6951f implements C5624e {
    /* renamed from: a */
    private final String f25447a;
    /* renamed from: b */
    private final MetadataLoader f25448b;
    /* renamed from: c */
    private final ConcurrentHashMap<String, PhoneMetadata> f25449c;
    /* renamed from: d */
    private final ConcurrentHashMap<Integer, PhoneMetadata> f25450d;

    C6951f(String str, MetadataLoader metadataLoader) {
        this.f25449c = new ConcurrentHashMap();
        this.f25450d = new ConcurrentHashMap();
        this.f25447a = str;
        this.f25448b = metadataLoader;
    }

    C6951f(MetadataLoader metadataLoader) {
        this("/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto", metadataLoader);
    }

    /* renamed from: a */
    public PhoneMetadata mo5925a(String str) {
        return C5623d.m24670a(str, this.f25449c, this.f25447a, this.f25448b);
    }

    /* renamed from: a */
    public PhoneMetadata mo5924a(int i) {
        if (m30466b(i)) {
            return C5623d.m24670a(Integer.valueOf(i), this.f25450d, this.f25447a, this.f25448b);
        }
        return 0;
    }

    /* renamed from: b */
    private boolean m30466b(int i) {
        List list = (List) C5622c.m24668a().get(Integer.valueOf(i));
        if (list.size() != 1 || "001".equals(list.get(0)) == 0) {
            return false;
        }
        return true;
    }
}
