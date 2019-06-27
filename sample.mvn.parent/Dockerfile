FROM openjdk:10-jdk

RUN apt-get update && apt-get install -y --no-install-recommends openjfx maven git && rm -rf /var/lib/apt/lists/* 

RUN mkdir $HOME/build
RUN git clone https://github.com/oemergenc/e4-efxclipse-maven-sample.git $HOME/build

WORKDIR $HOME/build

RUN mvn dependency:get -Dartifact=at.bestsolution:tycho-lifecycle-controller:0.0.2-SNAPSHOT -DrepoUrl=http://maven.bestsolution.at/efxclipse-snapshots/
RUN mvn dependency:get -Dartifact=at.bestsolution:maven-osgi-targetplatform-extension:0.0.2-SNAPSHOT -DrepoUrl=http://maven.bestsolution.at/efxclipse-snapshots/ 
RUN cd  $HOME/build/sample.mvn.parent && mvn clean install
