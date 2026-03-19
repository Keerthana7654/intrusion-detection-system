# Intrusion Detection and Prevention System (IDPS)

A full-stack web application that monitors network activity, detects suspicious behaviour using rule-based logic, and provides real-time alerts through a browser-based dashboard.

---

## Overview

This system was built to demonstrate how web technologies can be applied to cybersecurity — specifically, detecting and logging potential intrusions in real time. The application follows MVC architecture and separates presentation, business logic, and data layers cleanly.

---

## Features

- Real-time monitoring of suspicious user and network activity
- Rule-based detection engine that flags abnormal patterns and potential intrusions
- Persistent storage of intrusion records, user activity logs, and detection results
- Responsive web dashboard with live alerts and detection status
- Clean MVC structure for maintainability and scalability

---

## Tech Stack

| Layer | Technology |
|---|---|
| Backend | Java, Servlets, JSP |
| Frontend | HTML, CSS, JavaScript |
| Database | MySQL |
| DB Connectivity | JDBC |
| Architecture | MVC (Model-View-Controller) |

---

## Architecture

```
Client (Browser)
     │
     ▼
JSP Views  ◄──────────────────────────────────────┐
     │                                             │
     ▼                                             │
Java Servlets (Controller)                         │
     │                                             │
     ├──► Detection Logic (Rule-based Engine)      │
     │                                             │
     ▼                                             │
MySQL Database (via JDBC) ─────────────────────────┘
  ├── intrusion_records
  ├── user_activity_logs
  └── detection_results
```

---

## Getting Started

### Prerequisites

- Java JDK 8 or above
- Apache Tomcat 9+
- MySQL 8+
- Any IDE (Eclipse / IntelliJ IDEA)

### Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/Keerthana7654/Intrusion-Detection-and-Prevention.git
   ```

2. **Import into your IDE**
   - Open as a Dynamic Web Project in Eclipse or as a Maven/Web project in IntelliJ.

3. **Configure the database**
   - Create a MySQL database named `idps_db`
   - Run the SQL scripts in `/sql/schema.sql` to set up tables
   - Update DB credentials in `DBConnection.java`

4. **Deploy to Tomcat**
   - Add the project to your Tomcat server
   - Start the server and navigate to `http://localhost:8080/IDPS`

---

## Project Structure

```
IDPS/
├── src/
│   ├── servlets/          # Controller layer — handles HTTP requests
│   ├── models/            # Model layer — Java beans and DB logic
│   └── utils/             # JDBC connection, helper classes
├── WebContent/
│   ├── views/             # JSP pages (dashboard, alerts, logs)
│   ├── css/               # Stylesheets
│   └── js/                # Client-side scripts
└── sql/
    └── schema.sql         # Database schema
```

---

## Team

Built as a team academic project at Vasavi Jnana Peetha First Grade College (Affiliated to Bangalore University) as part of the BCA programme.

---

## License

This project is for academic and learning purposes.
