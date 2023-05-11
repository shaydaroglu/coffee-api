#!/bin/bash

gradle --stop &
gradle clean
gradle build --quiet &
gradle bootRun