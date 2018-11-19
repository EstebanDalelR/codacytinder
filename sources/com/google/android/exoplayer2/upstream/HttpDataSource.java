package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.C2314v;
import com.google.android.exoplayer2.util.Predicate;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HttpDataSource extends DataSource {
    /* renamed from: a */
    public static final Predicate<String> f11662a = new C37161();

    public static class HttpDataSourceException extends IOException {
        /* renamed from: a */
        public final int f6829a;
        /* renamed from: b */
        public final DataSpec f6830b;

        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        public HttpDataSourceException(String str, DataSpec dataSpec, int i) {
            super(str);
            this.f6830b = dataSpec;
            this.f6829a = i;
        }

        public HttpDataSourceException(IOException iOException, DataSpec dataSpec, int i) {
            super(iOException);
            this.f6830b = dataSpec;
            this.f6829a = i;
        }

        public HttpDataSourceException(String str, IOException iOException, DataSpec dataSpec, int i) {
            super(str, iOException);
            this.f6830b = dataSpec;
            this.f6829a = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$b */
    public static final class C2275b {
        /* renamed from: a */
        private final Map<String, String> f6831a = new HashMap();
        /* renamed from: b */
        private Map<String, String> f6832b;

        /* renamed from: a */
        public synchronized void m8239a(String str, String str2) {
            this.f6832b = null;
            this.f6831a.put(str, str2);
        }

        /* renamed from: a */
        public synchronized void m8238a(String str) {
            this.f6832b = null;
            this.f6831a.remove(str);
        }

        /* renamed from: a */
        public synchronized void m8237a() {
            this.f6832b = null;
            this.f6831a.clear();
        }

        /* renamed from: b */
        public synchronized Map<String, String> m8240b() {
            if (this.f6832b == null) {
                this.f6832b = Collections.unmodifiableMap(new HashMap(this.f6831a));
            }
            return this.f6832b;
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$1 */
    static class C37161 implements Predicate<String> {
        C37161() {
        }

        public /* synthetic */ boolean evaluate(Object obj) {
            return m14080a((String) obj);
        }

        /* renamed from: a */
        public boolean m14080a(String str) {
            str = C2314v.m8493d(str);
            return (TextUtils.isEmpty(str) || ((str.contains(ManagerWebServices.PARAM_TEXT) && !str.contains("text/vtt")) || str.contains("html") || str.contains("xml") != null)) ? null : true;
        }
    }

    public interface Factory extends com.google.android.exoplayer2.upstream.DataSource.Factory {
        @Deprecated
        void clearAllDefaultRequestProperties();

        @Deprecated
        void clearDefaultRequestProperty(String str);

        HttpDataSource createDataSource();

        C2275b getDefaultRequestProperties();

        @Deprecated
        void setDefaultRequestProperty(String str, String str2);
    }

    public static final class InvalidContentTypeException extends HttpDataSourceException {
        /* renamed from: c */
        public final String f11659c;

        public InvalidContentTypeException(String str, DataSpec dataSpec) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid content type: ");
            stringBuilder.append(str);
            super(stringBuilder.toString(), dataSpec, 1);
            this.f11659c = str;
        }
    }

    public static final class InvalidResponseCodeException extends HttpDataSourceException {
        /* renamed from: c */
        public final int f11660c;
        /* renamed from: d */
        public final Map<String, List<String>> f11661d;

        public InvalidResponseCodeException(int i, Map<String, List<String>> map, DataSpec dataSpec) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Response code: ");
            stringBuilder.append(i);
            super(stringBuilder.toString(), dataSpec, 1);
            this.f11660c = i;
            this.f11661d = map;
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$a */
    public static abstract class C4266a implements Factory {
        /* renamed from: a */
        private final C2275b f13816a = new C2275b();

        /* renamed from: b */
        protected abstract HttpDataSource mo3741b(C2275b c2275b);

        public final HttpDataSource createDataSource() {
            return mo3741b(this.f13816a);
        }

        public final C2275b getDefaultRequestProperties() {
            return this.f13816a;
        }

        @Deprecated
        public final void setDefaultRequestProperty(String str, String str2) {
            this.f13816a.m8239a(str, str2);
        }

        @Deprecated
        public final void clearDefaultRequestProperty(String str) {
            this.f13816a.m8238a(str);
        }

        @Deprecated
        public final void clearAllDefaultRequestProperties() {
            this.f13816a.m8237a();
        }
    }

    void clearAllRequestProperties();

    void clearRequestProperty(String str);

    void close() throws HttpDataSourceException;

    Map<String, List<String>> getResponseHeaders();

    long open(DataSpec dataSpec) throws HttpDataSourceException;

    int read(byte[] bArr, int i, int i2) throws HttpDataSourceException;

    void setRequestProperty(String str, String str2);
}
