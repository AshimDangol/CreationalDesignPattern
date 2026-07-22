@echo off
set MAVEN_OPTS=-Xmx512m
set MAVEN_HOME=%~dp0\.mvn\wrapper
if exist "%MAVEN_HOME%\maven-wrapper.jar" (
  java %MAVEN_OPTS% -jar "%MAVEN_HOME%\maven-wrapper.jar" %*
) else (
  echo Maven Wrapper JAR not found. Run: mvn -N wrapper:wrapper
  echo Falling back to system Maven...
  mvn %*
)
