package com.tinder.places.main.view;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/places/main/view/BackButtonRegistrar;", "", "backButtonHandler", "Lcom/tinder/places/main/view/BackButtonHandler;", "getBackButtonHandler", "()Lcom/tinder/places/main/view/BackButtonHandler;", "setBackButtonHandler", "(Lcom/tinder/places/main/view/BackButtonHandler;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface BackButtonRegistrar {
    @Nullable
    BackButtonHandler getBackButtonHandler();

    void setBackButtonHandler(@Nullable BackButtonHandler backButtonHandler);
}
