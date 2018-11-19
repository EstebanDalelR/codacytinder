package com.tinder.chat.view;

import android.app.Dialog;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ViewSwitcher;
import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.facebook.rebound.C1811f;
import com.facebook.rebound.C1812g;
import com.facebook.rebound.C3443i;
import com.facebook.rebound.SpringListener;
import com.jakewharton.rxbinding.p130a.C5698c;
import com.jakewharton.rxbinding.view.C5707b;
import com.tinder.R;
import com.tinder.base.p173c.C8304b;
import com.tinder.bitmoji.view.BitmojiIconView;
import com.tinder.bitmoji.view.BitmojiPickerView;
import com.tinder.chat.analytics.af;
import com.tinder.chat.analytics.af.C8418a;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.chat.presenter.C8447u;
import com.tinder.chat.target.ChatInputBoxGifSelector;
import com.tinder.chat.target.ChatInputBoxTarget;
import com.tinder.chat.view.model.C8498n;
import com.tinder.chat.view.provider.C8507f;
import com.tinder.chat.view.provider.ChatInputGifSelectorState;
import com.tinder.chat.view.provider.ChatInputGifSelectorStateUpdatesNotifier;
import com.tinder.common.p196h.C8543d;
import com.tinder.common.view.extension.BackButtonHandlerView;
import com.tinder.data.keyboard.KeyboardHeightProvider;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.message.Gif;
import com.tinder.reactions.common.utils.C14616a;
import com.tinder.reactions.drawer.mediator.AnimatorControllerInterface;
import com.tinder.reactions.drawer.mediator.C14629b;
import com.tinder.reactions.drawer.view.AnimatorTouchInterface;
import com.tinder.reactions.drawer.view.ChatInputEditText;
import com.tinder.reactions.drawer.view.OnTouchInterceptor;
import com.tinder.typingindicator.model.TypingIndicatorExperimentUtility;
import com.tinder.utils.RxUtils;
import io.reactivex.disposables.Disposable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.C15813i;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Observable;
import rx.Subscription;
import rx.p494a.p496b.C19397a;
import tinder.com.tooltip.Tooltip.AnchorGravity;
import tinder.com.tooltip.Tooltip.C19463a;

public class ChatInputBoxContainer extends RelativeLayout implements LifecycleObserver, ChatInputBoxGifSelector, ChatInputBoxTarget, BackButtonHandlerView, AnimatorControllerInterface, AnimatorTouchInterface {
    /* renamed from: A */
    private View f12239A;
    /* renamed from: B */
    private SpringListener f12240B = new ChatInputBoxContainer$3(this);
    @Inject
    /* renamed from: a */
    C8447u f12241a;
    @Inject
    /* renamed from: b */
    String f12242b;
    @BindDimen(2131165282)
    int bitmojiContainerDefaultHeight;
    @BindView(2131361936)
    BitmojiIconView bitmojiIcon;
    @BindDimen(2131165289)
    int bitmojiPickerHeight;
    @BindView(2131361940)
    BitmojiPickerView bitmojiPickerView;
    @BindDimen(2131165291)
    int bitmojiSearchViewHeight;
    @BindDimen(2131165292)
    int bitmojiTagViewHeight;
    @BindString(2131820653)
    String bitmojiTooltipTextNoMatchName;
    @BindString(2131820654)
    String bitmojiTooltipTextWithMatchName;
    @Inject
    /* renamed from: c */
    af f12243c;
    @Inject
    /* renamed from: d */
    C8507f f12244d;
    @Inject
    /* renamed from: e */
    ChatInputGifSelectorStateUpdatesNotifier f12245e;
    @Inject
    /* renamed from: f */
    C14629b f12246f;
    @Inject
    /* renamed from: g */
    TypingIndicatorExperimentUtility f12247g;
    @BindView(2131362091)
    ImageView gifControl;
    @BindView(2131362097)
    ChatInputEditText gifSearchEditText;
    @BindView(2131362634)
    GifSelector gifSelector;
    @BindDimen(2131165324)
    int gifSelectorHeight;
    @BindView(2131362093)
    ImageSwitcher gifSwitcher;
    @Inject
    /* renamed from: h */
    Lifecycle f12248h;
    @Inject
    /* renamed from: i */
    KeyboardHeightProvider f12249i;
    @BindString(2131820643)
    String imageMessageFallbackImage;
    @BindView(2131362099)
    ViewSwitcher inputSwitcher;
    /* renamed from: j */
    private final C1811f f12250j;
    /* renamed from: k */
    private final C1811f f12251k;
    /* renamed from: l */
    private OnTouchInterceptor f12252l = C10595d.f34447a;
    /* renamed from: m */
    private Subscription f12253m;
    /* renamed from: n */
    private Subscription f12254n;
    /* renamed from: o */
    private Subscription f12255o;
    /* renamed from: p */
    private Subscription f12256p;
    /* renamed from: q */
    private Subscription f12257q;
    /* renamed from: r */
    private Subscription f12258r;
    @BindView(2131362094)
    ImageView reactionControl;
    /* renamed from: s */
    private Subscription f12259s;
    @BindView(2131362098)
    ImageButton sendButton;
    /* renamed from: t */
    private Disposable f12260t;
    @BindView(2131362100)
    ChatInputEditText textMessageEditText;
    @BindColor(2131099904)
    int tooltipGradientOrange;
    @BindColor(2131099905)
    int tooltipGradientRed;
    /* renamed from: u */
    private Disposable f12261u;
    /* renamed from: v */
    private Dialog f12262v;
    /* renamed from: w */
    private String f12263w;
    /* renamed from: x */
    private int f12264x = this.bitmojiContainerDefaultHeight;
    /* renamed from: y */
    private int f12265y = 0;
    /* renamed from: z */
    private int f12266z = 0;

