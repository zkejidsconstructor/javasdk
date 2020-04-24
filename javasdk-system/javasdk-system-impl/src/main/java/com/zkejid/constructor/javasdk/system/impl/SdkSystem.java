package com.zkejid.constructor.javasdk.system.impl;

import java.io.InputStream;
import java.io.PrintStream;

/**
 * Implementation directly calls {@link java.lang.System}.
 */
public class SdkSystem implements com.zkejid.constructor.javasdk.system.api.v1.System {
    @Override
    public InputStream in() {
        return System.in;
    }

    @Override
    public void setIn(InputStream in) {
        System.setIn(in);
    }

    @Override
    public PrintStream out() {
        return System.out;
    }

    @Override
    public void setOut(PrintStream out) {
        System.setOut(out);
    }

    @Override
    public PrintStream err() {
        return System.err;
    }

    @Override
    public void setErr(PrintStream err) {
        System.setErr(err);
    }
}
