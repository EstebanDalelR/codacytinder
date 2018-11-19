package com.tinder.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.adapters.C6173b;
import com.tinder.api.ManagerNetwork;
import com.tinder.interfaces.PhotoUploadSelection;
import com.tinder.managers.FacebookManager;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerApp;
import com.tinder.usecase.C17223f;
import com.tinder.utils.RxUtils;
import com.tinder.utils.ad;
import javax.inject.Inject;
import org.json.JSONObject;
import p000a.p001a.C0001a;
import rx.Subscription;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

/* renamed from: com.tinder.fragments.q */
public class C13310q extends Fragment implements OnClickListener {
    @Inject
    /* renamed from: a */
    FacebookManager f42242a;
    @Inject
    /* renamed from: b */
    ManagerNetwork f42243b;
    @Inject
    /* renamed from: c */
    LegacyBreadCrumbTracker f42244c;
    @Inject
    /* renamed from: d */
    C17223f f42245d;
    /* renamed from: e */
    private ProgressBar f42246e;
    /* renamed from: f */
    private ListView f42247f;
    /* renamed from: g */
    private TextView f42248g;
    /* renamed from: h */
    private C6173b f42249h;
    /* renamed from: i */
    private String f42250i;
    @Nullable
    /* renamed from: j */
    private String f42251j;
    /* renamed from: k */
    private Subscription f42252k;

    /* renamed from: a */
    final /* synthetic */ void m51542a(JSONObject jSONObject) {
        m51538b(jSONObject);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        ManagerApp.e().inject(this);
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ad.a();
        super.onCreateView(layoutInflater, viewGroup, bundle);
        layoutInflater = layoutInflater.inflate(R.layout.view_albums, viewGroup, false);
        this.f42246e = (ProgressBar) layoutInflater.findViewById(R.id.progress);
        this.f42248g = (TextView) layoutInflater.findViewById(R.id.txt_no_albums);
        this.f42247f = (ListView) layoutInflater.findViewById(R.id.listview_albums);
        if (this.f42249h == null) {
            this.f42249h = new C6173b(getActivity());
        }
        this.f42247f.setAdapter(this.f42249h);
        if (this.f42249h.isEmpty() == null) {
            this.f42246e.setVisibility(8);
        }
        this.f42251j = FacebookManager.m40462a();
        this.f42250i = FacebookManager.m40469b(this.f42251j);
        return layoutInflater;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m51539a();
    }

    public void onResume() {
        super.onResume();
        this.f42244c.m40475a((Fragment) this);
    }

    public void onDestroyView() {
        super.onDestroyView();
        RxUtils.b(this.f42252k);
    }

    /* renamed from: a */
    public void m51539a() {
        this.f42248g.setVisibility(8);
        this.f42252k = this.f42245d.a(this.f42250i).b(Schedulers.io()).a(C19397a.a()).a(new C14029r(this), new C14030s(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m51541a(Throwable th) {
        C0001a.c(th);
        this.f42246e.setVisibility(8);
        this.f42248g.setVisibility(0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private void m51538b(@android.support.annotation.NonNull org.json.JSONObject r6) {
        /*
        r5 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = 8;
        r2 = 0;
        r3 = 0;
        r4 = r5.f42251j;	 Catch:{ JSONException -> 0x0034 }
        r4 = com.tinder.p257g.C9645b.m40035a(r6, r4);	 Catch:{ JSONException -> 0x0034 }
        r0.addAll(r4);	 Catch:{ JSONException -> 0x0034 }
        r6 = com.tinder.p257g.C9645b.m40034a(r6);	 Catch:{ JSONException -> 0x0034 }
        r3 = r5.f42249h;
        r3.a(r0);
        r0 = r6.id;
        if (r0 == 0) goto L_0x0024;
    L_0x001f:
        r0 = r5.f42249h;
        r0.a(r6, r2);
    L_0x0024:
        r6 = r5.f42246e;
        r6.setVisibility(r1);
        r6 = r5.f42249h;
        r6 = r6.getCount();
        if (r6 != 0) goto L_0x0058;
    L_0x0031:
        goto L_0x0057;
    L_0x0032:
        r6 = move-exception;
        goto L_0x0061;
    L_0x0034:
        r6 = move-exception;
        r6 = r6.getMessage();	 Catch:{ all -> 0x0032 }
        com.tinder.utils.ad.c(r6);	 Catch:{ all -> 0x0032 }
        r6 = r5.f42249h;
        r6.a(r0);
        r6 = r3.id;
        if (r6 == 0) goto L_0x004a;
    L_0x0045:
        r6 = r5.f42249h;
        r6.a(r3, r2);
    L_0x004a:
        r6 = r5.f42246e;
        r6.setVisibility(r1);
        r6 = r5.f42249h;
        r6 = r6.getCount();
        if (r6 != 0) goto L_0x0058;
    L_0x0057:
        r1 = 0;
    L_0x0058:
        r6 = r5.f42248g;
        r6.setVisibility(r1);
        r5.m51537b();
        return;
    L_0x0061:
        r4 = r5.f42249h;
        r4.a(r0);
        r0 = r3.id;
        if (r0 == 0) goto L_0x006f;
    L_0x006a:
        r0 = r5.f42249h;
        r0.a(r3, r2);
    L_0x006f:
        r0 = r5.f42246e;
        r0.setVisibility(r1);
        r0 = r5.f42249h;
        r0 = r0.getCount();
        if (r0 != 0) goto L_0x007d;
    L_0x007c:
        r1 = 0;
    L_0x007d:
        r0 = r5.f42248g;
        r0.setVisibility(r1);
        r5.m51537b();
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.fragments.q.b(org.json.JSONObject):void");
    }

    /* renamed from: b */
    private void m51537b() {
        this.f42247f.setOnItemClickListener(new C9639t(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m51540a(AdapterView adapterView, View view, int i, long j) {
        ((PhotoUploadSelection) getActivity()).showPhotos(this.f42249h.a(i).id, this.f42249h.a(i).name);
    }

    public void onClick(View view) {
        getActivity().onBackPressed();
    }
}
