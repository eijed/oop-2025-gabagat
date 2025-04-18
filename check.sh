#!/bin/sh

if [ -z "$1" ]; then
  echo "path required."
  exit 1
fi

cd $1;
rm -rf ./*.class ./**/*.class;

export JAV_FILES="*.java"

if find . -mindepth 1 -maxdepth 1 -type d  | grep -q .; then
  export JAV_FILES="*.java **/*.java"
fi

javac -cp .:../../.lib/junit-platform-console-standalone-1.9.3.jar $JAV_FILES;
java Main;

if [ "0" != "$2" ]; then
  echo "skipping test.";
  java -cp .:../../.lib/junit-platform-console-standalone-1.9.3.jar org.junit.runner.JUnitCore MainTest;
fi

#if [ $? -eq 0 ]; then
#  echo "OK"
#else
#  echo "Failed Test"
#fi

rm -rf ./*.class ./**/*.class;
cd ../../;