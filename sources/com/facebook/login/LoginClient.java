package com.facebook.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.common.C1672a.C1670e;
import com.facebook.internal.C1749x;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.Utility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class LoginClient implements Parcelable {
    public static final Creator<LoginClient> CREATOR = new C17641();
    C1767a backgroundProcessingListener;
    boolean checkedInternetPermission;
    int currentHandler = -1;
    Fragment fragment;
    LoginMethodHandler[] handlersToTry;
    Map<String, String> loggingExtras;
    private C1769c loginLogger;
    OnCompletedListener onCompletedListener;
    Request pendingRequest;

    /* renamed from: com.facebook.login.LoginClient$1 */
    static class C17641 implements Creator {
        C17641() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6091a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6092a(i);
        }

        /* renamed from: a */
        public LoginClient m6091a(Parcel parcel) {
            return new LoginClient(parcel);
        }

        /* renamed from: a */
        public LoginClient[] m6092a(int i) {
            return new LoginClient[i];
        }
    }

    public interface OnCompletedListener {
        void onCompleted(Result result);
    }

    public static class Request implements Parcelable {
        public static final Creator<Request> CREATOR = new C17651();
        private final String applicationId;
        private final String authId;
        private final DefaultAudience defaultAudience;
        private String deviceRedirectUriString;
        private boolean isRerequest;
        private final LoginBehavior loginBehavior;
        private Set<String> permissions;

        /* renamed from: com.facebook.login.LoginClient$Request$1 */
        static class C17651 implements Creator {
            C17651() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m6093a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m6094a(i);
            }

            /* renamed from: a */
            public Request m6093a(Parcel parcel) {
                return new Request(parcel);
            }

            /* renamed from: a */
            public Request[] m6094a(int i) {
                return new Request[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String str, String str2) {
            this.isRerequest = false;
            this.loginBehavior = loginBehavior;
            if (set == null) {
                set = new HashSet();
            }
            this.permissions = set;
            this.defaultAudience = defaultAudience;
            this.applicationId = str;
            this.authId = str2;
        }

        Set<String> getPermissions() {
            return this.permissions;
        }

        void setPermissions(Set<String> set) {
            C1749x.m6064a((Object) set, "permissions");
            this.permissions = set;
        }

        LoginBehavior getLoginBehavior() {
            return this.loginBehavior;
        }

        DefaultAudience getDefaultAudience() {
            return this.defaultAudience;
        }

        String getApplicationId() {
            return this.applicationId;
        }

        String getAuthId() {
            return this.authId;
        }

        boolean isRerequest() {
            return this.isRerequest;
        }

        void setRerequest(boolean z) {
            this.isRerequest = z;
        }

        String getDeviceRedirectUriString() {
            return this.deviceRedirectUriString;
        }

        void setDeviceRedirectUriString(String str) {
            this.deviceRedirectUriString = str;
        }

        boolean hasPublishPermission() {
            for (String a : this.permissions) {
                if (C1771d.m6121a(a)) {
                    return true;
                }
            }
            return false;
        }

        private Request(Parcel parcel) {
            boolean z = false;
            this.isRerequest = false;
            String readString = parcel.readString();
            DefaultAudience defaultAudience = null;
            this.loginBehavior = readString != null ? LoginBehavior.valueOf(readString) : null;
            Collection arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.permissions = new HashSet(arrayList);
            readString = parcel.readString();
            if (readString != null) {
                defaultAudience = DefaultAudience.valueOf(readString);
            }
            this.defaultAudience = defaultAudience;
            this.applicationId = parcel.readString();
            this.authId = parcel.readString();
            if (parcel.readByte() != (byte) 0) {
                z = true;
            }
            this.isRerequest = z;
            this.deviceRedirectUriString = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            String str = null;
            parcel.writeString(this.loginBehavior != 0 ? this.loginBehavior.name() : 0);
            parcel.writeStringList(new ArrayList(this.permissions));
            if (this.defaultAudience != 0) {
                str = this.defaultAudience.name();
            }
            parcel.writeString(str);
            parcel.writeString(this.applicationId);
            parcel.writeString(this.authId);
            parcel.writeByte((byte) this.isRerequest);
            parcel.writeString(this.deviceRedirectUriString);
        }
    }

    public static class Result implements Parcelable {
        public static final Creator<Result> CREATOR = new C17661();
        final Code code;
        final String errorCode;
        final String errorMessage;
        public Map<String, String> loggingExtras;
        final Request request;
        final AccessToken token;

        /* renamed from: com.facebook.login.LoginClient$Result$1 */
        static class C17661 implements Creator {
            C17661() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m6095a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m6096a(i);
            }

            /* renamed from: a */
            public Result m6095a(Parcel parcel) {
                return new Result(parcel);
            }

            /* renamed from: a */
            public Result[] m6096a(int i) {
                return new Result[i];
            }
        }

        enum Code {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            
            private final String loggingValue;

            private Code(String str) {
                this.loggingValue = str;
            }

            String getLoggingValue() {
                return this.loggingValue;
            }
        }

        public int describeContents() {
            return 0;
        }

        Result(Request request, Code code, AccessToken accessToken, String str, String str2) {
            C1749x.m6064a((Object) code, "code");
            this.request = request;
            this.token = accessToken;
            this.errorMessage = str;
            this.code = code;
            this.errorCode = str2;
        }

        static Result createTokenResult(Request request, AccessToken accessToken) {
            return new Result(request, Code.SUCCESS, accessToken, null, null);
        }

        static Result createCancelResult(Request request, String str) {
            return new Result(request, Code.CANCEL, null, str, null);
        }

        static Result createErrorResult(Request request, String str, String str2) {
            return createErrorResult(request, str, str2, null);
        }

        static Result createErrorResult(Request request, String str, String str2, String str3) {
            return new Result(request, Code.ERROR, null, TextUtils.join(": ", Utility.m5788b(str, str2)), str3);
        }

        private Result(Parcel parcel) {
            this.code = Code.valueOf(parcel.readString());
            this.token = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.errorMessage = parcel.readString();
            this.errorCode = parcel.readString();
            this.request = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.loggingExtras = Utility.m5769a(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.code.name());
            parcel.writeParcelable(this.token, i);
            parcel.writeString(this.errorMessage);
            parcel.writeString(this.errorCode);
            parcel.writeParcelable(this.request, i);
            Utility.m5773a(parcel, this.loggingExtras);
        }
    }

    /* renamed from: com.facebook.login.LoginClient$a */
    interface C1767a {
        /* renamed from: a */
        void mo1869a();

        /* renamed from: b */
        void mo1870b();
    }

    public int describeContents() {
        return 0;
    }

    public LoginClient(Fragment fragment) {
        this.fragment = fragment;
    }

    public Fragment getFragment() {
        return this.fragment;
    }

    void setFragment(Fragment fragment) {
        if (this.fragment != null) {
            throw new FacebookException("Can't set fragment once it is already set.");
        }
        this.fragment = fragment;
    }

    FragmentActivity getActivity() {
        return this.fragment.getActivity();
    }

    public Request getPendingRequest() {
        return this.pendingRequest;
    }

    public static int getLoginRequestCode() {
        return RequestCodeOffset.Login.toRequestCode();
    }

    void startOrContinueAuth(Request request) {
        if (!getInProgress()) {
            authorize(request);
        }
    }

    void authorize(Request request) {
        if (request != null) {
            if (this.pendingRequest != null) {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            } else if (!AccessToken.isCurrentAccessTokenActive() || checkInternetPermission()) {
                this.pendingRequest = request;
                this.handlersToTry = getHandlersToTry(request);
                tryNextHandler();
            }
        }
    }

    boolean getInProgress() {
        return this.pendingRequest != null && this.currentHandler >= 0;
    }

    void cancelCurrentHandler() {
        if (this.currentHandler >= 0) {
            getCurrentHandler().cancel();
        }
    }

    LoginMethodHandler getCurrentHandler() {
        return this.currentHandler >= 0 ? this.handlersToTry[this.currentHandler] : null;
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        return this.pendingRequest != null ? getCurrentHandler().onActivityResult(i, i2, intent) : false;
    }

    protected LoginMethodHandler[] getHandlersToTry(Request request) {
        ArrayList arrayList = new ArrayList();
        request = request.getLoginBehavior();
        if (request.allowsGetTokenAuth()) {
            arrayList.add(new GetTokenLoginMethodHandler(this));
        }
        if (request.allowsKatanaAuth()) {
            arrayList.add(new KatanaProxyLoginMethodHandler(this));
        }
        if (request.allowsFacebookLiteAuth()) {
            arrayList.add(new FacebookLiteLoginMethodHandler(this));
        }
        if (request.allowsCustomTabAuth()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (request.allowsWebViewAuth()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (request.allowsDeviceAuth() != null) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        request = new LoginMethodHandler[arrayList.size()];
        arrayList.toArray(request);
        return request;
    }

    boolean checkInternetPermission() {
        if (this.checkedInternetPermission) {
            return true;
        }
        if (checkPermission("android.permission.INTERNET") != 0) {
            Activity activity = getActivity();
            complete(Result.createErrorResult(this.pendingRequest, activity.getString(C1670e.com_facebook_internet_permission_error_title), activity.getString(C1670e.com_facebook_internet_permission_error_message)));
            return false;
        }
        this.checkedInternetPermission = true;
        return true;
    }

    void tryNextHandler() {
        if (this.currentHandler >= 0) {
            logAuthorizationMethodComplete(getCurrentHandler().getNameForLogging(), "skipped", null, null, getCurrentHandler().methodLoggingExtras);
        }
        while (this.handlersToTry != null && this.currentHandler < this.handlersToTry.length - 1) {
            this.currentHandler++;
            if (tryCurrentHandler()) {
                return;
            }
        }
        if (this.pendingRequest != null) {
            completeWithFailure();
        }
    }

    private void completeWithFailure() {
        complete(Result.createErrorResult(this.pendingRequest, "Login attempt failed.", null));
    }

    private void addLoggingExtra(String str, String str2, boolean z) {
        if (this.loggingExtras == null) {
            this.loggingExtras = new HashMap();
        }
        if (this.loggingExtras.containsKey(str) && z) {
            z = new StringBuilder();
            z.append((String) this.loggingExtras.get(str));
            z.append(",");
            z.append(str2);
            str2 = z.toString();
        }
        this.loggingExtras.put(str, str2);
    }

    boolean tryCurrentHandler() {
        LoginMethodHandler currentHandler = getCurrentHandler();
        if (!currentHandler.needsInternetPermission() || checkInternetPermission()) {
            boolean tryAuthorize = currentHandler.tryAuthorize(this.pendingRequest);
            if (tryAuthorize) {
                getLogger().m6104a(this.pendingRequest.getAuthId(), currentHandler.getNameForLogging());
            } else {
                getLogger().m6108b(this.pendingRequest.getAuthId(), currentHandler.getNameForLogging());
                addLoggingExtra("not_tried", currentHandler.getNameForLogging(), true);
            }
            return tryAuthorize;
        }
        addLoggingExtra("no_internet_permission", "1", false);
        return false;
    }

    void completeAndValidate(Result result) {
        if (result.token == null || !AccessToken.isCurrentAccessTokenActive()) {
            complete(result);
        } else {
            validateSameFbidAndFinish(result);
        }
    }

    void complete(Result result) {
        LoginMethodHandler currentHandler = getCurrentHandler();
        if (currentHandler != null) {
            logAuthorizationMethodComplete(currentHandler.getNameForLogging(), result, currentHandler.methodLoggingExtras);
        }
        if (this.loggingExtras != null) {
            result.loggingExtras = this.loggingExtras;
        }
        this.handlersToTry = null;
        this.currentHandler = -1;
        this.pendingRequest = null;
        this.loggingExtras = null;
        notifyOnCompleteListener(result);
    }

    OnCompletedListener getOnCompletedListener() {
        return this.onCompletedListener;
    }

    void setOnCompletedListener(OnCompletedListener onCompletedListener) {
        this.onCompletedListener = onCompletedListener;
    }

    C1767a getBackgroundProcessingListener() {
        return this.backgroundProcessingListener;
    }

    void setBackgroundProcessingListener(C1767a c1767a) {
        this.backgroundProcessingListener = c1767a;
    }

    int checkPermission(String str) {
        return getActivity().checkCallingOrSelfPermission(str);
    }

    void validateSameFbidAndFinish(Result result) {
        if (result.token == null) {
            throw new FacebookException("Can't validate without a token");
        }
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        AccessToken accessToken = result.token;
        if (!(currentAccessToken == null || accessToken == null)) {
            try {
                if (currentAccessToken.getUserId().equals(accessToken.getUserId())) {
                    result = Result.createTokenResult(this.pendingRequest, result.token);
                    complete(result);
                }
            } catch (Result result2) {
                complete(Result.createErrorResult(this.pendingRequest, "Caught exception", result2.getMessage()));
                return;
            }
        }
        result2 = Result.createErrorResult(this.pendingRequest, "User logged in as different Facebook user.", null);
        complete(result2);
    }

    private static AccessToken createFromTokenWithRefreshedPermissions(AccessToken accessToken, Collection<String> collection, Collection<String> collection2) {
        return new AccessToken(accessToken.getToken(), accessToken.getApplicationId(), accessToken.getUserId(), collection, collection2, accessToken.getSource(), accessToken.getExpires(), accessToken.getLastRefresh());
    }

    private C1769c getLogger() {
        if (this.loginLogger == null || !this.loginLogger.m6102a().equals(this.pendingRequest.getApplicationId())) {
            this.loginLogger = new C1769c(getActivity(), this.pendingRequest.getApplicationId());
        }
        return this.loginLogger;
    }

    private void notifyOnCompleteListener(Result result) {
        if (this.onCompletedListener != null) {
            this.onCompletedListener.onCompleted(result);
        }
    }

    void notifyBackgroundProcessingStart() {
        if (this.backgroundProcessingListener != null) {
            this.backgroundProcessingListener.mo1869a();
        }
    }

    void notifyBackgroundProcessingStop() {
        if (this.backgroundProcessingListener != null) {
            this.backgroundProcessingListener.mo1870b();
        }
    }

    private void logAuthorizationMethodComplete(String str, Result result, Map<String, String> map) {
        logAuthorizationMethodComplete(str, result.code.getLoggingValue(), result.errorMessage, result.errorCode, map);
    }

    private void logAuthorizationMethodComplete(String str, String str2, String str3, String str4, Map<String, String> map) {
        if (this.pendingRequest == null) {
            getLogger().m6105a("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            getLogger().m6106a(this.pendingRequest.getAuthId(), str, str2, str3, str4, map);
        }
    }

    static java.lang.String getE2E() {
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
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = "init";	 Catch:{ JSONException -> 0x000e }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ JSONException -> 0x000e }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x000e }
    L_0x000e:
        r0 = r0.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.getE2E():java.lang.String");
    }

    public LoginClient(Parcel parcel) {
        Parcelable[] readParcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        this.handlersToTry = new LoginMethodHandler[readParcelableArray.length];
        for (int i = 0; i < readParcelableArray.length; i++) {
            this.handlersToTry[i] = (LoginMethodHandler) readParcelableArray[i];
            this.handlersToTry[i].setLoginClient(this);
        }
        this.currentHandler = parcel.readInt();
        this.pendingRequest = (Request) parcel.readParcelable(Request.class.getClassLoader());
        this.loggingExtras = Utility.m5769a(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.handlersToTry, i);
        parcel.writeInt(this.currentHandler);
        parcel.writeParcelable(this.pendingRequest, i);
        Utility.m5773a(parcel, this.loggingExtras);
    }
}
