package com.example.demo20;

import javax.inject.Qualifier;

/**
 */
@Qualifier
public @interface Sign {
    String value() default "";
}
