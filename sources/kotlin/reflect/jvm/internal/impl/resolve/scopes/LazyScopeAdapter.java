package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.spotify.sdk.android.authentication.AuthenticationRequest.QueryParams;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import org.jetbrains.annotations.NotNull;

public final class LazyScopeAdapter extends AbstractScopeAdapter {
    private final NotNullLazyValue<MemberScope> scope;

    public LazyScopeAdapter(@NotNull NotNullLazyValue<? extends MemberScope> notNullLazyValue) {
        C2668g.b(notNullLazyValue, QueryParams.SCOPE);
        this.scope = notNullLazyValue;
    }

    @NotNull
    protected MemberScope getWorkerScope() {
        return (MemberScope) this.scope.invoke();
    }
}
