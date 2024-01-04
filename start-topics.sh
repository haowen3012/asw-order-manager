#!/bin/bash

# Script per avviare Kafka con Docker Compose (v2)


echo Creating Kafka topics for the restaurant service...

KAFKA_DOCKER=$(docker ps | grep kafka | grep -v zookeeper | awk '{print $1}')

docker exec -it $KAFKA_DOCKER kafka-topics.sh --bootstrap-server localhost:9092 --create --topic order-service-event-channel --replication-factor 1 --partitions 4

