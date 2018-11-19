package com.tinder.chat.view;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.R;
import com.tinder.chat.analytics.C10532i;
import com.tinder.chat.analytics.C10532i.C8429a;
import com.tinder.chat.presenter.C8442a;
import com.tinder.common.p076a.C2640a;
import com.tinder.deadshot.Deadshot;
import com.tinder.dialogs.aa;
import com.tinder.dialogs.aj;
import com.tinder.domain.match.model.CoreMatch;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.MessageAdMatch;
import com.tinder.domain.match.model.PlacesMatch;
import com.tinder.enums.ReportCause;
import com.tinder.listeners.ListenerReportUser;
import com.tinder.listeners.OnUnMatchReasonSelectedListener;
import com.tinder.managers.ManagerApp;
import com.tinder.match.analytics.recommend.AddDeeplinkShareIdEvent;
import com.tinder.profile.dialogs.CensorMenuDialog;
import com.tinder.profile.dialogs.CensorMenuDialog.CensorMenuDialogListener;
import com.tinder.profile.dialogs.CensorMenuDialog.MenuItem;
import com.tinder.profile.model.Profile;
import com.tinder.profile.p363b.C16093z;
import com.tinder.profile.p365d.C14398a;
import com.tinder.targets.CensorTarget;
import com.tinder.utils.at;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;

@Deprecated
public class CensorOverflowMenu extends AppCompatImageButton implements CensorTarget {
    @Inject
    /* renamed from: a */
    C8442a f41071a;
    @Inject
    /* renamed from: b */
    C10532i f41072b;
    @Inject
    /* renamed from: c */
    C16093z f41073c;
    @Inject
    /* renamed from: d */
    AddDeeplinkShareIdEvent f41074d;
    @Nullable
    /* renamed from: e */
    private aa f41075e;
    /* renamed from: f */
    private Set<MenuItem> f41076f;
    /* renamed from: g */
    private Match f41077g;
    /* renamed from: h */
    private Profile f41078h;
    /* renamed from: i */
    private boolean f41079i;
    /* renamed from: j */
    private Listener f41080j;
    /* renamed from: k */
    private final OnUnMatchReasonSelectedListener f41081k = new C105791(this);
    /* renamed from: l */
    private final ListenerReportUser f41082l = new C105802(this);
    /* renamed from: m */
    private final CensorMenuDialogListener f41083m = new C105813(this);

    public interface Listener {
        void onDeleteSponsoredMessageClick(MessageAdMatch messageAdMatch);
    }

    /* renamed from: com.tinder.chat.view.CensorOverflowMenu$1 */
    class C105791 implements OnUnMatchReasonSelectedListener {
        /* renamed from: a */
        final /* synthetic */ CensorOverflowMenu f34325a;

        C105791(CensorOverflowMenu censorOverflowMenu) {
            this.f34325a = censorOverflowMenu;
        }

        public void onUnMatchReasonSelected(ReportCause reportCause, String str) {
            C2640a.a(this.f34325a.f41077g, "Match is not bound for CensorOverflowMenu to unMatch.");
            this.f34325a.f41071a.m36060b(this.f34325a.f41077g.getId(), this.f34325a.m50123c(this.f34325a.f41077g), this.f34325a.m50124d(this.f34325a.f41077g), this.f34325a.f41077g.getAttribution(), reportCause, str);
        }
    }

    /* renamed from: com.tinder.chat.view.CensorOverflowMenu$2 */
    class C105802 implements ListenerReportUser {
        /* renamed from: a */
        final /* synthetic */ CensorOverflowMenu f34326a;

        C105802(CensorOverflowMenu censorOverflowMenu) {
            this.f34326a = censorOverflowMenu;
        }

        public void onReportUser(ReportCause reportCause, String str, boolean z) {
            if (this.f34326a.f41077g) {
                this.f34326a.f41071a.m36054a(this.f34326a.f41077g.getId(), this.f34326a.m50123c(this.f34326a.f41077g), this.f34326a.m50124d(this.f34326a.f41077g), this.f34326a.f41077g.getAttribution(), reportCause, str);
            } else if (this.f34326a.f41078h) {
                this.f34326a.f41071a.m36051a(this.f34326a.f41078h.a(), null, reportCause, str);
            } else {
                throw new IllegalStateException("Match/Profile id required by CensorOverflowMenu to report.");
            }
        }
    }

    /* renamed from: com.tinder.chat.view.CensorOverflowMenu$3 */
    class C105813 implements CensorMenuDialogListener {
        /* renamed from: a */
        final /* synthetic */ CensorOverflowMenu f34327a;

        C105813(CensorOverflowMenu censorOverflowMenu) {
            this.f34327a = censorOverflowMenu;
        }

        public void onReportClicked() {
            this.f34327a.f41071a.m36045a();
        }

        public void onMuteClicked() {
            C2640a.a(this.f34327a.f41077g, "Match is not bound for CensorOverflowMenu to mute.");
            this.f34327a.f41071a.m36050a(this.f34327a.f41077g.getId());
        }

