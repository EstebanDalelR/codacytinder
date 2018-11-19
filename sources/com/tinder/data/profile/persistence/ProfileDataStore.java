package com.tinder.data.profile.persistence;

import com.tinder.domain.profile.model.ProfileOption;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.annotations.Experimental;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH&J\"\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH&J)\u0010\n\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\b2\u0006\u0010\u000b\u001a\u0002H\u0006H&¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/tinder/data/profile/persistence/ProfileDataStore;", "", "clear", "Lio/reactivex/Completable;", "get", "Lio/reactivex/Observable;", "T", "option", "Lcom/tinder/domain/profile/model/ProfileOption;", "observeDataChanges", "save", "data", "(Lcom/tinder/domain/profile/model/ProfileOption;Ljava/lang/Object;)Lio/reactivex/Completable;", "data_release"}, k = 1, mv = {1, 1, 10})
@Experimental
public interface ProfileDataStore {
    @NotNull
    C3956a clear();

    @NotNull
    <T> C3959e<T> get(@NotNull ProfileOption<? extends T> profileOption);

    @NotNull
    <T> C3959e<T> observeDataChanges(@NotNull ProfileOption<? extends T> profileOption);

    @NotNull
    <T> C3956a save(@NotNull ProfileOption<? extends T> profileOption, T t);
}
