package de.javakaffee.kryoserializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.io.PrintStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JdkProxySerializer extends Serializer<Object> {
    public Object read(Kryo kryo, Input input, Class<Object> cls) {
        InvocationHandler invocationHandler = (InvocationHandler) kryo.readClassAndObject(input);
        Class[] clsArr = (Class[]) kryo.readObject(input, Class[].class);
        kryo = kryo.getClassLoader();
        try {
            return Proxy.newProxyInstance(kryo, clsArr, invocationHandler);
        } catch (Input input2) {
            PrintStream printStream = System.err;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getName());
            stringBuilder.append(".read:\nCould not create proxy using classLoader ");
            stringBuilder.append(kryo);
            stringBuilder.append(", have invocationhandler.classloader: ");
            stringBuilder.append(invocationHandler.getClass().getClassLoader());
            stringBuilder.append(" have contextclassloader: ");
            stringBuilder.append(Thread.currentThread().getContextClassLoader());
            printStream.println(stringBuilder.toString());
            throw input2;
        }
    }

    public void write(Kryo kryo, Output output, Object obj) {
        kryo.writeClassAndObject(output, Proxy.getInvocationHandler(obj));
        kryo.writeObject(output, obj.getClass().getInterfaces());
    }

    public Object copy(Kryo kryo, Object obj) {
        return Proxy.newProxyInstance(kryo.getClassLoader(), obj.getClass().getInterfaces(), Proxy.getInvocationHandler(obj));
    }
}