        public void onUnMuteClicked() {
            C2640a.a(this.f34327a.f41077g, "Match is not bound for CensorOverflowMenu to unMute.");
            this.f34327a.f41071a.m36059b(this.f34327a.f41077g.getId());
        }

        public void onUnMatchClicked() {
            this.f34327a.f41071a.m36046a(this.f34327a.f41077g);
        }

        public void onRecommendClicked() {
            this.f34327a.f41071a.m36047a(this.f34327a.f41078h);
        }
    }

    public void startShareRecIntent(String str, String str2) {
    }

    public CensorOverflowMenu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((ManagerApp) getContext().getApplicationContext()).h().reusuableComponentBuilder().build().inject(this);
    }

    public void setOnClickListener(@Nullable OnClickListener onClickListener) {
        throw new UnsupportedOperationException("Click listener is set internally in bind methods");
    }

    /* renamed from: a */
    public void m50125a(Match match) {
        this.f41077g = match;
        this.f41076f = m50122b(match);
        setOnClickListenerInternal(new C8454a(this, match));
    }

    /* renamed from: a */
    final /* synthetic */ void m50126a(Match match, View view) {
        this.f41072b.m42616a(new C8429a("chat_moreoptions", match.getId()));
        m50118a();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Deadshot.take(this, this.f41071a);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void showReportFailure() {
        at.a((Activity) getActivityContext(), R.string.error_report_notification);
        if (this.f41075e != null) {
            this.f41075e.dismiss();
        }
    }

    public void showReportSuccessful() {
        if (this.f41075e != null) {
            this.f41075e.mo9979n();
        }
    }

    public void showUnMatchFailure() {
        at.a((Activity) getActivityContext(), R.string.error_unmatch_notification);
    }

    public void showUnMatchSuccessful() {
        Activity activity = (Activity) C14398a.a(getActivityContext());
        if (activity != null) {
            activity.finish();
        }
    }

    public void showUnMatchDialog() {
        new aj(getContext(), this.f41081k).show();
    }

    public void showReportDialog() {
        this.f41075e = new aa(getActivityContext(), this.f41082l, this.f41079i);
        this.f41075e.show();
    }

    public void showMuteSuccessful() {
        m50119a(false);
    }

    public void showUnMuteSuccessful() {
        m50119a(true);
    }

    public void setListener(Listener listener) {
        this.f41080j = listener;
    }

    private void setOnClickListenerInternal(@Nullable OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    private void m50119a(boolean z) {
        if (z) {
            this.f41076f.remove(MenuItem.UN_MUTE);
            this.f41076f.add(MenuItem.MUTE);
            return;
        }
        this.f41076f.remove(MenuItem.MUTE);
        this.f41076f.add(MenuItem.UN_MUTE);
    }

    public void showErrorMuteNotifications() {
        at.a((Activity) getActivityContext(), R.string.error_mute_notification);
    }

    public void showErrorUnMuteNotifications() {
        at.a((Activity) getActivityContext(), R.string.error_unmute_notification);
    }

    public void showUserHasSharingDisabledError() {
        if (getContext() instanceof Activity) {
            at.b((Activity) getContext(), R.string.cannot_share_rec);
        }
    }

    public void showGenericError() {
        if (getContext() instanceof Activity) {
            at.a((Activity) getContext(), R.string.reported_warning_accept_agreement_error);
        }
    }

    public void notifyDeleteSponsoredMessageClick(MessageAdMatch messageAdMatch) {
        if (this.f41080j != null) {
            this.f41080j.onDeleteSponsoredMessageClick(messageAdMatch);
        }
    }

    private Context getActivityContext() {
        return C14398a.a(getContext());
    }

    /* renamed from: a */
    private void m50118a() {
        C2640a.a(this.f41076f, "Censor Menu items not set for CensorOverflowMenu");
        new CensorMenuDialog(this.f41083m, getContext(), this.f41076f, this).show();
    }

    /* renamed from: b */
    private Set<MenuItem> m50122b(Match match) {
        if (match instanceof MessageAdMatch) {
            return Collections.singleton(MenuItem.UN_MATCH);
        }
        Set<MenuItem> hashSet = new HashSet();
        hashSet.add(MenuItem.UN_MATCH);
        hashSet.add(match.getMuted() != null ? MenuItem.UN_MUTE : MenuItem.MUTE);
        hashSet.add(MenuItem.REPORT);
        return hashSet;
    }

    /* renamed from: c */
    private String m50123c(Match match) {
        if (match instanceof CoreMatch) {
            return ((CoreMatch) match).getPerson().id();
        }
        return match instanceof PlacesMatch ? ((PlacesMatch) match).getPerson().id() : null;
    }

    /* renamed from: d */
    private String m50124d(Match match) {
        return match instanceof PlacesMatch ? ((PlacesMatch) match).getPlace().getId() : null;
    }
}
