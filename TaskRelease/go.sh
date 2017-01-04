#!/bin/bash

cd vagrant-lamp-wordpress
vagrant up
cd ../IdeaProjectsNew/ReleaseProject
mvn clean
mvn test
cd ../../vagrant-lamp-wordpress
vagrant halt
cd ../IdeaProjectsNew/ReleaseProject/target/surefire-reports
open emailable-report.html
