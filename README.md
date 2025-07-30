# WeatherApp - Spring Boot Project

This is a simple Spring Boot REST API that provides weather information for today, tomorrow, and specific cities.  
The app runs on **port 8085**.

---

## 📂 Project Structure
```
Directory structure:
└── adrin-bershik-c-j-day7-proj2/
    ├── pom.xml
    └── src/
        ├── main/
        │   ├── java/
        │   │   └── com/
        │   │       └── day7proj2weatherapp/
        │   │           └── weatherapp/
        │   │               ├── WeatherApplication.java
        │   │               └── controller/
        │   │                   └── WeatherController.java
        │   └── resources/
        │       └── application.properties
        └── test/
            └── java/
                └── com/
                    └── day7proj2weatherapp/
                        └── AppTest.java
```

---

## 🚀 Features
- `GET /weather/today` → Returns today's weather.
- `GET /weather/tomorrow` → Returns tomorrow's weather forecast.
- `GET /weather/city/{name}` → Returns a placeholder weather report for a given city.

---

## 🛠️ Technologies Used
- Java 17+ (or compatible version)
- Spring Boot 3.x+
- Maven

---

## ▶️ How to Run

1. **Clone the repository**  
   ```bash
   git clone https://github.com/your-username/adrin-bershik-c-j-day7-proj2.git
   cd adrin-bershik-c-j-day7-proj2
