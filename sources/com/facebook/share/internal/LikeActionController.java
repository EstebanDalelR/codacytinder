package com.facebook.share.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.C0436c;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.C1665c;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.ads.AdError;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.BundleJSONConverter;
import com.facebook.internal.C1697a;
import com.facebook.internal.C1724k;
import com.facebook.internal.C1724k.C1720d;
import com.facebook.internal.C1725l;
import com.facebook.internal.C1738r;
import com.facebook.internal.C1745t;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.Callback;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.PlatformServiceClient.CompletedListener;
import com.facebook.internal.Utility;
import com.facebook.internal.WorkQueue;
import com.facebook.share.internal.LikeContent.C4215a;
import com.facebook.share.widget.LikeView.ObjectType;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

@Deprecated
public class LikeActionController {
    /* renamed from: a */
    private static final String f4983a = "LikeActionController";
    /* renamed from: b */
    private static C1724k f4984b;
    /* renamed from: c */
    private static final ConcurrentHashMap<String, LikeActionController> f4985c = new ConcurrentHashMap();
    /* renamed from: d */
    private static WorkQueue f4986d = new WorkQueue(1);
    /* renamed from: e */
    private static WorkQueue f4987e = new WorkQueue(1);
    /* renamed from: f */
    private static Handler f4988f;
    /* renamed from: g */
    private static String f4989g;
    /* renamed from: h */
    private static boolean f4990h;
    /* renamed from: i */
    private static volatile int f4991i;
    /* renamed from: j */
    private static C1665c f4992j;
    /* renamed from: k */
    private String f4993k;
    /* renamed from: l */
    private ObjectType f4994l;
    /* renamed from: m */
    private boolean f4995m;
    /* renamed from: n */
    private String f4996n;
    /* renamed from: o */
    private String f4997o;
    /* renamed from: p */
    private String f4998p;
    /* renamed from: q */
    private String f4999q;
    /* renamed from: r */
    private String f5000r;
    /* renamed from: s */
    private String f5001s;
    /* renamed from: t */
    private boolean f5002t;
    /* renamed from: u */
    private boolean f5003u;
    /* renamed from: v */
    private boolean f5004v;
    /* renamed from: w */
    private Bundle f5005w;
    /* renamed from: x */
    private AppEventsLogger f5006x;

    /* renamed from: com.facebook.share.internal.LikeActionController$4 */
    static /* synthetic */ class C18184 {
        /* renamed from: a */
        static final /* synthetic */ int[] f4970a = new int[ObjectType.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = com.facebook.share.widget.LikeView.ObjectType.values();
            r0 = r0.length;
            r0 = new int[r0];
            f4970a = r0;
            r0 = f4970a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.facebook.share.widget.LikeView.ObjectType.PAGE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.LikeActionController.4.<clinit>():void");
        }
    }

    @Deprecated
    public interface CreationCallback {
        void onComplete(LikeActionController likeActionController, FacebookException facebookException);
    }

    /* renamed from: com.facebook.share.internal.LikeActionController$b */
    private static class C1821b implements Runnable {
        /* renamed from: a */
        private String f4975a;
        /* renamed from: b */
        private ObjectType f4976b;
        /* renamed from: c */
        private CreationCallback f4977c;

        C1821b(String str, ObjectType objectType, CreationCallback creationCallback) {
            this.f4975a = str;
            this.f4976b = objectType;
            this.f4977c = creationCallback;
        }

        public void run() {
            LikeActionController.m6305c(this.f4975a, this.f4976b, this.f4977c);
        }
    }

    /* renamed from: com.facebook.share.internal.LikeActionController$i */
    private static class C1822i implements Runnable {
        /* renamed from: a */
        private static ArrayList<String> f4978a = new ArrayList();
        /* renamed from: b */
        private String f4979b;
        /* renamed from: c */
        private boolean f4980c;

        C1822i(String str, boolean z) {
            this.f4979b = str;
            this.f4980c = z;
        }

        public void run() {
            if (this.f4979b != null) {
                f4978a.remove(this.f4979b);
                f4978a.add(0, this.f4979b);
            }
            if (this.f4980c && f4978a.size() >= ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                while (64 < f4978a.size()) {
                    LikeActionController.f4985c.remove((String) f4978a.remove(f4978a.size() - 1));
                }
            }
        }
    }

    /* renamed from: com.facebook.share.internal.LikeActionController$l */
    private interface C1823l {
        /* renamed from: a */
        void mo1891a();
    }

    /* renamed from: com.facebook.share.internal.LikeActionController$m */
    private interface C1824m {
        /* renamed from: a */
        FacebookRequestError mo1896a();

        /* renamed from: a */
        void mo1897a(GraphRequestBatch graphRequestBatch);
    }

    /* renamed from: com.facebook.share.internal.LikeActionController$n */
    private static class C1825n implements Runnable {
        /* renamed from: a */
        private String f4981a;
        /* renamed from: b */
        private String f4982b;

        C1825n(String str, String str2) {
            this.f4981a = str;
            this.f4982b = str2;
        }

        public void run() {
            LikeActionController.m6298b(this.f4981a, this.f4982b);
        }
    }

    /* renamed from: com.facebook.share.internal.LikeActionController$2 */
    class C34512 implements CompletedListener {
        /* renamed from: a */
        final /* synthetic */ LikeActionController f10469a;

        C34512(LikeActionController likeActionController) {
            this.f10469a = likeActionController;
        }

