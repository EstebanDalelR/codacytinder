package com.tinder.apprating.p086a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.CycleInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.bk;
import com.tinder.model.SparksEvent;
import com.tinder.utils.C15369t;
import com.tinder.utils.an;
import com.tinder.utils.av;
import javax.inject.Inject;

/* renamed from: com.tinder.apprating.a.a */
public class C8257a extends Dialog implements OnClickListener {
    @Inject
    /* renamed from: a */
    C8260f f29468a;
    @Inject
    /* renamed from: b */
    ManagerAnalytics f29469b;
    /* renamed from: c */
    private final int f29470c = 4;
    /* renamed from: d */
    private final String f29471d = "#ffce66";
    /* renamed from: e */
    private final String f29472e = "#cecece";
    /* renamed from: f */
    private int f29473f;
    /* renamed from: g */
    private int f29474g;
    /* renamed from: h */
    private int f29475h = -1;
    /* renamed from: i */
    private int f29476i = 0;
    /* renamed from: j */
    private String f29477j;
    /* renamed from: k */
    private TextView f29478k;
    /* renamed from: l */
    private TextView f29479l;
    /* renamed from: m */
    private TextView f29480m;
    /* renamed from: n */
    private TextView f29481n;
    /* renamed from: o */
    private TextView f29482o;
    /* renamed from: p */
    private TextView f29483p;
    /* renamed from: q */
    private EditText f29484q;
    /* renamed from: r */
    private ViewGroup f29485r;
    /* renamed from: s */
    private ViewGroup f29486s;
    /* renamed from: t */
    private ViewGroup f29487t;

    public C8257a(Context context, int i, String str) {
        super(context, R.style.Theme.FloatingDialog);
        ManagerApp.e().inject(this);
        getWindow().setWindowAnimations(R.style.dialog_up_down_animation);
        setContentView(R.layout.dialog_rating);
        this.f29478k = (TextView) findViewById(R.id.rate_title);
        this.f29479l = (TextView) findViewById(R.id.rate_title_thanks);
        this.f29480m = (TextView) findViewById(R.id.rate_title_below);
        this.f29481n = (TextView) findViewById(R.id.rate_detail);
        this.f29484q = (EditText) findViewById(R.id.rate_me_feedback_edittext);
        this.f29485r = (ViewGroup) findViewById(R.id.rate_layout_stars);
        this.f29486s = (ViewGroup) findViewById(R.id.rate_layout_actions);
        this.f29482o = (TextView) findViewById(R.id.rate_action_pos);
        this.f29483p = (TextView) findViewById(R.id.rate_action_neg);
        this.f29487t = (ViewGroup) findViewById(R.id.rate_me_content);
        this.f29482o.setOnClickListener(this);
        av.b(this.f29482o);
        this.f29483p.setOnClickListener(this);
        av.b(this.f29483p);
        this.f29484q.setFilters(new InputFilter[]{new C15369t()});
        this.f29473f = Color.parseColor("#ffce66");
        this.f29474g = Color.parseColor("#cecece");
        this.f29477j = str;
        this.f29475h = i;
        if (this.f29475h == null) {
            m35255i();
        } else if (1 == i) {
            m35251e();
        } else {
            throw new IllegalArgumentException("Invalid mode argument");
        }
    }

    public void show() {
        super.show();
        m35248b();
    }

    /* renamed from: b */
    private void m35248b() {
        String str = this.f29475h == 0 ? "stars" : "askFeedback";
        SparksEvent sparksEvent = new SparksEvent("Rate.Show");
        sparksEvent.put(ManagerWebServices.PARAM_CAUSE, this.f29477j);
        sparksEvent.put("mode", str);
        this.f29469b.m40477a(sparksEvent);
    }

    /* renamed from: c */
    private void m35249c() {
        String str = "?";
        if (this.f29475h != 5) {
            switch (this.f29475h) {
                case 0:
                    str = "stars";
                    break;
                case 1:
                    str = "enterFeedback";
                    break;
                case 2:
                    str = "askFeedback";
                    break;
                case 3:
                    str = "askReview";
                    break;
                default:
                    break;
            }
            SparksEvent sparksEvent = new SparksEvent("Rate.Cancel");
            sparksEvent.put("mode", str);
            sparksEvent.put(ManagerWebServices.PARAM_CAUSE, this.f29477j);
            if (this.f29476i > 0) {
                sparksEvent.put("stars", this.f29476i);
            }
            this.f29469b.m40477a(sparksEvent);
        }
        if (1 != this.f29475h) {
            if (2 != this.f29475h) {
                if (3 == this.f29475h) {
                    bk.c(true);
                    m35254h();
                }
                this.f29475h = 5;
            }
        }
        bk.b(true);
        m35253g();
        this.f29475h = 5;
    }

