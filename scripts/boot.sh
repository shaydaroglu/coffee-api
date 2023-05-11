#!/bin/bash

gradle --stop
gradle build --quiet &
gradle bootRun