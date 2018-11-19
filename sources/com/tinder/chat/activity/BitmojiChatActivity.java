package com.tinder.chat.activity;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.C4330g;
import com.jakewharton.rxbinding2.p140b.C5716a;
import com.snapchat.kit.sdk.bitmoji.OnBitmojiSearchFocusChangeListener;
import com.snapchat.kit.sdk.bitmoji.OnBitmojiSelectedListener;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.bitmoji.keyboard.KeyboardHeightWorker;
import com.tinder.bitmoji.view.BitmojiIconView;
import com.tinder.bitmoji.view.BitmojiPickerView;
import com.tinder.chat.view.ChatInputBoxContainer;
import com.tinder.data.keyboard.KeyboardHeightNotifier;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3959e;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.p453a.p455b.C15674a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/tinder/chat/activity/BitmojiChatActivity;", "Lcom/tinder/chat/activity/ChatActivity;", "Lcom/snapchat/kit/sdk/bitmoji/OnBitmojiSelectedListener;", "Lcom/snapchat/kit/sdk/bitmoji/OnBitmojiSearchFocusChangeListener;", "()V", "chatInputBoxContainer", "Lcom/tinder/chat/view/ChatInputBoxContainer;", "chatRootKeyboardPlaceholder", "Landroid/widget/FrameLayout;", "keyboardHeightWorker", "Lcom/tinder/bitmoji/keyboard/KeyboardHeightWorker;", "pickerView", "Lcom/tinder/bitmoji/view/BitmojiPickerView;", "getLayoutResId", "", "observeBitmojiIconState", "", "observeKeyboardHeight", "observeKeyboardWorker", "onBitmojiSearchFocusChange", "isSearchInFocus", "", "onBitmojiSelected", "imageUrl", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class BitmojiChatActivity extends ChatActivity implements OnBitmojiSearchFocusChangeListener, OnBitmojiSelectedListener {
    /* renamed from: e */
    private BitmojiPickerView f45459e;
    /* renamed from: f */
    private ChatInputBoxContainer f45460f;
    /* renamed from: g */
    private FrameLayout f45461g;
    /* renamed from: h */
    private KeyboardHeightWorker f45462h;
    /* renamed from: i */
    private HashMap f45463i;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "test", "(Ljava/lang/Boolean;)Z"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.activity.BitmojiChatActivity$a */
    static final class C10508a<T> implements Predicate<Boolean> {
        /* renamed from: a */
        public static final C10508a f34166a = new C10508a();

        C10508a() {
        }

        /* renamed from: a */
        public final boolean m42475a(@NotNull Boolean bool) {
            C2668g.b(bool, "it");
            return true;
        }

        public /* synthetic */ boolean test(Object obj) {
            return m42475a((Boolean) obj);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.activity.BitmojiChatActivity$b */
    static final class C10509b<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ BitmojiChatActivity f34167a;

        C10509b(BitmojiChatActivity bitmojiChatActivity) {
            this.f34167a = bitmojiChatActivity;
        }

        public /* synthetic */ void accept(Object obj) {
            m42476a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m42476a(Boolean bool) {
            bool = BitmojiChatActivity.m54589b(this.f34167a).getLayoutParams();
            bool.height = 0;
            BitmojiChatActivity.m54589b(this.f34167a).setLayoutParams(bool);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.activity.BitmojiChatActivity$c */
    static final class C10510c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C10510c f34168a = new C10510c();

        C10510c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m42477a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m42477a(Throwable th) {
            C0001a.c(th, "Error observing keyboard height", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "height", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.activity.BitmojiChatActivity$d */
    static final class C10511d<T> implements Consumer<Integer> {
        /* renamed from: a */
        final /* synthetic */ BitmojiChatActivity f34169a;

        C10511d(BitmojiChatActivity bitmojiChatActivity) {
            this.f34169a = bitmojiChatActivity;
        }

        public /* synthetic */ void accept(Object obj) {
            m42478a((Integer) obj);
        }

        /* renamed from: a */
        public final void m42478a(Integer num) {
            LayoutParams layoutParams = BitmojiChatActivity.m54589b(this.f34169a).getLayoutParams();
            if (C2668g.a(num.intValue(), 0) <= 0 || !BitmojiChatActivity.m54588a(this.f34169a).b() || BitmojiChatActivity.m54588a(this.f34169a).c()) {
                layoutParams.height = 0;
            } else {
                C2668g.a(num, "height");
                layoutParams.height = num.intValue();
            }
            BitmojiChatActivity.m54589b(this.f34169a).setLayoutParams(layoutParams);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.activity.BitmojiChatActivity$e */
    static final class C10512e<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C10512e f34170a = new C10512e();

        C10512e() {
        }

        public /* synthetic */ void accept(Object obj) {
            m42479a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m42479a(Throwable th) {
            C0001a.c(th, "Error observing keyboard height", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.activity.BitmojiChatActivity$f */
    static final class C10513f<T> implements Consumer<Integer> {
        /* renamed from: a */
        final /* synthetic */ BitmojiChatActivity f34171a;

        C10513f(BitmojiChatActivity bitmojiChatActivity) {
            this.f34171a = bitmojiChatActivity;
        }

        public /* synthetic */ void accept(Object obj) {
            m42480a((Integer) obj);
        }

        /* renamed from: a */
        public final void m42480a(Integer num) {
            KeyboardHeightNotifier p = this.f34171a.m54560p();
            C2668g.a(num, "it");
            p.update(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.activity.BitmojiChatActivity$g */
    static final class C10514g<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C10514g f34172a = new C10514g();

        C10514g() {
        }

        public /* synthetic */ void accept(Object obj) {
            m42481a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m42481a(Throwable th) {
            C0001a.c(th, "Error observing keyboard worker", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0010\u0010\u0007\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/tinder/chat/activity/BitmojiChatActivity$onBitmojiSelected$1", "Lcom/bumptech/glide/request/target/SimpleTarget;", "Landroid/graphics/Bitmap;", "(Lcom/tinder/chat/activity/BitmojiChatActivity;Ljava/lang/String;)V", "onResourceReady", "", "bitmap", "glideAnimation", "Lcom/bumptech/glide/request/animation/GlideAnimation;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.activity.BitmojiChatActivity$h */
    public static final class C14234h extends C4330g<Bitmap> {
        /* renamed from: a */
        final /* synthetic */ BitmojiChatActivity f45119a;
        /* renamed from: b */
        final /* synthetic */ String f45120b;

        C14234h(BitmojiChatActivity bitmojiChatActivity, String str) {
            this.f45119a = bitmojiChatActivity;
            this.f45120b = str;
        }

        public /* synthetic */ void onResourceReady(Object obj, GlideAnimation glideAnimation) {
            m54041a((Bitmap) obj, glideAnimation);
        }

        /* renamed from: a */
        public void m54041a(@NotNull Bitmap bitmap, @Nullable GlideAnimation<? super Bitmap> glideAnimation) {
            C2668g.b(bitmap, "bitmap");
            glideAnimation = bitmap.getWidth();
            bitmap = bitmap.getHeight();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Bitmoji selected ");
            stringBuilder.append(this.f45120b);
            stringBuilder.append(" is ");
            stringBuilder.append(glideAnimation);
            stringBuilder.append(" x ");
            stringBuilder.append(bitmap);
            C0001a.b(stringBuilder.toString(), new Object[0]);
            BitmojiChatActivity.m54588a(this.f45119a).a(this.f45120b, glideAnimation, bitmap);
        }
    }

    /* renamed from: b */
    public View mo11519b(int i) {
        if (this.f45463i == null) {
            this.f45463i = new HashMap();
        }
        View view = (View) this.f45463i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f45463i.put(Integer.valueOf(i), view);
        return view;
    }

    /* renamed from: d */
    protected int mo11520d() {
        return R.layout.activity_chat_bitmoji;
    }

    @NotNull
    /* renamed from: a */
    public static final /* synthetic */ ChatInputBoxContainer m54588a(BitmojiChatActivity bitmojiChatActivity) {
        bitmojiChatActivity = bitmojiChatActivity.f45460f;
        if (bitmojiChatActivity == null) {
            C2668g.b("chatInputBoxContainer");
        }
        return bitmojiChatActivity;
    }

    @NotNull
    /* renamed from: b */
    public static final /* synthetic */ FrameLayout m54589b(BitmojiChatActivity bitmojiChatActivity) {
        bitmojiChatActivity = bitmojiChatActivity.f45461g;
        if (bitmojiChatActivity == null) {
            C2668g.b("chatRootKeyboardPlaceholder");
        }
        return bitmojiChatActivity;
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = findViewById(R.id.bitmoji_picker_view);
        C2668g.a(bundle, "findViewById(R.id.bitmoji_picker_view)");
        this.f45459e = (BitmojiPickerView) bundle;
        bundle = findViewById(R.id.inputBoxContainer);
        C2668g.a(bundle, "findViewById(R.id.inputBoxContainer)");
        this.f45460f = (ChatInputBoxContainer) bundle;
        bundle = findViewById(R.id.chatRootKeyboardPlaceholder);
        C2668g.a(bundle, "findViewById(R.id.chatRootKeyboardPlaceholder)");
        this.f45461g = (FrameLayout) bundle;
        bundle = this.f45460f;
        if (bundle == null) {
            C2668g.b("chatInputBoxContainer");
        }
        FrameLayout frameLayout = this.f45461g;
        if (frameLayout == null) {
            C2668g.b("chatRootKeyboardPlaceholder");
        }
        bundle.setChatRootKeyboardPlaceholder(frameLayout);
        bundle = this.f45459e;
        if (bundle == null) {
            C2668g.b("pickerView");
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C2668g.a(supportFragmentManager, "supportFragmentManager");
        bundle.m35456a(supportFragmentManager);
        Activity activity = this;
        Lifecycle lifecycle = getLifecycle();
        C2668g.a(lifecycle, "lifecycle");
        this.f45462h = new KeyboardHeightWorker(activity, lifecycle, null, 4, null);
        m54590q();
        m54591r();
        m54592s();
    }

    public void onBitmojiSelected(@NotNull String str) {
        C2668g.b(str, "imageUrl");
        C0994i.a(this).a(str).l().a(DiskCacheStrategy.SOURCE).b(new C14234h(this, str));
    }

    public void onBitmojiSearchFocusChange(boolean z) {
        if (z) {
            z = this.f45460f;
            if (!z) {
                C2668g.b("chatInputBoxContainer");
            }
            z.a();
        }
    }

    /* renamed from: q */
    private final void m54590q() {
        KeyboardHeightWorker keyboardHeightWorker = this.f45462h;
        if (keyboardHeightWorker == null) {
            C2668g.b("keyboardHeightWorker");
        }
        C3959e observeOn = keyboardHeightWorker.a().observeOn(C15674a.a());
        ChatInputBoxContainer chatInputBoxContainer = this.f45460f;
        if (chatInputBoxContainer == null) {
            C2668g.b("chatInputBoxContainer");
        }
        observeOn.takeUntil(C5716a.a(chatInputBoxContainer)).subscribe(new C10513f(this), C10514g.f34172a);
    }

    /* renamed from: r */
    private final void m54591r() {
        C3959e observeOn = m54559g().observeCurrent().observeOn(C15674a.a());
        ChatInputBoxContainer chatInputBoxContainer = this.f45460f;
        if (chatInputBoxContainer == null) {
            C2668g.b("chatInputBoxContainer");
        }
        observeOn.takeUntil(C5716a.a(chatInputBoxContainer)).subscribe(new C10511d(this), C10512e.f34170a);
    }

    /* renamed from: s */
    private final void m54592s() {
        RxJavaInteropExtKt.toV2Observable(((BitmojiIconView) mo11519b(C6248a.bitmoji_icon_view)).m42221d()).takeUntil(C5716a.a((BitmojiIconView) mo11519b(C6248a.bitmoji_icon_view))).filter(C10508a.f34166a).subscribe(new C10509b(this), C10510c.f34168a);
    }
}
