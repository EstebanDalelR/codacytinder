package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata;
import com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadataCollection;
import io.fabric.sdk.android.services.events.C15645a;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.i18n.phonenumbers.d */
final class C5623d {
    /* renamed from: a */
    static final MetadataLoader f20886a = new C69501();
    /* renamed from: b */
    private static final Logger f20887b = Logger.getLogger(C5623d.class.getName());
    /* renamed from: c */
    private static final ConcurrentHashMap<Integer, PhoneMetadata> f20888c = new ConcurrentHashMap();
    /* renamed from: d */
    private static final ConcurrentHashMap<String, PhoneMetadata> f20889d = new ConcurrentHashMap();
    /* renamed from: e */
    private static final Set<Integer> f20890e = C5620a.m24642a();
    /* renamed from: f */
    private static final Set<String> f20891f = C5626h.m24677a();

    /* renamed from: com.google.i18n.phonenumbers.d$1 */
    static class C69501 implements MetadataLoader {
        C69501() {
        }

        public InputStream loadMetadata(String str) {
            return C5623d.class.getResourceAsStream(str);
        }
    }

    private C5623d() {
    }

    /* renamed from: a */
    static PhoneMetadata m24669a(int i) {
        if (f20890e.contains(Integer.valueOf(i))) {
            return C5623d.m24670a(Integer.valueOf(i), f20888c, "/com/google/i18n/phonenumbers/data/PhoneNumberAlternateFormatsProto", f20886a);
        }
        return 0;
    }

    /* renamed from: a */
    static <T> PhoneMetadata m24670a(T t, ConcurrentHashMap<T, PhoneMetadata> concurrentHashMap, String str, MetadataLoader metadataLoader) {
        PhoneMetadata phoneMetadata = (PhoneMetadata) concurrentHashMap.get(t);
        if (phoneMetadata != null) {
            return phoneMetadata;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(C15645a.ROLL_OVER_FILE_NAME_SEPARATOR);
        stringBuilder.append(t);
        str = stringBuilder.toString();
        metadataLoader = C5623d.m24672a(str, metadataLoader);
        if (metadataLoader.size() > 1) {
            Logger logger = f20887b;
            Level level = Level.WARNING;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("more than one metadata in file ");
            stringBuilder2.append(str);
            logger.log(level, stringBuilder2.toString());
        }
        T t2 = (PhoneMetadata) metadataLoader.get(null);
        t = (PhoneMetadata) concurrentHashMap.putIfAbsent(t, t2);
        if (t == null) {
            t = t2;
        }
        return t;
    }

    /* renamed from: a */
    private static List<PhoneMetadata> m24672a(String str, MetadataLoader metadataLoader) {
        InputStream loadMetadata = metadataLoader.loadMetadata(str);
        if (loadMetadata == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("missing metadata: ");
            stringBuilder.append(str);
            throw new IllegalStateException(stringBuilder.toString());
        }
        metadataLoader = C5623d.m24671a(loadMetadata).m24606a();
        if (metadataLoader.size() != 0) {
            return metadataLoader;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("empty metadata: ");
        stringBuilder.append(str);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    private static PhoneMetadataCollection m24671a(InputStream inputStream) {
        Throwable e;
        ObjectInputStream objectInputStream;
        try {
            objectInputStream = new ObjectInputStream(inputStream);
            try {
                PhoneMetadataCollection phoneMetadataCollection = new PhoneMetadataCollection();
                phoneMetadataCollection.readExternal(objectInputStream);
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (InputStream inputStream2) {
                        f20887b.log(Level.WARNING, "error closing input stream (ignored)", inputStream2);
                    }
                } else {
                    inputStream2.close();
                }
                return phoneMetadataCollection;
            } catch (Throwable e2) {
                throw new RuntimeException("cannot load/parse metadata", e2);
            } catch (Throwable th) {
                e2 = th;
                if (objectInputStream == null) {
                    try {
                        objectInputStream.close();
                    } catch (InputStream inputStream22) {
                        f20887b.log(Level.WARNING, "error closing input stream (ignored)", inputStream22);
                    }
                } else {
                    inputStream22.close();
                }
                throw e2;
            }
        } catch (Throwable e3) {
            throw new RuntimeException("cannot load/parse metadata", e3);
        } catch (Throwable e32) {
            Throwable th2 = e32;
            objectInputStream = null;
            e2 = th2;
            if (objectInputStream == null) {
                inputStream22.close();
            } else {
                objectInputStream.close();
            }
            throw e2;
        }
    }
}
