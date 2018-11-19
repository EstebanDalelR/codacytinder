package com.facebook.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.internal.C1725l;
import com.facebook.internal.C1749x;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.Callback;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: com.facebook.login.d */
public class C1771d {
    /* renamed from: a */
    private static final Set<String> f4853a = C1771d.m6125c();
    /* renamed from: b */
    private static volatile C1771d f4854b;
    /* renamed from: c */
    private LoginBehavior f4855c = LoginBehavior.NATIVE_WITH_FALLBACK;
    /* renamed from: d */
    private DefaultAudience f4856d = DefaultAudience.FRIENDS;
    /* renamed from: e */
    private final SharedPreferences f4857e;

    /* renamed from: com.facebook.login.d$c */
    private static class C1770c {
        /* renamed from: a */
        private static C1769c f4852a;

        /* renamed from: b */
        private static synchronized C1769c m6111b(Context context) {
            synchronized (C1770c.class) {
                if (context == null) {
                    context = FacebookSdk.m3994e();
                }
                if (context == null) {
                    return null;
                }
                if (f4852a == null) {
                    f4852a = new C1769c(context, FacebookSdk.m3998i());
                }
                context = f4852a;
                return context;
            }
        }
    }

    /* renamed from: com.facebook.login.d$2 */
    class C34352 implements Callback {
        /* renamed from: a */
        final /* synthetic */ C1771d f10428a;

        C34352(C1771d c1771d) {
            this.f10428a = c1771d;
        }

        public boolean onActivityResult(int i, Intent intent) {
            return this.f10428a.m6135a(i, intent);
        }
    }

    /* renamed from: com.facebook.login.d$a */
    private static class C3436a implements C1781g {
        /* renamed from: a */
        private final Activity f10429a;

        C3436a(Activity activity) {
            C1749x.m6064a((Object) activity, "activity");
            this.f10429a = activity;
        }

        /* renamed from: a */
        public void mo1872a(Intent intent, int i) {
            this.f10429a.startActivityForResult(intent, i);
        }

        /* renamed from: a */
        public Activity mo1871a() {
            return this.f10429a;
        }
    }

    /* renamed from: com.facebook.login.d$b */
    private static class C3437b implements C1781g {
        /* renamed from: a */
        private final C1725l f10430a;

        C3437b(C1725l c1725l) {
            C1749x.m6064a((Object) c1725l, "fragment");
            this.f10430a = c1725l;
        }

        /* renamed from: a */
        public void mo1872a(Intent intent, int i) {
            this.f10430a.m5947a(intent, i);
        }

        /* renamed from: a */
        public Activity mo1871a() {
            return this.f10430a.m5949c();
        }
    }

    C1771d() {
        C1749x.m6061a();
        this.f4857e = FacebookSdk.m3994e().getSharedPreferences("com.facebook.loginManager", 0);
    }

    /* renamed from: a */
    public static C1771d m6112a() {
        if (f4854b == null) {
            synchronized (C1771d.class) {
                if (f4854b == null) {
                    f4854b = new C1771d();
                }
            }
        }
        return f4854b;
    }

    /* renamed from: a */
    public void m6134a(CallbackManager callbackManager, final FacebookCallback<C1772e> facebookCallback) {
        if (callbackManager instanceof CallbackManagerImpl) {
            ((CallbackManagerImpl) callbackManager).m13083b(RequestCodeOffset.Login.toRequestCode(), new Callback(this) {
                /* renamed from: b */
                final /* synthetic */ C1771d f10427b;

                public boolean onActivityResult(int i, Intent intent) {
                    return this.f10427b.m6136a(i, intent, facebookCallback);
                }
            });
            return;
        }
        throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
    }

    /* renamed from: a */
    boolean m6135a(int i, Intent intent) {
        return m6136a(i, intent, null);
    }

