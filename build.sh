#!/usr/bin/env bash
"$JAVA_HOME"/bin/javac -d build --module-source-path modules "$(find modules -name "*.java")"