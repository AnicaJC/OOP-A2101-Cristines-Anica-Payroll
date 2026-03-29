# MotorPH Payroll System - Terminal Assessment (TA)

## Project Overview
This Java-based application is a centralized Payroll and Employee Management System for **MotorPH**. It automates the calculation of employee salaries, tracks attendance from CSV logs, and manages leave requests with strict data validation.

---

## Key Features
* **Employee Management:** Dynamic data retrieval of employee attributes from `MotorPH_Employee Data - Employee Details.csv`.
* **Payroll Engine:** Precise calculation of Gross and Net pay, including SSS, PhilHealth, Pag-IBIG and Withholding Tax.
* **Attendance Processing:** Automatic calculation of total hours worked via `AttendanceService`.
* **Leave Management:** User-friendly request form with **Strict Date Validation** (`MM/dd/yyyy`).

---

## System Architecture
The project follows a **Layered Architecture (Service-Model-Utility)** to ensure clean separation of concerns:
* **`com.motorph.model`**: Contains data objects (`Employee`, `AttendanceRecord`).
* **`com.motorph.service`**: Contains business logic (`SalaryService`, `EmployeeService`, `DataService`, `EmployeeService`, `SalaryCalculator`, and `SalaryService`).
* **`com.motorph.ui`**: Handles the Swing Graphical User Interface.

---

## How to use?
1. **Clone the Repo:** `git clone https://github.com/AnicaJC/OOP-A2101-Cristines-Anica-Payroll.git or download as a .ZIP file and extract locally.`
2. **Open in IDE:** Open the project folder in **NetBeans** or **IntelliJ**.
3. **Data Files:** Ensure the `.csv` data files are in the root directory of the project.
4. **Run** the project file to start the application.

Login credentials:
| User Type | Username | Password |
| :--- | :--- | :--- |
| **Employee** | Employee ID (e.g., `10001`) | Employee ID (e.g., `10001`) |
| **Admin** | `admin` | `admin123` |
