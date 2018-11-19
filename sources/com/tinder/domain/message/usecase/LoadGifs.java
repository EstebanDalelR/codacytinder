package com.tinder.domain.message.usecase;

import com.tinder.domain.common.usecase.SingleUseCase;
import com.tinder.domain.message.Gif;
import com.tinder.domain.message.GifRepository;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/message/usecase/LoadGifs;", "Lcom/tinder/domain/common/usecase/SingleUseCase;", "", "", "Lcom/tinder/domain/message/Gif;", "gifRepository", "Lcom/tinder/domain/message/GifRepository;", "(Lcom/tinder/domain/message/GifRepository;)V", "execute", "Lrx/Single;", "query", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class LoadGifs implements SingleUseCase<String, List<? extends Gif>> {
    private final GifRepository gifRepository;

    @Inject
    public LoadGifs(@NotNull GifRepository gifRepository) {
        C2668g.b(gifRepository, "gifRepository");
        this.gifRepository = gifRepository;
    }

    @NotNull
    public Single<List<Gif>> execute(@NotNull String str) {
        String str2;
        C2668g.b(str, "query");
        if ((((CharSequence) str).length() == 0 ? 1 : null) != null) {
            str = this.gifRepository.loadTrending();
            str2 = "gifRepository.loadTrending()";
        } else {
            str = this.gifRepository.search(str);
            str2 = "gifRepository.search(query)";
        }
        C2668g.a(str, str2);
        return str;
    }
}
