package com.tinder.domain.boost.repository;

import io.reactivex.C3956a;
import io.reactivex.C3958c;
import io.reactivex.C3960g;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\b\u001a\u00020\tH&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH&¨\u0006\f"}, d2 = {"Lcom/tinder/domain/boost/repository/BoostProfileFacesRepository;", "", "addProfileUrls", "Lio/reactivex/Single;", "", "urls", "", "", "clearUrls", "Lio/reactivex/Completable;", "loadNextUrl", "Lio/reactivex/Maybe;", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface BoostProfileFacesRepository {
    @NotNull
    C3960g<Boolean> addProfileUrls(@NotNull List<String> list);

    @NotNull
    C3956a clearUrls();

    @NotNull
    C3958c<String> loadNextUrl();
}
