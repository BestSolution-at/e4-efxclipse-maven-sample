#!/usr/bin/env sh

#Definitions
ARTIFACTS="tycho-lifecycle-controller:0.0.3-SNAPSHOT \
			maven-osgi-targetplatform-extension:0.0.3-SNAPSHOT \
			maven-osgi-package-plugin:0.0.3-SNAPSHOT \
			maven-osgi-exec-plugin:0.0.3-SNAPSHOT" 

ARTIFACTS_GROUP="at.bestsolution"

ARTIFACTS_REPOSITORY="https://maven.bestsolution.at/efxclipse-snapshots/"

#Retrieve Artifacts

clear

echo
echo "*** Installing Maven Artifacts and Dependencies"
echo
for ARTIFACT in ${ARTIFACTS}; do
	echo -n "    - ${ARTIFACT}... "
	eval $"echo mvn dependency:get -Dartifact=${ARTIFACTS_GROUP}:${ARTIFACT} -DrepoUrl=${ARTIFACTS_REPOSITORY} > /dev/null"
	echo "done."
	echo
done

echo "*** Installing Project"
echo
echo -n "    - Performing Action: 'mvn clean install'... "
eval $"echo mvn clean install" > /dev/null
echo "done."
echo
echo
echo "Note: To Launch Application from Command Line Execute:"
echo
echo "    mvn -f launch/pom.xml test -Pnetbeans "
echo
echo
echo "Execution Terminated"
echo
exit 0
