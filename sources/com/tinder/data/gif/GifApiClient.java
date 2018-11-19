package com.tinder.data.gif;

import com.tinder.domain.message.Gif;
import io.reactivex.C3960g;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&¨\u0006\t"}, d2 = {"Lcom/tinder/data/gif/GifApiClient;", "", "search", "Lio/reactivex/Single;", "", "Lcom/tinder/domain/message/Gif;", "query", "", "trending", "data_release"}, k = 1, mv = {1, 1, 10})
public interface GifApiClient {
    @NotNull
    C3960g<List<Gif>> search(@NotNull String str);

    @NotNull
    C3960g<List<Gif>> trending();
}
