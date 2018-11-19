package com.tinder.utils;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.HttpCookie;

public class SerializableHttpCookie implements Serializable {
    private static final long serialVersionUID = -6051428667568260064L;
    /* renamed from: a */
    private transient HttpCookie f47614a;

    public SerializableHttpCookie(HttpCookie httpCookie) {
        this.f47614a = httpCookie;
    }

    /* renamed from: a */
    public HttpCookie m57604a() {
        return this.f47614a;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.f47614a.getName());
        objectOutputStream.writeObject(this.f47614a.getValue());
        objectOutputStream.writeObject(this.f47614a.getComment());
        objectOutputStream.writeObject(this.f47614a.getCommentURL());
        objectOutputStream.writeBoolean(this.f47614a.getDiscard());
        objectOutputStream.writeObject(this.f47614a.getDomain());
        objectOutputStream.writeLong(this.f47614a.getMaxAge());
        objectOutputStream.writeObject(this.f47614a.getPath());
        objectOutputStream.writeObject(this.f47614a.getPortlist());
        objectOutputStream.writeBoolean(this.f47614a.getSecure());
        objectOutputStream.writeInt(this.f47614a.getVersion());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f47614a = new HttpCookie((String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        this.f47614a.setComment((String) objectInputStream.readObject());
        this.f47614a.setCommentURL((String) objectInputStream.readObject());
        this.f47614a.setDiscard(objectInputStream.readBoolean());
        this.f47614a.setDomain((String) objectInputStream.readObject());
        this.f47614a.setMaxAge(objectInputStream.readLong());
        this.f47614a.setPath((String) objectInputStream.readObject());
        this.f47614a.setPortlist((String) objectInputStream.readObject());
        this.f47614a.setSecure(objectInputStream.readBoolean());
        this.f47614a.setVersion(objectInputStream.readInt());
    }
}
