package com.example.demo21;

import javax.inject.Qualifier;

/**
 */
@Qualifier
public @interface Sign {
    String value() default "";
}