    /* renamed from: a */
    boolean m6136a(int i, Intent intent, FacebookCallback<C1772e> facebookCallback) {
        Map map;
        Code code;
        boolean z;
        AccessToken accessToken;
        Request request;
        int i2 = i;
        Intent intent2 = intent;
        Code code2 = Code.ERROR;
        Exception exception = null;
        boolean z2 = false;
        if (intent2 != null) {
            AccessToken accessToken2;
            Map map2;
            Request request2;
            Result result = (Result) intent2.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                Request request3 = result.request;
                Code code3 = result.code;
                if (i2 == -1) {
                    if (result.code == Code.SUCCESS) {
                        accessToken2 = result.token;
                    } else {
                        exception = new FacebookAuthorizationException(result.errorMessage);
                        accessToken2 = null;
                    }
                } else if (i2 == 0) {
                    accessToken2 = null;
                    z2 = true;
                } else {
                    accessToken2 = null;
                }
                map2 = result.loggingExtras;
                Code code4 = code3;
                request2 = request3;
                code2 = code4;
            } else {
                accessToken2 = null;
                map2 = accessToken2;
                request2 = map2;
            }
            map = map2;
            code = code2;
            z = z2;
            Request request4 = request2;
            accessToken = accessToken2;
            request = request4;
        } else if (i2 == 0) {
            code = Code.CANCEL;
            request = null;
            accessToken = request;
            map = accessToken;
            z = true;
        } else {
            code = code2;
            request = null;
            accessToken = request;
            map = accessToken;
            z = false;
        }
        if (exception == null && accessToken == null && !z) {
            exception = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        m6115a(null, code, map, exception, true, request);
        m6116a(accessToken, request, exception, z, facebookCallback);
        return true;
    }

    /* renamed from: a */
    public C1771d m6130a(LoginBehavior loginBehavior) {
        this.f4855c = loginBehavior;
        return this;
    }

    /* renamed from: a */
    public C1771d m6129a(DefaultAudience defaultAudience) {
        this.f4856d = defaultAudience;
        return this;
    }

    /* renamed from: b */
    public void m6137b() {
        AccessToken.setCurrentAccessToken(null);
        Profile.setCurrentProfile(null);
        m6119a(false);
    }

    /* renamed from: a */
    public void m6133a(Fragment fragment, Collection<String> collection) {
        m6117a(new C1725l(fragment), (Collection) collection);
    }

    /* renamed from: a */
    public void m6132a(android.app.Fragment fragment, Collection<String> collection) {
        m6117a(new C1725l(fragment), (Collection) collection);
    }

    /* renamed from: a */
    private void m6117a(C1725l c1725l, Collection<String> collection) {
        m6123b(collection);
        m6118a(new C3437b(c1725l), m6128a((Collection) collection));
    }

    /* renamed from: a */
    public void m6131a(Activity activity, Collection<String> collection) {
        m6123b(collection);
        m6118a(new C3436a(activity), m6128a((Collection) collection));
    }

    /* renamed from: b */
    public void m6140b(Fragment fragment, Collection<String> collection) {
        m6122b(new C1725l(fragment), (Collection) collection);
    }

    /* renamed from: b */
    public void m6139b(android.app.Fragment fragment, Collection<String> collection) {
        m6122b(new C1725l(fragment), (Collection) collection);
    }

    /* renamed from: b */
    private void m6122b(C1725l c1725l, Collection<String> collection) {
        m6126c(collection);
        m6118a(new C3437b(c1725l), m6128a((Collection) collection));
    }

    /* renamed from: b */
    public void m6138b(Activity activity, Collection<String> collection) {
        m6126c(collection);
        m6118a(new C3436a(activity), m6128a((Collection) collection));
    }

