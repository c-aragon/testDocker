FROM java:8

MAINTAINER <carlos.aragon@biaani.com>

EXPOSE 3333

VOLUME /data

COPY build/libs/*.jar Example.jar

CMD ["java","-jar","Example.jar"]
