package com.tinder.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tinder.R;
import com.tinder.common.view.extension.C8581b;
import com.tinder.common.view.extension.C8583c;
import com.tinder.managers.LegacyBreadCrumbTracker;
import com.tinder.managers.ManagerApp;
import javax.inject.Inject;

public class ap extends Fragment {
    @Inject
    /* renamed from: a */
    LegacyBreadCrumbTracker f42210a;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.fragment_view_gif, viewGroup, false);
        viewGroup = getArguments().getString("url");
        if (viewGroup != null) {
            ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.giphy);
            C8581b.m36602a(imageView, viewGroup, viewGroup2.findViewById(R.id.progress), new C8583c());
            imageView.setOnClickListener(new aq(this));
        }
        return viewGroup2;
    }

    /* renamed from: a */
    final /* synthetic */ void m51514a(View view) {
        getActivity().finish();
    }

    public void onResume() {
        super.onResume();
        this.f42210a.m40475a((Fragment) this);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        ManagerApp.e().inject(this);
    }
}
