package retrofit.client;

import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import retrofit.mime.TypedInput;

/* renamed from: retrofit.client.f */
public class C19530f implements Client {

    /* renamed from: retrofit.client.f$a */
    private static class C19529a implements TypedInput {
        /* renamed from: a */
        private final String f61035a;
        /* renamed from: b */
        private final long f61036b;
        /* renamed from: c */
        private final InputStream f61037c;

        private C19529a(String str, long j, InputStream inputStream) {
            this.f61035a = str;
            this.f61036b = j;
            this.f61037c = inputStream;
        }

        public String mimeType() {
            return this.f61035a;
        }

        public long length() {
            return this.f61036b;
        }

        public InputStream in() throws IOException {
            return this.f61037c;
        }
    }

    public C19370e execute(C19369d c19369d) throws IOException {
        HttpURLConnection a = m70504a(c19369d);
        m70506a(a, c19369d);
        return m70505a(a);
    }

    /* renamed from: a */
    protected HttpURLConnection m70504a(C19369d c19369d) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(c19369d.m69547b()).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(ManagerWebServices.TIMEOUT_DEFAULT_MS);
        return httpURLConnection;
    }

    /* renamed from: a */
    void m70506a(HttpURLConnection httpURLConnection, C19369d c19369d) throws IOException {
        httpURLConnection.setRequestMethod(c19369d.m69546a());
        httpURLConnection.setDoInput(true);
        for (C19368b c19368b : c19369d.m69548c()) {
            httpURLConnection.addRequestProperty(c19368b.m69544a(), c19368b.m69545b());
        }
        c19369d = c19369d.m69549d();
        if (c19369d != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty(ManagerWebServices.PARAM_CONTENT_TYPE, c19369d.mimeType());
            long length = c19369d.length();
            if (length != -1) {
                httpURLConnection.setFixedLengthStreamingMode((int) length);
                httpURLConnection.addRequestProperty("Content-Length", String.valueOf(length));
            } else {
                httpURLConnection.setChunkedStreamingMode(4096);
            }
            c19369d.writeTo(httpURLConnection.getOutputStream());
        }
    }

    /* renamed from: a */
    C19370e m70505a(HttpURLConnection httpURLConnection) throws IOException {
        InputStream errorStream;
        int responseCode = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        if (responseMessage == null) {
            responseMessage = "";
        }
        String str = responseMessage;
        List arrayList = new ArrayList();
        for (Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
            String str2 = (String) entry.getKey();
            for (String c19368b : (List) entry.getValue()) {
                arrayList.add(new C19368b(str2, c19368b));
            }
        }
        String contentType = httpURLConnection.getContentType();
        int contentLength = httpURLConnection.getContentLength();
        if (responseCode >= 400) {
            errorStream = httpURLConnection.getErrorStream();
        } else {
            errorStream = httpURLConnection.getInputStream();
        }
        return new C19370e(httpURLConnection.getURL().toString(), responseCode, str, arrayList, new C19529a(contentType, (long) contentLength, errorStream));
    }
}
