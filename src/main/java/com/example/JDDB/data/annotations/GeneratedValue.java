package com.example.JDDB.data.annotations;

import com.example.JDDB.data.enums.GeneratorType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface GeneratedValue {
    GeneratorType value() default GeneratorType.SEQUENCE;
}
