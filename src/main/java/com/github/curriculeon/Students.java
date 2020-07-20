package com.github.curriculeon;
import java.util.*;

public final class Students extends People{
    private static final Students INSTANCE = null;
    private Students(){
    }

    public Students getInstance(){
        return INSTANCE;
    }

}
