#!/usr/bin/env bash
find modules -name "*.java"
"$JAVA_HOME"/bin/javac -d build --module-source-path modules $(find modules -name "*.java")