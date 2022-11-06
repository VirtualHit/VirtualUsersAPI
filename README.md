# VirtualUsersAPI

API de [VirtualUsers](https://github.com/VirtualHit/VirtualUsers)

## 💻 Implementación con maven o gradle
- Maven:
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.VirtualHit</groupId>
        <artifactId>VirtualUsersAPI</artifactId>
        <version>v1.0.0</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```
- Gradle:
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    compileOnly "com.github.VirtualHit:VirtualUsersAPI:v1.0.0"
}
```

## 🧾 Obtener acceso a la API
```java
@Override
public void onEnable() {
    UserService userService;
    if (getServer().getPluginManager().getPlugin("VirtualUsers") == null) {
        getLogger().severe("VirtualUsers is not installed!");
    } else {
        RegisteredServiceProvider<UserService> rsp = Bukkit.getServicesManager().getRegistration(UserService.class);
        if (rsp == null) {
        // If rsp is null, probably the scope isn't is as "provided" (pom.xml or build.gradle)
            getLogger().severe("VirtualUsers is not installed!");
            getServer().getPluginManager().disablePlugin(this);
        } else {
            userService = rsp.getProvider();
        }
    }
}
```

## 📋 NOTAS

- Ninguna

## 👪 Autores

[alexcastro1919](https://github.com/alexcastro1919)

