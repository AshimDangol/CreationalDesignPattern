#!/bin/sh
# Maven Wrapper script
MAVEN_OPTS="-Xmx512m"
MAVEN_HOME="$(cd "$(dirname "$0")" && pwd)/.mvn/wrapper"
export MAVEN_OPTS
if [ -f "$MAVEN_HOME/maven-wrapper.jar" ]; then
  java $MAVEN_OPTS -jar "$MAVEN_HOME/maven-wrapper.jar" "$@"
else
  echo "Maven Wrapper JAR not found. Run: mvn -N wrapper:wrapper"
  echo "Falling back to system Maven..."
  mvn "$@"
fi
