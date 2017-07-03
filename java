#!/bin/sh
docker run -ti --rm \
    -v $PWD:/workdir --workdir=/workdir \
    -e MAVEN_OPS="-Xms256M -Xmx1024M -XX:PermSize=256M -XX:MaxPermSize=1024M" \
    --name java7 \
    --net=host \
    openjdk:8 java $@
