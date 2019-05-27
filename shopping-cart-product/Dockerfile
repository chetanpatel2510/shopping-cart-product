FROM openjdk:8
ADD shopping-cart-product/target/shopping-cart-product-0.0.1-SNAPSHOT.jar shopping-cart-product.jar
EXPOSE 8080
ENV PATH $PATH:/usr/bin/
ENTRYPOINT ["java", "-jar", "shopping-cart-product.jar"]