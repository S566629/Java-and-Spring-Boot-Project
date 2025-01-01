# **Java-SpringBoot Project**

## **Overview**
This project is built using **Java** with **Spring Boot** and **MVC Controller** integration. The goal is to demonstrate a fully functional application with deployment on **Render** using **Docker**. The application utilizes **PostgreSQL** as its database and showcases all essential steps, including development, configuration, and deployment.

---

## **Key Components**
| **Component**          | **Details**                                  |
|-------------------------|----------------------------------------------|
| **Programming Language**| Java                                         |
| **Framework**           | Spring Boot with MVC architecture            |
| **Database**            | PostgreSQL                                   |
| **Deployment Platform** | Render                                       |
| **Containerization**    | Docker                                       |

---

## **How to Explore This Repository**
📂 **Repository Structure**:
1. **Code**:
   - Java source code is in the `src/main` directory.
   - Configuration files like `application.properties` are in `src/main/resources`.

2. **Dependencies**:
   - The `pom.xml` file lists all required dependencies for running the application.

3. **Docker**:
   - The `Dockerfile` is located in the root directory for containerization.

4. **Deployment**:
   - Deployment scripts or guidelines for Render are provided in the `README.md`.

5. **Screenshots**:
   - Stored in the `assets` folder or linked directly in the documentation.

---

## **Graphical Workflow Representation**
<div align="center">
  <h3>🚀 Workflow Diagram</h3>
  <div style="display: flex; justify-content: center; align-items: center; gap: 20px;">
    <img src="https://github.com/user-attachments/assets/9ba41be9-1641-41b0-8de1-55d4710d4f24" alt="Dockerfile" width="30%" title="Step 1: Containerization with Docker"/>
    <span style="font-size: 30px; font-weight: bold;">➔</span>
    <img src="https://github.com/user-attachments/assets/f9d18ccd-e8fa-4b70-b64a-9ce1dfe971a2" alt="Render Deployment" width="30%" title="Step 2: Deployment on Render"/>
    <span style="font-size: 30px; font-weight: bold;">➔</span>
    <img src="https://github.com/user-attachments/assets/16bffe92-08fb-4dc9-a79c-21594b7786a1" alt="Live Application" width="30%" title="Step 3: Accessing Live Application"/>
  </div>
  <p style="font-style: italic; font-weight: bold; margin-top: 10px;">This diagram represents the workflow for containerizing, deploying, and accessing the application.</p>
</div>

---

## **Steps and Screenshots**

### **1. PostgreSQL Status Check**
- This screenshot verifies the successful creation and availability of the PostgreSQL database on Render.

![PostgreSQL Status](https://github.com/user-attachments/assets/a5fc97d3-f8d9-477d-a405-4042d00b372e)

---

### **2. Adding PostgreSQL Dependency in `pom.xml`**
- The `pom.xml` file is updated to include the required PostgreSQL dependency, enabling database connectivity.

![pom.xml Dependency](https://github.com/user-attachments/assets/62fa13e1-034b-41d0-8b79-b2018eaffd54)

---

### **3. Configuring `application.properties`**
- The `application.properties` file is configured with PostgreSQL connection details (e.g., URL, username, password) to establish communication with the database.

![application.properties](https://github.com/user-attachments/assets/6859b977-1784-4b6c-822f-62d018b27926)

---

### **4. Dockerfile Setup**
- The Dockerfile is located in the root directory (same level as the `src` folder). It contains instructions for containerizing the application.

![Dockerfile](https://github.com/user-attachments/assets/9ba41be9-1641-41b0-8de1-55d4710d4f24)

---

### **5. Pushing the Project to Git Repository**
- The project is pushed to a Git repository for version control and collaboration.

![Git Repository](https://github.com/user-attachments/assets/96621aec-8858-445c-b0f0-85407822e0e6)

---

### **6. Deployment on Render**
- The application is successfully deployed on Render, with a success message confirming the creation of the web service.

![Render Success Message](https://github.com/user-attachments/assets/f9d18ccd-e8fa-4b70-b64a-9ce1dfe971a2)

---

### **7. Accessing the Live Application**
- The live application is accessible via the Render link. Below is a screenshot of the application's home page.

![Application Web Page](https://github.com/user-attachments/assets/16bffe92-08fb-4dc9-a79c-21594b7786a1)

---

## **Conclusion**
This repository showcases the complete process of building, containerizing, deploying, and accessing a Spring Boot application integrated with PostgreSQL. By following the structured steps and exploring the repository, users can replicate the workflow for their own projects.

