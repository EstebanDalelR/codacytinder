package com.tinder.managers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import com.android.volley.VolleyError;
import com.tinder.R;
import com.tinder.activities.ActivityBanned;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.performance.C8154t;
import com.tinder.api.EnvironmentProvider;
import com.tinder.api.JsonObjectRequestHeader;
import com.tinder.api.ManagerNetwork;
import com.tinder.api.ManagerWebServices;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.dialogs.ad;
import com.tinder.listeners.ListenerAgreeToWarningTerms;
import com.tinder.model.ReportNotification;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.json.JSONObject;

@Singleton
public class bf {
    /* renamed from: a */
    private final ManagerNetwork f32596a;
    /* renamed from: b */
    private final EnvironmentProvider f32597b;
    /* renamed from: c */
    private final C8154t f32598c;

    @Inject
    bf(ManagerNetwork managerNetwork, @NonNull C2630h c2630h, @NonNull EnvironmentProvider environmentProvider, @NonNull AbTestUtility abTestUtility) {
        this.f32596a = managerNetwork;
        this.f32597b = environmentProvider;
        this.f32598c = new C8154t(c2630h, abTestUtility);
    }

    @NonNull
    /* renamed from: a */
    public static ad m40502a(@NonNull Context context, ReportNotification reportNotification) {
        return new ad(context, reportNotification);
    }

    /* renamed from: a */
    public static void m40504a(@NonNull Activity activity) {
        Intent intent = new Intent(activity, ActivityBanned.class);
        intent.setFlags(1073741824);
        activity.startActivity(intent);
        activity.finish();
    }

    /* renamed from: a */
    public static String m40503a(@NonNull Context context, int i) {
        switch (i) {
            case 0:
                return context.getString(R.string.reported_reason_other);
            case 1:
                return context.getString(R.string.report_type_spam);
            case 2:
                return context.getString(R.string.report_type_offensive_messages);
            case 4:
                return context.getString(R.string.report_type_inappropriate_photos);
            case 5:
                return context.getString(R.string.report_type_bad_offline_behavior);
            default:
                return context.getString(R.string.reported_reason_other);
        }
    }

    /* renamed from: a */
    public void m40507a(@NonNull ListenerAgreeToWarningTerms listenerAgreeToWarningTerms) {
        this.f32596a.addRequest(new JsonObjectRequestHeader(1, ManagerWebServices.URL_REPORT_ACCEPT_WARNING, new JSONObject(), new bg(listenerAgreeToWarningTerms), new bh(listenerAgreeToWarningTerms), C2652a.a()));
    }

    /* renamed from: a */
    static final /* synthetic */ void m40506a(@NonNull ListenerAgreeToWarningTerms listenerAgreeToWarningTerms, JSONObject jSONObject) {
        com.tinder.utils.ad.a("agreeToTerms onResponse");
        if (jSONObject.optInt("status") == 200) {
            listenerAgreeToWarningTerms.onSucess();
        } else {
            listenerAgreeToWarningTerms.onFailure();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m40505a(@NonNull ListenerAgreeToWarningTerms listenerAgreeToWarningTerms, VolleyError volleyError) {
        com.tinder.utils.ad.c(volleyError.getMessage());
        listenerAgreeToWarningTerms.onFailure();
    }
}
