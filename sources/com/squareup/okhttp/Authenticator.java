package com.squareup.okhttp;

import java.io.IOException;
import java.net.Proxy;

public interface Authenticator {
    C6071q authenticate(Proxy proxy, C6075s c6075s) throws IOException;

    C6071q authenticateProxy(Proxy proxy, C6075s c6075s) throws IOException;
}
