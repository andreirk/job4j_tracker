package ru.job4j;

public class JavaConfig implements Config {


    @Override
    public <T> Class<? extends T> getImplClass(Class<T> ifc) {
        return null;
    }
}
