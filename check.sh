#!/bin/sh
cd $1;
rm -rf ./*.class;
javac -cp .:../../lib/junit-platform-console-standalone-1.9.3.jar Main.java MainTest.java;
java Main
java -cp .:../../lib/junit-platform-console-standalone-1.9.3.jar org.junit.runner.JUnitCore MainTest;

#if [ $? -eq 0 ]; then
#  echo "OK"
#else
#  echo "Failed Test"
#fi

rm -rf ./*.class;
cd ../../;