    /* renamed from: a */
    private void m35247a(int i) {
        this.f29476i = i + 1;
        Object obj = this.f29476i >= 4 ? 1 : null;
        bk.d(true);
        SparksEvent sparksEvent = new SparksEvent("Rate.SelectStar");
        sparksEvent.put("stars", this.f29476i);
        this.f29469b.m40477a(sparksEvent);
        TimeInterpolator cycleInterpolator = new CycleInterpolator(0.5f);
        if (obj != null) {
            for (int i2 = 0; i2 < this.f29485r.getChildCount(); i2++) {
                final ImageView imageView = (ImageView) this.f29485r.getChildAt(i2);
                if (i2 <= i) {
                    imageView.animate().setStartDelay((long) (i2 * 60)).scaleX(1.225f).scaleY(1.225f).setInterpolator(cycleInterpolator).setListener(new an(this) {
                        /* renamed from: b */
                        final /* synthetic */ C8257a f33698b;

                        public void onAnimationStart(Animator animator) {
                            imageView.setColorFilter(this.f33698b.f29473f);
                        }
                    }).start();
                } else {
                    imageView.setColorFilter(this.f29474g);
                }
                imageView.setClickable(false);
            }
            m35256j();
            return;
        }
        m35250d();
    }

    /* renamed from: d */
    private void m35250d() {
        this.f29487t.getLayoutTransition().disableTransitionType(4);
        this.f29487t.getLayoutTransition().disableTransitionType(1);
        this.f29487t.getLayoutTransition().disableTransitionType(0);
        this.f29475h = 2;
        this.f29478k.setVisibility(4);
        this.f29481n.setVisibility(4);
        this.f29478k.setText(R.string.can_tell_us_how);
        this.f29481n.setText(R.string.your_feedback_is_important);
        this.f29481n.setVisibility(4);
        this.f29478k.setVisibility(0);
        this.f29481n.setVisibility(0);
        this.f29486s.setVisibility(0);
        this.f29483p.setText(R.string.not_now);
        this.f29482o.setText(R.string.yes);
        this.f29485r.setVisibility(8);
        this.f29481n.setPadding(0, 0, 0, 0);
    }

    /* renamed from: e */
    private void m35251e() {
        this.f29475h = 1;
        this.f29478k.setVisibility(8);
        this.f29481n.setVisibility(8);
        this.f29485r.setVisibility(8);
        this.f29483p.setText(R.string.cancel);
        this.f29482o.setText(R.string.send);
        this.f29484q.setVisibility(0);
        this.f29486s.setVisibility(0);
        this.f29484q.setMovementMethod(new ScrollingMovementMethod());
        this.f29484q.postDelayed(new C8258b(this), 100);
    }

    /* renamed from: a */
    final /* synthetic */ void m35259a() {
        av.a(getContext(), this.f29484q);
    }

    /* renamed from: f */
    private void m35252f() {
        this.f29475h = 4;
        this.f29484q.setVisibility(8);
        this.f29481n.setPadding(0, 0, 0, 0);
        this.f29481n.setVisibility(4);
        this.f29481n.setText(R.string.your_input_helps_us);
        this.f29481n.setVisibility(0);
        this.f29479l.setVisibility(0);
        this.f29482o.setText(R.string.okay);
        this.f29483p.setVisibility(4);
    }

    /* renamed from: g */
    private void m35253g() {
        this.f29487t.getLayoutTransition().disableTransitionType(1);
        this.f29487t.getLayoutTransition().disableTransitionType(0);
        this.f29487t.getLayoutTransition().disableTransitionType(4);
        this.f29487t.getLayoutTransition().disableTransitionType(2);
        this.f29487t.getLayoutTransition().disableTransitionType(3);
        this.f29479l.setVisibility(0);
        this.f29481n.setPadding(0, 0, 0, 0);
        this.f29481n.setText(R.string.you_can_provide_feedback_anytime);
        this.f29480m.setVisibility(8);
        this.f29478k.setVisibility(8);
        this.f29481n.setVisibility(0);
        this.f29484q.setVisibility(8);
        this.f29482o.setText(R.string.okay);
        this.f29483p.setVisibility(4);
    }

