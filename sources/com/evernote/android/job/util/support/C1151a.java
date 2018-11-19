package com.evernote.android.job.util.support;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: com.evernote.android.job.util.support.a */
class C1151a implements XmlSerializer {
    /* renamed from: a */
    private static final String[] f3022a = new String[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};
    /* renamed from: b */
    private static String f3023b = "                                                              ";
    /* renamed from: c */
    private final char[] f3024c = new char[8192];
    /* renamed from: d */
    private int f3025d;
    /* renamed from: e */
    private Writer f3026e;
    /* renamed from: f */
    private OutputStream f3027f;
    /* renamed from: g */
    private CharsetEncoder f3028g;
    /* renamed from: h */
    private ByteBuffer f3029h = ByteBuffer.allocate(8192);
    /* renamed from: i */
    private boolean f3030i = false;
    /* renamed from: j */
    private boolean f3031j;
    /* renamed from: k */
    private int f3032k = 0;
    /* renamed from: l */
    private boolean f3033l = true;

    C1151a() {
    }

    /* renamed from: a */
    private void m3923a(char c) throws IOException {
        int i = this.f3025d;
        if (i >= 8191) {
            flush();
            i = this.f3025d;
        }
        this.f3024c[i] = c;
        this.f3025d = i + 1;
    }

    /* renamed from: a */
    private void m3926a(String str, int i, int i2) throws IOException {
        if (i2 > 8192) {
            i2 += i;
            while (i < i2) {
                int i3 = i + 8192;
                m3926a(str, i, i3 < i2 ? 8192 : i2 - i);
                i = i3;
            }
            return;
        }
        i3 = this.f3025d;
        if (i3 + i2 > 8192) {
            flush();
            i3 = this.f3025d;
        }
        str.getChars(i, i + i2, this.f3024c, i3);
        this.f3025d = i3 + i2;
    }

    /* renamed from: a */
    private void m3927a(char[] cArr, int i, int i2) throws IOException {
        if (i2 > 8192) {
            i2 += i;
            while (i < i2) {
                int i3 = i + 8192;
                m3927a(cArr, i, i3 < i2 ? 8192 : i2 - i);
                i = i3;
            }
            return;
        }
        i3 = this.f3025d;
        if (i3 + i2 > 8192) {
            flush();
            i3 = this.f3025d;
        }
        System.arraycopy(cArr, i, this.f3024c, i3, i2);
        this.f3025d = i3 + i2;
    }

    /* renamed from: a */
    private void m3925a(String str) throws IOException {
        m3926a(str, 0, str.length());
    }

    /* renamed from: a */
    private void m3924a(int i) throws IOException {
        i *= 4;
        if (i > f3023b.length()) {
            i = f3023b.length();
        }
        m3926a(f3023b, 0, i);
    }

