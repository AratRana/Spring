package com.arat.multitenant.security;

import java.lang.annotation.*;

/**
 * @author arat
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface RequestAuthorization {
}
