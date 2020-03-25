# GraalVM meets Maven

[![Badge](https://github.com/thatsIch/play-with-native-graalvm-and-maven/workflows/Build%20Hello%20World/badge.svg)](https://github.com/thatsIch/play-with-native-graalvm-and-maven/actions?query=workflow%3A%22Build+Hello+World%22)

## Setup

Use [chocolatey](https://chocolatey.org/) to install the required [dependencies](dependencies.config).

```powershell
choco install depedencies.config -y
set PATH=C:\Program Files (x86)\Microsoft Visual Studio\2017\BuildTools\VC\Tools\MSVC\14.16.27023\bin\Hostx64\x64;%PATH%
set GRAALVM_HOME=C:\Program Files\GraalVM\graalvm-ce-java11-20.0.0
set JAVA_HOME=%GRAALVM_HOME%
set PATH=%GRAALVM_HOME%\bin;%PATH%
gu install native-image
C:\Program Files (x86)\Microsoft Visual Studio\2017\BuildTools\VC\Auxiliary\Build\vcvars64.bat
```
