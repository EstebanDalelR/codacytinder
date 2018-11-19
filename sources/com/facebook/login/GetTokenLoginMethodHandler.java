package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.PlatformServiceClient.CompletedListener;
import com.facebook.internal.Utility;
import com.facebook.internal.Utility.GraphMeRequestWithCacheCallback;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONObject;

class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public static final Creator<GetTokenLoginMethodHandler> CREATOR = new C17623();
    private C3431a getTokenClient;

    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$3 */
    static class C17623 implements Creator {
        C17623() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6087a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6088a(i);
        }

        /* renamed from: a */
        public GetTokenLoginMethodHandler m6087a(Parcel parcel) {
            return new GetTokenLoginMethodHandler(parcel);
        }

        /* renamed from: a */
        public GetTokenLoginMethodHandler[] m6088a(int i) {
            return new GetTokenLoginMethodHandler[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    String getNameForLogging() {
        return "get_token";
    }

    GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    void cancel() {
        if (this.getTokenClient != null) {
            this.getTokenClient.m5744b();
            this.getTokenClient.m5742a(null);
            this.getTokenClient = null;
        }
    }

    boolean tryAuthorize(final Request request) {
        this.getTokenClient = new C3431a(this.loginClient.getActivity(), request.getApplicationId());
        if (!this.getTokenClient.m5743a()) {
            return null;
        }
        this.loginClient.notifyBackgroundProcessingStart();
        this.getTokenClient.m5742a(new CompletedListener(this) {
            /* renamed from: b */
            final /* synthetic */ GetTokenLoginMethodHandler f10415b;

            public void completed(Bundle bundle) {
                this.f10415b.getTokenCompleted(request, bundle);
            }
        });
        return true;
    }

    void getTokenCompleted(Request request, Bundle bundle) {
        if (this.getTokenClient != null) {
            this.getTokenClient.m5742a(null);
        }
        this.getTokenClient = null;
        this.loginClient.notifyBackgroundProcessingStop();
        if (bundle != null) {
            ArrayList stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Object<String> permissions = request.getPermissions();
            if (stringArrayList == null || !(permissions == null || stringArrayList.containsAll(permissions))) {
                bundle = new HashSet();
                for (String str : permissions) {
                    if (!stringArrayList.contains(str)) {
                        bundle.add(str);
                    }
                }
                if (!bundle.isEmpty()) {
                    addLoggingExtra("new_permissions", TextUtils.join(",", bundle));
                }
                request.setPermissions(bundle);
            } else {
                complete(request, bundle);
                return;
            }
        }
        this.loginClient.tryNextHandler();
    }

    void onComplete(Request request, Bundle bundle) {
        this.loginClient.completeAndValidate(Result.createTokenResult(this.loginClient.getPendingRequest(), LoginMethodHandler.createAccessTokenFromNativeLogin(bundle, AccessTokenSource.FACEBOOK_APPLICATION_SERVICE, request.getApplicationId())));
    }

    void complete(final Request request, final Bundle bundle) {
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (string != null) {
            if (!string.isEmpty()) {
                onComplete(request, bundle);
                return;
            }
        }
        this.loginClient.notifyBackgroundProcessingStart();
        Utility.m5776a(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), new GraphMeRequestWithCacheCallback(this) {
            /* renamed from: c */
            final /* synthetic */ GetTokenLoginMethodHandler f10418c;

            public void onSuccess(JSONObject jSONObject) {
                try {
                    bundle.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString("id"));
                    this.f10418c.onComplete(request, bundle);
                } catch (JSONObject jSONObject2) {
                    this.f10418c.loginClient.complete(Result.createErrorResult(this.f10418c.loginClient.getPendingRequest(), "Caught exception", jSONObject2.getMessage()));
                }
            }

            public void onFailure(FacebookException facebookException) {
                this.f10418c.loginClient.complete(Result.createErrorResult(this.f10418c.loginClient.getPendingRequest(), "Caught exception", facebookException.getMessage()));
            }
        });
    }

    GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
