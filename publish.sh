gradle clean build
docker build -t ca/examplerest:0.0.1 .
docker tag ca/examplerest:0.0.1 gcr.io/istio-001/examplerest:0.0.1
docker push gcr.io/istio-001/examplerest:0.0.1
