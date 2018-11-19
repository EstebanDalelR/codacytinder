package com.facebook.login;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.C4017g;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.C1680e;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.common.C1672a.C1668c;
import com.facebook.common.C1672a.C1669d;
import com.facebook.common.C1672a.C1670e;
import com.facebook.common.C1672a.C1671f;
import com.facebook.devicerequests.p057a.C1679a;
import com.facebook.internal.C1712j;
import com.facebook.internal.C1749x;
import com.facebook.internal.SmartLoginOption;
import com.facebook.internal.Utility;
import com.facebook.internal.Utility.C1688a;
import com.facebook.login.LoginClient.Request;
import com.spotify.sdk.android.authentication.AuthenticationRequest.QueryParams;
import com.tinder.api.ManagerWebServices;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class DeviceAuthDialog extends C4017g {
    /* renamed from: a */
    private ProgressBar f14290a;
    /* renamed from: b */
    private TextView f14291b;
    /* renamed from: c */
    private TextView f14292c;
    /* renamed from: d */
    private DeviceAuthMethodHandler f14293d;
    /* renamed from: e */
    private AtomicBoolean f14294e = new AtomicBoolean();
    /* renamed from: f */
    private volatile C1680e f14295f;
    /* renamed from: g */
    private volatile ScheduledFuture f14296g;
    /* renamed from: h */
    private volatile RequestState f14297h;
    /* renamed from: i */
    private Dialog f14298i;
    /* renamed from: j */
    private boolean f14299j = false;
    /* renamed from: k */
    private boolean f14300k = false;
    /* renamed from: l */
    private Request f14301l = null;

    /* renamed from: com.facebook.login.DeviceAuthDialog$2 */
    class C17552 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ DeviceAuthDialog f4842a;

        C17552(DeviceAuthDialog deviceAuthDialog) {
            this.f4842a = deviceAuthDialog;
        }

        public void onClick(View view) {
            this.f4842a.m17778d();
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$3 */
    class C17563 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ DeviceAuthDialog f4843a;

        C17563(DeviceAuthDialog deviceAuthDialog) {
            this.f4843a = deviceAuthDialog;
        }

        public void run() {
            this.f4843a.m17760a();
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$5 */
    class C17575 implements DialogInterface.OnClickListener {
        /* renamed from: a */
        final /* synthetic */ DeviceAuthDialog f4844a;

        C17575(DeviceAuthDialog deviceAuthDialog) {
            this.f4844a = deviceAuthDialog;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f4844a.f14298i.setContentView(this.f4844a.m17759a((boolean) 0));
            this.f4844a.m17784a(this.f4844a.f14301l);
        }
    }

    private static class RequestState implements Parcelable {
        public static final Creator<RequestState> CREATOR = new C17591();
        private String authorizationUri;
        private long interval;
        private long lastPoll;
        private String requestCode;
        private String userCode;

        /* renamed from: com.facebook.login.DeviceAuthDialog$RequestState$1 */
        static class C17591 implements Creator<RequestState> {
            C17591() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m6081a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m6082a(i);
            }

            /* renamed from: a */
            public RequestState m6081a(Parcel parcel) {
                return new RequestState(parcel);
            }

            /* renamed from: a */
            public RequestState[] m6082a(int i) {
                return new RequestState[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        RequestState() {
        }

        public String getAuthorizationUri() {
            return this.authorizationUri;
        }

        public String getUserCode() {
            return this.userCode;
        }

        public void setUserCode(String str) {
            this.userCode = str;
            this.authorizationUri = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", new Object[]{str});
        }

        public String getRequestCode() {
            return this.requestCode;
        }

        public void setRequestCode(String str) {
            this.requestCode = str;
        }

        public long getInterval() {
            return this.interval;
        }

        public void setInterval(long j) {
            this.interval = j;
        }

        public void setLastPoll(long j) {
            this.lastPoll = j;
        }

        protected RequestState(Parcel parcel) {
            this.userCode = parcel.readString();
            this.requestCode = parcel.readString();
            this.interval = parcel.readLong();
            this.lastPoll = parcel.readLong();
        }

        public boolean withinLastRefreshWindow() {
            boolean z = false;
            if (this.lastPoll == 0) {
                return false;
            }
            if ((new Date().getTime() - this.lastPoll) - (this.interval * 1000) < 0) {
                z = true;
            }
            return z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.userCode);
            parcel.writeString(this.requestCode);
            parcel.writeLong(this.interval);
            parcel.writeLong(this.lastPoll);
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$1 */
    class C34241 implements Callback {
        /* renamed from: a */
        final /* synthetic */ DeviceAuthDialog f10410a;

        C34241(DeviceAuthDialog deviceAuthDialog) {
            this.f10410a = deviceAuthDialog;
        }

        public void onCompleted(GraphResponse graphResponse) {
            if (!this.f10410a.f14299j) {
                if (graphResponse.m4092a() != null) {
                    this.f10410a.m17761a(graphResponse.m4092a().getException());
                    return;
                }
                graphResponse = graphResponse.m4093b();
                RequestState requestState = new RequestState();
                try {
                    requestState.setUserCode(graphResponse.getString("user_code"));
                    requestState.setRequestCode(graphResponse.getString("code"));
                    requestState.setInterval(graphResponse.getLong("interval"));
                    this.f10410a.m17762a(requestState);
                } catch (Throwable e) {
                    this.f10410a.m17761a(new FacebookException(e));
                }
            }
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$4 */
    class C34254 implements Callback {
        /* renamed from: a */
        final /* synthetic */ DeviceAuthDialog f10411a;

        C34254(DeviceAuthDialog deviceAuthDialog) {
            this.f10411a = deviceAuthDialog;
        }

        public void onCompleted(GraphResponse graphResponse) {
            if (!this.f10411a.f14294e.get()) {
                FacebookRequestError a = graphResponse.m4092a();
                if (a != null) {
                    int subErrorCode = a.getSubErrorCode();
                    if (subErrorCode != 1349152) {
                        switch (subErrorCode) {
                            case 1349172:
                            case 1349174:
                                this.f10411a.m17772b();
                                break;
                            case 1349173:
                                break;
                            default:
                                this.f10411a.m17761a(graphResponse.m4092a().getException());
                                break;
                        }
                    }
                    this.f10411a.m17778d();
                    return;
                }
                try {
                    this.f10411a.m17768a(graphResponse.m4093b().getString("access_token"));
                } catch (Throwable e) {
                    this.f10411a.m17761a(new FacebookException(e));
                }
            }
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f14293d = (DeviceAuthMethodHandler) ((C4207b) ((FacebookActivity) getActivity()).m18642b()).m16662b().getCurrentHandler();
        if (bundle != null) {
            RequestState requestState = (RequestState) bundle.getParcelable("request_state");
            if (requestState != null) {
                m17762a(requestState);
            }
        }
        return layoutInflater;
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        this.f14298i = new Dialog(getActivity(), C1671f.com_facebook_auth_dialog);
        boolean z = (C1679a.m5683b() == null || this.f14300k != null) ? null : true;
        this.f14298i.setContentView(m17759a(z));
        return this.f14298i;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f14299j == null) {
            m17778d();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f14297h != null) {
            bundle.putParcelable("request_state", this.f14297h);
        }
    }

    public void onDestroy() {
        this.f14299j = true;
        this.f14294e.set(true);
        super.onDestroy();
        if (this.f14295f != null) {
            this.f14295f.cancel(true);
        }
        if (this.f14296g != null) {
            this.f14296g.cancel(true);
        }
    }

    /* renamed from: a */
    public void m17784a(Request request) {
        this.f14301l = request;
        Bundle bundle = new Bundle();
        bundle.putString(QueryParams.SCOPE, TextUtils.join(",", request.getPermissions()));
        request = request.getDeviceRedirectUriString();
        if (request != null) {
            bundle.putString(QueryParams.REDIRECT_URI, request);
        }
        request = new StringBuilder();
        request.append(C1749x.m6067b());
        request.append("|");
        request.append(C1749x.m6071c());
        bundle.putString("access_token", request.toString());
        bundle.putString("device_info", C1679a.m5680a());
        new GraphRequest(null, "device/login", bundle, HttpMethod.POST, new C34241(this)).m4066j();
    }

    /* renamed from: a */
    private void m17762a(RequestState requestState) {
        this.f14297h = requestState;
        this.f14291b.setText(requestState.getUserCode());
        this.f14292c.setCompoundDrawablesWithIntrinsicBounds(null, new BitmapDrawable(getResources(), C1679a.m5682b(requestState.getAuthorizationUri())), null, null);
        this.f14291b.setVisibility(0);
        this.f14290a.setVisibility(8);
        if (!this.f14300k && C1679a.m5681a(requestState.getUserCode())) {
            AppEventsLogger.newLogger(getContext()).logSdkEvent("fb_smart_login_service", null, null);
        }
        if (requestState.withinLastRefreshWindow() != null) {
            m17772b();
        } else {
            m17760a();
        }
    }

    /* renamed from: a */
    private View m17759a(boolean z) {
        LayoutInflater layoutInflater = getActivity().getLayoutInflater();
        if (z) {
            z = layoutInflater.inflate(C1669d.com_facebook_smart_device_dialog_fragment, null);
        } else {
            z = layoutInflater.inflate(C1669d.com_facebook_device_auth_dialog_fragment, null);
        }
        this.f14290a = (ProgressBar) z.findViewById(C1668c.progress_bar);
        this.f14291b = (TextView) z.findViewById(C1668c.confirmation_code);
        ((Button) z.findViewById(C1668c.cancel_button)).setOnClickListener(new C17552(this));
        this.f14292c = (TextView) z.findViewById(C1668c.com_facebook_device_auth_instructions);
        this.f14292c.setText(Html.fromHtml(getString(C1670e.com_facebook_device_auth_instructions)));
        return z;
    }

    /* renamed from: a */
    private void m17760a() {
        this.f14297h.setLastPoll(new Date().getTime());
        this.f14295f = m17775c().m4066j();
    }

    /* renamed from: b */
    private void m17772b() {
        this.f14296g = DeviceAuthMethodHandler.getBackgroundExecutor().schedule(new C17563(this), this.f14297h.getInterval(), TimeUnit.SECONDS);
    }

    /* renamed from: c */
    private GraphRequest m17775c() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.f14297h.getRequestCode());
        return new GraphRequest(null, "device/login_status", bundle, HttpMethod.POST, new C34254(this));
    }

    /* renamed from: a */
    private void m17770a(final String str, final C1688a c1688a, final String str2, String str3) {
        CharSequence string = getResources().getString(C1670e.com_facebook_smart_login_confirmation_title);
        String string2 = getResources().getString(C1670e.com_facebook_smart_login_confirmation_continue_as);
        CharSequence string3 = getResources().getString(C1670e.com_facebook_smart_login_confirmation_cancel);
        str3 = String.format(string2, new Object[]{str3});
        Builder builder = new Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(str3, new DialogInterface.OnClickListener(this) {
            /* renamed from: d */
            final /* synthetic */ DeviceAuthDialog f4848d;

            public void onClick(DialogInterface dialogInterface, int i) {
                this.f4848d.m17769a(str, c1688a, str2);
            }
        }).setPositiveButton(string3, new C17575(this));
        builder.create().show();
    }

    /* renamed from: a */
    private void m17768a(final String str) {
        Bundle bundle = new Bundle();
        bundle.putString(ManagerWebServices.FB_PARAM_BATCH_FIELDS, "id,permissions,name");
        new GraphRequest(new AccessToken(str, FacebookSdk.m3998i(), "0", null, null, null, null, null), "me", bundle, HttpMethod.GET, new Callback(this) {
            /* renamed from: b */
            final /* synthetic */ DeviceAuthDialog f10413b;

            public void onCompleted(GraphResponse graphResponse) {
                if (!this.f10413b.f14294e.get()) {
                    if (graphResponse.m4092a() != null) {
                        this.f10413b.m17761a(graphResponse.m4092a().getException());
                        return;
                    }
                    try {
                        JSONObject b = graphResponse.m4093b();
                        String string = b.getString("id");
                        C1688a a = Utility.m5751a(b);
                        graphResponse = b.getString("name");
                        C1679a.m5684c(this.f10413b.f14297h.getUserCode());
                        if (!C1712j.m5907a(FacebookSdk.m3998i()).m5902g().contains(SmartLoginOption.RequireConfirm) || this.f10413b.f14300k) {
                            this.f10413b.m17769a(string, a, str);
                            return;
                        }
                        this.f10413b.f14300k = true;
                        this.f10413b.m17770a(string, a, str, (String) graphResponse);
                    } catch (Throwable e) {
                        this.f10413b.m17761a(new FacebookException(e));
                    }
                }
            }
        }).m4066j();
    }

    /* renamed from: a */
    private void m17769a(String str, C1688a c1688a, String str2) {
        this.f14293d.onSuccess(str2, FacebookSdk.m3998i(), str, c1688a.m5745a(), c1688a.m5746b(), AccessTokenSource.DEVICE_AUTH, null, null);
        this.f14298i.dismiss();
    }

    /* renamed from: a */
    private void m17761a(FacebookException facebookException) {
        if (this.f14294e.compareAndSet(false, true)) {
            if (this.f14297h != null) {
                C1679a.m5684c(this.f14297h.getUserCode());
            }
            this.f14293d.onError(facebookException);
            this.f14298i.dismiss();
        }
    }

    /* renamed from: d */
    private void m17778d() {
        if (this.f14294e.compareAndSet(false, true)) {
            if (this.f14297h != null) {
                C1679a.m5684c(this.f14297h.getUserCode());
            }
            if (this.f14293d != null) {
                this.f14293d.onCancel();
            }
            this.f14298i.dismiss();
        }
    }
}
