package com.squareup.okhttp;

import java.io.IOException;

public interface Interceptor {

    public interface Chain {
        C6007g connection();

        C6075s proceed(C6071q c6071q) throws IOException;

        C6071q request();
    }

    C6075s intercept(Chain chain) throws IOException;
}
