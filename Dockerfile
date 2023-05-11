FROM gradle:7.6-jdk17-alpine AS base
ENV APP_NAME=coffee-api

FROM base AS builder

RUN apk add --no-cache \
        wget \
        tar \
        unzip \
        make

ENV GRADLE_VERSION=7.6
ENV PATH=${PATH}:/opt/gradle-${GRADLE_VERSION}/bin

FROM base

COPY build/libs/coffee-api.jar .
CMD ["coffe-api.jar"]