    /* renamed from: b */
    private void m6123b(Collection<String> collection) {
        if (collection != null) {
            for (String a : collection) {
                if (C1771d.m6121a(a)) {
                    throw new FacebookException(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[]{(String) collection.next()}));
                }
            }
        }
    }

    /* renamed from: c */
    private void m6126c(Collection<String> collection) {
        if (collection != null) {
            for (String a : collection) {
                if (!C1771d.m6121a(a)) {
                    throw new FacebookException(String.format("Cannot pass a read permission (%s) to a request for publish authorization", new Object[]{(String) collection.next()}));
                }
            }
        }
    }

    /* renamed from: a */
    static boolean m6121a(String str) {
        return (str == null || !(str.startsWith("publish") || str.startsWith("manage") || f4853a.contains(str) != null)) ? null : true;
    }

    /* renamed from: c */
    private static Set<String> m6125c() {
        return Collections.unmodifiableSet(new LoginManager$2());
    }

    /* renamed from: a */
    protected Request m6128a(Collection<String> collection) {
        Request request = new Request(this.f4855c, Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet()), this.f4856d, FacebookSdk.m3998i(), UUID.randomUUID().toString());
        request.setRerequest(AccessToken.isCurrentAccessTokenActive());
        return request;
    }

    /* renamed from: a */
    private void m6118a(C1781g c1781g, Request request) throws FacebookException {
        m6114a(c1781g.mo1871a(), request);
        CallbackManagerImpl.m13080a(RequestCodeOffset.Login.toRequestCode(), new C34352(this));
        if (!m6124b(c1781g, request)) {
            Exception facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            m6115a(c1781g.mo1871a(), Code.ERROR, null, facebookException, false, request);
            throw facebookException;
        }
    }

    /* renamed from: a */
    private void m6114a(Context context, Request request) {
        context = C1770c.m6111b(context);
        if (context != null && request != null) {
            context.m6103a(request);
        }
    }

    /* renamed from: a */
    private void m6115a(Context context, Code code, Map<String, String> map, Exception exception, boolean z, Request request) {
        C1769c a = C1770c.m6111b(context);
        if (a != null) {
            if (request == null) {
                a.m6109c("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
            } else {
                Map hashMap = new HashMap();
                hashMap.put("try_login_activity", z ? "1" : "0");
                a.m6107a(request.getAuthId(), hashMap, code, map, exception);
            }
        }
    }

    /* renamed from: b */
    private boolean m6124b(com.facebook.login.C1781g r3, com.facebook.login.LoginClient.Request r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r2 = this;
        r4 = r2.m6127a(r4);
        r0 = r2.m6120a(r4);
        r1 = 0;
        if (r0 != 0) goto L_0x000c;
    L_0x000b:
        return r1;
    L_0x000c:
        r0 = com.facebook.login.LoginClient.getLoginRequestCode();	 Catch:{ ActivityNotFoundException -> 0x0015 }
        r3.mo1872a(r4, r0);	 Catch:{ ActivityNotFoundException -> 0x0015 }
        r3 = 1;
        return r3;
    L_0x0015:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.d.b(com.facebook.login.g, com.facebook.login.LoginClient$Request):boolean");
    }

    /* renamed from: a */
    private boolean m6120a(Intent intent) {
        if (FacebookSdk.m3994e().getPackageManager().resolveActivity(intent, 0) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    protected Intent m6127a(Request request) {
        Intent intent = new Intent();
        intent.setClass(FacebookSdk.m3994e(), FacebookActivity.class);
        intent.setAction(request.getLoginBehavior().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    /* renamed from: a */
    static C1772e m6113a(Request request, AccessToken accessToken) {
        Collection permissions = request.getPermissions();
        Object hashSet = new HashSet(accessToken.getPermissions());
        if (request.isRerequest() != null) {
            hashSet.retainAll(permissions);
        }
        request = new HashSet(permissions);
        request.removeAll(hashSet);
        return new C1772e(accessToken, hashSet, request);
    }

    /* renamed from: a */
    private void m6116a(AccessToken accessToken, Request request, FacebookException facebookException, boolean z, FacebookCallback<C1772e> facebookCallback) {
        if (accessToken != null) {
            AccessToken.setCurrentAccessToken(accessToken);
            Profile.fetchProfileForCurrentAccessToken();
        }
        if (facebookCallback != null) {
            request = accessToken != null ? C1771d.m6113a(request, accessToken) : null;
            if (!z) {
                if (request == null || request.m6141a().size()) {
                    if (facebookException != null) {
                        facebookCallback.onError(facebookException);
                        return;
                    } else if (accessToken != null) {
                        m6119a(true);
                        facebookCallback.onSuccess(request);
                        return;
                    } else {
                        return;
                    }
                }
            }
            facebookCallback.onCancel();
        }
    }

    /* renamed from: a */
    private void m6119a(boolean z) {
        Editor edit = this.f4857e.edit();
        edit.putBoolean("express_login_allowed", z);
        edit.apply();
    }
}
