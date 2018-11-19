package retrofit.mime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;

/* renamed from: retrofit.mime.a */
public final class C19542a implements TypedOutput {
    /* renamed from: a */
    final ByteArrayOutputStream f61064a = new ByteArrayOutputStream();

    public String fileName() {
        return null;
    }

    public String mimeType() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    /* renamed from: a */
    public void m70523a(String str, boolean z, String str2, boolean z2) {
        if (str == null) {
            throw new NullPointerException("name");
        } else if (str2 == null) {
            throw new NullPointerException("value");
        } else {
            if (this.f61064a.size() > 0) {
                this.f61064a.write(38);
            }
            if (z) {
                try {
                    str = URLEncoder.encode(str, "UTF-8");
                } catch (String str3) {
                    throw new RuntimeException(str3);
                }
            }
            if (z2) {
                str2 = URLEncoder.encode(str2, "UTF-8");
            }
            this.f61064a.write(str3.getBytes("UTF-8"));
            this.f61064a.write(true);
            this.f61064a.write(str2.getBytes("UTF-8"));
        }
    }

    public long length() {
        return (long) this.f61064a.size();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.f61064a.toByteArray());
    }
}
