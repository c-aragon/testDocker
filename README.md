# Anotaciones

Para construir el proyecto con gradle
```bash
gradle clean build
```

Para crear el docker usando el archivo **Dockerfile**
```bash
docker build -t biaani:latest .
```

Para ejecutar el contenedor
```bash
docker run -p3333:3333 -d biaani
```
