package org.objenesis.instantiator.p095b;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;

/* renamed from: org.objenesis.instantiator.b.c$a */
class c$a extends InputStream {
    /* renamed from: d */
    private static final int[] f60402d = new int[]{1, 2, 2};
    /* renamed from: g */
    private static byte[] f60403g;
    /* renamed from: h */
    private static byte[] f60404h;
    /* renamed from: a */
    private int f60405a = 0;
    /* renamed from: b */
    private byte[] f60406b = f60403g;
    /* renamed from: c */
    private int f60407c = 0;
    /* renamed from: e */
    private byte[][] f60408e;
    /* renamed from: f */
    private final byte[] f60409f;

    public int available() throws IOException {
        return ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    static {
        c$a.m69483a();
    }

    /* renamed from: a */
    private static void m69483a() {
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeShort(-21267);
            dataOutputStream.writeShort(5);
            f60403g = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream = new ByteArrayOutputStream();
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(115);
            dataOutputStream.writeByte(113);
            dataOutputStream.writeInt(8257536);
            f60404h = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("IOException: ");
            stringBuilder.append(e.getMessage());
            throw new Error(stringBuilder.toString());
        }
    }

    public c$a(Class<?> cls) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeByte(115);
            dataOutputStream.writeByte(114);
            dataOutputStream.writeUTF(cls.getName());
            dataOutputStream.writeLong(ObjectStreamClass.lookup(cls).getSerialVersionUID());
            dataOutputStream.writeByte(2);
            dataOutputStream.writeShort(0);
            dataOutputStream.writeByte(120);
            dataOutputStream.writeByte(112);
            this.f60409f = byteArrayOutputStream.toByteArray();
            this.f60408e = new byte[][]{f60403g, this.f60409f, f60404h};
        } catch (Class<?> cls2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("IOException: ");
            stringBuilder.append(cls2.getMessage());
            throw new Error(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    private void m69484b() {
        this.f60405a = 0;
        this.f60407c = f60402d[this.f60407c];
        this.f60406b = this.f60408e[this.f60407c];
    }

    public int read() throws IOException {
        byte[] bArr = this.f60406b;
        int i = this.f60405a;
        this.f60405a = i + 1;
        byte b = bArr[i];
        if (this.f60405a >= this.f60406b.length) {
            m69484b();
        }
        return b;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int length = this.f60406b.length - this.f60405a;
        int i3 = i;
        i = i2;
        while (length <= i) {
            System.arraycopy(this.f60406b, this.f60405a, bArr, i3, length);
            i3 += length;
            i -= length;
            m69484b();
            length = this.f60406b.length - this.f60405a;
        }
        if (i > 0) {
            System.arraycopy(this.f60406b, this.f60405a, bArr, i3, i);
            this.f60405a += i;
        }
        return i2;
    }
}
