package retrofit.mime;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: retrofit.mime.d */
public class C19544d implements TypedInput, TypedOutput {
    /* renamed from: a */
    private final String f61069a;
    /* renamed from: b */
    private final byte[] f61070b;

    public String fileName() {
        return null;
    }

    public C19544d(String str, byte[] bArr) {
        if (str == null) {
            str = "application/unknown";
        }
        if (bArr == null) {
            throw new NullPointerException("bytes");
        }
        this.f61069a = str;
        this.f61070b = bArr;
    }

    /* renamed from: a */
    public byte[] m70530a() {
        return this.f61070b;
    }

    public String mimeType() {
        return this.f61069a;
    }

    public long length() {
        return (long) this.f61070b.length;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.f61070b);
    }

    public InputStream in() throws IOException {
        return new ByteArrayInputStream(this.f61070b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C19544d c19544d = (C19544d) obj;
                return Arrays.equals(this.f61070b, c19544d.f61070b) && this.f61069a.equals(c19544d.f61069a) != null;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f61069a.hashCode() * 31) + Arrays.hashCode(this.f61070b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TypedByteArray[length=");
        stringBuilder.append(length());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
