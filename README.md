# e4 sample application

The repository contains a sample application built with pure maven and hence it allows to develop e4 applications 
in Netbeans and IntelliJ IDEA as well

## Maven Plugin

To launch applications in Netbeans and IntelliJ a special maven-plugin https://github.com/BestSolution-at/maven-osgi-plugin is needed which as of today you need to build and install yourself locally

```sh
user@host> git clone https://github.com/BestSolution-at/maven-osgi-plugin.git
user@host> cd at.bestsolution.maven.osgi.plugin
user@host> mvn clean install
```

## Eclipse

To run the application inside Eclipse you need to have at least e(fx)clipse 3.1.0 tooling installed who provides a new run-configuration type `MVN OSGi Launcher`.

![Eclipse Launcher][eclipse-launch]

Sample Video:
[![Eclipse Sample Video](http://img.youtube.com/vi/0x2X4TRTMbc/0.jpg)](https://www.youtube.com/watch?v=0x2X4TRTMbc)

## Netbeans

To run in Netbeans no additional stuff has to be installed. The custom actions are checked into the `sample.mvn.parent` project.

Sample Video:
[![Netbeans Sample Video](http://img.youtube.com/vi/MUkKmyp9i1o/0.jpg)](https://youtu.be/MUkKmyp9i1o)

## IntelliJ IDEA

To run in IntelliJ IDEA no additional stuff has to be installed when running you need to manually select launch the maven executable with 'intellij' profile.

Sample Video:
[![IntelliJ IDEA Sample Video](http://img.youtube.com/vi/Y2koc8ETjMk/0.jpg)](https://youtu.be/Y2koc8ETjMk)

[eclipse-launch]: https://raw.githubusercontent.com/BestSolution-at/e4-efxclipse-maven-sample/master/mvn-osgi-launch.png
