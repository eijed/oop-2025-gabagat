#!/bin/sh
cd ./$1;
rm -rf ./*.class;
javac -cp .:../lib/junit-platform-console-standalone-1.9.3.jar Main.java MainTest.java;
java -cp .:../lib/junit-platform-console-standalone-1.9.3.jar org.junit.runner.JUnitCore MainTest;
rm -rf ./*.class;
cd ../;