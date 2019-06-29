#!/usr/bin/env bash

mvn dependency:get -Dartifact=at.bestsolution:tycho-lifecycle-controller:0.0.2-SNAPSHOT -DrepoUrl=http://maven.bestsolution.at/efxclipse-snapshots/
mvn dependency:get -Dartifact=at.bestsolution:maven-osgi-targetplatform-extension:0.0.2-SNAPSHOT -DrepoUrl=http://maven.bestsolution.at/efxclipse-snapshots/
mvn dependency:get -Dartifact=at.bestsolution:maven-osgi-package-plugin:0.0.2-SNAPSHOT -DrepoUrl=http://maven.bestsolution.at/efxclipse-snapshots/

cd sample.mvn.parent
mvn clean package
