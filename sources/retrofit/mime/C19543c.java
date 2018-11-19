package retrofit.mime;

import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/* renamed from: retrofit.mime.c */
public final class C19543c implements TypedOutput {
    /* renamed from: a */
    private final List<C19391a> f61065a;
    /* renamed from: b */
    private final byte[] f61066b;
    /* renamed from: c */
    private final String f61067c;
    /* renamed from: d */
    private long f61068d;

    /* renamed from: retrofit.mime.c$a */
    private static final class C19391a {
        /* renamed from: a */
        private final TypedOutput f60527a;
        /* renamed from: b */
        private final String f60528b;
        /* renamed from: c */
        private final String f60529c;
        /* renamed from: d */
        private final boolean f60530d;
        /* renamed from: e */
        private final String f60531e;
        /* renamed from: f */
        private byte[] f60532f;
        /* renamed from: g */
        private byte[] f60533g;
        /* renamed from: h */
        private boolean f60534h;

        public C19391a(String str, String str2, TypedOutput typedOutput, String str3, boolean z) {
            this.f60528b = str;
            this.f60529c = str2;
            this.f60527a = typedOutput;
            this.f60530d = z;
            this.f60531e = str3;
        }

        /* renamed from: a */
        public void m69596a(OutputStream outputStream) throws IOException {
            m69594b();
            outputStream.write(this.f60532f);
            outputStream.write(this.f60533g);
            this.f60527a.writeTo(outputStream);
        }

        /* renamed from: a */
        public long m69595a() {
            m69594b();
            if (this.f60527a.length() > -1) {
                return (this.f60527a.length() + ((long) this.f60532f.length)) + ((long) this.f60533g.length);
            }
            return -1;
        }

        /* renamed from: b */
        private void m69594b() {
            if (!this.f60534h) {
                this.f60532f = C19543c.m70526b(this.f60531e, this.f60530d, false);
                this.f60533g = C19543c.m70527c(this.f60528b, this.f60529c, this.f60527a);
                this.f60534h = true;
            }
        }
    }

    public String fileName() {
        return null;
    }

    public C19543c() {
        this(UUID.randomUUID().toString());
    }

    C19543c(String str) {
        this.f61065a = new LinkedList();
        this.f61067c = str;
        this.f61066b = C19543c.m70526b(str, false, true);
        this.f61068d = (long) this.f61066b.length;
    }

    /* renamed from: a */
    public void m70529a(String str, String str2, TypedOutput typedOutput) {
        if (str == null) {
            throw new NullPointerException("Part name must not be null.");
        } else if (str2 == null) {
            throw new NullPointerException("Transfer encoding must not be null.");
        } else if (typedOutput == null) {
            throw new NullPointerException("Part body must not be null.");
        } else {
            C19391a c19391a = new C19391a(str, str2, typedOutput, this.f61067c, this.f61065a.isEmpty());
            this.f61065a.add(c19391a);
            str = c19391a.m69595a();
            if (str == -1) {
                this.f61068d = -1;
            } else if (this.f61068d != -1) {
                this.f61068d += str;
            }
        }
    }

    /* renamed from: a */
    public int m70528a() {
        return this.f61065a.size();
    }

    public String mimeType() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("multipart/form-data; boundary=");
        stringBuilder.append(this.f61067c);
        return stringBuilder.toString();
    }

    public long length() {
        return this.f61068d;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        for (C19391a a : this.f61065a) {
            a.m69596a(outputStream);
        }
        outputStream.write(this.f61066b);
    }

    /* renamed from: b */
    private static byte[] m70526b(String str, boolean z, boolean z2) {
        try {
            StringBuilder stringBuilder = new StringBuilder(str.length() + 8);
            if (!z) {
                stringBuilder.append("\r\n");
            }
            stringBuilder.append("--");
            stringBuilder.append(str);
            if (z2) {
                stringBuilder.append("--");
            }
            stringBuilder.append("\r\n");
            return stringBuilder.toString().getBytes("UTF-8");
        } catch (String str2) {
            throw new RuntimeException("Unable to write multipart boundary", str2);
        }
    }

    /* renamed from: c */
    private static byte[] m70527c(String str, String str2, TypedOutput typedOutput) {
        try {
            StringBuilder stringBuilder = new StringBuilder(ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            stringBuilder.append("Content-Disposition: form-data; name=\"");
            stringBuilder.append(str);
            str = typedOutput.fileName();
            if (str != null) {
                stringBuilder.append("\"; filename=\"");
                stringBuilder.append(str);
            }
            stringBuilder.append("\"\r\nContent-Type: ");
            stringBuilder.append(typedOutput.mimeType());
            long length = typedOutput.length();
            if (length != -1) {
                stringBuilder.append("\r\nContent-Length: ");
                stringBuilder.append(length);
            }
            stringBuilder.append("\r\nContent-Transfer-Encoding: ");
            stringBuilder.append(str2);
            stringBuilder.append("\r\n\r\n");
            return stringBuilder.toString().getBytes("UTF-8");
        } catch (String str3) {
            throw new RuntimeException("Unable to write multipart header", str3);
        }
    }
}
