# ktor-backend
Simple Kotlin backend using Ktor

### About
It will return sample data with image on API GET request


## Start
Go to https://start.ktor.io/ and create a project starter.


## Use
Open project in [IntelliJ](https://www.jetbrains.com/idea/) and Run it.

Check the URL in the console logs and click on it or type the URL in the browser.

Call the API:

/randomfox

```
{
id: "2",
name: "Emma",
description: "Emma likes to eat apples",
imageUrl: "http://0.0.0.0:8080/fox/fox2.jpg"
}
```

/fox?foxId=3

```
{
"id": "3",
"name": "Florian",
"description": "Florian is always hungry",
"imageUrl": "http://0.0.0.0:8080/fox/fox3.jpg"
}
```

/fox?foxId=22

```
{
error: "Item does not exit"
}
```

/foxes

```
[
    {
    "id": "1",
    "name": "Florian",
    "description": "Florian is always hungry",
    "imageUrl": "http://0.0.0.0:8080/fox/fox3.jpg"
    },
...
]
```

## Docker
### Prepare JAR file
First lets build the project to generate the jar file:
 - Under Gradle Task, find the task "fatJar", and run it (double click)
 - Run it to make sure it is working properly
 ```
cd build/libs/
java -jar com.mrthiago.ktor-backend-0.0.1.jar
```
It should run just as if you had press Run in the IDE.

### Dokerfile

Build
```
docker build -t rest-fox .
```

Run
```
docker run --name rest-fox-demo -p 8080:8080 rest-fox
```

# 
## Acknowledgment

### Tutorials / Sources
- Initial Tutorial and sample data by [Philipp Lackner](https://www.youtube.com/watch?v=c6I3Dw0xDlQ)

- Build Ktor Project and create Dockerfile by [Caelis](https://www.youtube.com/watch?v=Q1AFRrmEWtU)

- Fox Images from [Google search](https://www.google.com/search?q=fox)

- fatJar task: To build the project jar, used sample code by [Maksim Kostromin](https://gist.github.com/daggerok/4f5f63448f24d991c273165615baa39a)


### Resources 
- [KotlinConf 2019: Ktor for Mobile Developers: Fear the server no more! by Dan Kim](https://www.youtube.com/watch?v=SOPEc8JnFl4)

- [Server-side Kotlin with Coroutines • Roman Elizarov • GOTO 2019](https://www.youtube.com/watch?v=hQrFfwT1IMo&t=8s)

- [Building Kotlin Libraries Sample](https://docs.gradle.org/current/samples/sample_building_kotlin_libraries.html)

- [Kotlin Idioms](https://kotlinlang.org/docs/idioms.html)

#### Future reading / useful resources
- [Run a Kotlin Ktor app on App Engine standard environment](https://cloud.google.com/community/tutorials/kotlin-ktor-app-engine-java8)

- [Repo Ktor](https://github.com/ktorio/ktor)