        public void completed(Bundle bundle) {
            if (bundle != null) {
                if (bundle.containsKey("com.facebook.platform.extra.OBJECT_IS_LIKED")) {
                    String string;
                    boolean z = bundle.getBoolean("com.facebook.platform.extra.OBJECT_IS_LIKED");
                    if (bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE")) {
                        string = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE");
                    } else {
                        string = this.f10469a.f4996n;
                    }
                    String str = string;
                    if (bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE")) {
                        string = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE");
                    } else {
                        string = this.f10469a.f4997o;
                    }
                    String str2 = string;
                    if (bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE")) {
                        string = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE");
                    } else {
                        string = this.f10469a.f4998p;
                    }
                    String str3 = string;
                    if (bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE")) {
                        string = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE");
                    } else {
                        string = this.f10469a.f4999q;
                    }
                    String str4 = string;
                    if (bundle.containsKey("com.facebook.platform.extra.UNLIKE_TOKEN")) {
                        bundle = bundle.getString("com.facebook.platform.extra.UNLIKE_TOKEN");
                    } else {
                        bundle = this.f10469a.f5000r;
                    }
                    this.f10469a.m6285a(z, str, str2, str3, str4, bundle);
                }
            }
        }
    }

    /* renamed from: com.facebook.share.internal.LikeActionController$6 */
    static class C34536 implements Callback {
        C34536() {
        }

        public boolean onActivityResult(int i, Intent intent) {
            return LikeActionController.m6286a(RequestCodeOffset.Like.toRequestCode(), i, intent);
        }
    }

    /* renamed from: com.facebook.share.internal.LikeActionController$8 */
    static class C34548 extends C1665c {
        C34548() {
        }

        /* renamed from: a */
        protected void mo1873a(AccessToken accessToken, AccessToken accessToken2) {
            accessToken = FacebookSdk.m3994e();
            if (accessToken2 == null) {
                LikeActionController.f4991i = (LikeActionController.f4991i + 1) % AdError.NETWORK_ERROR_CODE;
                accessToken.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", LikeActionController.f4991i).apply();
                LikeActionController.f4985c.clear();
                LikeActionController.f4984b.m5943a();
            }
            LikeActionController.m6310d((LikeActionController) null, "com.facebook.sdk.LikeActionController.DID_RESET");
        }
    }

    /* renamed from: com.facebook.share.internal.LikeActionController$a */
    private abstract class C3457a implements C1824m {
        /* renamed from: a */
        protected String f10477a;
        /* renamed from: b */
        protected ObjectType f10478b;
        /* renamed from: c */
        protected FacebookRequestError f10479c;
        /* renamed from: d */
        final /* synthetic */ LikeActionController f10480d;
        /* renamed from: e */
        private GraphRequest f10481e;

        /* renamed from: com.facebook.share.internal.LikeActionController$a$1 */
        class C34561 implements GraphRequest.Callback {
            /* renamed from: a */
            final /* synthetic */ C3457a f10476a;

            C34561(C3457a c3457a) {
                this.f10476a = c3457a;
            }

            public void onCompleted(GraphResponse graphResponse) {
                this.f10476a.f10479c = graphResponse.m4092a();
                if (this.f10476a.f10479c != null) {
                    this.f10476a.mo3361a(this.f10476a.f10479c);
                } else {
                    this.f10476a.mo3362a(graphResponse);
                }
            }
        }

        /* renamed from: a */
        protected abstract void mo3362a(GraphResponse graphResponse);

        protected C3457a(LikeActionController likeActionController, String str, ObjectType objectType) {
            this.f10480d = likeActionController;
            this.f10477a = str;
            this.f10478b = objectType;
        }

        /* renamed from: a */
        public void mo1897a(GraphRequestBatch graphRequestBatch) {
            graphRequestBatch.m4074a(this.f10481e);
        }

        /* renamed from: a */
        public FacebookRequestError mo1896a() {
            return this.f10479c;
        }

        /* renamed from: a */
        protected void m13171a(GraphRequest graphRequest) {
            this.f10481e = graphRequest;
            graphRequest.m4055a(FacebookSdk.m3995f());
            graphRequest.m4052a(new C34561(this));
        }

        /* renamed from: a */
        protected void mo3361a(FacebookRequestError facebookRequestError) {
            C1738r.m5979a(LoggingBehavior.REQUESTS, LikeActionController.f4983a, "Error running request for object '%s' with type '%s' : %s", this.f10477a, this.f10478b, facebookRequestError);
        }
    }

    /* renamed from: com.facebook.share.internal.LikeActionController$h */
    private interface C3458h extends C1824m {
        /* renamed from: b */
        boolean mo3363b();

        /* renamed from: c */
        String mo3364c();
    }

    /* renamed from: com.facebook.share.internal.LikeActionController$c */
    private class C4208c extends C3457a {
        /* renamed from: e */
        String f13450e = this.f13454i.f4996n;
        /* renamed from: f */
        String f13451f = this.f13454i.f4997o;
        /* renamed from: g */
        String f13452g = this.f13454i.f4998p;
        /* renamed from: h */
        String f13453h = this.f13454i.f4999q;
        /* renamed from: i */
        final /* synthetic */ LikeActionController f13454i;

        C4208c(LikeActionController likeActionController, String str, ObjectType objectType) {
            this.f13454i = likeActionController;
            super(likeActionController, str, objectType);
            likeActionController = new Bundle();
            likeActionController.putString(ManagerWebServices.FB_PARAM_BATCH_FIELDS, "engagement.fields(count_string_with_like,count_string_without_like,social_sentence_with_like,social_sentence_without_like)");
            likeActionController.putString(ManagerWebServices.PARAM_LOCALE, Locale.getDefault().toString());
            m13171a((GraphRequest) new GraphRequest(AccessToken.getCurrentAccessToken(), str, likeActionController, HttpMethod.GET));
        }

        /* renamed from: a */
        protected void mo3362a(GraphResponse graphResponse) {
            graphResponse = Utility.m5790b(graphResponse.m4093b(), "engagement");
            if (graphResponse != null) {
                this.f13450e = graphResponse.optString("count_string_with_like", this.f13450e);
                this.f13451f = graphResponse.optString("count_string_without_like", this.f13451f);
                this.f13452g = graphResponse.optString("social_sentence_with_like", this.f13452g);
                this.f13453h = graphResponse.optString("social_sentence_without_like", this.f13453h);
            }
        }

