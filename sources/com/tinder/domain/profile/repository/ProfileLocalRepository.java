package com.tinder.domain.profile.repository;

import com.tinder.domain.profile.model.ProfileOption;
import io.reactivex.C3956a;
import io.reactivex.C3958c;
import io.reactivex.C3959e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH&J\"\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH&J/\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\b2\u0006\u0010\u000b\u001a\u0002H\u0006H&¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/tinder/domain/profile/repository/ProfileLocalRepository;", "", "clear", "Lio/reactivex/Completable;", "getProfileOption", "Lio/reactivex/Maybe;", "T", "option", "Lcom/tinder/domain/profile/model/ProfileOption;", "loadProfileOption", "Lio/reactivex/Observable;", "defaultValue", "(Lcom/tinder/domain/profile/model/ProfileOption;Ljava/lang/Object;)Lio/reactivex/Observable;", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface ProfileLocalRepository {
    @NotNull
    C3956a clear();

    @NotNull
    <T> C3958c<T> getProfileOption(@NotNull ProfileOption<? extends T> profileOption);

    @NotNull
    <T> C3959e<T> loadProfileOption(@NotNull ProfileOption<? extends T> profileOption);

    @NotNull
    <T> C3959e<T> loadProfileOption(@NotNull ProfileOption<? extends T> profileOption, T t);
}
