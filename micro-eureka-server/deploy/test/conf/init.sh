#!/usr/bin/env bash

postFix="svc.cluster.local"
EUREKA_HOST_NAME="$MY_POD_NAME.$MY_IN_SERVICE_NAME.$MY_POD_NAMESPACE.$postFix"
export EUREKA_HOST_NAME=$EUREKA_HOST_NAME
BOOL_REGISTER="true"
BOOL_FETCH="true"
if [ $EUREKA_REPLICAS = 1 ]; then
    echo "the replicas of eureka pod is one"
    BOOL_REGISTER="false"
    BOOL_FETCH="false"
    EUREKA_URL_LIST="http://$EUREKA_HOST_NAME:14100/eureka/,"
    echo " set the EUREKA_URL_LIST is $EUREKA_URL_LIST"
else
    echo "the replicas of the eureka pod is $EUREKA_REPLICAS"
    BOOL_REGISTER="true"
    BOOL_FETCH="true"
    for ((i=0 ;i<$EUREKA_REPLICAS; i ++))
    do
        temp="http://$EUREKA_APPLICATION_NAME-$i.$MY_IN_SERVICE_NAME.$MY_POD_NAMESPACE.$postFix:14100/eureka/,"
        EUREKA_URL_LIST="$EUREKA_URL_LIST$temp"
        echo $EUREKA_URL_LIST
    done
fi

EUREKA_URL_LIST=${EUREKA_URL_LIST%?}
export EUREKA_URL_LIST=$EUREKA_URL_LIST
export BOOL_FETCH=$BOOL_FETCH
export BOOL_REGISTER=$BOOL_REGISTER
echo "start eureka...."
/xs/app/jdk1.8.0_101/bin/java -jar /xs/webapps/micro-eureka/micro-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=k8stest --eureka.server.enable-self-preservation=false
