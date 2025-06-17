# DevOps Portfolio – Sharmila

Welcome to my DevOps portfolio! This repository showcases a collection of sample configurations and automation scripts I've worked on or studied to deepen my knowledge in DevOps, cloud, and container orchestration.

---

## 🔧 Tools & Technologies

- **Kubernetes** (K8s)
- **Docker**
- **Terraform**
- **AWS**
- **CI/CD** – GitHub Actions, Jenkins
- **Monitoring** – Prometheus, Grafana
- **Logging** – FluentD, EFK Stack

---

├── kubernetes/
│   ├── nginx-deployment.yaml
│   ├── configmap-example.yaml
│   ├── readiness-probe.yaml
│   ├── liveness-probe.yaml
│   └── helm-chart-demo/
│       ├── Chart.yaml
│       ├── values.yaml
│       └── templates/
│           ├── deployment.yaml
│           ├── service.yaml
│           └── _helpers.tpl
├── monitoring/
│   ├── prometheus-configmap.yaml
│   ├── prometheus-deployment.yaml
│   ├── prometheus-service.yaml
│   ├── grafana-dashboard.json
│   ├── grafana-deployment.yaml
│   └── grafana-dashboard-configmap.yaml
├── terraform/
│   └── aws-ec2.tf
├── scripts/
│   └── cleanup.sh
├── cicd/
│   ├── github-actions-demo.yml
│   └── jenkins-pipeline.groovy
├── Jenkinsfile               # Optional: Move/rename groovy file here for auto Jenkins detection
└── README.md

```


---

## 🧠 Purpose

This repository was created as part of my ongoing DevOps learning and hands-on practice. It contains reusable templates, infrastructure-as-code samples, and CI/CD automation configurations that demonstrate:

- Core Kubernetes concepts  
- Infrastructure provisioning with Terraform  
- Basic CI/CD pipeline setup  
- Monitoring and logging integrations, including Prometheus    

---
---

## 📂 Folder Descriptions

- **kubernetes/** – Core Kubernetes YAMLs, including deployment, configmaps, probes, and a Helm demo
- **terraform/** – Infrastructure-as-Code samples for provisioning AWS EC2 instances (with future potential for EKS)
- **prometheus/** – Setup files for Prometheus monitoring on Kubernetes
- **cicd/** – GitHub Actions CI/CD pipeline examples
- **scripts/** – Utility shell scripts for clean-up or automation

> ⚠️ Note: This repo is for educational and demonstration purposes only. It does not include any proprietary or production code.

---

## 🚀 How to Use

- **Kubernetes configs:**  
  Apply with `kubectl apply -f kubernetes/`

- **Helm chart demo:**  
  Deploy with `helm install demo-chart ./kubernetes/helm-chart-demo`

- **Prometheus and Grafana:**  
  Deploy Prometheus with `kubectl apply -f prometheus/`  
  Deploy Grafana with `kubectl apply -f grafana/` and import dashboard JSON

- **Terraform:**  
  Initialize and apply with:  
terraform init
terraform apply


