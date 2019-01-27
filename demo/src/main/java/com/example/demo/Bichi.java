package com.example.demo;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.math.BigInteger;

public class Bichi {
    final FaceTest[] faceTests = new FaceTest[10];

    @Test
    public void main() throws IllegalAccessException, InstantiationException, CloneNotSupportedException {
        FaceTest faceTest = new FaceTest();
        FaceTest clone = faceTest.clone();
    }
}
