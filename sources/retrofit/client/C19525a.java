package retrofit.client;

import com.tinder.api.ManagerWebServices;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import retrofit.mime.C19544d;
import retrofit.mime.TypedOutput;

/* renamed from: retrofit.client.a */
public class C19525a implements Client {
    /* renamed from: a */
    private final HttpClient f61030a;

    /* renamed from: retrofit.client.a$a */
    private static class C19365a extends HttpEntityEnclosingRequestBase {
        /* renamed from: a */
        private final String f60487a;

        C19365a(C19369d c19369d) {
            this.f60487a = c19369d.m69546a();
            setURI(URI.create(c19369d.m69547b()));
            for (C19368b c19368b : c19369d.m69548c()) {
                addHeader(new BasicHeader(c19368b.m69544a(), c19368b.m69545b()));
            }
            setEntity(new C19367c(c19369d.m69549d()));
        }

        public String getMethod() {
            return this.f60487a;
        }
    }

    /* renamed from: retrofit.client.a$b */
    private static class C19366b extends HttpRequestBase {
        /* renamed from: a */
        private final String f60488a;

        public C19366b(C19369d c19369d) {
            this.f60488a = c19369d.m69546a();
            setURI(URI.create(c19369d.m69547b()));
            for (C19368b c19368b : c19369d.m69548c()) {
                addHeader(new BasicHeader(c19368b.m69544a(), c19368b.m69545b()));
            }
        }

        public String getMethod() {
            return this.f60488a;
        }
    }

    /* renamed from: retrofit.client.a$c */
    static class C19367c extends AbstractHttpEntity {
        /* renamed from: a */
        final TypedOutput f60489a;

        public boolean isRepeatable() {
            return true;
        }

        public boolean isStreaming() {
            return false;
        }

        C19367c(TypedOutput typedOutput) {
            this.f60489a = typedOutput;
            setContentType(typedOutput.mimeType());
        }

        public long getContentLength() {
            return this.f60489a.length();
        }

        public InputStream getContent() throws IOException {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f60489a.writeTo(byteArrayOutputStream);
            return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        }

        public void writeTo(OutputStream outputStream) throws IOException {
            this.f60489a.writeTo(outputStream);
        }
    }

    public C19525a(HttpClient httpClient) {
        this.f61030a = httpClient;
    }

    public C19370e execute(C19369d c19369d) throws IOException {
        return C19525a.m70493a(c19369d.m69547b(), m70494a(this.f61030a, C19525a.m70492a(c19369d)));
    }

    /* renamed from: a */
    protected HttpResponse m70494a(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        return httpClient.execute(httpUriRequest);
    }

    /* renamed from: a */
    static HttpUriRequest m70492a(C19369d c19369d) {
        if (c19369d.m69549d() != null) {
            return new C19365a(c19369d);
        }
        return new C19366b(c19369d);
    }

    /* renamed from: a */
    static C19370e m70493a(String str, HttpResponse httpResponse) throws IOException {
        StatusLine statusLine = httpResponse.getStatusLine();
        int statusCode = statusLine.getStatusCode();
        String reasonPhrase = statusLine.getReasonPhrase();
        List arrayList = new ArrayList();
        String str2 = "application/octet-stream";
        for (Header header : httpResponse.getAllHeaders()) {
            String name = header.getName();
            String value = header.getValue();
            if (ManagerWebServices.PARAM_CONTENT_TYPE.equalsIgnoreCase(name)) {
                str2 = value;
            }
            arrayList.add(new C19368b(name, value));
        }
        C19544d c19544d = null;
        httpResponse = httpResponse.getEntity();
        if (httpResponse != null) {
            c19544d = new C19544d(str2, EntityUtils.toByteArray(httpResponse));
        }
        return new C19370e(str, statusCode, reasonPhrase, arrayList, c19544d);
    }
}
