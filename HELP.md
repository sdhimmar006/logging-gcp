
**One time GKE setup**
```
export PROJECT_ID=$(gcloud config get-value project)
gcloud services enable compute.googleapis.com container.googleapis.com containerregistry.googleapis.com cloudtrace.googleapis.com logging.googleapis.com secretmanager.googleapis.com

gcloud container clusters create service-cluster \
--num-nodes 1 \
--machine-type n1-standard-2 \
--zone us-central1-c \
--workload-metadata=GKE_METADATA \
--project=${PROJECT_ID} \
--workload-pool=${PROJECT_ID}.svc.id.goog
```

**One time setup of code**
```
export PROJECT_ID=$(gcloud config get-value project)
git clone https://github.com/sdhimmar006/logging-gcp.git
cd logging-gcp
chmod +x gradlew
export VERSION="0.0.1"
./gradlew jib -PPROJECT_ID=${PROJECT_ID} -PVERSION=${VERSION}
kubectl apply -f ./deploy
```
**Update an existing service**
```
export VERSION="0.0.2"
chmod +x gradlew
./gradlew jib -PPROJECT_ID=${PROJECT_ID} -PVERSION=${VERSION}
kubectl apply -f ./deploy
```