package retrofit2;

import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import javax.annotation.Nullable;
import okhttp3.C15957l;
import okhttp3.C15958m;
import okhttp3.C15963q;
import okhttp3.C15963q.C15962a;
import okhttp3.C15964r;
import okhttp3.C17688j.C15954a;
import okhttp3.C17690n;
import okhttp3.C17690n.C15959a;
import okhttp3.C17690n.C15960b;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;
import okio.BufferedSink;
import okio.C18549c;

final class RequestBuilder {
    private static final char[] HEX_DIGITS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final String PATH_SEGMENT_ALWAYS_ENCODE_SET = " \"<>^`{}|\\?#";
    private final HttpUrl baseUrl;
    @Nullable
    private C15964r body;
    @Nullable
    private C15958m contentType;
    @Nullable
    private C15954a formBuilder;
    private final boolean hasBody;
    private final String method;
    @Nullable
    private C15959a multipartBuilder;
    @Nullable
    private String relativeUrl;
    private final C15962a requestBuilder = new C15962a();
    @Nullable
    private Builder urlBuilder;

    private static class ContentTypeOverridingRequestBody extends C15964r {
        private final C15958m contentType;
        private final C15964r delegate;

        ContentTypeOverridingRequestBody(C15964r c15964r, C15958m c15958m) {
            this.delegate = c15964r;
            this.contentType = c15958m;
        }

        public C15958m contentType() {
            return this.contentType;
        }

        public long contentLength() throws IOException {
            return this.delegate.contentLength();
        }

        public void writeTo(BufferedSink bufferedSink) throws IOException {
            this.delegate.writeTo(bufferedSink);
        }
    }

    RequestBuilder(String str, HttpUrl httpUrl, @Nullable String str2, @Nullable C15957l c15957l, @Nullable C15958m c15958m, boolean z, boolean z2, boolean z3) {
        this.method = str;
        this.baseUrl = httpUrl;
        this.relativeUrl = str2;
        this.contentType = c15958m;
        this.hasBody = z;
        if (c15957l != null) {
            this.requestBuilder.a(c15957l);
        }
        if (z2) {
            this.formBuilder = new C15954a();
        } else if (z3) {
            this.multipartBuilder = new C15959a();
            this.multipartBuilder.a(C17690n.f55031e);
        }
    }

    void setRelativeUrl(Object obj) {
        this.relativeUrl = obj.toString();
    }

    void addHeader(String str, String str2) {
        if (ManagerWebServices.PARAM_CONTENT_TYPE.equalsIgnoreCase(str)) {
            str = C15958m.a(str2);
            if (str == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Malformed content type: ");
                stringBuilder.append(str2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.contentType = str;
            return;
        }
        this.requestBuilder.b(str, str2);
    }

    void addPathParam(String str, String str2, boolean z) {
        if (this.relativeUrl == null) {
            throw new AssertionError();
        }
        String str3 = this.relativeUrl;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        stringBuilder.append(str);
        stringBuilder.append("}");
        this.relativeUrl = str3.replace(stringBuilder.toString(), canonicalizeForPath(str2, z));
    }

    private static String canonicalizeForPath(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt >= 32 && codePointAt < 127 && PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) == -1) {
                if (!z) {
                    if (codePointAt != 47) {
                        if (codePointAt == 37) {
                        }
                    }
                }
                i += Character.charCount(codePointAt);
            }
            C18549c c18549c = new C18549c();
            c18549c.a(str, 0, i);
            canonicalizeForPath(c18549c, str, i, length, z);
            return c18549c.readUtf8();
        }
        return str;
    }

    private static void canonicalizeForPath(C18549c c18549c, String str, int i, int i2, boolean z) {
        C18549c c18549c2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (z) {
                if (!(codePointAt == 9 || codePointAt == 10 || codePointAt == 12)) {
                    if (codePointAt == 13) {
                    }
                }
                i += Character.charCount(codePointAt);
            }
            if (codePointAt >= 32 && codePointAt < 127 && PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(codePointAt) == -1) {
                if (!z) {
                    if (codePointAt != 47) {
                        if (codePointAt == 37) {
                        }
                    }
                }
                c18549c.a(codePointAt);
                i += Character.charCount(codePointAt);
            }
            if (c18549c2 == null) {
                c18549c2 = new C18549c();
            }
            c18549c2.a(codePointAt);
            while (!c18549c2.exhausted()) {
                int readByte = c18549c2.readByte() & 255;
                c18549c.b(37);
                c18549c.b(HEX_DIGITS[(readByte >> 4) & 15]);
                c18549c.b(HEX_DIGITS[readByte & 15]);
            }
            i += Character.charCount(codePointAt);
        }
    }

    void addQueryParam(String str, @Nullable String str2, boolean z) {
        if (this.relativeUrl != null) {
            this.urlBuilder = this.baseUrl.e(this.relativeUrl);
            if (this.urlBuilder == null) {
                str2 = new StringBuilder();
                str2.append("Malformed URL. Base: ");
                str2.append(this.baseUrl);
                str2.append(", Relative: ");
                str2.append(this.relativeUrl);
                throw new IllegalArgumentException(str2.toString());
            }
            this.relativeUrl = null;
        }
        if (z) {
            this.urlBuilder.b(str, str2);
        } else {
            this.urlBuilder.a(str, str2);
        }
    }

    void addFormField(String str, String str2, boolean z) {
        if (z) {
            this.formBuilder.b(str, str2);
        } else {
            this.formBuilder.a(str, str2);
        }
    }

    void addPart(C15957l c15957l, C15964r c15964r) {
        this.multipartBuilder.a(c15957l, c15964r);
    }

    void addPart(C15960b c15960b) {
        this.multipartBuilder.a(c15960b);
    }

    void setBody(C15964r c15964r) {
        this.body = c15964r;
    }

    C15963q build() {
        HttpUrl c;
        Builder builder = this.urlBuilder;
        if (builder != null) {
            c = builder.c();
        } else {
            c = this.baseUrl.d(this.relativeUrl);
            if (c == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Malformed URL. Base: ");
                stringBuilder.append(this.baseUrl);
                stringBuilder.append(", Relative: ");
                stringBuilder.append(this.relativeUrl);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        C15964r c15964r = this.body;
        if (c15964r == null) {
            if (this.formBuilder != null) {
                c15964r = this.formBuilder.a();
            } else if (this.multipartBuilder != null) {
                c15964r = this.multipartBuilder.a();
            } else if (this.hasBody) {
                c15964r = C15964r.create(null, new byte[0]);
            }
        }
        C15958m c15958m = this.contentType;
        if (c15958m != null) {
            if (c15964r != null) {
                c15964r = new ContentTypeOverridingRequestBody(c15964r, c15958m);
            } else {
                this.requestBuilder.b(ManagerWebServices.PARAM_CONTENT_TYPE, c15958m.toString());
            }
        }
        return this.requestBuilder.a(c).a(this.method, c15964r).d();
    }
}
