package com.tinder.chat.activity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.analytics.chat.Origin;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.chat.injection.components.ChatActivitySubcomponent;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.chat.presenter.C8445s;
import com.tinder.chat.view.ChatToolbar;
import com.tinder.common.view.extension.C8580a;
import com.tinder.data.keyboard.KeyboardHeightNotifier;
import com.tinder.data.keyboard.KeyboardHeightProvider;
import com.tinder.managers.ManagerApp;
import com.tinder.pushnotifications.model.TinderNotification;
import com.tinder.reactions.drawer.view.ChatInputEditText;
import com.tinder.video.injection.VideoInjector;
import com.tinder.video.injection.VideoInjector$Factory;
import java.io.Serializable;
import java.util.HashMap;
import java8.util.function.Predicate;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 @2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001@B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010+\u001a\u00020,H\u0014J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0016J\b\u00100\u001a\u000201H\u0016J\u0012\u00102\u001a\u0002012\b\u00103\u001a\u0004\u0018\u000104H\u0014J\b\u00105\u001a\u000201H\u0016J\b\u00106\u001a\u000201H\u0014J\b\u00107\u001a\u000201H\u0014J\b\u00108\u001a\u00020\u0006H\u0016J\b\u00109\u001a\u00020:H\u0016J\n\u0010;\u001a\u0004\u0018\u00010<H\u0002J\b\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u000201H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00148\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0004@\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006A"}, d2 = {"Lcom/tinder/chat/activity/ChatActivity;", "Lcom/tinder/base/ActivitySignedInBase;", "Lcom/tinder/chat/injection/provider/ChatActivitySubcomponentProvider;", "Lcom/tinder/video/injection/VideoInjector$Factory;", "()V", "chatActivityComponent", "Lcom/tinder/chat/injection/components/ChatActivitySubcomponent;", "chatActivityPresenter", "Lcom/tinder/chat/presenter/ChatActivityPresenter;", "getChatActivityPresenter$Tinder_release", "()Lcom/tinder/chat/presenter/ChatActivityPresenter;", "setChatActivityPresenter$Tinder_release", "(Lcom/tinder/chat/presenter/ChatActivityPresenter;)V", "keyboardHeightNotifier", "Lcom/tinder/data/keyboard/KeyboardHeightNotifier;", "getKeyboardHeightNotifier$Tinder_release", "()Lcom/tinder/data/keyboard/KeyboardHeightNotifier;", "setKeyboardHeightNotifier$Tinder_release", "(Lcom/tinder/data/keyboard/KeyboardHeightNotifier;)V", "keyboardHeightProvider", "Lcom/tinder/data/keyboard/KeyboardHeightProvider;", "getKeyboardHeightProvider$Tinder_release", "()Lcom/tinder/data/keyboard/KeyboardHeightProvider;", "setKeyboardHeightProvider$Tinder_release", "(Lcom/tinder/data/keyboard/KeyboardHeightProvider;)V", "rootContainer", "Landroid/view/ViewGroup;", "getRootContainer", "()Landroid/view/ViewGroup;", "setRootContainer", "(Landroid/view/ViewGroup;)V", "textMessageEditText", "Lcom/tinder/reactions/drawer/view/ChatInputEditText;", "getTextMessageEditText$Tinder_release", "()Lcom/tinder/reactions/drawer/view/ChatInputEditText;", "setTextMessageEditText$Tinder_release", "(Lcom/tinder/reactions/drawer/view/ChatInputEditText;)V", "toolbar", "Lcom/tinder/chat/view/ChatToolbar;", "getToolbar$Tinder_release", "()Lcom/tinder/chat/view/ChatToolbar;", "setToolbar$Tinder_release", "(Lcom/tinder/chat/view/ChatToolbar;)V", "getLayoutResId", "", "getNotificationPredicate", "Ljava8/util/function/Predicate;", "Lcom/tinder/pushnotifications/model/TinderNotification;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onStart", "onStop", "provideChatActivityComponent", "provideVideoInjector", "Lcom/tinder/video/injection/VideoInjector;", "readMatchIdFromIntent", "", "readOriginFromIntent", "Lcom/tinder/analytics/chat/Origin;", "setupDagger", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public class ChatActivity extends ActivitySignedInBase implements ChatActivitySubcomponentProvider, VideoInjector$Factory {
    /* renamed from: d */
    public static final C8404a f45417d = new C8404a();
    @Inject
    @NotNull
    /* renamed from: a */
    public C8445s f45418a;
    @Inject
    @NotNull
    /* renamed from: b */
    public KeyboardHeightProvider f45419b;
    @Inject
    @NotNull
    /* renamed from: c */
    public KeyboardHeightNotifier f45420c;
    /* renamed from: e */
    private ChatActivitySubcomponent f45421e;
    /* renamed from: f */
    private HashMap f45422f;
    @NotNull
    @BindView(2131362086)
    protected ViewGroup rootContainer;
    @Nullable
    @NotNull
    @BindView(2131362100)
    public ChatInputEditText textMessageEditText;
    @NotNull
    @BindView(2131362106)
    public ChatToolbar toolbar;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/tinder/chat/activity/ChatActivity$Companion;", "", "()V", "EXTRA_MATCH_ID", "", "EXTRA_ORIGIN", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.activity.ChatActivity$a */
    public static final class C8404a {
        private C8404a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.activity.ChatActivity$b */
    static final class C8405b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ ChatActivity f29836a;

        C8405b(ChatActivity chatActivity) {
            this.f29836a = chatActivity;
        }

        public final void onClick(View view) {
            this.f29836a.m54558f().m36122b();
            this.f29836a.finish();
        }
    }

    /* renamed from: b */
    public View mo11519b(int i) {
        if (this.f45422f == null) {
            this.f45422f = new HashMap();
        }
        View view = (View) this.f45422f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f45422f.put(Integer.valueOf(i), view);
        return view;
    }

    /* renamed from: d */
    protected int mo11520d() {
        return R.layout.activity_chat;
    }

    @NotNull
    /* renamed from: e */
    public final ChatToolbar m54557e() {
        ChatToolbar chatToolbar = this.toolbar;
        if (chatToolbar == null) {
            C2668g.b("toolbar");
        }
        return chatToolbar;
    }

    @NotNull
    /* renamed from: f */
    public final C8445s m54558f() {
        C8445s c8445s = this.f45418a;
        if (c8445s == null) {
            C2668g.b("chatActivityPresenter");
        }
        return c8445s;
    }

    @NotNull
    /* renamed from: g */
    public final KeyboardHeightProvider m54559g() {
        KeyboardHeightProvider keyboardHeightProvider = this.f45419b;
        if (keyboardHeightProvider == null) {
            C2668g.b("keyboardHeightProvider");
        }
        return keyboardHeightProvider;
    }

    @NotNull
    /* renamed from: p */
    public final KeyboardHeightNotifier m54560p() {
        KeyboardHeightNotifier keyboardHeightNotifier = this.f45420c;
        if (keyboardHeightNotifier == null) {
            C2668g.b("keyboardHeightNotifier");
        }
        return keyboardHeightNotifier;
    }

    protected void onCreate(@org.jetbrains.annotations.Nullable Bundle bundle) {
        mo11524q();
        super.onCreate(bundle);
        setContentView(mo11520d());
        ButterKnife.a(this);
        bundle = this.toolbar;
        if (bundle == null) {
            C2668g.b("toolbar");
        }
        setSupportActionBar((Toolbar) bundle);
        bundle = this.toolbar;
        if (bundle == null) {
            C2668g.b("toolbar");
        }
        bundle.setNavigationOnClickListener(new C8405b(this));
    }

    @NotNull
    public ChatActivitySubcomponent provideChatActivityComponent() {
        ChatActivitySubcomponent chatActivitySubcomponent = this.f45421e;
        if (chatActivitySubcomponent == null) {
            C2668g.b("chatActivityComponent");
        }
        return chatActivitySubcomponent;
    }

    @NotNull
    public VideoInjector provideVideoInjector() {
        ChatActivitySubcomponent chatActivitySubcomponent = this.f45421e;
        if (chatActivitySubcomponent == null) {
            C2668g.b("chatActivityComponent");
        }
        return chatActivitySubcomponent;
    }

    @NotNull
    public Predicate<TinderNotification> getNotificationPredicate() {
        C8445s c8445s = this.f45418a;
        if (c8445s == null) {
            C2668g.b("chatActivityPresenter");
        }
        return c8445s.m36123c();
    }

    /* renamed from: q */
    private final void mo11524q() {
        String r = mo11525r();
        Application application = getApplication();
        if (application == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        Object obj;
        this.f45421e = ((ManagerApp) application).h().chatActivityComponentBuilder().matchId(r != null ? r : "").chatActivity(this).build();
        ChatActivitySubcomponent chatActivitySubcomponent = this.f45421e;
        if (chatActivitySubcomponent == null) {
            C2668g.b("chatActivityComponent");
        }
        chatActivitySubcomponent.inject(this);
        CharSequence charSequence = r;
        if (charSequence != null) {
            if (!C19303i.a(charSequence)) {
                obj = null;
                if (obj != null) {
                    C0001a.e("matchId must not be null or empty", new Object[0]);
                    Toast.makeText(this, R.string.error_contact_support, 0).show();
                    finish();
                }
            }
        }
        obj = 1;
        if (obj != null) {
            C0001a.e("matchId must not be null or empty", new Object[0]);
            Toast.makeText(this, R.string.error_contact_support, 0).show();
            finish();
        }
    }

    protected void onStart() {
        super.onStart();
        C8445s c8445s = this.f45418a;
        if (c8445s == null) {
            C2668g.b("chatActivityPresenter");
        }
        c8445s.m36120a(m54554s());
        ManagerApp.a(mo11525r());
    }

    protected void onStop() {
        super.onStop();
        if (this.textMessageEditText != null) {
            C8445s c8445s = this.f45418a;
            if (c8445s == null) {
                C2668g.b("chatActivityPresenter");
            }
            ChatInputEditText chatInputEditText = this.textMessageEditText;
            if (chatInputEditText == null) {
                C2668g.b("textMessageEditText");
            }
            Editable text = chatInputEditText.getText();
            C2668g.a(text, "textMessageEditText.text");
            c8445s.m36121a(((CharSequence) text).length() > 0);
        }
        ManagerApp.a(null);
    }

    public void onPause() {
        super.onPause();
        C8445s c8445s = this.f45418a;
        if (c8445s == null) {
            C2668g.b("chatActivityPresenter");
        }
        c8445s.m36119a();
    }

    public void onBackPressed() {
        ViewGroup viewGroup = this.rootContainer;
        if (viewGroup == null) {
            C2668g.b("rootContainer");
        }
        if (!C8580a.m36599a(this, viewGroup)) {
            super.onBackPressed();
        }
    }

    /* renamed from: r */
    private final String mo11525r() {
        Intent intent = getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return extras.getString("match_id");
            }
        }
        return null;
    }

    /* renamed from: s */
    private final Origin m54554s() {
        Serializable serializable;
        Origin origin;
        Intent intent = getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                serializable = extras.getSerializable("origin");
                if (!(serializable instanceof Origin)) {
                    serializable = null;
                }
                origin = (Origin) serializable;
                return origin == null ? origin : Origin.UNKNOWN;
            }
        }
        serializable = null;
        if (serializable instanceof Origin) {
            serializable = null;
        }
        origin = (Origin) serializable;
        if (origin == null) {
        }
    }
}
