#!/bin/sh

javacc JavaMM.jj

javac *.java

java JavaMM tests/teste.java
