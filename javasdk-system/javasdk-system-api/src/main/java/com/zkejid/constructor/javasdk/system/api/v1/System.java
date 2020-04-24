package com.zkejid.constructor.javasdk.system.api.v1;

import java.io.InputStream;
import java.io.PrintStream;

/**
 * Interface hides actual calls to {@link java.lang.System} methods and access to its fields.
 */
public interface System {

    /**
     * @see java.lang.System#in
     */
    InputStream in();

    /**
     * @see java.lang.System#setIn(InputStream)
     */
    void setIn(InputStream in);

    /**
     * @see java.lang.System#out
     */
    PrintStream out();

    /**
     * @see java.lang.System#setOut(PrintStream)
     */
    void setOut(PrintStream out);

    /**
     * @see java.lang.System#err
     */
    PrintStream err();

    /**
     * @see java.lang.System#setErr(PrintStream)
     */
    void setErr(PrintStream err);

}
