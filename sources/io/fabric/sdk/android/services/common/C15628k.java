package io.fabric.sdk.android.services.common;

import android.content.Context;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.services.cache.C18331b;
import io.fabric.sdk.android.services.cache.ValueLoader;

/* renamed from: io.fabric.sdk.android.services.common.k */
public class C15628k {
    /* renamed from: a */
    private final ValueLoader<String> f48374a = new C173341(this);
    /* renamed from: b */
    private final C18331b<String> f48375b = new C18331b();

    /* renamed from: io.fabric.sdk.android.services.common.k$1 */
    class C173341 implements ValueLoader<String> {
        /* renamed from: a */
        final /* synthetic */ C15628k f53053a;

        C173341(C15628k c15628k) {
            this.f53053a = c15628k;
        }

        public /* synthetic */ Object load(Context context) throws Exception {
            return m63394a(context);
        }

        /* renamed from: a */
        public String m63394a(Context context) throws Exception {
            context = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            return context == null ? "" : context;
        }
    }

    /* renamed from: a */
    public String m58704a(Context context) {
        try {
            context = (String) this.f48375b.get(context, this.f48374a);
            if ("".equals(context)) {
                context = null;
            }
            return context;
        } catch (Context context2) {
            C15608c.m58560h().mo12794e("Fabric", "Failed to determine installer package name", context2);
            return null;
        }
    }
}
