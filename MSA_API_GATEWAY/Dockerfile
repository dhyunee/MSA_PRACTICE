# 1단계: 빌드
FROM eclipse-temurin:21-jdk AS build
WORKDIR /app

# Gradle Wrapper 복사
COPY gradlew /app/
COPY gradle /app/gradle

# build.gradle, settings.gradle 복사 (Groovy 기반!)
COPY build.gradle settings.gradle /app/

# 의존성만 미리 다운받기 (캐시 목적)
RUN ./gradlew build -x test || return 0

# 전체 프로젝트 복사
COPY . /app

# 실제 빌드
RUN ./gradlew build -x test

# 2단계: 실행용
FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app

COPY --from=build /app/build/libs/*.jar app.jar

EXPOSE 9000
ENTRYPOINT ["java", "-jar", "app.jar"]