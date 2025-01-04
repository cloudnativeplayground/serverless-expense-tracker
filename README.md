# Serverless Expense Tracker

**Serverless Expense Tracker** is an open-source project designed to help users track and manage their personal expenses using a cloud-native, serverless architecture. Built with **Java**, **Spring**, and **Kubernetes-based serverless frameworks**, this project leverages modern development practices for scalability and efficiency.

## Features
- **Serverless Architecture**: Uses Kubernetes-based serverless frameworks for efficient resource management.
- **Expense Tracking**: Track daily, monthly, and yearly expenses with detailed categorization.
- **Cloud-Native Design**: Fully containerized and orchestrated with Kubernetes.
- **Open Source**: Licensed under GNU GPL v3.

## Tech Stack
- **Programming Language**: Java
- **Framework**: Spring Boot
- **Architecture**: Serverless on Kubernetes
- **Orchestration**: Kubernetes

## Getting Started

### Prerequisites
- **Java 17+**
- **Maven 3.8+**
- **Docker**
- **Kubernetes Cluster** (e.g., Minikube, Kind, or managed Kubernetes services like AKS, EKS, or GKE)

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/cloudnativeplayground/expensetracker.git
   ```
2. Navigate to the project directory:
   ```bash
   cd expensetracker
   ```
3. Build the project:
   ```bash
   mvn clean package
   ```
4. Build the Docker image:
   ```bash
   docker build -t expensetracker:latest .
   ```
5. Deploy to your Kubernetes cluster using the provided Helm chart:
   ```bash
   helm install expensetracker ./helm
   ```

### Usage
Access the application using the service's external URL or port-forward the service:
```bash
kubectl port-forward svc/expensetracker 8080:80
```
Visit: [http://localhost:8080](http://localhost:8080)

## Contribution
Contributions are welcome! If you want to contribute:
1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Submit a pull request with detailed information.

## Maintainer
This project is maintained by **[Aditya Pratap Bhuyan](https://linkedin.com/in/adityabhuyan)**.

## License
This project is licensed under the **GNU General Public License v3 (GPLv3)**.

---

Happy coding with **Serverless Expense Tracker**! 🚀
