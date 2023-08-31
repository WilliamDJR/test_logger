# 使用一个Java基础镜像作为基础
FROM openjdk:21-ea-17

# 将工作目录切换到/app
WORKDIR /app

# 复制编译好的JAR文件到容器中
COPY target/spring-boot-0.0.1-SNAPSHOT.jar app.jar

# 暴露应用程序的端口
EXPOSE 8080

# 启动应用程序
CMD ["java", "-jar", "app.jar"]
