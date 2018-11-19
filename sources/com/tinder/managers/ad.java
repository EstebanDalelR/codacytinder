package com.tinder.managers;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.tinder.activities.WebViewActivityInstagram;
import com.tinder.api.EnvironmentProvider;
import com.tinder.api.ManagerWebServices;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.utils.C15367r;
import java.util.Locale;
import javax.inject.Inject;

public class ad {
    /* renamed from: a */
    private final ManagerWebServices f32588a;
    /* renamed from: b */
    private final ManagerProfile f32589b;
    /* renamed from: c */
    private final EnvironmentProvider f32590c;
    /* renamed from: d */
    private final C15193i f32591d;
    /* renamed from: e */
    private final UserMetaManager f32592e;

    @Inject
    public ad(ManagerWebServices managerWebServices, ManagerProfile managerProfile, EnvironmentProvider environmentProvider, C15193i c15193i, UserMetaManager userMetaManager) {
        this.f32588a = managerWebServices;
        this.f32589b = managerProfile;
        this.f32590c = environmentProvider;
        this.f32591d = c15193i;
        this.f32592e = userMetaManager;
    }

    /* renamed from: a */
    private String m40499a(@Nullable String str) {
        StringBuilder stringBuilder = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            stringBuilder.append("fbe=");
            stringBuilder.append(str);
        }
        if (this.f32589b.c() != null) {
            stringBuilder.append("&u=");
            stringBuilder.append(this.f32589b.c().getId());
        }
        if (this.f32591d.a() != null) {
            stringBuilder.append("&p=true");
        }
        str = this.f32592e.getMetaUser();
        if (str != null) {
            str = str.getUser();
            if (str != null) {
                str = str.getPhoneNumber();
                if (!TextUtils.isEmpty(str)) {
                    stringBuilder.append("&ph=");
                    stringBuilder.append(str);
                }
            }
        }
        stringBuilder.append("&d=Android");
        stringBuilder.append("&m=");
        stringBuilder.append(C15367r.c());
        stringBuilder.append("&os=");
        stringBuilder.append(VERSION.SDK_INT);
        stringBuilder.append("&ti=");
        stringBuilder.append(ManagerApp.c());
        stringBuilder.append("&loc=");
        stringBuilder.append(Locale.getDefault());
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public void m40500a(@NonNull Activity activity, @Nullable String str) {
        String str2 = ManagerWebServices.URL_FAQ;
        str = m40499a(str);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
        stringBuilder.append(str);
        str = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("faq url: ");
        stringBuilder2.append(str);
        com.tinder.utils.ad.a(stringBuilder2.toString());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        activity.startActivity(intent);
    }

    /* renamed from: a */
    public void m40501a(Fragment fragment) {
        if (fragment != null && fragment.getActivity() != null) {
            Intent intent = new Intent(fragment.getActivity(), WebViewActivityInstagram.class);
            intent.putExtra("url", m40498a());
            fragment.startActivityForResult(intent, 7);
        }
    }

    /* renamed from: a */
    private String m40498a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f32590c.getUrlBase());
        ManagerWebServices managerWebServices = this.f32588a;
        stringBuilder.append(ManagerWebServices.IG_LOGIN_URL);
        return stringBuilder.toString();
    }
}
