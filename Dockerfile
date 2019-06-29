FROM openjdk:8

RUN apt-get update && apt-get install -y --no-install-recommends openjfx maven git && rm -rf /var/lib/apt/lists/* 

RUN mkdir /root/build
RUN git clone --depth=50 --branch=feature/travisfy https://github.com/oemergenc/e4-efxclipse-maven-sample.git /root/build

WORKDIR /root/build

RUN git reset --hard ecd1d6f1

RUN mvn dependency:get -Dartifact=at.bestsolution:tycho-lifecycle-controller:0.0.2-SNAPSHOT -DrepoUrl=http://maven.bestsolution.at/efxclipse-snapshots/
RUN mvn dependency:get -Dartifact=at.bestsolution:maven-osgi-targetplatform-extension:0.0.2-SNAPSHOT -DrepoUrl=http://maven.bestsolution.at/efxclipse-snapshots/
RUN mvn dependency:get -Dartifact=at.bestsolution:maven-osgi-package-plugin:0.0.2-SNAPSHOT -DrepoUrl=http://maven.bestsolution.at/efxclipse-snapshots/

WORKDIR /root/build/sample.mvn.parent

RUN mvn clean package
