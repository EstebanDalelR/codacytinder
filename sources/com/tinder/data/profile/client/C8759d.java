package com.tinder.data.profile.client;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.tinder.api.TinderUserApi;
import com.tinder.api.model.profile.UpdateUsernameRequestBody;
import com.tinder.api.response.v2.EmptyResponse;
import com.tinder.domain.profile.model.exception.NoUsernameAvailableException;
import com.tinder.domain.profile.model.exception.UsernameTakenException;
import io.reactivex.C3956a;
import io.reactivex.functions.Function;
import java.io.IOException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/data/profile/client/WebProfileClient;", "", "tinderUserApi", "Lcom/tinder/api/TinderUserApi;", "(Lcom/tinder/api/TinderUserApi;)V", "canDeleteUsername", "", "responseCode", "", "checkUsernameTaken", "create", "Lio/reactivex/Completable;", "username", "", "delete", "update", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.client.d */
public final class C8759d {
    /* renamed from: a */
    private final TinderUserApi f30757a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "response", "Lcom/tinder/api/response/v2/EmptyResponse;", "apply", "(Lcom/tinder/api/response/v2/EmptyResponse;)Ljava/lang/Integer;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.client.d$a */
    static final class C10931a<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C10931a f35633a = new C10931a();

        C10931a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43527a((EmptyResponse) obj);
        }

        @Nullable
        /* renamed from: a */
        public final Integer m43527a(@NotNull EmptyResponse emptyResponse) {
            C2668g.b(emptyResponse, "response");
            emptyResponse = emptyResponse.getMeta();
            return emptyResponse != null ? Integer.valueOf(emptyResponse.getStatus()) : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "response", "Lcom/tinder/api/response/v2/EmptyResponse;", "apply", "(Lcom/tinder/api/response/v2/EmptyResponse;)Ljava/lang/Integer;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.client.d$b */
    static final class C10932b<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C10932b f35634a = new C10932b();

        C10932b() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43528a((EmptyResponse) obj);
        }

        @Nullable
        /* renamed from: a */
        public final Integer m43528a(@NotNull EmptyResponse emptyResponse) {
            C2668g.b(emptyResponse, "response");
            emptyResponse = emptyResponse.getMeta();
            return emptyResponse != null ? Integer.valueOf(emptyResponse.getStatus()) : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "response", "Lcom/tinder/api/response/v2/EmptyResponse;", "apply", "(Lcom/tinder/api/response/v2/EmptyResponse;)Ljava/lang/Integer;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.client.d$c */
    static final class C10933c<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C10933c f35635a = new C10933c();

        C10933c() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43529a((EmptyResponse) obj);
        }

        @Nullable
        /* renamed from: a */
        public final Integer m43529a(@NotNull EmptyResponse emptyResponse) {
            C2668g.b(emptyResponse, "response");
            emptyResponse = emptyResponse.getMeta();
            return emptyResponse != null ? Integer.valueOf(emptyResponse.getStatus()) : null;
        }
    }

    @Inject
    public C8759d(@NotNull TinderUserApi tinderUserApi) {
        C2668g.b(tinderUserApi, "tinderUserApi");
        this.f30757a = tinderUserApi;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m37304a(@NotNull String str) {
        C2668g.b(str, "username");
        str = this.f30757a.createUsername(new UpdateUsernameRequestBody(str)).e(C10931a.f35633a).e(new C10934e(new WebProfileClient$create$2(this))).c();
        C2668g.a(str, "tinderUserApi.createUser…         .toCompletable()");
        return str;
    }

    @NotNull
    /* renamed from: b */
    public final C3956a m37305b(@NotNull String str) {
        C2668g.b(str, "username");
        str = this.f30757a.updateUsername(new UpdateUsernameRequestBody(str)).e(C10933c.f35635a).e(new C10934e(new WebProfileClient$update$2(this))).c();
        C2668g.a(str, "tinderUserApi.updateUser…         .toCompletable()");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m37303a() {
        C3956a c = this.f30757a.deleteUsername().e(C10932b.f35634a).e(new C10934e(new WebProfileClient$delete$2(this))).c();
        C2668g.a(c, "tinderUserApi.deleteUser…         .toCompletable()");
        return c;
    }

    /* renamed from: a */
    private final void m37299a(int i) throws Exception {
        if (Callback.DEFAULT_DRAG_ANIMATION_DURATION <= i) {
            if (299 >= i) {
                return;
            }
        }
        if (i != 405) {
            if (i != 409) {
                if (i != 410) {
                    if (i != 422) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Network Error: status code ");
                        stringBuilder.append(i);
                        throw new IOException(stringBuilder.toString());
                    }
                }
            }
        }
        throw ((Throwable) new UsernameTakenException());
    }

    /* renamed from: b */
    private final void m37301b(int i) throws Exception {
        if (Callback.DEFAULT_DRAG_ANIMATION_DURATION <= i) {
            if (299 >= i) {
                return;
            }
        }
        if (i == 410) {
            throw ((Throwable) new NoUsernameAvailableException());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Network Error: status code ");
        stringBuilder.append(i);
        throw new IOException(stringBuilder.toString());
    }
}
