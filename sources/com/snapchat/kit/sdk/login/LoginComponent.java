package com.snapchat.kit.sdk.login;

import com.snapchat.kit.sdk.SnapKitComponent;
import com.snapchat.kit.sdk.login.dagger.scope.LoginScope;
import com.snapchat.kit.sdk.login.networking.C5958a;
import com.snapchat.kit.sdk.login.p158b.C7164a;
import dagger.Component;

@LoginScope
@Component(dependencies = {SnapKitComponent.class})
public interface LoginComponent {
    C7164a loginButtonController();

    C5958a snapLoginClient();
}
