package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

@zzzv
public final class ahd extends agy {
    /* renamed from: b */
    private MessageDigest f22949b;

    /* renamed from: a */
    public final byte[] mo4244a(String str) {
        byte[] array;
        String[] split = str.split(" ");
        int i = 4;
        if (split.length == 1) {
            int a = ahc.m19165a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(a);
            array = allocate.array();
        } else if (split.length < 5) {
            array = new byte[(split.length << 1)];
            for (r4 = 0; r4 < split.length; r4++) {
                int a2 = ahc.m19165a(split[r4]);
                a2 = (a2 >> 16) ^ (65535 & a2);
                byte[] bArr = new byte[]{(byte) a2, (byte) (a2 >> 8)};
                a2 = r4 << 1;
                array[a2] = bArr[0];
                array[a2 + 1] = bArr[1];
            }
        } else {
            array = new byte[split.length];
            for (int i2 = 0; i2 < split.length; i2++) {
                r4 = ahc.m19165a(split[i2]);
                array[i2] = (byte) ((r4 >> 24) ^ (((r4 & 255) ^ ((r4 >> 8) & 255)) ^ ((r4 >> 16) & 255)));
            }
        }
        this.f22949b = m19160a();
        synchronized (this.a) {
            if (this.f22949b == null) {
                array = new byte[0];
                return array;
            }
            this.f22949b.reset();
            this.f22949b.update(array);
            Object digest = this.f22949b.digest();
            if (digest.length <= 4) {
                i = digest.length;
            }
            Object obj = new byte[i];
            System.arraycopy(digest, 0, obj, 0, obj.length);
            return obj;
        }
    }
}
