# FROM image
# ADD /my/Test.java  /a/b/c/Test.java
# RUN apt-get install java
# ENV JAVA_HOME=/some/path
# WORKDIR /a/b/c
# EXPOSE 8050
# ENTRYPOINT sleep 5

FROM alpine
RUN apk add openjdk8
ENV PATH $PATH:/usr/lib/jvm/java-1.8-openjdk/bin
WORKDIR /usr/share/udemy
ADD Test.java Test.java
ENTRYPOINT javac Test.java && java Test $NUMBER