package com.zkejid.constructor.javasdk.nio.impl;

import com.zkejid.constructor.core.api.v1.ConstructionException;
import com.zkejid.constructor.core.api.v1.ConstructorPart;
import com.zkejid.constructor.javasdk.nio.api.v1.FileSystems;

import java.nio.file.FileSystem;
import java.util.Collections;
import java.util.Set;

public class SdkFileSystems implements FileSystems, ConstructorPart {

    @Override
    public Set<Class<?>> getInterfacesNecessary() {
        return Collections.emptySet();
    }

    @Override
    public Set<Class<?>> getInterfacesProvided() {
        return Collections.singleton(FileSystems.class);
    }

    @Override
    public Object getImplementation(Class<?> aClass) {
        if (FileSystems.class.equals(aClass)) {
            return this;
        } else {
            throw new ConstructionException("Unexpected " + aClass);
        }
    }

    @Override
    public void putImplementation(Class<?> aClass, Object o) {
        throw new ConstructionException("Module doesn't have dependencies");
    }

    @Override
    public void verifyNecessaryInterfaces() throws ConstructionException {
        // No-op
    }

    @Override
    public FileSystem getDefault() {
        return java.nio.file.FileSystems.getDefault();
    }

}
