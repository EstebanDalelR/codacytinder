package com.tinder.smsauth.sdk.di;

import android.content.Context;
import com.tinder.smsauth.data.C14967a;
import com.tinder.smsauth.data.C14969b;
import com.tinder.smsauth.data.C16723e;
import com.tinder.smsauth.data.api.SmsAuthApiModule;
import com.tinder.smsauth.data.api.SmsAuthApiModule_ProvideSmsAuthServiceFactory;
import com.tinder.smsauth.data.api.SmsAuthService;
import com.tinder.smsauth.data.p412a.C14966b;
import com.tinder.smsauth.data.p412a.C18086c;
import com.tinder.smsauth.data.p412a.C18087d;
import com.tinder.smsauth.data.p412a.C18088e;
import com.tinder.smsauth.data.p412a.C18089f;
import com.tinder.smsauth.data.p412a.C18090g;
import com.tinder.smsauth.data.p412a.C18091h;
import com.tinder.smsauth.entity.SmsAuthRepository;
import com.tinder.smsauth.entity.SmsAuthType;
import com.tinder.smsauth.sdk.analytics.SmsAuthTracker;
import com.tinder.smsauth.sdk.di.SmsAuthSdkComponent.Builder;
import dagger.internal.C15521i;
import java.util.Collections;
import java.util.Set;
import okhttp3.C17692o;
import okhttp3.Interceptor;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* renamed from: com.tinder.smsauth.sdk.di.b */
public final class C18125b implements SmsAuthSdkComponent {
    /* renamed from: a */
    private Context f56251a;
    /* renamed from: b */
    private SmsAuthType f56252b;
    /* renamed from: c */
    private SmsAuthApiModule f56253c;
    /* renamed from: d */
    private C14966b f56254d;
    /* renamed from: e */
    private SmsAuthTracker f56255e;

    /* renamed from: com.tinder.smsauth.sdk.di.b$a */
    private static final class C16761a implements Builder {
        /* renamed from: a */
        private C14966b f51774a;
        /* renamed from: b */
        private SmsAuthApiModule f51775b;
        /* renamed from: c */
        private Context f51776c;
        /* renamed from: d */
        private SmsAuthType f51777d;
        /* renamed from: e */
        private SmsAuthTracker f51778e;

        private C16761a() {
        }

        public /* synthetic */ Builder context(Context context) {
            return m62286a(context);
        }

        public /* synthetic */ Builder networkModule(C14966b c14966b) {
            return m62287a(c14966b);
        }

        public /* synthetic */ Builder smsAuthTracker(SmsAuthTracker smsAuthTracker) {
            return m62289a(smsAuthTracker);
        }

        public /* synthetic */ Builder smsAuthType(SmsAuthType smsAuthType) {
            return m62288a(smsAuthType);
        }

        public SmsAuthSdkComponent build() {
            if (this.f51774a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(C14966b.class.getCanonicalName());
                stringBuilder.append(" must be set");
                throw new IllegalStateException(stringBuilder.toString());
            }
            if (this.f51775b == null) {
                this.f51775b = new SmsAuthApiModule();
            }
            if (this.f51776c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Context.class.getCanonicalName());
                stringBuilder.append(" must be set");
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.f51777d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(SmsAuthType.class.getCanonicalName());
                stringBuilder.append(" must be set");
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.f51778e != null) {
                return new C18125b();
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(SmsAuthTracker.class.getCanonicalName());
                stringBuilder.append(" must be set");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        /* renamed from: a */
        public C16761a m62286a(Context context) {
            this.f51776c = (Context) C15521i.m58000a(context);
            return this;
        }

        /* renamed from: a */
        public C16761a m62288a(SmsAuthType smsAuthType) {
            this.f51777d = (SmsAuthType) C15521i.m58000a(smsAuthType);
            return this;
        }

        /* renamed from: a */
        public C16761a m62289a(SmsAuthTracker smsAuthTracker) {
            this.f51778e = (SmsAuthTracker) C15521i.m58000a(smsAuthTracker);
            return this;
        }

        /* renamed from: a */
        public C16761a m62287a(C14966b c14966b) {
            this.f51774a = (C14966b) C15521i.m58000a(c14966b);
            return this;
        }
    }

    private C18125b(C16761a c16761a) {
        m65762a(c16761a);
    }

    /* renamed from: a */
    public static Builder m65761a() {
        return new C16761a();
    }

    /* renamed from: b */
    private Set<Interceptor> m65763b() {
        return Collections.singleton(C18086c.m65669b(this.f56254d));
    }

    /* renamed from: c */
    private C17692o m65764c() {
        return C18089f.m65677a(this.f56254d, m65763b());
    }

    /* renamed from: d */
    private MoshiConverterFactory m65765d() {
        return C18088e.m65674a(this.f56254d, C18087d.m65672b(this.f56254d));
    }

    /* renamed from: e */
    private Retrofit m65766e() {
        return C18090g.m65681a(this.f56254d, m65764c(), C18091h.m65684b(this.f56254d), m65765d());
    }

    /* renamed from: f */
    private SmsAuthService m65767f() {
        return SmsAuthApiModule_ProvideSmsAuthServiceFactory.proxyProvideSmsAuthService(this.f56253c, m65766e());
    }

    /* renamed from: g */
    private C14969b m65768g() {
        return new C14969b(this.f56252b, m65767f(), new C14967a(), C18087d.m65672b(this.f56254d));
    }

    /* renamed from: h */
    private C16723e m65769h() {
        return new C16723e(m65768g());
    }

    /* renamed from: a */
    private void m65762a(C16761a c16761a) {
        this.f56251a = c16761a.f51776c;
        this.f56252b = c16761a.f51777d;
        this.f56253c = c16761a.f51775b;
        this.f56254d = c16761a.f51774a;
        this.f56255e = c16761a.f51778e;
    }

    public Context context() {
        return this.f56251a;
    }

    public SmsAuthRepository smsAuthRepository() {
        return m65769h();
    }

    public SmsAuthTracker smsAuthTracker() {
        return this.f56255e;
    }
}
