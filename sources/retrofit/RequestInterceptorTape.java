package retrofit;

import java.util.ArrayList;
import java.util.List;
import retrofit.RequestInterceptor.RequestFacade;

final class RequestInterceptorTape implements RequestInterceptor, RequestFacade {
    /* renamed from: b */
    private final List<C19354a> f61014b = new ArrayList();

    private enum Command {
        ADD_HEADER {
            public void intercept(RequestFacade requestFacade, String str, String str2) {
                requestFacade.addHeader(str, str2);
            }
        },
        ADD_PATH_PARAM {
            public void intercept(RequestFacade requestFacade, String str, String str2) {
                requestFacade.addPathParam(str, str2);
            }
        },
        ADD_ENCODED_PATH_PARAM {
            public void intercept(RequestFacade requestFacade, String str, String str2) {
                requestFacade.addEncodedPathParam(str, str2);
            }
        },
        ADD_QUERY_PARAM {
            public void intercept(RequestFacade requestFacade, String str, String str2) {
                requestFacade.addQueryParam(str, str2);
            }
        },
        ADD_ENCODED_QUERY_PARAM {
            public void intercept(RequestFacade requestFacade, String str, String str2) {
                requestFacade.addEncodedQueryParam(str, str2);
            }
        };

        abstract void intercept(RequestFacade requestFacade, String str, String str2);
    }

    /* renamed from: retrofit.RequestInterceptorTape$a */
    private static final class C19354a {
        /* renamed from: a */
        final Command f60426a;
        /* renamed from: b */
        final String f60427b;
        /* renamed from: c */
        final String f60428c;

        C19354a(Command command, String str, String str2) {
            this.f60426a = command;
            this.f60427b = str;
            this.f60428c = str2;
        }
    }

    RequestInterceptorTape() {
    }

    public void addHeader(String str, String str2) {
        this.f61014b.add(new C19354a(Command.ADD_HEADER, str, str2));
    }

    public void addPathParam(String str, String str2) {
        this.f61014b.add(new C19354a(Command.ADD_PATH_PARAM, str, str2));
    }

    public void addEncodedPathParam(String str, String str2) {
        this.f61014b.add(new C19354a(Command.ADD_ENCODED_PATH_PARAM, str, str2));
    }

    public void addQueryParam(String str, String str2) {
        this.f61014b.add(new C19354a(Command.ADD_QUERY_PARAM, str, str2));
    }

    public void addEncodedQueryParam(String str, String str2) {
        this.f61014b.add(new C19354a(Command.ADD_ENCODED_QUERY_PARAM, str, str2));
    }

    public void intercept(RequestFacade requestFacade) {
        for (C19354a c19354a : this.f61014b) {
            c19354a.f60426a.intercept(requestFacade, c19354a.f60427b, c19354a.f60428c);
        }
    }
}
