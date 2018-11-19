package com.tinder.reactions.audio;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.tinder.chat.injection.scope.ChatActivityScope;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\nH\u0002J\u0006\u0010\u0014\u001a\u00020\rR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/reactions/audio/ReactionsAudioPlayer;", "", "audioStreamer", "Lcom/tinder/reactions/audio/ReactionsAudioStreamer;", "audioManager", "Landroid/media/AudioManager;", "(Lcom/tinder/reactions/audio/ReactionsAudioStreamer;Landroid/media/AudioManager;)V", "audioFocusChangeListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "hasAudioFocus", "", "onPlaybackCompleteAction", "Lkotlin/Function0;", "", "play", "context", "Landroid/content/Context;", "audioFileResId", "", "requestAudioFocus", "stop", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ChatActivityScope
/* renamed from: com.tinder.reactions.audio.d */
public final class C14593d {
    /* renamed from: a */
    private boolean f46047a;
    /* renamed from: b */
    private final Function0<C15813i> f46048b = ((Function0) new ReactionsAudioPlayer$onPlaybackCompleteAction$1(this));
    /* renamed from: c */
    private final OnAudioFocusChangeListener f46049c = ((OnAudioFocusChangeListener) new C14592a(this));
    /* renamed from: d */
    private final ReactionsAudioStreamer f46050d;
    /* renamed from: e */
    private final AudioManager f46051e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "focusChange", "", "onAudioFocusChange"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.audio.d$a */
    static final class C14592a implements OnAudioFocusChangeListener {
        /* renamed from: a */
        final /* synthetic */ C14593d f46046a;

        C14592a(C14593d c14593d) {
            this.f46046a = c14593d;
        }

        public final void onAudioFocusChange(int i) {
            if (i != 1) {
                switch (i) {
                    case -3:
                        this.f46046a.f46047a = false;
                        this.f46046a.m55654a();
                        return;
                    case -2:
                        this.f46046a.f46047a = false;
                        this.f46046a.m55654a();
                        return;
                    case -1:
                        this.f46046a.f46047a = false;
                        this.f46046a.m55654a();
                        return;
                    default:
                        return;
                }
            }
            this.f46046a.f46047a = true;
        }
    }

    @Inject
    public C14593d(@NotNull ReactionsAudioStreamer reactionsAudioStreamer, @NotNull AudioManager audioManager) {
        C2668g.b(reactionsAudioStreamer, "audioStreamer");
        C2668g.b(audioManager, "audioManager");
        this.f46050d = reactionsAudioStreamer;
        this.f46051e = audioManager;
    }

    /* renamed from: a */
    public final void m55655a(@NotNull Context context, int i) {
        C2668g.b(context, "context");
        if (m55652b()) {
            this.f46050d.play(context, i, this.f46048b);
        }
    }

    /* renamed from: a */
    public final void m55654a() {
        this.f46050d.stop(this.f46048b);
    }

    /* renamed from: b */
    private final boolean m55652b() {
        boolean z = true;
        if (this.f46047a) {
            return true;
        }
        if (this.f46051e.requestAudioFocus(this.f46049c, 3, 3) != 1) {
            z = false;
        }
        this.f46047a = z;
        return this.f46047a;
    }
}
