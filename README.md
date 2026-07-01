# 🚀 Spring Boot EKS CI/CD Project

## 📌 Project Overview

This project demonstrates an end-to-end **CI/CD pipeline** for deploying a **Spring Boot application on Amazon EKS (Elastic Kubernetes Service)** using modern DevOps practices.

The pipeline automates the complete application delivery workflow:

- Source code management using GitHub
- Automated build using Jenkins
- Code quality analysis using SonarQube
- Container image creation using Docker
- Image publishing to Docker Hub
- Kubernetes deployment on AWS EKS
- Infrastructure provisioning using Terraform

Whenever new code is pushed to GitHub, Jenkins automatically triggers the pipeline and deploys the latest application version to the Kubernetes cluster.


---

# 🏗️ Architecture Flow
Developer
|
↓
GitHub Repository
|
↓
GitHub Webhook
|
↓
Jenkins Pipeline
|
↓
Maven Build
|
↓
SonarQube Analysis
|
↓
Docker Image Build
|
↓
Docker Hub
|
↓
AWS EKS Cluster
|
↓
Kubernetes Deployment
|
↓
LoadBalancer Service
|
↓
Application Access
# 🛠️ Technologies Used

## Cloud Platform

- AWS EKS
- AWS EC2
- AWS VPC
- AWS IAM
- AWS Load Balancer


## DevOps Tools

- Jenkins
- Docker
- Docker Hub
- SonarQube
- GitHub Webhooks


## Container Orchestration

- Kubernetes
- Kubernetes Deployment
- Kubernetes Service
- Horizontal Pod Autoscaler (HPA)


## Application

- Java 21
- Spring Boot 3
- Maven


## Infrastructure as Code

- Terraform


---

# ✨ Features

✅ Automated CI/CD pipeline

✅ GitHub webhook integration

✅ Automated Spring Boot build

✅ SonarQube code quality analysis

✅ Docker image creation

✅ Docker Hub image publishing

✅ Kubernetes deployment on AWS EKS

✅ Application exposure using LoadBalancer

✅ Automatic scaling using Kubernetes HPA

✅ Infrastructure creation using Terraform


---

# 🔄 Jenkins Pipeline Stages

## 1. Checkout

Jenkins clones the latest source code from GitHub.


GitHub Repository → Jenkins



## 2. Build

Builds the Spring Boot application using Maven.

```bash
mvn clean package
3. SonarQube Analysis

Analyzes code quality and detects issues.

mvn sonar:sonar
4. Docker Build

Creates a Docker image.

docker build -t kusuma/springboot:${BUILD_NUMBER} .
5. Docker Push

Pushes the image to Docker Hub.

docker push kusuma/springboot:${BUILD_NUMBER}
6. Configure EKS

Connects Jenkins with AWS EKS cluster.

aws eks update-kubeconfig \
--region us-east-1 \
--name devops-eks
7. Kubernetes Deployment

Deploys application resources.

kubectl apply -f kubernetes/
8. Verify Deployment

Check Kubernetes resources:

kubectl get pods -n devops

kubectl get svc -n devops

kubectl get deployments -n devops
☸️ Kubernetes Components
Namespace

Creates an isolated environment for the application.

namespace.yml
ConfigMap

Stores application configuration.

configmap.yml
Deployment

Manages application pods and replicas.

deployment.yml
Service

Exposes application using AWS LoadBalancer.

service.yml
Horizontal Pod Autoscaler

Automatically scales pods based on CPU utilization.

hpa.yml
🏗️ Terraform Infrastructure

Terraform is used to provision AWS infrastructure:

terraform/

├── VPC
├── Public Subnets
├── Private Subnets
├── Internet Gateway
├── NAT Gateway
├── Security Groups
├── IAM Roles
├── EKS Cluster
└── Managed Node Group
📂 Project Structure
springboot-eks-cicd-project
│
├── src/
│
├── kubernetes/
│   ├── namespace.yml
│   ├── configmap.yml
│   ├── deployment.yml
│   ├── service.yml
│   └── hpa.yml
│
├── terraform/
│   ├── main.tf
│   ├── variables.tf
│   └── outputs.tf
│
├── Dockerfile
│
├── Jenkinsfile
│
├── pom.xml
│
└── README.md
🌐 Application Access

After successful deployment:

Run:

kubectl get svc -n devops

Get the LoadBalancer URL.

Example:

http://<load-balancer-dns>

Open the URL in the browser to access the Spring Boot application.

🎯 Key Achievements

✅ Built complete CI/CD automation pipeline

✅ Integrated GitHub with Jenkins using Webhooks

✅ Implemented SonarQube quality checks

✅ Containerized Spring Boot application using Docker

✅ Deployed application on AWS EKS

✅ Automated AWS infrastructure using Terraform

✅ Implemented Kubernetes auto scaling using HPA

👨‍💻 Author

Mone Kusuma

Spring Boot EKS CI/CD Project

Technologies:

AWS EKS | Kubernetes | Jenkins | Terraform | Docker | Docker Hub | SonarQube | Spring Boot


