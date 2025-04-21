package com.kourouma.training.datastructure.codingame;

import java.lang.annotation.Repeatable;

@Repeatable(Messages.class)
public @interface Message {
public String message();
}