package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.repository.CustomGenderRepository;
import io.reactivex.C3960g;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00030\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001f\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/domain/profile/usecase/LoadMoreGenderList;", "Lkotlin/Function1;", "", "Lio/reactivex/Single;", "", "customGenderRepository", "Lcom/tinder/domain/profile/repository/CustomGenderRepository;", "(Lcom/tinder/domain/profile/repository/CustomGenderRepository;)V", "urlRegex", "Lkotlin/text/Regex;", "invoke", "query", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class LoadMoreGenderList implements Function1<String, C3960g<List<? extends String>>> {
    private final CustomGenderRepository customGenderRepository;
    private final Regex urlRegex = new Regex("^((https?|ftp)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+(‌​[/?].*)?$");

    @Inject
    public LoadMoreGenderList(@NotNull CustomGenderRepository customGenderRepository) {
        C2668g.b(customGenderRepository, "customGenderRepository");
        this.customGenderRepository = customGenderRepository;
    }

    @NotNull
    public C3960g<List<String>> invoke(@Nullable String str) {
        if (str != null) {
            CharSequence charSequence = str;
            if ((charSequence.length() == 0 ? 1 : null) == null) {
                if (!this.urlRegex.a(charSequence)) {
                    str = this.customGenderRepository.loadMoreGenderList().e(new LoadMoreGenderList$invoke$1(str)).e(new LoadMoreGenderList$invoke$2(str));
                    C2668g.a(str, "customGenderRepository.l…          }\n            }");
                    return str;
                }
            }
        }
        str = C3960g.a(C19301m.a());
        C2668g.a(str, "Single.just(emptyList())");
        return str;
    }
}
