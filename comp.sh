#!/bin/sh

jjtree JavaMM.jjt

javacc JavaMM.jj

javac *.java

java JavaMM tests/teste.java
