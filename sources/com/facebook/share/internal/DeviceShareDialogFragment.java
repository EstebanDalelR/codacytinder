package com.facebook.share.internal;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.C4017g;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.HttpMethod;
import com.facebook.common.C1672a.C1668c;
import com.facebook.common.C1672a.C1669d;
import com.facebook.common.C1672a.C1670e;
import com.facebook.common.C1672a.C1671f;
import com.facebook.devicerequests.p057a.C1679a;
import com.facebook.internal.C1749x;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DeviceShareDialogFragment extends C4017g {
    /* renamed from: f */
    private static ScheduledThreadPoolExecutor f14302f;
    /* renamed from: a */
    private ProgressBar f14303a;
    /* renamed from: b */
    private TextView f14304b;
    /* renamed from: c */
    private Dialog f14305c;
    /* renamed from: d */
    private volatile RequestState f14306d;
    /* renamed from: e */
    private volatile ScheduledFuture f14307e;
    /* renamed from: g */
    private ShareContent f14308g;

    /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$1 */
    class C18151 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ DeviceShareDialogFragment f4968a;

        C18151(DeviceShareDialogFragment deviceShareDialogFragment) {
            this.f4968a = deviceShareDialogFragment;
        }

        public void onClick(View view) {
            this.f4968a.f14305c.dismiss();
        }
    }

    /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$3 */
    class C18163 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ DeviceShareDialogFragment f4969a;

        C18163(DeviceShareDialogFragment deviceShareDialogFragment) {
            this.f4969a = deviceShareDialogFragment;
        }

        public void run() {
            this.f4969a.f14305c.dismiss();
        }
    }

    private static class RequestState implements Parcelable {
        public static final Creator<RequestState> CREATOR = new C18171();
        private long expiresIn;
        private String userCode;

        /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$RequestState$1 */
        static class C18171 implements Creator<RequestState> {
            C18171() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m6261a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m6262a(i);
            }

            /* renamed from: a */
            public RequestState m6261a(Parcel parcel) {
                return new RequestState(parcel);
            }

            /* renamed from: a */
            public RequestState[] m6262a(int i) {
                return new RequestState[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        RequestState() {
        }

        public String getUserCode() {
            return this.userCode;
        }

        public void setUserCode(String str) {
            this.userCode = str;
        }

        public long getExpiresIn() {
            return this.expiresIn;
        }

        public void setExpiresIn(long j) {
            this.expiresIn = j;
        }

        protected RequestState(Parcel parcel) {
            this.userCode = parcel.readString();
            this.expiresIn = parcel.readLong();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.userCode);
            parcel.writeLong(this.expiresIn);
        }
    }

    /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$2 */
    class C34472 implements Callback {
        /* renamed from: a */
        final /* synthetic */ DeviceShareDialogFragment f10454a;

        C34472(DeviceShareDialogFragment deviceShareDialogFragment) {
            this.f10454a = deviceShareDialogFragment;
        }

        public void onCompleted(com.facebook.GraphResponse r5) {
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
            r4 = this;
            r0 = r5.m4092a();
            if (r0 == 0) goto L_0x000c;
        L_0x0006:
            r5 = r4.f10454a;
            r5.m17788a(r0);
            return;
        L_0x000c:
            r5 = r5.m4093b();
            r0 = new com.facebook.share.internal.DeviceShareDialogFragment$RequestState;
            r0.<init>();
            r1 = "user_code";	 Catch:{ JSONException -> 0x002d }
            r1 = r5.getString(r1);	 Catch:{ JSONException -> 0x002d }
            r0.setUserCode(r1);	 Catch:{ JSONException -> 0x002d }
            r1 = "expires_in";	 Catch:{ JSONException -> 0x002d }
            r1 = r5.getLong(r1);	 Catch:{ JSONException -> 0x002d }
            r0.setExpiresIn(r1);	 Catch:{ JSONException -> 0x002d }
            r5 = r4.f10454a;
            r5.m17789a(r0);
            return;
        L_0x002d:
            r5 = r4.f10454a;
            r0 = new com.facebook.FacebookRequestError;
            r1 = 0;
            r2 = "";
            r3 = "Malformed server response";
            r0.<init>(r1, r2, r3);
            r5.m17788a(r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.DeviceShareDialogFragment.2.onCompleted(com.facebook.GraphResponse):void");
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle != null) {
            RequestState requestState = (RequestState) bundle.getParcelable("request_state");
            if (requestState != null) {
                m17789a(requestState);
            }
        }
        return layoutInflater;
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        this.f14305c = new Dialog(getActivity(), C1671f.com_facebook_auth_dialog);
        bundle = getActivity().getLayoutInflater().inflate(C1669d.com_facebook_device_auth_dialog_fragment, null);
        this.f14303a = (ProgressBar) bundle.findViewById(C1668c.progress_bar);
        this.f14304b = (TextView) bundle.findViewById(C1668c.confirmation_code);
        ((Button) bundle.findViewById(C1668c.cancel_button)).setOnClickListener(new C18151(this));
        ((TextView) bundle.findViewById(C1668c.com_facebook_device_auth_instructions)).setText(Html.fromHtml(getString(C1670e.com_facebook_device_auth_instructions)));
        this.f14305c.setContentView(bundle);
        m17793c();
        return this.f14305c;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f14307e != null) {
            this.f14307e.cancel(true);
        }
        m17787a(-1, new Intent());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f14306d != null) {
            bundle.putParcelable("request_state", this.f14306d);
        }
    }

    /* renamed from: a */
    private void m17787a(int i, Intent intent) {
        if (this.f14306d != null) {
            C1679a.m5684c(this.f14306d.getUserCode());
        }
        FacebookRequestError facebookRequestError = (FacebookRequestError) intent.getParcelableExtra("error");
        if (facebookRequestError != null) {
            Toast.makeText(getContext(), facebookRequestError.getErrorMessage(), 0).show();
        }
        if (isAdded()) {
            Activity activity = getActivity();
            activity.setResult(i, intent);
            activity.finish();
        }
    }

    /* renamed from: a */
    private void m17786a() {
        if (isAdded()) {
            getFragmentManager().mo429a().mo404a((Fragment) this).mo410c();
        }
    }

    /* renamed from: a */
    public void m17795a(ShareContent shareContent) {
        this.f14308g = shareContent;
    }

    /* renamed from: b */
    private Bundle m17792b() {
        ShareContent shareContent = this.f14308g;
        if (shareContent == null) {
            return null;
        }
        if (shareContent instanceof ShareLinkContent) {
            return C1839j.m6477a((ShareLinkContent) shareContent);
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            return C1839j.m6478a((ShareOpenGraphContent) shareContent);
        }
        return null;
    }

    /* renamed from: c */
    private void m17793c() {
        Bundle b = m17792b();
        if (b == null || b.size() == 0) {
            m17788a(new FacebookRequestError(0, "", "Failed to get share content"));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C1749x.m6067b());
        stringBuilder.append("|");
        stringBuilder.append(C1749x.m6071c());
        b.putString("access_token", stringBuilder.toString());
        b.putString("device_info", C1679a.m5680a());
        new GraphRequest(null, "device/share", b, HttpMethod.POST, new C34472(this)).m4066j();
    }

    /* renamed from: a */
    private void m17788a(FacebookRequestError facebookRequestError) {
        m17786a();
        Intent intent = new Intent();
        intent.putExtra("error", facebookRequestError);
        m17787a(-1, intent);
    }

    /* renamed from: d */
    private static synchronized ScheduledThreadPoolExecutor m17794d() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceShareDialogFragment.class) {
            if (f14302f == null) {
                f14302f = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f14302f;
        }
        return scheduledThreadPoolExecutor;
    }

    /* renamed from: a */
    private void m17789a(RequestState requestState) {
        this.f14306d = requestState;
        this.f14304b.setText(requestState.getUserCode());
        this.f14304b.setVisibility(0);
        this.f14303a.setVisibility(8);
        this.f14307e = m17794d().schedule(new C18163(this), requestState.getExpiresIn(), TimeUnit.SECONDS);
    }
}
