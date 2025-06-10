# South African ID Validator 🇿🇦

![Java](https://img.shields.io/badge/Java-11%2B-blue)
![Gradle](https://img.shields.io/badge/Gradle-7.5%2B-green)
![License](https://img.shields.io/badge/License-MIT-orange)

A Java-based application that validates South African 13-digit ID numbers using the Luhn algorithm and extracts detailed personal information.

## 📂 Project Structure
```
SaID_validator/
├── 📁 app/
│   ├── 📄 build.gradle
│   ├── 📁 src/
│   │   ├── 📁 main/java/org/example/
│   │   │   ├── 🟨 Main.java              # CLI Application
│   │   │   └── 🟨 ValidateSaid.java      # Core Validation Logic
│   │   └── 📁 test/java/org/example/
│   │       └── 🟨 AppTest.java           # Unit Tests
│   └── 📁 build/                         # Compiled classes & artifacts
├── 📁 gradle/
│   └── 📁 wrapper/
├── 📄 gradle.properties
├── 📄 gradlew
├── 📄 gradlew.bat
├── 📄 settings.gradle
└── 📄 README.md
```

## ✨ Features

- **Luhn Algorithm Validation**: Ensures the ID number is mathematically valid
- **Detailed Information Extraction**:
  - 📅 Birth Date: Extracts the date of birth from the ID number
  - ♀️♂️ Gender: Determines gender based on specific digits
  - 🌍 Citizenship: Identifies South African citizenship status
  - 🧑 Race Classification: Historical classification (educational purposes only)
- **Comprehensive Testing**: Unit tests with JUnit 5
- **Gradle Build System**: Easy dependency management and builds

## 🚀 Future Features

| Feature | Status | Description |
|---------|--------|-------------|
| Biometric Integration | Planned | Facial recognition and fingerprint authentication |
| Blockchain Technology | Planned | Decentralized identity management |
| Voice Recognition | Planned | Voice biometrics for multi-factor auth |
| Mobile Application | Planned | On-the-go identity verification |
| National Systems Integration | Planned | Real-time verification with government systems |

## 🛠️ Technologies Used

- ![Java](https://img.shields.io/badge/-Java-007396?logo=java&logoColor=white) Java 11
- ![JUnit](https://img.shields.io/badge/-JUnit5-25A162?logo=junit5&logoColor=white) JUnit 5
- ![Gradle](https://img.shields.io/badge/-Gradle-02303A?logo=gradle&logoColor=white) Gradle
- Luhn Algorithm
- VerifyID API (for potential future integration)

## 📦 Prerequisites

- Java JDK 11 or higher
- Gradle 7.5+
- JUnit 5 (included via Gradle)

## ⚙️ Installation & Usage

1. **Clone the repository**:
   ```bash
   git clone https://github.com/calvinkhoza/SaID_validator.git
   cd SaID_validator/SaID_validator
   ```
2. **Build the project**:

```bash
./gradlew build
```
 Run the application:

```bash
./gradlew run
```
 Run tests:
```
bash
./gradlew test
```
## Example Session: 

```
South African ID Validator
--------------------------

Enter ID number (or 'quit' to exit): 2001014800086
✅ Valid SA ID Number
Gender: Male
Birth Date: 2020-01-01

ID Breakdown:
YYMMDD: 200101
Citizenship: SA Citizen

Enter ID number (or 'quit' to exit): quit

Thank You have a great day !
```
## 📖 SA ID Number Format
South African ID numbers follow this 13-digit format:
```
Y Y M M D D G S S S C A Z
│ │ │ │ │ │ │ │ │ │ │ │ └─ Check digit (Luhn algorithm)
│ │ │ │ │ │ │ │ │ │ │ └─── Race identifier (obsolete, always 8 or 9)
│ │ │ │ │ │ │ │ │ │ └───── Citizenship (0=Citizen, 1=Permanent Resident)
│ │ │ │ │ │ │ └─────────── Sequence number (birth registration)
│ │ │ │ │ │ └─────────────── Gender (0-4=Female, 5-9=Male)
└─┴─┴─┴─┴─┴─────────────── Date of Birth (YYMMDD)
```
## 📜 License
Distributed under the MIT License. See LICENSE for more information.
