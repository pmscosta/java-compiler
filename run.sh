#!/bin/sh

if [ -z "$1"]
    then
        java -cp src jmm tests/teste.java
else
        java -cp src jmm "$1"
fi