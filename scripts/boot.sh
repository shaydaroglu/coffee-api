#!/bin/bash

gradle --stop &
gradle clean
gradle bootRun