# Running existing images on OpenShift

## Description

This demonstrates running an existing spring boot example application docker image hosted on quay.io

## Docker Command Example
```
docker run -p 8080:8080 quay.io/cloudfirst/spring-boot-helloworld:v0.2
```

## OpenShift Command Example
Run the following command to run the docker image and then expose the port
```
oc new-app quay.io/cloudfirst/spring-boot-helloworld:v0.2
oc expose svc/spring-boot-helloworld
```

Run the following to get the route url
```
oc get route spring-boot-helloworld --template="http://{{ .spec.host }}"
```