    /* renamed from: h */
    private void m35254h() {
        this.f29487t.getLayoutTransition().disableTransitionType(1);
        this.f29487t.getLayoutTransition().disableTransitionType(0);
        this.f29487t.getLayoutTransition().disableTransitionType(4);
        this.f29487t.getLayoutTransition().disableTransitionType(2);
        this.f29487t.getLayoutTransition().disableTransitionType(3);
        findViewById(R.id.rate_detail_thanks).setVisibility(0);
        this.f29481n.setVisibility(4);
        this.f29481n.setVisibility(8);
        this.f29482o.setText(R.string.okay);
        this.f29483p.setVisibility(4);
        this.f29485r.setVisibility(4);
        this.f29485r.setVisibility(8);
        this.f29486s.setVisibility(0);
        this.f29479l.setVisibility(0);
        this.f29480m.setVisibility(4);
        this.f29480m.setVisibility(8);
    }

    /* renamed from: i */
    private void m35255i() {
        int i = 0;
        this.f29475h = 0;
        this.f29478k.setText(R.string.how_would_you_rate);
        this.f29481n.setText(R.string.tap_the_stars);
        this.f29485r.setVisibility(0);
        this.f29486s.setVisibility(8);
        while (i < this.f29485r.getChildCount()) {
            ImageView imageView = (ImageView) this.f29485r.getChildAt(i);
            imageView.setOnClickListener(this);
            imageView.setColorFilter(this.f29474g);
            i++;
        }
    }

    /* renamed from: j */
    private void m35256j() {
        this.f29475h = 3;
        this.f29487t.getLayoutTransition().disableTransitionType(4);
        this.f29487t.getLayoutTransition().setAnimateParentHierarchy(false);
        this.f29487t.getLayoutTransition().setDuration(300);
        this.f29480m.setVisibility(0);
        this.f29486s.setVisibility(0);
        this.f29481n.setText(R.string.no_better_way);
        this.f29481n.setVisibility(0);
        this.f29478k.setVisibility(8);
        this.f29481n.setPadding(0, 0, 0, 0);
    }

    /* renamed from: k */
    private void m35257k() {
        SparksEvent sparksEvent = new SparksEvent("Rate.Review");
        sparksEvent.put("stars", this.f29476i);
        sparksEvent.put(ManagerWebServices.PARAM_CAUSE, this.f29477j);
        this.f29469b.m40477a(sparksEvent);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.tinder"));
        intent.addFlags(268435456);
        getContext().startActivity(intent);
    }

    /* renamed from: l */
    private boolean m35258l() {
        String trim = this.f29484q.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            return false;
        }
        SparksEvent sparksEvent = new SparksEvent("Rate.Feedback");
        sparksEvent.put(ManagerWebServices.PARAM_TEXT, trim);
        sparksEvent.put(ManagerWebServices.PARAM_CAUSE, this.f29477j);
        if (this.f29476i > 0) {
            sparksEvent.put("stars", this.f29476i);
        }
        this.f29469b.m40477a(sparksEvent);
        bk.e(true);
        this.f29468a.m35263a(trim, this.f29476i);
        return true;
    }

    public void onBackPressed() {
        m35249c();
        super.onBackPressed();
    }

    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.img_star_1:
            case R.id.img_star_2:
            case R.id.img_star_3:
            case R.id.img_star_4:
            case R.id.img_star_5:
                m35247a(this.f29485r.indexOfChild(view));
                return;
            default:
                switch (id) {
                    case R.id.rate_action_neg:
                        m35249c();
                        av.c(this.f29484q);
                        return;
                    case R.id.rate_action_pos:
                        switch (this.f29475h) {
                            case 1:
                                if (m35258l() != null) {
                                    av.c(this.f29484q);
                                    m35252f();
                                    return;
                                }
                                return;
                            case 2:
                                m35251e();
                                return;
                            case 3:
                                m35257k();
                                dismiss();
                                return;
                            default:
                                dismiss();
                                return;
                        }
                    default:
                        return;
                }
        }
    }
}
