package retrofit.p502b;

import com.google.appengine.api.urlfetch.HTTPHeader;
import com.google.appengine.api.urlfetch.HTTPMethod;
import com.google.appengine.api.urlfetch.HTTPRequest;
import com.google.appengine.api.urlfetch.HTTPResponse;
import com.google.appengine.api.urlfetch.URLFetchService;
import com.google.appengine.api.urlfetch.URLFetchServiceFactory;
import com.tinder.api.ManagerWebServices;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import retrofit.client.C19368b;
import retrofit.client.C19369d;
import retrofit.client.C19370e;
import retrofit.client.Client;
import retrofit.mime.C19544d;

/* renamed from: retrofit.b.a */
public class C19523a implements Client {
    /* renamed from: a */
    private final URLFetchService f61027a;

    /* renamed from: a */
    private static HTTPMethod m70486a(String str) {
        if ("GET".equals(str)) {
            return HTTPMethod.GET;
        }
        if ("POST".equals(str)) {
            return HTTPMethod.POST;
        }
        if ("PATCH".equals(str)) {
            return HTTPMethod.PATCH;
        }
        if ("PUT".equals(str)) {
            return HTTPMethod.PUT;
        }
        if ("DELETE".equals(str)) {
            return HTTPMethod.DELETE;
        }
        if ("HEAD".equals(str)) {
            return HTTPMethod.HEAD;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Illegal HTTP method: ");
        stringBuilder.append(str);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public C19523a() {
        this(URLFetchServiceFactory.getURLFetchService());
    }

    public C19523a(URLFetchService uRLFetchService) {
        this.f61027a = uRLFetchService;
    }

    public C19370e execute(C19369d c19369d) throws IOException {
        HTTPRequest a = C19523a.m70487a(c19369d);
        return C19523a.m70488a(m70489a(this.f61027a, a), a);
    }

    /* renamed from: a */
    protected HTTPResponse m70489a(URLFetchService uRLFetchService, HTTPRequest hTTPRequest) throws IOException {
        return uRLFetchService.fetch(hTTPRequest);
    }

    /* renamed from: a */
    static HTTPRequest m70487a(C19369d c19369d) throws IOException {
        HTTPRequest hTTPRequest = new HTTPRequest(new URL(c19369d.m69547b()), C19523a.m70486a(c19369d.m69546a()));
        for (C19368b c19368b : c19369d.m69548c()) {
            hTTPRequest.addHeader(new HTTPHeader(c19368b.m69544a(), c19368b.m69545b()));
        }
        c19369d = c19369d.m69549d();
        if (c19369d != null) {
            String mimeType = c19369d.mimeType();
            if (mimeType != null) {
                hTTPRequest.addHeader(new HTTPHeader(ManagerWebServices.PARAM_CONTENT_TYPE, mimeType));
            }
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            c19369d.writeTo(byteArrayOutputStream);
            hTTPRequest.setPayload(byteArrayOutputStream.toByteArray());
        }
        return hTTPRequest;
    }

    /* renamed from: a */
    static C19370e m70488a(HTTPResponse hTTPResponse, HTTPRequest hTTPRequest) {
        URL finalUrl = hTTPResponse.getFinalUrl();
        if (finalUrl == null) {
            finalUrl = hTTPRequest.getURL();
        }
        String url = finalUrl.toString();
        int responseCode = hTTPResponse.getResponseCode();
        HTTPRequest<HTTPHeader> headers = hTTPResponse.getHeaders();
        List arrayList = new ArrayList(headers.size());
        String str = "application/octet-stream";
        for (HTTPHeader hTTPHeader : headers) {
            String name = hTTPHeader.getName();
            String value = hTTPHeader.getValue();
            if (ManagerWebServices.PARAM_CONTENT_TYPE.equalsIgnoreCase(name)) {
                str = value;
            }
            arrayList.add(new C19368b(name, value));
        }
        hTTPRequest = null;
        hTTPResponse = hTTPResponse.getContent();
        if (hTTPResponse != null) {
            hTTPRequest = new C19544d(str, hTTPResponse);
        }
        return new C19370e(url, responseCode, "", arrayList, hTTPRequest);
    }
}
