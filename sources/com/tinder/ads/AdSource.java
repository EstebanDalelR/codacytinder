package com.tinder.ads;

import android.content.Context;
import com.tinder.ads.validation.AdValidator.Rule;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ak;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0014B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0014\u0010\u000e\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\u0006\u0010\u0004\u001a\u00020\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/tinder/ads/AdSource;", "", "context", "Landroid/content/Context;", "type", "Lcom/tinder/ads/AdSource$Type;", "validationRules", "", "Lcom/tinder/ads/validation/AdValidator$Rule;", "(Landroid/content/Context;Lcom/tinder/ads/AdSource$Type;Ljava/util/Set;)V", "getContext", "()Landroid/content/Context;", "getValidationRules", "()Ljava/util/Set;", "createSourceFetcher", "Lcom/tinder/ads/AdSourceFetcher;", "isConfigured", "", "priority", "Lcom/tinder/ads/SourcePriority;", "Type", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public abstract class AdSource {
    @NotNull
    private final Context context;
    private final Type type;
    @NotNull
    private final Set<Rule> validationRules;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/ads/AdSource$Type;", "", "(Ljava/lang/String;I)V", "FACEBOOK_AUDIENCE_NETWORK", "GOOGLE_DFP_BANNER", "GOOGLE_DFP_NATIVE", "TEST", "aggregator_release"}, k = 1, mv = {1, 1, 7})
    public enum Type {
    }

    @NotNull
    public abstract AdSourceFetcher<?, ?, ?> createSourceFetcher();

    public abstract boolean isConfigured();

    @NotNull
    public abstract SourcePriority priority();

    public AdSource(@NotNull Context context, @NotNull Type type, @NotNull Set<? extends Rule> set) {
        C2668g.b(context, "context");
        C2668g.b(type, "type");
        C2668g.b(set, "validationRules");
        this.context = context;
        this.type = type;
        this.validationRules = set;
    }

    @NotNull
    protected final Context getContext() {
        return this.context;
    }

    public /* synthetic */ AdSource(Context context, Type type, Set set, int i, C15823e c15823e) {
        if ((i & 4) != 0) {
            set = ak.a();
        }
        this(context, type, set);
    }

    @NotNull
    public final Set<Rule> getValidationRules() {
        return this.validationRules;
    }

    @NotNull
    public final Type type() {
        return this.type;
    }
}
