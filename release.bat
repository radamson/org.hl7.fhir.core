REM replace versions before running
REM make sure you are committed

@echo off
echo ..
echo =====================================================================
echo upgrade and release fhir.core from 3.7.35-SNAPSHOT to 3.7.36-SNAPSHOT
echo =====================================================================
echo ..
echo check versions and make sure committed...
pause

call mvn versions:set -DnewVersion=3.7.36-SNAPSHOT
call git commit -a -m "Release new version"
call git push origin master
call "C:\tools\fnr.exe" --cl --dir "C:\work\org.hl7.fhir\build" --fileMask "*.java" --includeSubDirectories --find "3.7.35-SNAPSHOT" --replace "3.7.36-SNAPSHOT"
call "C:\tools\fnr.exe" --cl --dir "C:\work\org.hl7.fhir\fhir-ig-publisher" --fileMask "*.xml" --includeSubDirectories --find "3.7.35-SNAPSHOT" --replace "3.7.36-SNAPSHOT"
call "C:\tools\fnr.exe" --cl --dir "C:\work\org.hl7.fhir\build" --fileMask "*.xml" --find "3.7.35-SNAPSHOT" --replace "3.7.36-SNAPSHOT"
call mvn deploy
copy C:\work\org.hl7.fhir\org.hl7.fhir.core\org.hl7.fhir.validation.cli\target\org.hl7.fhir.validation.cli-3.7.36-SNAPSHOT.jar ..\latest-ig-publisher\org.hl7.fhir.validator.jar
cd ..\latest-ig-publisher
call git commit -a -m "Release new version 3.7.36-SNAPSHOT"
call git push origin master
call python c:\tools\zulip-api\zulip\zulip\send.py --stream committers/notification --subject "java core" -m "New Java Core v3.7.36-SNAPSHOT released. New Validator at https://oss.sonatype.org/service/local/artifact/maven/redirect?r=snapshots&g=ca.uhn.hapi.fhir&a=org.hl7.fhir.validation.cli&v=3.7.36-SNAPSHOT&e=jar, and also deployed at https://fhir.github.io/latest-ig-publisher/org.hl7.fhir.validator.jar" --config-file zuliprc

echo ===============================================================
echo all done
echo ===============================================================
pause
 