        /* renamed from: a */
        protected void mo3361a(FacebookRequestError facebookRequestError) {
            C1738r.m5979a(LoggingBehavior.REQUESTS, LikeActionController.f4983a, "Error fetching engagement for object '%s' with type '%s' : %s", this.a, this.b, facebookRequestError);
            this.f13454i.m6280a("get_engagement", facebookRequestError);
        }
    }

    /* renamed from: com.facebook.share.internal.LikeActionController$d */
    private class C4209d extends C3457a {
        /* renamed from: e */
        String f13455e;
        /* renamed from: f */
        final /* synthetic */ LikeActionController f13456f;

        C4209d(LikeActionController likeActionController, String str, ObjectType objectType) {
            this.f13456f = likeActionController;
            super(likeActionController, str, objectType);
            likeActionController = new Bundle();
            likeActionController.putString(ManagerWebServices.FB_PARAM_BATCH_FIELDS, "og_object.fields(id)");
            likeActionController.putString("ids", str);
            m13171a((GraphRequest) new GraphRequest(AccessToken.getCurrentAccessToken(), "", likeActionController, HttpMethod.GET));
        }

        /* renamed from: a */
        protected void mo3361a(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.getErrorMessage().contains("og_object")) {
                this.c = null;
                return;
            }
            C1738r.m5979a(LoggingBehavior.REQUESTS, LikeActionController.f4983a, "Error getting the FB id for object '%s' with type '%s' : %s", this.a, this.b, facebookRequestError);
        }

