package com.tinder.domain.message;

import android.support.annotation.NonNull;
import java.util.List;
import rx.Single;

public interface GifRepository {
    @NonNull
    Single<List<Gif>> loadTrending();

    @NonNull
    Single<List<Gif>> search(String str);
}