    /* renamed from: b */
    private void m3928b(String str) throws IOException {
        int length = str.length();
        char length2 = (char) f3022a.length;
        String[] strArr = f3022a;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < length2) {
                String str2 = strArr[charAt];
                if (str2 != null) {
                    if (i2 < i) {
                        m3926a(str, i2, i - i2);
                    }
                    i2 = i + 1;
                    m3925a(str2);
                }
            }
            i++;
        }
        if (i2 < i) {
            m3926a(str, i2, i - i2);
        }
    }

    /* renamed from: b */
    private void m3929b(char[] cArr, int i, int i2) throws IOException {
        char length = (char) f3022a.length;
        String[] strArr = f3022a;
        i2 += i;
        int i3 = i;
        while (i < i2) {
            char c = cArr[i];
            if (c < length) {
                String str = strArr[c];
                if (str != null) {
                    if (i3 < i) {
                        m3927a(cArr, i3, i - i3);
                    }
                    i3 = i + 1;
                    m3925a(str);
                }
            }
            i++;
        }
        if (i3 < i) {
            m3927a(cArr, i3, i - i3);
        }
    }

    public XmlSerializer attribute(String str, String str2, String str3) throws IOException, IllegalArgumentException, IllegalStateException {
        m3923a(' ');
        if (str != null) {
            m3925a(str);
            m3923a(':');
        }
        m3925a(str2);
        m3925a("=\"");
        m3928b(str3);
        m3923a('\"');
        this.f3033l = null;
        return this;
    }

    public void cdsect(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void comment(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void docdecl(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void endDocument() throws IOException, IllegalArgumentException, IllegalStateException {
        flush();
    }

    public XmlSerializer endTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        this.f3032k--;
        if (this.f3031j) {
            m3925a(" />\n");
        } else {
            if (this.f3030i && this.f3033l) {
                m3924a(this.f3032k);
            }
            m3925a("</");
            if (str != null) {
                m3925a(str);
                m3923a(':');
            }
            m3925a(str2);
            m3925a(">\n");
        }
        this.f3033l = true;
        this.f3031j = null;
        return this;
    }

    public void entityRef(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private void m3922a() throws IOException {
        int position = this.f3029h.position();
        if (position > 0) {
            this.f3029h.flip();
            this.f3027f.write(this.f3029h.array(), 0, position);
            this.f3029h.clear();
        }
    }

    public void flush() throws IOException {
        if (this.f3025d > 0) {
            if (this.f3027f != null) {
                CharBuffer wrap = CharBuffer.wrap(this.f3024c, 0, this.f3025d);
                CoderResult encode = this.f3028g.encode(wrap, this.f3029h, true);
                while (!encode.isError()) {
                    if (encode.isOverflow()) {
                        m3922a();
                        encode = this.f3028g.encode(wrap, this.f3029h, true);
                    } else {
                        m3922a();
                        this.f3027f.flush();
                    }
                }
                throw new IOException(encode.toString());
            }
            this.f3026e.write(this.f3024c, 0, this.f3025d);
            this.f3026e.flush();
            this.f3025d = 0;
        }
    }

    public int getDepth() {
        throw new UnsupportedOperationException();
    }

    public boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getNamespace() {
        throw new UnsupportedOperationException();
    }

    public String getPrefix(String str, boolean z) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    public void ignorableWhitespace(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void processingInstruction(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void setFeature(String str, boolean z) throws IllegalArgumentException, IllegalStateException {
        if (str.equals("http://xmlpull.org/v1/doc/features.html#indent-output") != null) {
            this.f3030i = true;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public void setOutput(OutputStream outputStream, String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (outputStream == null) {
            throw new IllegalArgumentException();
        }
        try {
            this.f3028g = Charset.forName(str).newEncoder();
            this.f3027f = outputStream;
        } catch (OutputStream outputStream2) {
            throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(outputStream2));
        } catch (OutputStream outputStream22) {
            throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(outputStream22));
        }
    }

    public void setOutput(Writer writer) throws IOException, IllegalArgumentException, IllegalStateException {
        this.f3026e = writer;
    }

    public void setPrefix(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void setProperty(String str, Object obj) throws IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void startDocument(String str, Boolean bool) throws IOException, IllegalArgumentException, IllegalStateException {
        str = new StringBuilder();
        str.append("<?xml version='1.0' encoding='utf-8' standalone='");
        str.append(bool.booleanValue() != null ? "yes" : "no");
        str.append("' ?>\n");
        m3925a(str.toString());
        this.f3033l = true;
    }

    public XmlSerializer startTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f3031j) {
            m3925a(">\n");
        }
        if (this.f3030i) {
            m3924a(this.f3032k);
        }
        this.f3032k++;
        m3923a('<');
        if (str != null) {
            m3925a(str);
            m3923a(':');
        }
        m3925a(str2);
        this.f3031j = true;
        this.f3033l = null;
        return this;
    }

    public XmlSerializer text(char[] cArr, int i, int i2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f3031j) {
            m3925a(">");
            this.f3031j = false;
        }
        m3929b(cArr, i, i2);
        if (this.f3030i) {
            i += i2;
            i2 = 1;
            if (cArr[i - 1] != 10) {
                i2 = 0;
            }
            this.f3033l = i2;
        }
        return this;
    }

    public XmlSerializer text(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        boolean z = false;
        if (this.f3031j) {
            m3925a(">");
            this.f3031j = false;
        }
        m3928b(str);
        if (this.f3030i) {
            if (str.length() > 0 && str.charAt(str.length() - 1) == 10) {
                z = true;
            }
            this.f3033l = z;
        }
        return this;
    }
}
