package com.foursquare.internal.network.request;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.api.types.FoursquareType;
import com.foursquare.api.types.ResponseV2;
import com.foursquare.internal.network.C1920b;
import com.foursquare.internal.network.C1921c;
import com.foursquare.internal.network.C1932g;
import com.foursquare.internal.network.Request;
import com.foursquare.internal.network.p059a.C1918a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

public final class FoursquareRequest<T extends FoursquareType> extends Request<T> {
    /* renamed from: a */
    private final Type f10575a;
    /* renamed from: b */
    private int f10576b;
    /* renamed from: c */
    private String f10577c;
    /* renamed from: d */
    private C1936a[] f10578d;

    /* renamed from: com.foursquare.internal.network.request.FoursquareRequest$1 */
    class C19341 implements ParameterizedType {
        /* renamed from: a */
        final /* synthetic */ FoursquareRequest f5209a;

        public Type getOwnerType() {
            return null;
        }

        C19341(FoursquareRequest foursquareRequest) {
            this.f5209a = foursquareRequest;
        }

        public Type getRawType() {
            return ResponseV2.class;
        }

        public Type[] getActualTypeArguments() {
            return new Type[]{this.f5209a.m13286h()};
        }
    }

    /* renamed from: com.foursquare.internal.network.request.FoursquareRequest$a */
    public static final class C1935a<T extends FoursquareType> {
        @NonNull
        /* renamed from: a */
        private final FoursquareRequest<T> f5210a;
        /* renamed from: b */
        private final List<C1936a> f5211b = new ArrayList();

        public C1935a(@NonNull Class<T> cls) {
            this.f5210a = new FoursquareRequest(cls);
        }

        /* renamed from: a */
        public C1935a<T> m6780a(String str) {
            this.f5210a.f10577c = str;
            this.f5210a.f10576b = 1;
            return this;
        }

        /* renamed from: a */
        public C1935a<T> m6781a(String str, String str2) {
            this.f5211b.add(new C1936a(str, str2));
            return this;
        }

        /* renamed from: a */
        public C1935a<T> m6782a(boolean z, String str, String str2) {
            return z ? m6781a(str, str2) : this;
        }

        /* renamed from: a */
        public C1935a<T> m6779a(FoursquareLocation foursquareLocation) {
            if (foursquareLocation != null) {
                this.f5211b.add(new C1936a("ll", C1918a.m6681a(foursquareLocation)));
                this.f5211b.add(new C1936a("llAcc", C1918a.m6682b(foursquareLocation)));
                this.f5211b.add(new C1936a("alt", C1918a.m6683c(foursquareLocation)));
            }
            return this;
        }

        @NonNull
        /* renamed from: a */
        public FoursquareRequest<T> m6783a() {
            if (this.f5210a.f10575a != null) {
                if (!TextUtils.isEmpty(this.f5210a.m13284f())) {
                    this.f5210a.f10578d = (C1936a[]) this.f5211b.toArray(new C1936a[this.f5211b.size()]);
                    return this.f5210a;
                }
            }
            throw new IllegalStateException("You must specify a type and an endpoint");
        }
    }

    /* renamed from: b */
    public void mo2010b() {
    }

    /* renamed from: i */
    public boolean m13287i() {
        return true;
    }

    private FoursquareRequest(@NonNull Type type) {
        this.f10576b = 0;
        this.f10575a = type;
    }

    /* renamed from: e */
    public int m13283e() {
        return this.f10576b;
    }

    /* renamed from: f */
    public String m13284f() {
        return this.f10577c;
    }

    /* renamed from: g */
    public C1936a[] m13285g() {
        return this.f10578d;
    }

    /* renamed from: h */
    public Type m13286h() {
        return this.f10575a;
    }

    @NonNull
    /* renamed from: d */
    public C1932g<T> mo2011d() {
        C1921c b = C1920b.m6688a().m6697b();
        if (TextUtils.isEmpty(b.m6720g()) && m13287i()) {
            b.m6710a("client_id", C1920b.m6688a().m6698c());
            b.m6710a("client_secret", C1920b.m6688a().m6699d());
        }
        Type c19341 = new C19341(this);
        HttpUrl c = b.m6716c();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(b.m6717d());
        stringBuilder.append(m13284f());
        c = c.d(stringBuilder.toString());
        if (c == null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Could not form a valid URL from base URL: [");
            stringBuilder2.append(b.m6716c().toString());
            stringBuilder2.append("] and path prefix : [");
            stringBuilder2.append(b.m6717d());
            stringBuilder2.append("] and link : [");
            stringBuilder2.append(m13284f());
            stringBuilder2.append("]");
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
        switch (m13283e()) {
            case 0:
                return b.m6708a(c19341, c.toString(), m6675a(), m13285g() == null ? new C1936a[0] : m13285g());
            case 1:
                return b.m6713b(c19341, c.toString(), m6675a(), m13285g() == null ? new C1936a[0] : m13285g());
            default:
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Method magic-int ");
                stringBuilder3.append(m13283e());
                stringBuilder3.append(" is not valid. Must be METHOD_GET or METHOD_POST");
                throw new IllegalStateException(stringBuilder3.toString());
        }
    }
}
