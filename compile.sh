#!/bin/sh

jjtree src/jmm.jjt

javacc src/jmm.jj

javac src/*.java