    /* renamed from: a */
    static final /* synthetic */ MotionEvent m14740a(MotionEvent motionEvent) {
        return motionEvent;
    }

    /* renamed from: a */
    final /* synthetic */ void m14780a(String str) {
        m14749c(str);
    }

    /* renamed from: i */
    final /* synthetic */ void m14796i() {
        m14770w();
    }

    public ChatInputBoxContainer(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        ((ChatActivitySubcomponentProvider) context).provideChatActivityComponent().inject(this);
        inflate(getContext(), R.layout.chat_input_box_container, this);
        ButterKnife.m2675a((View) this);
        this.f12244d.a(this);
        this.f12250j = m14741a(C3443i.m13162c());
        this.f12251k = m14745b(C3443i.m13162c());
        m14768u();
    }

    public void setChatRootKeyboardPlaceholder(View view) {
        this.f12239A = view;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12248h.mo36a(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12248h.mo37b(this);
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public void onResume() {
        this.f12246f.f();
        m14761n();
        m14763p();
        m14762o();
        Deadshot.take(this, this.f12241a);
        m14752d(getCurrentFocusedInputView());
        m14770w();
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public void onPause() {
        RxUtils.m10188b(this.f12253m);
        RxUtils.m10188b(this.f12255o);
        RxUtils.m10188b(this.f12254n);
        RxUtils.m10188b(this.f12257q);
        RxUtils.m10188b(this.f12258r);
        RxUtils.m10188b(this.f12259s);
        Deadshot.drop(this);
        m14754e(getCurrentFocusedInputView());
        this.f12246f.g();
        com.tinder.domain.common.reactivex.RxUtils.INSTANCE.unsubscribe(this.f12260t);
        com.tinder.domain.common.reactivex.RxUtils.INSTANCE.unsubscribe(this.f12261u);
    }

    public void setEnabled(boolean z) {
        ColorFilter colorFilter;
        super.setEnabled(z);
        if (z) {
            colorFilter = null;
        } else {
            colorFilter = m14769v();
        }
        this.gifControl.setEnabled(z);
        this.gifControl.setColorFilter(colorFilter);
        this.reactionControl.setEnabled(z);
        this.reactionControl.setColorFilter(colorFilter);
        this.textMessageEditText.setEnabled(z);
        this.gifSearchEditText.setEnabled(z);
        if (z) {
            this.textMessageEditText.setHint(R.string.chat_input_hint);
        } else {
            this.textMessageEditText.setHint(null);
        }
    }

    public void showGifs(List<Gif> list) {
        if (list.isEmpty()) {
            this.gifSelector.a();
        } else {
            this.gifSelector.a(list);
        }
    }

    public void showGifSearch() {
        RxUtils.m10188b(this.f12257q);
        this.f12257q = m14760m().m10386b(C19397a.a()).m10378a(C19397a.a()).m10385b(m14759l()).m10381a(new C13744e(this), C13752p.f43728a);
    }

    /* renamed from: h */
    final /* synthetic */ void m14795h() {
        this.f12245e.notify(ChatInputGifSelectorState.ACTIVE);
    }

    public void hideGifSearch() {
        RxUtils.m10188b(this.f12258r);
        this.f12258r = m14757j().m10386b(C19397a.a()).m10378a(C19397a.a()).m10385b(m14758k()).m10385b(m14759l()).m10381a(new aa(this), ae.f43649a);
    }

    /* renamed from: g */
    final /* synthetic */ void m14794g() {
        this.f12245e.notify(ChatInputGifSelectorState.INACTIVE);
    }

    public void hideReactionsControl() {
        this.reactionControl.setVisibility(8);
    }

    public void initializeBitmojiKeyboardObservers() {
        m14771x();
        m14772y();
    }

    public void showBitmojiIcon() {
        this.bitmojiIcon.setVisibility(0);
        this.bitmojiIcon.d().j(C5707b.a(this)).a(new af(this), ag.f43651a);
    }

    /* renamed from: a */
    final /* synthetic */ void m14778a(Boolean bool) {
        double d = (double) this.f12264x;
        if (bool.booleanValue() != null) {
            C14616a.f46121a.b(this.bitmojiIcon);
            if (this.f12251k.m6252g() != null) {
                if (this.gifSwitcher.getDisplayedChild() == 1) {
                    this.f12241a.g();
                }
                this.textMessageEditText.clearFocus();
                this.bitmojiPickerView.setVisibility(0);
                this.f12251k.m6236a(((double) this.f12265y) / d);
                this.f12251k.m6242b(1.0d);
                this.f12241a.i();
            } else {
                return;
            }
        }
        if (m14785b() == null && this.f12265y > null && this.f12246f.d() == null) {
            C14616a.f46121a.b(this.bitmojiIcon);
            this.f12265y = 0;
        }
        if (m14785b() != null) {
            this.f12251k.m6238a(this.f12240B);
        }
        this.bitmojiPickerView.setVisibility(8);
        this.f12251k.m6242b(((double) this.f12265y) / d);
    }

    public void hideBitmojiIcon() {
        this.bitmojiIcon.setVisibility(8);
    }

    public void showBitmojiTooltip() {
        C8304b.a(this.bitmojiIcon, new ah(this));
    }

    /* renamed from: c */
    final /* synthetic */ C15813i m14786c(View view) {
        m14746b(this.f12263w);
        return null;
    }

    public void bindTooltipTextWithMatchName(String str) {
        this.f12263w = String.format(this.bitmojiTooltipTextWithMatchName, new Object[]{str});
    }

    public void bindTooltipTextNoMatchName() {
        this.f12263w = this.bitmojiTooltipTextNoMatchName;
    }

    /* renamed from: b */
    private void m14746b(String str) {
        if (this.f12262v != null) {
            this.f12262v.dismiss();
        }
        this.f12262v = new C19463a(getContext(), this.bitmojiIcon).a(AnchorGravity.TOP).a(str).a(true).a(new int[]{this.tooltipGradientRed, this.tooltipGradientOrange}).a(-1).b(true).a(new ai(this)).a();
        this.f12262v.setOnCancelListener(new aj(this));
        this.f12262v.show();
    }

    /* renamed from: f */
    final /* synthetic */ void m14793f() {
        this.bitmojiIcon.c();
        this.f12262v.dismiss();
        this.f12241a.j();
    }

    /* renamed from: a */
    final /* synthetic */ void m14774a(DialogInterface dialogInterface) {
        this.f12241a.k();
    }

    public boolean handleBackButton() {
        if (this.gifSwitcher.getDisplayedChild() == 1) {
            this.f12241a.g();
            return true;
        } else if (!this.bitmojiIcon.a()) {
            return false;
        } else {
            this.bitmojiIcon.b();
            return true;
        }
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            m14768u();
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @OnClick({2131362093})
    void onGifSwitchClicked() {
        if (this.f12250j.m6252g()) {
            this.f12245e.notify(ChatInputGifSelectorState.IN_PROGRESS);
            if (this.bitmojiPickerView.getVisibility() == 0) {
                this.f12251k.m6238a(this.f12240B);
                this.f12265y = this.f12266z;
                this.bitmojiIcon.b();
            }
            if (this.gifSwitcher.getDisplayedChild() == 0) {
                this.f12243c.a(new C8418a(this.f12242b, "gif"));
                this.f12241a.f();
            } else {
                this.f12241a.g();
            }
        }
    }

    @OnClick({2131362096})
    void onClearClicked() {
        this.gifSearchEditText.setText(null);
    }

    /* renamed from: j */
    private Completable m14757j() {
        if (!this.f12246f.b()) {
            return Completable.m10357a();
        }
        m14754e(getCurrentFocusedInputView());
        return Completable.m10358a(500, TimeUnit.MILLISECONDS);
    }

    /* renamed from: k */
    private Completable m14758k() {
        return Completable.m10366a(new C13745f(this));
    }

    /* renamed from: e */
    final /* synthetic */ void m14792e() {
        m14768u();
        this.inputSwitcher.setDisplayedChild(0);
        this.gifSwitcher.setDisplayedChild(0);
        this.f12250j.m6242b(0.0d);
        RxUtils.m10188b(this.f12254n);
        RxUtils.m10188b(this.f12256p);
    }

    /* renamed from: l */
    private Completable m14759l() {
        return C8543d.f30288a.a(this.f12250j);
    }

    /* renamed from: m */
    private Completable m14760m() {
        return Completable.m10366a(new C13746g(this));
    }

    /* renamed from: d */
    final /* synthetic */ void m14790d() {
        this.inputSwitcher.setDisplayedChild(1);
        this.gifSwitcher.setDisplayedChild(1);
        this.f12250j.m6242b(1.0d);
        m14766s();
        m14767t();
        m14752d(this.gifSearchEditText);
    }

    /* renamed from: c */
    private void m14749c(String str) {
        ImageButton imageButton = this.sendButton;
        str = (str == null || TextUtils.isEmpty(str.trim()) != null) ? null : true;
        imageButton.setEnabled(str);
    }

    /* renamed from: n */
    private void m14761n() {
        this.textMessageEditText.setOnClickListener(new C8469h(this));
        this.textMessageEditText.setOnFocusChangeListener(new C8470i(this));
        this.textMessageEditText.m18388a(this.f12247g.isTypingIndicatorEnabled());
        this.f12253m = m14764q().d(new C13747j(this));
    }

    /* renamed from: b */
    final /* synthetic */ void m14782b(View view) {
        this.f12241a.e();
    }

    /* renamed from: a */
    final /* synthetic */ void m14776a(View view, boolean z) {
        if (z && this.bitmojiIcon.a() != null) {
            this.f12265y = this.f12266z;
            this.bitmojiIcon.b();
        }
    }

    /* renamed from: o */
    private void m14762o() {
        this.f12255o = this.gifSelector.b().b(new C13748k(this)).a(new C13749l(this), C13750m.f43658a);
    }

    /* renamed from: c */
    final /* synthetic */ void m14787c(C8498n c8498n) {
        this.gifSearchEditText.setText(null);
        this.f12241a.g();
    }

    /* renamed from: b */
    final /* synthetic */ void m14783b(C8498n c8498n) {
        this.f12241a.a(c8498n, getCurrentGifSearchText());
    }

    /* renamed from: p */
    private void m14763p() {
        this.sendButton.setOnClickListener(new C8504n(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m14775a(View view) {
        this.f12241a.a(getCurrentMessageText());
        this.textMessageEditText.setText(null);
    }

    /* renamed from: q */
    private Observable<String> m14764q() {
        return C5698c.a(this.textMessageEditText).k(C12753o.f41129a);
    }

    /* renamed from: r */
    private Observable<String> m14765r() {
        return C5698c.a(this.gifSearchEditText).c(350, TimeUnit.MILLISECONDS).k(C12773q.f41157a).g();
    }

    /* renamed from: s */
    private void m14766s() {
        Observable r = m14765r();
        C8447u c8447u = this.f12241a;
        c8447u.getClass();
        this.f12254n = r.a(C13753r.a(c8447u), C13754s.f43731a);
    }

    /* renamed from: t */
    private void m14767t() {
        this.f12256p = this.gifSelector.c().a(new C13755t(this), C13756u.f43733a);
    }

    /* renamed from: a */
    final /* synthetic */ void m14777a(C8498n c8498n) {
        this.f12241a.a(getCurrentGifSearchText(), c8498n);
    }

    /* renamed from: u */
    private void m14768u() {
        this.gifSearchEditText.clearFocus();
        this.textMessageEditText.clearFocus();
    }

    @Nullable
    private View getCurrentFocusedInputView() {
        if (this.textMessageEditText.hasFocus()) {
            return this.textMessageEditText;
        }
        return this.gifSearchEditText.hasFocus() ? this.gifSearchEditText : null;
    }

    private String getCurrentMessageText() {
        return this.textMessageEditText.getText().toString();
    }

    private String getCurrentGifSearchText() {
        return this.gifSearchEditText.getText().toString();
    }

    /* renamed from: v */
    private ColorFilter m14769v() {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        return new ColorMatrixColorFilter(colorMatrix);
    }

    /* renamed from: a */
    private C1811f m14741a(C3443i c3443i) {
        c3443i = c3443i.m6219b();
        c3443i.m6239a(C1812g.m6256b(8.0d, 20.0d));
        c3443i.m6238a(new ChatInputBoxContainer$1(this));
        return c3443i;
    }

    /* renamed from: b */
    private C1811f m14745b(C3443i c3443i) {
        c3443i = c3443i.m6219b();
        c3443i.m6239a(C1812g.m6256b(8.0d, 20.0d));
        c3443i.m6238a(new ChatInputBoxContainer$2(this));
        return c3443i;
    }

    public boolean allowDrag() {
        return this.f12250j.m6252g() && this.gifSwitcher.getDisplayedChild() == 0;
    }

    public void setTouchInterceptor(@NonNull OnTouchInterceptor onTouchInterceptor) {
        this.f12252l = onTouchInterceptor;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(this.f12252l.OnTouch(motionEvent));
    }

    /* renamed from: a */
    public void m14781a(String str, int i, int i2) {
        this.f12241a.a(str, i, i2, this.imageMessageFallbackImage);
    }

    /* renamed from: a */
    public void m14773a() {
        this.f12241a.h();
    }

    /* renamed from: b */
    public boolean m14785b() {
        if (!this.textMessageEditText.isFocused()) {
            if (!this.gifSearchEditText.isFocused()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public boolean m14789c() {
        return this.bitmojiPickerView.getVisibility() == 0;
    }

    /* renamed from: d */
    private void m14752d(View view) {
        C14616a.f46121a.a(view, 200);
    }

    /* renamed from: e */
    private void m14754e(@Nullable View view) {
        C14616a.f46121a.b(view);
    }

    /* renamed from: w */
    private void m14770w() {
        RxUtils.m10188b(this.f12259s);
        if (!this.f12250j.m6252g()) {
            this.f12259s = m14759l().m10381a(new C13757v(this), C13758w.f43735a);
        } else if (this.f12250j.m6245c() == 0.0d) {
            this.f12245e.notify(ChatInputGifSelectorState.INACTIVE);
            hideGifSearch();
        } else {
            this.f12245e.notify(ChatInputGifSelectorState.ACTIVE);
            showGifSearch();
        }
    }

    /* renamed from: x */
    private void m14771x() {
        this.f12261u = this.f12249i.observe().m15456a(new C10651x(this), new C10652y(this));
    }

    /* renamed from: d */
    final /* synthetic */ void m14791d(Integer num) throws Exception {
        int intValue;
        if (num.intValue() > 0) {
            this.f12266z = num.intValue();
            intValue = num.intValue();
        } else {
            intValue = this.bitmojiContainerDefaultHeight;
        }
        m14742a(intValue);
    }

    /* renamed from: b */
    final /* synthetic */ void m14784b(Throwable th) throws Exception {
        C0001a.m30c(th, "Error getting the initial keyboard height", new Object[0]);
        m14742a(this.bitmojiContainerDefaultHeight);
    }

    /* renamed from: y */
    private void m14772y() {
        this.f12260t = this.f12249i.observeCurrent().doOnNext(new C10653z(this)).filter(ab.f34353a).distinctUntilChanged().subscribe(new ac(this), ad.f34419a);
    }

    /* renamed from: c */
    final /* synthetic */ void m14788c(Integer num) throws Exception {
        this.f12265y = num.intValue();
    }

    /* renamed from: b */
    static final /* synthetic */ boolean m14747b(Integer num) throws Exception {
        return num.intValue() > null ? true : null;
    }

    /* renamed from: a */
    final /* synthetic */ void m14779a(Integer num) throws Exception {
        this.f12266z = num.intValue();
        m14742a(num.intValue());
        num = this.bitmojiPickerView.getLayoutParams();
        num.height = this.f12264x;
        this.bitmojiPickerView.setLayoutParams(num);
    }

    /* renamed from: a */
    private void m14742a(int i) {
        this.f12264x = (i + this.bitmojiSearchViewHeight) + this.bitmojiTagViewHeight;
    }
}
