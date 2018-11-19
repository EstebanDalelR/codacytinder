package com.google.android.exoplayer2.upstream.cache;

import android.support.annotation.Nullable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.exoplayer2.upstream.cache.g */
public final class C3718g implements ContentMetadata {
    /* renamed from: a */
    public static final C3718g f11715a = new C3718g(Collections.emptyMap());
    /* renamed from: b */
    private int f11716b;
    /* renamed from: c */
    private final Map<String, byte[]> f11717c;

    /* renamed from: a */
    public static C3718g m14109a(DataInputStream dataInputStream) throws IOException {
        int readInt = dataInputStream.readInt();
        Map hashMap = new HashMap();
        int i = 0;
        while (i < readInt) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 >= 0) {
                if (readInt2 <= 10485760) {
                    Object obj = new byte[readInt2];
                    dataInputStream.readFully(obj);
                    hashMap.put(readUTF, obj);
                    i++;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid value size: ");
            stringBuilder.append(readInt2);
            throw new IOException(stringBuilder.toString());
        }
        return new C3718g(hashMap);
    }

    private C3718g(Map<String, byte[]> map) {
        this.f11717c = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public C3718g m14115a(C2285f c2285f) {
        Map a = C3718g.m14110a(this.f11717c, c2285f);
        if (m14113a(a)) {
            return this;
        }
        return new C3718g(a);
    }

    /* renamed from: a */
    public void m14116a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.f11717c.size());
        for (Entry entry : this.f11717c.entrySet()) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public final byte[] get(String str, byte[] bArr) {
        if (!this.f11717c.containsKey(str)) {
            return bArr;
        }
        byte[] bArr2 = (byte[]) this.f11717c.get(str);
        return Arrays.copyOf(bArr2, bArr2.length);
    }

    public final String get(String str, String str2) {
        return this.f11717c.containsKey(str) ? new String((byte[]) this.f11717c.get(str), Charset.forName("UTF-8")) : str2;
    }

    public final long get(String str, long j) {
        return this.f11717c.containsKey(str) ? ByteBuffer.wrap((byte[]) this.f11717c.get(str)).getLong() : j;
    }

    public final boolean contains(String str) {
        return this.f11717c.containsKey(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return m14113a(((C3718g) obj).f11717c);
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m14113a(Map<String, byte[]> map) {
        if (this.f11717c.size() != map.size()) {
            return false;
        }
        for (Entry entry : this.f11717c.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.f11716b == 0) {
            int i = 0;
            for (Entry entry : this.f11717c.entrySet()) {
                i += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.f11716b = i;
        }
        return this.f11716b;
    }

    /* renamed from: a */
    private static Map<String, byte[]> m14110a(Map<String, byte[]> map, C2285f c2285f) {
        HashMap hashMap = new HashMap(map);
        C3718g.m14111a(hashMap, c2285f.m8296a());
        C3718g.m14112a(hashMap, c2285f.m8297b());
        return hashMap;
    }

    /* renamed from: a */
    private static void m14111a(HashMap<String, byte[]> hashMap, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            hashMap.remove(list.get(i));
        }
    }

    /* renamed from: a */
    private static void m14112a(HashMap<String, byte[]> hashMap, Map<String, Object> map) {
        for (String str : map.keySet()) {
            Object a = C3718g.m14114a(map.get(str));
            if (a.length > 10485760) {
                throw new IllegalArgumentException(String.format("The size of %s (%d) is greater than maximum allowed: %d", new Object[]{str, Integer.valueOf(a.length), Integer.valueOf(10485760)}));
            }
            hashMap.put(str, a);
        }
    }

    /* renamed from: a */
    private static byte[] m14114a(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(Charset.forName("UTF-8"));
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }
}