        /* renamed from: a */
        protected void mo3362a(GraphResponse graphResponse) {
            graphResponse = Utility.m5790b(graphResponse.m4093b(), this.a);
            if (graphResponse != null) {
                graphResponse = graphResponse.optJSONObject("og_object");
                if (graphResponse != null) {
                    this.f13455e = graphResponse.optString("id");
                }
            }
        }
    }

    /* renamed from: com.facebook.share.internal.LikeActionController$e */
    private class C4210e extends C3457a implements C3458h {
        /* renamed from: e */
        final /* synthetic */ LikeActionController f13457e;
        /* renamed from: f */
        private boolean f13458f = this.f13457e.f4995m;
        /* renamed from: g */
        private String f13459g;
        /* renamed from: h */
        private final String f13460h;
        /* renamed from: i */
        private final ObjectType f13461i;

        C4210e(LikeActionController likeActionController, String str, ObjectType objectType) {
            this.f13457e = likeActionController;
            super(likeActionController, str, objectType);
            this.f13460h = str;
            this.f13461i = objectType;
            likeActionController = new Bundle();
            likeActionController.putString(ManagerWebServices.FB_PARAM_BATCH_FIELDS, "id,application");
            likeActionController.putString("object", this.f13460h);
            m13171a((GraphRequest) new GraphRequest(AccessToken.getCurrentAccessToken(), "me/og.likes", likeActionController, HttpMethod.GET));
        }

        /* renamed from: a */
        protected void mo3362a(GraphResponse graphResponse) {
            graphResponse = Utility.m5798c(graphResponse.m4093b(), ManagerWebServices.FB_DATA);
            if (graphResponse != null) {
                for (int i = 0; i < graphResponse.length(); i++) {
                    JSONObject optJSONObject = graphResponse.optJSONObject(i);
                    if (optJSONObject != null) {
                        this.f13458f = true;
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("application");
                        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
                        if (optJSONObject2 != null && AccessToken.isCurrentAccessTokenActive() && Utility.m5784a(currentAccessToken.getApplicationId(), optJSONObject2.optString("id"))) {
                            this.f13459g = optJSONObject.optString("id");
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        protected void mo3361a(FacebookRequestError facebookRequestError) {
            C1738r.m5979a(LoggingBehavior.REQUESTS, LikeActionController.f4983a, "Error fetching like status for object '%s' with type '%s' : %s", this.f13460h, this.f13461i, facebookRequestError);
            this.f13457e.m6280a("get_og_object_like", facebookRequestError);
        }

        /* renamed from: b */
        public boolean mo3363b() {
            return this.f13458f;
        }

        /* renamed from: c */
        public String mo3364c() {
            return this.f13459g;
        }
    }

    /* renamed from: com.facebook.share.internal.LikeActionController$f */
    private class C4211f extends C3457a {
        /* renamed from: e */
        String f13462e;
        /* renamed from: f */
        boolean f13463f;
        /* renamed from: g */
        final /* synthetic */ LikeActionController f13464g;

        C4211f(LikeActionController likeActionController, String str, ObjectType objectType) {
            this.f13464g = likeActionController;
            super(likeActionController, str, objectType);
            likeActionController = new Bundle();
            likeActionController.putString(ManagerWebServices.FB_PARAM_BATCH_FIELDS, "id");
            likeActionController.putString("ids", str);
            m13171a((GraphRequest) new GraphRequest(AccessToken.getCurrentAccessToken(), "", likeActionController, HttpMethod.GET));
        }

        /* renamed from: a */
        protected void mo3362a(GraphResponse graphResponse) {
            graphResponse = Utility.m5790b(graphResponse.m4093b(), this.a);
            if (graphResponse != null) {
                this.f13462e = graphResponse.optString("id");
                this.f13463f = Utility.m5785a(this.f13462e) ^ 1;
            }
        }

        /* renamed from: a */
        protected void mo3361a(FacebookRequestError facebookRequestError) {
            C1738r.m5979a(LoggingBehavior.REQUESTS, LikeActionController.f4983a, "Error getting the FB id for object '%s' with type '%s' : %s", this.a, this.b, facebookRequestError);
        }
    }

    /* renamed from: com.facebook.share.internal.LikeActionController$g */
    private class C4212g extends C3457a implements C3458h {
        /* renamed from: e */
        final /* synthetic */ LikeActionController f13465e;
        /* renamed from: f */
        private boolean f13466f = this.f13465e.f4995m;
        /* renamed from: g */
        private String f13467g;

        /* renamed from: c */
        public String mo3364c() {
            return null;
        }

        C4212g(LikeActionController likeActionController, String str) {
            this.f13465e = likeActionController;
            super(likeActionController, str, ObjectType.PAGE);
            this.f13467g = str;
            likeActionController = new Bundle();
            likeActionController.putString(ManagerWebServices.FB_PARAM_BATCH_FIELDS, "id");
            AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("me/likes/");
            stringBuilder.append(str);
            m13171a(new GraphRequest(currentAccessToken, stringBuilder.toString(), likeActionController, HttpMethod.GET));
        }

        /* renamed from: a */
        protected void mo3362a(GraphResponse graphResponse) {
            graphResponse = Utility.m5798c(graphResponse.m4093b(), ManagerWebServices.FB_DATA);
            if (graphResponse != null && graphResponse.length() > null) {
                this.f13466f = true;
            }
        }

        /* renamed from: a */
        protected void mo3361a(FacebookRequestError facebookRequestError) {
            C1738r.m5979a(LoggingBehavior.REQUESTS, LikeActionController.f4983a, "Error fetching like status for page id '%s': %s", this.f13467g, facebookRequestError);
            this.f13465e.m6280a("get_page_like", facebookRequestError);
        }

        /* renamed from: b */
        public boolean mo3363b() {
            return this.f13466f;
        }
    }

    /* renamed from: com.facebook.share.internal.LikeActionController$j */
    private class C4213j extends C3457a {
        /* renamed from: e */
        String f13468e;
        /* renamed from: f */
        final /* synthetic */ LikeActionController f13469f;

        C4213j(LikeActionController likeActionController, String str, ObjectType objectType) {
            this.f13469f = likeActionController;
            super(likeActionController, str, objectType);
            likeActionController = new Bundle();
            likeActionController.putString("object", str);
            m13171a((GraphRequest) new GraphRequest(AccessToken.getCurrentAccessToken(), "me/og.likes", likeActionController, HttpMethod.POST));
        }

        /* renamed from: a */
        protected void mo3362a(GraphResponse graphResponse) {
            this.f13468e = Utility.m5761a(graphResponse.m4093b(), "id");
        }

        /* renamed from: a */
        protected void mo3361a(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.getErrorCode() == 3501) {
                this.c = null;
                return;
            }
            C1738r.m5979a(LoggingBehavior.REQUESTS, LikeActionController.f4983a, "Error liking object '%s' with type '%s' : %s", this.a, this.b, facebookRequestError);
            this.f13469f.m6280a("publish_like", facebookRequestError);
        }
    }

    /* renamed from: com.facebook.share.internal.LikeActionController$k */
    private class C4214k extends C3457a {
        /* renamed from: e */
        final /* synthetic */ LikeActionController f13470e;
        /* renamed from: f */
        private String f13471f;

        /* renamed from: a */
        protected void mo3362a(GraphResponse graphResponse) {
        }

        C4214k(LikeActionController likeActionController, String str) {
            this.f13470e = likeActionController;
            super(likeActionController, null, null);
            this.f13471f = str;
            m13171a((GraphRequest) new GraphRequest(AccessToken.getCurrentAccessToken(), str, null, HttpMethod.DELETE));
        }

        /* renamed from: a */
        protected void mo3361a(FacebookRequestError facebookRequestError) {
            C1738r.m5979a(LoggingBehavior.REQUESTS, LikeActionController.f4983a, "Error unliking object with unlike token '%s' : %s", this.f13471f, facebookRequestError);
            this.f13470e.m6280a("publish_unlike", facebookRequestError);
        }
    }

    @Deprecated
    /* renamed from: e */
    public boolean m6339e() {
        return false;
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m6286a(final int i, final int i2, final Intent intent) {
        if (Utility.m5785a(f4989g)) {
            f4989g = FacebookSdk.m3994e().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getString("PENDING_CONTROLLER_KEY", null);
        }
        if (Utility.m5785a(f4989g)) {
            return false;
        }
        m6282a(f4989g, ObjectType.UNKNOWN, new CreationCallback() {
            public void onComplete(LikeActionController likeActionController, FacebookException facebookException) {
                if (facebookException == null) {
                    likeActionController.m6292b((int) i, i2, intent);
                } else {
                    Utility.m5777a(LikeActionController.f4983a, (Exception) facebookException);
                }
            }
        });
        return true;
    }

    @Deprecated
    /* renamed from: a */
    public static void m6282a(String str, ObjectType objectType, CreationCallback creationCallback) {
        if (!f4990h) {
            m6324j();
        }
        LikeActionController a = m6267a(str);
        if (a != null) {
            m6274a(a, objectType, creationCallback);
        } else {
            f4987e.m5854a(new C1821b(str, objectType, creationCallback));
        }
    }

    /* renamed from: a */
    private static void m6274a(LikeActionController likeActionController, ObjectType objectType, CreationCallback creationCallback) {
        FacebookException facebookException;
        ObjectType a = C1838i.m6458a(objectType, likeActionController.f4994l);
        if (a == null) {
            facebookException = new FacebookException("Object with id:\"%s\" is already marked as type:\"%s\". Cannot change the type to:\"%s\"", likeActionController.f4993k, likeActionController.f4994l.toString(), objectType.toString());
            likeActionController = null;
        } else {
            likeActionController.f4994l = a;
            facebookException = null;
        }
        m6269a(creationCallback, likeActionController, facebookException);
    }

    /* renamed from: c */
    private static void m6305c(String str, ObjectType objectType, CreationCallback creationCallback) {
        LikeActionController a = m6267a(str);
        if (a != null) {
            m6274a(a, objectType, creationCallback);
            return;
        }
        a = m6289b(str);
        if (a == null) {
            a = new LikeActionController(str, objectType);
            m6328l(a);
        }
        m6281a(str, a);
        f4988f.post(new Runnable() {
            public void run() {
                a.m6332o();
            }
        });
        m6269a(creationCallback, a, (FacebookException) null);
    }

    /* renamed from: j */
    private static synchronized void m6324j() {
        synchronized (LikeActionController.class) {
            if (f4990h) {
                return;
            }
            f4988f = new Handler(Looper.getMainLooper());
            f4991i = FacebookSdk.m3994e().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getInt("OBJECT_SUFFIX", 1);
            f4984b = new C1724k(f4983a, new C1720d());
            m6325k();
            CallbackManagerImpl.m13080a(RequestCodeOffset.Like.toRequestCode(), new C34536());
            f4990h = true;
        }
    }

    /* renamed from: a */
    private static void m6269a(final CreationCallback creationCallback, final LikeActionController likeActionController, final FacebookException facebookException) {
        if (creationCallback != null) {
            f4988f.post(new Runnable() {
                public void run() {
                    creationCallback.onComplete(likeActionController, facebookException);
                }
            });
        }
    }

    /* renamed from: k */
    private static void m6325k() {
        f4992j = new C34548();
    }

    /* renamed from: a */
    private static void m6281a(String str, LikeActionController likeActionController) {
        str = m6308d(str);
        f4986d.m5854a(new C1822i(str, true));
        f4985c.put(str, likeActionController);
    }

    /* renamed from: a */
    private static LikeActionController m6267a(String str) {
        str = m6308d(str);
        LikeActionController likeActionController = (LikeActionController) f4985c.get(str);
        if (likeActionController != null) {
            f4986d.m5854a(new C1822i(str, false));
        }
        return likeActionController;
    }

    /* renamed from: l */
    private static void m6328l(LikeActionController likeActionController) {
        String m = m6329m(likeActionController);
        String d = m6308d(likeActionController.f4993k);
        if (!Utility.m5785a(m) && !Utility.m5785a(d)) {
            f4987e.m5854a(new C1825n(d, m));
        }
    }

    /* renamed from: b */
    private static void m6298b(String str, String str2) {
        Closeable closeable = null;
        try {
            Closeable b = f4984b.m5944b(str);
            try {
                b.write(str2.getBytes());
                if (b != null) {
                    Utility.m5774a(b);
                }
            } catch (IOException e) {
                str2 = e;
                closeable = b;
                try {
                    Log.e(f4983a, "Unable to serialize controller to disk", str2);
                    if (closeable != null) {
                        Utility.m5774a(closeable);
                    }
                } catch (Throwable th) {
                    str2 = th;
                    if (closeable != null) {
                        Utility.m5774a(closeable);
                    }
                    throw str2;
                }
            } catch (Throwable th2) {
                str2 = th2;
                closeable = b;
                if (closeable != null) {
                    Utility.m5774a(closeable);
                }
                throw str2;
            }
        } catch (IOException e2) {
            str2 = e2;
            Log.e(f4983a, "Unable to serialize controller to disk", str2);
            if (closeable != null) {
                Utility.m5774a(closeable);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private static com.facebook.share.internal.LikeActionController m6289b(java.lang.String r5) {
        /*
        r0 = 0;
        r5 = m6308d(r5);	 Catch:{ IOException -> 0x002a, all -> 0x0025 }
        r1 = f4984b;	 Catch:{ IOException -> 0x002a, all -> 0x0025 }
        r5 = r1.m5940a(r5);	 Catch:{ IOException -> 0x002a, all -> 0x0025 }
        if (r5 == 0) goto L_0x001f;
    L_0x000d:
        r1 = com.facebook.internal.Utility.m5757a(r5);	 Catch:{ IOException -> 0x001d }
        r2 = com.facebook.internal.Utility.m5785a(r1);	 Catch:{ IOException -> 0x001d }
        if (r2 != 0) goto L_0x001f;
    L_0x0017:
        r1 = m6300c(r1);	 Catch:{ IOException -> 0x001d }
        r0 = r1;
        goto L_0x001f;
    L_0x001d:
        r1 = move-exception;
        goto L_0x002c;
    L_0x001f:
        if (r5 == 0) goto L_0x0036;
    L_0x0021:
        com.facebook.internal.Utility.m5774a(r5);
        goto L_0x0036;
    L_0x0025:
        r5 = move-exception;
        r4 = r0;
        r0 = r5;
        r5 = r4;
        goto L_0x0038;
    L_0x002a:
        r1 = move-exception;
        r5 = r0;
    L_0x002c:
        r2 = f4983a;	 Catch:{ all -> 0x0037 }
        r3 = "Unable to deserialize controller from disk";
        android.util.Log.e(r2, r3, r1);	 Catch:{ all -> 0x0037 }
        if (r5 == 0) goto L_0x0036;
    L_0x0035:
        goto L_0x0021;
    L_0x0036:
        return r0;
    L_0x0037:
        r0 = move-exception;
    L_0x0038:
        if (r5 == 0) goto L_0x003d;
    L_0x003a:
        com.facebook.internal.Utility.m5774a(r5);
    L_0x003d:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.LikeActionController.b(java.lang.String):com.facebook.share.internal.LikeActionController");
    }

    /* renamed from: c */
    private static LikeActionController m6300c(String str) {
        LikeActionController likeActionController = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("com.facebook.share.internal.LikeActionController.version", -1) != 3) {
                return null;
            }
            LikeActionController likeActionController2 = new LikeActionController(jSONObject.getString("object_id"), ObjectType.fromInt(jSONObject.optInt("object_type", ObjectType.UNKNOWN.getValue())));
            likeActionController2.f4996n = jSONObject.optString("like_count_string_with_like", null);
            likeActionController2.f4997o = jSONObject.optString("like_count_string_without_like", null);
            likeActionController2.f4998p = jSONObject.optString("social_sentence_with_like", null);
            likeActionController2.f4999q = jSONObject.optString("social_sentence_without_like", null);
            likeActionController2.f4995m = jSONObject.optBoolean("is_object_liked");
            likeActionController2.f5000r = jSONObject.optString("unlike_token", null);
            JSONObject optJSONObject = jSONObject.optJSONObject("facebook_dialog_analytics_bundle");
            if (optJSONObject != null) {
                likeActionController2.f5005w = BundleJSONConverter.m5709a(optJSONObject);
            }
            likeActionController = likeActionController2;
            return likeActionController;
        } catch (String str2) {
            Log.e(f4983a, "Unable to deserialize controller from JSON", str2);
        }
    }

    /* renamed from: m */
    private static String m6329m(LikeActionController likeActionController) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("com.facebook.share.internal.LikeActionController.version", 3);
            jSONObject.put("object_id", likeActionController.f4993k);
            jSONObject.put("object_type", likeActionController.f4994l.getValue());
            jSONObject.put("like_count_string_with_like", likeActionController.f4996n);
            jSONObject.put("like_count_string_without_like", likeActionController.f4997o);
            jSONObject.put("social_sentence_with_like", likeActionController.f4998p);
            jSONObject.put("social_sentence_without_like", likeActionController.f4999q);
            jSONObject.put("is_object_liked", likeActionController.f4995m);
            jSONObject.put("unlike_token", likeActionController.f5000r);
            if (likeActionController.f5005w != null) {
                likeActionController = BundleJSONConverter.m5710a(likeActionController.f5005w);
                if (likeActionController != null) {
                    jSONObject.put("facebook_dialog_analytics_bundle", likeActionController);
                }
            }
            return jSONObject.toString();
        } catch (LikeActionController likeActionController2) {
            Log.e(f4983a, "Unable to serialize controller to JSON", likeActionController2);
            return null;
        }
    }

    /* renamed from: d */
    private static String m6308d(String str) {
        String token = AccessToken.isCurrentAccessTokenActive() ? AccessToken.getCurrentAccessToken().getToken() : null;
        if (token != null) {
            token = Utility.m5787b(token);
        }
        return String.format(Locale.ROOT, "%s|%s|com.fb.sdk.like|%d", new Object[]{str, Utility.m5758a(token, ""), Integer.valueOf(f4991i)});
    }

    /* renamed from: d */
    private static void m6310d(LikeActionController likeActionController, String str) {
        m6304c(likeActionController, str, null);
    }

    /* renamed from: c */
    private static void m6304c(LikeActionController likeActionController, String str, Bundle bundle) {
        Intent intent = new Intent(str);
        if (likeActionController != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("com.facebook.sdk.LikeActionController.OBJECT_ID", likeActionController.m6334a());
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        C0436c.m1648a(FacebookSdk.m3994e()).m1653a(intent);
    }

    private LikeActionController(String str, ObjectType objectType) {
        this.f4993k = str;
        this.f4994l = objectType;
    }

    @Deprecated
    /* renamed from: a */
    public String m6334a() {
        return this.f4993k;
    }

    @Deprecated
    /* renamed from: b */
    public String m6336b() {
        return this.f4995m ? this.f4996n : this.f4997o;
    }

    @Deprecated
    /* renamed from: c */
    public String m6337c() {
        return this.f4995m ? this.f4998p : this.f4999q;
    }

    @Deprecated
    /* renamed from: d */
    public boolean m6338d() {
        return this.f4995m;
    }

    @Deprecated
    /* renamed from: a */
    public void m6335a(Activity activity, C1725l c1725l, Bundle bundle) {
        boolean z = true;
        boolean z2 = this.f4995m ^ true;
        if (m6331n()) {
            m6299b(z2);
            if (this.f5004v) {
                m6327l().logSdkEvent("fb_like_control_did_undo_quickly", null, bundle);
                return;
            } else if (!m6288a(z2, bundle)) {
                if (z2) {
                    z = false;
                }
                m6299b(z);
                m6293b(activity, c1725l, bundle);
                return;
            } else {
                return;
            }
        }
        m6293b(activity, c1725l, bundle);
    }

    /* renamed from: l */
    private AppEventsLogger m6327l() {
        if (this.f5006x == null) {
            this.f5006x = AppEventsLogger.newLogger(FacebookSdk.m3994e());
        }
        return this.f5006x;
    }

    /* renamed from: a */
    private boolean m6288a(boolean z, Bundle bundle) {
        if (m6331n()) {
            if (z) {
                m6303c(bundle);
                return true;
            } else if (!Utility.m5785a(this.f5000r)) {
                m6309d(bundle);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m6284a(boolean z) {
        m6299b(z);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Unable to publish the like/unlike action");
        m6304c(this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
    }

    /* renamed from: b */
    private void m6299b(boolean z) {
        m6285a(z, this.f4996n, this.f4997o, this.f4998p, this.f4999q, this.f5000r);
    }

    /* renamed from: a */
    private void m6285a(boolean z, String str, String str2, String str3, String str4, String str5) {
        Object obj;
        Object a = Utility.m5758a(str, null);
        Object a2 = Utility.m5758a(str2, null);
        Object a3 = Utility.m5758a(str3, null);
        Object a4 = Utility.m5758a(str4, null);
        Object a5 = Utility.m5758a(str5, null);
        if (z == this.f4995m && Utility.m5784a(a, this.f4996n) && Utility.m5784a(a2, this.f4997o) && Utility.m5784a(a3, this.f4998p) && Utility.m5784a(a4, this.f4999q)) {
            if (Utility.m5784a(a5, this.f5000r)) {
                obj = null;
                if (obj == null) {
                    this.f4995m = z;
                    this.f4996n = a;
                    this.f4997o = a2;
                    this.f4998p = a3;
                    this.f4999q = a4;
                    this.f5000r = a5;
                    m6328l(this);
                    m6310d(this, "com.facebook.sdk.LikeActionController.UPDATED");
                }
            }
        }
        obj = 1;
        if (obj == null) {
            this.f4995m = z;
            this.f4996n = a;
            this.f4997o = a2;
            this.f4998p = a3;
            this.f4999q = a4;
            this.f5000r = a5;
            m6328l(this);
            m6310d(this, "com.facebook.sdk.LikeActionController.UPDATED");
        }
    }

    /* renamed from: b */
    private void m6293b(Activity activity, C1725l c1725l, Bundle bundle) {
        String str;
        if (C4216c.m16689e()) {
            str = "fb_like_control_did_present_dialog";
        } else if (C4216c.m16690f()) {
            str = "fb_like_control_did_present_fallback_dialog";
        } else {
            m6279a("present_dialog", bundle);
            Utility.m5793b(f4983a, "Cannot show the Like Dialog on this device.");
            m6310d(null, "com.facebook.sdk.LikeActionController.UPDATED");
            str = null;
        }
        if (str != null) {
            if (this.f4994l != null) {
                str = this.f4994l.toString();
            } else {
                str = ObjectType.UNKNOWN.toString();
            }
            LikeContent a = new C4215a().m16684a(this.f4993k).m16686b(str).m16685a();
            if (c1725l != null) {
                new C4216c(c1725l).m16694a(a);
            } else {
                new C4216c(activity).m16694a(a);
            }
            m6294b(bundle);
            m6327l().logSdkEvent("fb_like_control_did_present_dialog", null, bundle);
        }
    }

    /* renamed from: b */
    private void m6292b(int i, int i2, Intent intent) {
        C1838i.m6471a(i, i2, intent, m6268a(this.f5005w));
        m6330m();
    }

    /* renamed from: a */
    private C1834g m6268a(final Bundle bundle) {
        return new C1834g(this, null) {
            /* renamed from: b */
            final /* synthetic */ LikeActionController f10475b;

            /* renamed from: a */
            public void mo1894a(C1697a c1697a, Bundle bundle) {
                if (bundle != null) {
                    if (bundle.containsKey("object_is_liked")) {
                        String string;
                        String str;
                        String string2;
                        String str2;
                        boolean z = bundle.getBoolean("object_is_liked");
                        String b = this.f10475b.f4996n;
                        String c = this.f10475b.f4997o;
                        if (bundle.containsKey("like_count_string")) {
                            string = bundle.getString("like_count_string");
                            str = string;
                        } else {
                            string = b;
                            str = c;
                        }
                        b = this.f10475b.f4998p;
                        c = this.f10475b.f4999q;
                        if (bundle.containsKey("social_sentence")) {
                            string2 = bundle.getString("social_sentence");
                            str2 = string2;
                        } else {
                            string2 = b;
                            str2 = c;
                        }
                        if (bundle.containsKey("object_is_liked")) {
                            bundle = bundle.getString("unlike_token");
                        } else {
                            bundle = this.f10475b.f5000r;
                        }
                        Bundle bundle2 = bundle;
                        bundle = bundle == null ? new Bundle() : bundle;
                        bundle.putString("call_id", c1697a.m5861c().toString());
                        this.f10475b.m6327l().logSdkEvent("fb_like_control_dialog_did_succeed", null, bundle);
                        this.f10475b.m6285a(z, string, str, string2, str2, bundle2);
                    }
                }
            }

            /* renamed from: a */
            public void mo1895a(C1697a c1697a, FacebookException facebookException) {
                C1738r.m5979a(LoggingBehavior.REQUESTS, LikeActionController.f4983a, "Like Dialog failed with error : %s", facebookException);
                Bundle bundle = bundle == null ? new Bundle() : bundle;
                bundle.putString("call_id", c1697a.m5861c().toString());
                this.f10475b.m6279a("present_dialog", bundle);
                LikeActionController.m6304c(this.f10475b, "com.facebook.sdk.LikeActionController.DID_ERROR", C1745t.m6027a(facebookException));
            }

            /* renamed from: a */
            public void mo1893a(C1697a c1697a) {
                mo1895a(c1697a, new FacebookOperationCanceledException());
            }
        };
    }

    /* renamed from: b */
    private void m6294b(Bundle bundle) {
        m6314e(this.f4993k);
        this.f5005w = bundle;
        m6328l(this);
    }

    /* renamed from: m */
    private void m6330m() {
        this.f5005w = null;
        m6314e(null);
    }

    /* renamed from: e */
    private static void m6314e(String str) {
        f4989g = str;
        FacebookSdk.m3994e().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putString("PENDING_CONTROLLER_KEY", f4989g).apply();
    }

    /* renamed from: n */
    private boolean m6331n() {
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        return (this.f5002t || this.f5001s == null || !AccessToken.isCurrentAccessTokenActive() || currentAccessToken.getPermissions() == null || !currentAccessToken.getPermissions().contains("publish_actions")) ? false : true;
    }

    /* renamed from: c */
    private void m6303c(final Bundle bundle) {
        this.f5004v = true;
        m6270a(new C1823l(this) {
            /* renamed from: b */
            final /* synthetic */ LikeActionController f10458b;

            /* renamed from: a */
            public void mo1891a() {
                if (Utility.m5785a(this.f10458b.f5001s)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
                    LikeActionController.m6304c(this.f10458b, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
                    return;
                }
                GraphRequestBatch graphRequestBatch = new GraphRequestBatch();
                final C4213j c4213j = new C4213j(this.f10458b, this.f10458b.f5001s, this.f10458b.f4994l);
                c4213j.mo1897a(graphRequestBatch);
                graphRequestBatch.m4073a(new GraphRequestBatch.Callback(this) {
                    /* renamed from: b */
                    final /* synthetic */ AnonymousClass10 f10456b;

                    public void onBatchCompleted(GraphRequestBatch graphRequestBatch) {
                        this.f10456b.f10458b.f5004v = false;
                        if (c4213j.mo1896a() != null) {
                            this.f10456b.f10458b.m6284a(false);
                            return;
                        }
                        this.f10456b.f10458b.f5000r = Utility.m5758a(c4213j.f13468e, null);
                        this.f10456b.f10458b.f5003u = true;
                        this.f10456b.f10458b.m6327l().logSdkEvent("fb_like_control_did_like", null, bundle);
                        this.f10456b.f10458b.m6313e(bundle);
                    }
                });
                graphRequestBatch.m4083h();
            }
        });
    }

    /* renamed from: d */
    private void m6309d(final Bundle bundle) {
        this.f5004v = true;
        GraphRequestBatch graphRequestBatch = new GraphRequestBatch();
        final C4214k c4214k = new C4214k(this, this.f5000r);
        c4214k.mo1897a(graphRequestBatch);
        graphRequestBatch.m4073a(new GraphRequestBatch.Callback(this) {
            /* renamed from: c */
            final /* synthetic */ LikeActionController f10461c;

            public void onBatchCompleted(GraphRequestBatch graphRequestBatch) {
                this.f10461c.f5004v = false;
                if (c4214k.mo1896a() != null) {
                    this.f10461c.m6284a(true);
                    return;
                }
                this.f10461c.f5000r = null;
                this.f10461c.f5003u = false;
                this.f10461c.m6327l().logSdkEvent("fb_like_control_did_unlike", null, bundle);
                this.f10461c.m6313e(bundle);
            }
        });
        graphRequestBatch.m4083h();
    }

    /* renamed from: o */
    private void m6332o() {
        if (AccessToken.isCurrentAccessTokenActive()) {
            m6270a(new C1823l(this) {
                /* renamed from: a */
                final /* synthetic */ LikeActionController f10465a;

                {
                    this.f10465a = r1;
                }

                /* renamed from: a */
                public void mo1891a() {
                    C3458h c4210e;
                    if (C18184.f4970a[this.f10465a.f4994l.ordinal()] != 1) {
                        c4210e = new C4210e(this.f10465a, this.f10465a.f5001s, this.f10465a.f4994l);
                    } else {
                        c4210e = new C4212g(this.f10465a, this.f10465a.f5001s);
                    }
                    final C4208c c4208c = new C4208c(this.f10465a, this.f10465a.f5001s, this.f10465a.f4994l);
                    GraphRequestBatch graphRequestBatch = new GraphRequestBatch();
                    c4210e.mo1897a(graphRequestBatch);
                    c4208c.mo1897a(graphRequestBatch);
                    graphRequestBatch.m4073a(new GraphRequestBatch.Callback(this) {
                        /* renamed from: c */
                        final /* synthetic */ AnonymousClass12 f10464c;

                        public void onBatchCompleted(GraphRequestBatch graphRequestBatch) {
                            if (c4210e.mo1896a() == null) {
                                if (c4208c.mo1896a() == null) {
                                    this.f10464c.f10465a.m6285a(c4210e.mo3363b(), c4208c.f13450e, c4208c.f13451f, c4208c.f13452g, c4208c.f13453h, c4210e.mo3364c());
                                    return;
                                }
                            }
                            C1738r.m5979a(LoggingBehavior.REQUESTS, LikeActionController.f4983a, "Unable to refresh like state for id: '%s'", this.f10464c.f10465a.f4993k);
                        }
                    });
                    graphRequestBatch.m4083h();
                }
            });
        } else {
            m6333p();
        }
    }

    /* renamed from: p */
    private void m6333p() {
        C3465d c3465d = new C3465d(FacebookSdk.m3994e(), FacebookSdk.m3998i(), this.f4993k);
        if (c3465d.m5743a()) {
            c3465d.m5742a(new C34512(this));
        }
    }

    /* renamed from: e */
    private void m6313e(Bundle bundle) {
        if (this.f4995m != this.f5003u && m6288a(this.f4995m, bundle) == null) {
            m6284a(this.f4995m ^ 1);
        }
    }

    /* renamed from: a */
    private void m6270a(final C1823l c1823l) {
        if (Utility.m5785a(this.f5001s)) {
            final C4209d c4209d = new C4209d(this, this.f4993k, this.f4994l);
            final C4211f c4211f = new C4211f(this, this.f4993k, this.f4994l);
            GraphRequestBatch graphRequestBatch = new GraphRequestBatch();
            c4209d.mo1897a(graphRequestBatch);
            c4211f.mo1897a(graphRequestBatch);
            graphRequestBatch.m4073a(new GraphRequestBatch.Callback(this) {
                /* renamed from: d */
                final /* synthetic */ LikeActionController f10473d;

                public void onBatchCompleted(GraphRequestBatch graphRequestBatch) {
                    this.f10473d.f5001s = c4209d.f13455e;
                    if (Utility.m5785a(this.f10473d.f5001s) != null) {
                        this.f10473d.f5001s = c4211f.f13462e;
                        this.f10473d.f5002t = c4211f.f13463f;
                    }
                    if (Utility.m5785a(this.f10473d.f5001s) != null) {
                        FacebookRequestError a;
                        C1738r.m5979a(LoggingBehavior.DEVELOPER_ERRORS, LikeActionController.f4983a, "Unable to verify the FB id for '%s'. Verify that it is a valid FB object or page", this.f10473d.f4993k);
                        LikeActionController likeActionController = this.f10473d;
                        String str = "get_verified_id";
                        if (c4211f.mo1896a() != null) {
                            a = c4211f.mo1896a();
                        } else {
                            a = c4209d.mo1896a();
                        }
                        likeActionController.m6280a(str, a);
                    }
                    if (c1823l != null) {
                        c1823l.mo1891a();
                    }
                }
            });
            graphRequestBatch.m4083h();
            return;
        }
        if (c1823l != null) {
            c1823l.mo1891a();
        }
    }

    /* renamed from: a */
    private void m6279a(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString("object_id", this.f4993k);
        bundle2.putString("object_type", this.f4994l.toString());
        bundle2.putString("current_action", str);
        m6327l().logSdkEvent("fb_like_control_error", null, bundle2);
    }

    /* renamed from: a */
    private void m6280a(String str, FacebookRequestError facebookRequestError) {
        Bundle bundle = new Bundle();
        if (facebookRequestError != null) {
            facebookRequestError = facebookRequestError.getRequestResult();
            if (facebookRequestError != null) {
                bundle.putString("error", facebookRequestError.toString());
            }
        }
        m6279a(str, bundle);
    }
}
