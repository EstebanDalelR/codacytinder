package com.google.android.gms.internal;

import java.io.IOException;
import java.io.OutputStream;

public abstract class aaz<MessageType extends aaz<MessageType, BuilderType>, BuilderType extends aba<MessageType, BuilderType>> implements zzfhe {
    /* renamed from: b */
    private static boolean f26533b = false;
    /* renamed from: a */
    protected int f26534a = 0;

    public final byte[] toByteArray() {
        try {
            byte[] bArr = new byte[zzho()];
            zzffg a = zzffg.m27526a(bArr);
            zza(a);
            a.m27581c();
            return bArr;
        } catch (Throwable e) {
            String str = "byte array";
            String name = getClass().getName();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(name).length() + 62) + String.valueOf(str).length());
            stringBuilder.append("Serializing ");
            stringBuilder.append(name);
            stringBuilder.append(" to a ");
            stringBuilder.append(str);
            stringBuilder.append(" threw an IOException (should never happen).");
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    public final zzfes toByteString() {
        try {
            abi b = zzfes.m20301b(zzho());
            zza(b.m18815b());
            return b.m18814a();
        } catch (Throwable e) {
            String str = "ByteString";
            String name = getClass().getName();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(name).length() + 62) + String.valueOf(str).length());
            stringBuilder.append("Serializing ");
            stringBuilder.append(name);
            stringBuilder.append(" to a ");
            stringBuilder.append(str);
            stringBuilder.append(" threw an IOException (should never happen).");
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    public final void writeTo(OutputStream outputStream) throws IOException {
        zzffg a = zzffg.m27525a(outputStream, zzffg.m27521a(zzho()));
        zza(a);
        a.mo6941a();
    }
}
