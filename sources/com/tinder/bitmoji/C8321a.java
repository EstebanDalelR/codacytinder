package com.tinder.bitmoji;

import com.snapchat.kit.sdk.bitmoji.networking.FetchAvatarUrlCallback;
import com.tinder.bitmoji.model.BitmojiFetchAvatarUrlException;
import io.reactivex.C3958c;
import io.reactivex.MaybeEmitter;
import io.reactivex.MaybeOnSubscribe;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/bitmoji/BitmojiAvatarImageApiClient;", "", "bitmoji", "Lcom/tinder/bitmoji/BitmojiWrapper;", "(Lcom/tinder/bitmoji/BitmojiWrapper;)V", "fetchAvatarUrl", "Lio/reactivex/Maybe;", "", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.bitmoji.a */
public final class C8321a {
    /* renamed from: a */
    private final C8323c f29601a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lio/reactivex/MaybeEmitter;", "", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.bitmoji.a$a */
    static final class C10365a<T> implements MaybeOnSubscribe<T> {
        /* renamed from: a */
        final /* synthetic */ C8321a f33840a;

        C10365a(C8321a c8321a) {
            this.f33840a = c8321a;
        }

        public final void subscribe(@NotNull final MaybeEmitter<String> maybeEmitter) {
            C2668g.b(maybeEmitter, "emitter");
            this.f33840a.f29601a.m35436a(new FetchAvatarUrlCallback() {
                public void onSuccess(@Nullable String str) {
                    if (str != null) {
                        maybeEmitter.onSuccess(str);
                    } else {
                        maybeEmitter.onComplete();
                    }
                }

                public void onFailure(boolean z, int i) {
                    maybeEmitter.onError(new BitmojiFetchAvatarUrlException(z, i));
                }
            });
        }
    }

    @Inject
    public C8321a(@NotNull C8323c c8323c) {
        C2668g.b(c8323c, "bitmoji");
        this.f29601a = c8323c;
    }

    @NotNull
    /* renamed from: a */
    public final C3958c<String> m35430a() {
        C3958c<String> a = C3958c.a(new C10365a(this));
        C2668g.a(a, "Maybe.create<String> { e…\n            })\n        }");
        return a;
    }
}
