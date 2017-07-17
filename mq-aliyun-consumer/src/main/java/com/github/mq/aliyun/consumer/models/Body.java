package com.github.mq.aliyun.consumer.models;


import com.github.mq.aliyun.consumer.parms.ArgumentExtractors;
import com.github.mq.aliyun.consumer.parms.WithArgumentExtractor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by wangziqing on 17/7/17.
 */
@WithArgumentExtractor(ArgumentExtractors.BodyExtractor.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER})
public @interface Body {
}
